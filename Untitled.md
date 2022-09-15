```haskell
data Tree a = Node a (Tree a) (Tree a) | Nil deriving Show

remove :: Tree a -> a -> Tree a

remove t@(Node x Nil Nil) n | x == n = Nil
							| otherwise = t
remove (Node x s Nil) n | x == n = s
						| otherwise Node x (remove s n) Nil
remove (Node x Nil s) n | x == n = s
						| otherwise Node x Nil (remove s n)
remove (Node x a b) n | x == n = Node (getRightMost a) (removeRightMost a) b
					  | x < n = Node x (remove a n) b
					  | otherwise = Node x a (remove b n)

getRightMost (Node x _ Nil) = x
getRightMost (Node x _ a) = getRightMost a

removeRightMost (Node x Nil Nil) = Nil
removeRightMost (Node x a Nil) = a
removeRightMost (Node x a b) = Node x a (removeRightMost b)

push :: Tree a -> a -> Tree a
push Nil n = Node n Nil Nil
push (Node x a b) n = | n <= x = Node x (push a n) b
					  | otherwise = Node x a (push b n)

						   
```

```Haskell
data Heap a = Node a (Heap a) (Heap a) | Nil deriving Show

cmp :: 
```

```
void rotate_right(std::unique_ptr<node>& ptr) {
    auto temp = std::move(ptr->left);
    ptr->left = std::move(temp->right);
    temp->right = std::move(ptr);
    ptr = std::move(temp);
}
```
