#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>


typedef struct sentence {
    char** strings;
} sentence_t;

sentence_t camel_caser(const char* input) {
    // NULL check
    if (input == NULL) {
        return (sentence_t) {NULL};
    }

    // Calculate the number of sentences (split by punctuation)
    int num_sentences = 0;
    int i = 0;
    while (input[i] != '\0') {
        if (ispunct(input[i])) {
            num_sentences++;
        }
        i++;
    }

    // Allocate memory for the array of strings
    char** output = (char**) malloc(sizeof(char*) * (num_sentences + 1));
    output[num_sentences] = NULL;

    int si = 0; // sentence index
    int so = 0; // sentence offset

    while (input[so] != '\0') {
        int j = 0;

        // Trim leading whitespace
        while (isspace(input[so + j])) j++;

        int start = j;
        int len = 0;

        // Find the end of the sentence
        while (input[so + j] != '\0' && !ispunct(input[so + j])) {
            if (!isspace(input[so + j])) {
                len++;
            }
            j++;
        }

        int end = j;

        // Allocate memory for the sentence
        output[si] = (char*) malloc(sizeof(char) * (len + 1));
        output[si][len] = '\0';

        // Transform the sentence to camelCase
        int prev_space = 0;
        while (start < end) {
            if (!isspace(input[start])) {
                if (prev_space) {
                    output[si][start] = toupper(input[so + start]);
                } else {
                    output[si][start] = tolower(input[so + start]);
                }

                prev_space = 0;
            } else {
                prev_space = 1;
            }

            start++;
        }

        si++;

        // Skip the punctuation
        so += j + 1;
    }

    return (sentence_t) {output};
}

void destroy(sentence_t sentence) {
    if (sentence.strings == NULL) {
        return;
    }

    int i = 0;
    while (sentence.strings[i] != NULL) {
        free(sentence.strings[i]);
        i++;
    }

    free(sentence.strings);
}

void print_sentence(sentence_t sentence) {
    if (sentence.strings == NULL) {
        printf("NULL\n");
        return;
    }

    int i = 0;
    while (sentence.strings[i] != NULL) {
        printf("%s\n", sentence.strings[i]);
        i++;
    }
}

int main() {
    sentence_t sentence = camel_caser("The Heisenbug is an incredible creature. Facenovel servers get their power from its indeterminism. Code smell can be ignored with INCREDIBLE use of air freshener. God objects are the new religion.");
    print_sentence(sentence);
    destroy(sentence);
    return 0;
}