# Assignment 2 *from best student to best teacher*
## 💨 MyArrayListStack.java
### 💬 push()
> **Task:** method adds an element to the top of the stack using the add method for MyArrayList
```java
public void push(T data) {
  stack.add(data);
}
```
### 💬 pop()
> **Task:** method removes and returns the top element of the stack using the remove method for MyArrayList
```java
public void pop(T data) {
  if (stack.isEmpty()) {
    throw new EmptyStackException();
  }
  return stack.remove(stack.size() - 1);
}
```
### 💬 peek()
> **Task:** method returns the top element of the stack without removing it using the get method for MyArrayList
```java
public T peek() {
  if (stack.isEmpty()) {
    throw new EmptyStackException();
  }
  return stack.get(stack.size() - 1);
}
```
### 💬 isEmpty()
> **Task:** method returns true if the stack is empty or false if it is not using the isEmpty method for MyArrayList
```java
public boolean isEmpty() {
  return stack.isEmpty();
}
```
### 💬 size()
> **Task:** method returns the number of elements in the stack using the size method for MyArrayList
```java
public int size() {
  return stack.size();
}
```


## 💨 MyLinkedListStack.java
### 💬 push()
> **Task:** method adds an element to the top of the stack using the add method for MyLinkedList
```java
public void push(T data) {
  stack.addFirst(data);
}
```
### 💬 pop()
> **Task:** method removes and returns the top element of the stack using the remove method for MyLinkedList
```java
public void pop(T data) {
  if (stack.isEmpty()) {
    throw new EmptyStackException();
  }
  return stack.removeFirst();
}
```
### 💬 peek()
> **Task:** method returns the top element of the stack without removing it using the get method for MyLinkedList
```java
public T peek() {
  if (stack.isEmpty()) {
    throw new EmptyStackException();
  }
  return stack.getFirst();
}
```
### 💬 isEmpty()
> **Task:** method returns true if the stack is empty or false if it is not using the isEmpty method for MyLinkedList
```java
public boolean isEmpty() {
  return stack.isEmpty();
}
```
### 💬 size()
> **Task:** method returns the number of elements in the stack using the size method for MyLinkedList
```java
public int size() {
  return stack.size();
}
```

## 💨 MyArrayListQueue.java
### 💬 enqueue()
> **Task:** method adds an element to the back of the queue using the add method for ArrayList
```java
public void enqueue(T data) {
  myList.add(0, item);
}
```
### 💬 dequeue()
> **Task:** method removes and returns the front element of the queue using the remove method for ArrayList
```java
public void pop(T data) {
  return myList.remove(myList.size()-1);
}
```
### 💬 peek()
> **Task:** method returns the front element of the queue without removing it using the get method for ArrayList
```java
public T peek() {
  isEmptyThrowException();
  return myList.get(myList.size()-1);
}
```
### 💬 isEmpty()
> **Task:** method returns true if the queue is empty or false if it is not using the isEmpty method for ArrayList
```java
public boolean isEmpty() {
  return myList.isEmpty();
}
```
### 💬 size()
> **Task:** method returns the number of elements in the queue using the size method for ArrayList
```java
public int size() {
  return myList.size();
}
```


## 💨 MyLinkedListQueue.java
### 💬 enqueue()
> **Task:** method adds an element to the back of the queue using the addFirst method for LinkedList
```java
public void enqueue(T data) {
  myList.addFirst(item);
}
```
### 💬 dequeue()
> **Task:** method removes and returns the front element of the queue using the removeFirst method for LinkedList
```java
public void pop(T data) {
  return myList.removeFirst();
}
```
### 💬 peek()
> **Task:** method returns the front element of the queue without removing it using the getFirst method for LinkedList
```java
public T peek() {
  isEmptyThrowException();
  return myList.getFirst();
}
```
### 💬 isEmpty()
> **Task:** method returns true if the queue is empty or false if it is not using the isEmpty method for LinkedList
```java
public boolean isEmpty() {
  return myList.isEmpty();
}
```
### 💬 size()
> **Task:** method returns the number of elements in the queue using the size method for LinkedList
```java
public int size() {
  return myList.size();
}
```
