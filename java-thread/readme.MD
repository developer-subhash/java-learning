# java-thread
- https://www.w3schools.com/java/java_threads.asp
- There are two ways to create a thread.
- It can be created by extending the Thread class and overriding its run() method:
- Another way to create a thread is to implement the Runnable interface:
- If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:
- If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method:
- 