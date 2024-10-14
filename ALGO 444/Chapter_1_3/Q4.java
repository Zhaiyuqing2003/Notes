import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

// Parentheses
public class Q4 {
    public static void main(String[] args) {
        // ( == 0, [ == 1, { == 2
        Stack<Character> CharStack = new Stack<Character>();
        while (!StdIn.isEmpty()){
            Character currentChar = StdIn.readChar();
            if (CharStack.isEmpty()){
                CharStack.push(currentChar);
            } else {

                if (currentChar == '}' || currentChar == ']' || currentChar == ')'){

                    Character previousChar = CharStack.pop();

                    if (previousChar == null){
                        System.out.println("False, because miss left bracket");
                        return;
                    }
                    if (!(currentChar == '}' && previousChar == '{' ||
                        currentChar == ']' && previousChar == '[' ||
                        currentChar == ')' && previousChar == '(')){
                        System.out.println("False, because bracket mismatch");
                        return;
                    } else {
                        // if two things are equal
                        // so none of them are pushed back, they are considered to be cancelled.
                    }
                } else {
                    // left side, just push in 
                    CharStack.push(currentChar);
                }
            }
        }
        if (!CharStack.isEmpty()){
            // some remaining left bracket
            System.out.println("False, because miss right bracket");
        } else {
            System.out.println(true);
        }
    }
}
