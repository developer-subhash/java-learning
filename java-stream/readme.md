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