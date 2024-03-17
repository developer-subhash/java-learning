# Java Stream
- https://www.javatpoint.com/java-8-stream
- https://www.geeksforgeeks.org/stream-in-java/
- In Java, a stream represents a sequence of elements that can be processed sequentially or in parallel. It's a new abstract layer introduced in Java 8 to perform functional-style operations on sequences of elements. Streams are primarily used to perform aggregate operations on collections of data such as filtering, mapping, sorting, and reducing.

- Stream provides following features:


- Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of computational operations.
  - Stream is functional in nature. Operations performed on a stream does not modify it's source. For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than removing elements from the source collection.
  - Stream is lazy and evaluates code only when required.
  - The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream must be generated to revisit the same elements of the source.


- Here's a brief overview of some common uses of streams in the real world:


  - **Data Processing**: Streams provide a concise and expressive way to process large volumes of data. For example, in data analytics applications, streams can be used to filter, transform, and aggregate data efficiently.

  - **Parallelism**: Streams can leverage parallelism to perform operations concurrently, which can significantly improve performance, especially when dealing with large datasets. This is particularly useful in tasks like data processing, where parallel execution can speed up computations.

  - **Functional Programming**: Streams encourage functional programming paradigms, such as immutability and pure functions. This promotes cleaner, more maintainable code that is easier to reason about and test.

  - **Database Interaction**: Streams can be used to process data retrieved from databases. For instance, you can fetch a large dataset from a database and process it using streams, applying filtering or mapping operations before displaying or further processing the results.

  - **File Processing**: Streams are handy for reading and processing data from files. You can use streams to read lines from a file, filter out certain lines, and perform transformations on the data before writing it back to another file.

  - **Concurrency Control**: Streams offer built-in support for parallel processing, allowing developers to take advantage of multicore processors effectively. This is useful in scenarios where performance is critical, such as in high-throughput applications or real-time data processing systems.

# Java 8 Optional
- https://www.javatpoint.com/java-8-optional
- It is a public final class and used to deal with NullPointerException in Java application.
- It provides methods which are used to check the presence of value for particular variable.
- In Java, the Optional class was introduced in Java 8 as part of the java.util package. It's designed to address the problem of dealing with potential null values in a safer and more expressive way.


- Prior to Java 8, if a method could potentially return null, it was not always clear to the caller whether they needed to check for null or not. This could lead to NullPointerExceptions (NPEs) if the caller forgot to check for null.

- Optional provides a container object which may or may not contain a non-null value. It encourages you to explicitly handle the case where the value might be absent, thereby reducing the possibility of null pointer exceptions.

- Here's a brief overview of how Optional works and its main use cases:

  - Avoiding NullPointerExceptions: By wrapping a potentially null value inside an Optional, you can ensure that the value is accessed safely.

  - Expressing Optional Values: Sometimes a method may not have a value to return. Instead of returning null, which doesn't convey much information, you can return an Optional indicating the absence of a value.

  - Chaining Methods Safely: You can chain Optional methods together to perform operations on the value if it's present. If the value is absent, the chain automatically short-circuits, avoiding unnecessary computations.