

# OOPs Assignment 1
## What is Queue ?

A Queue is a linear structure which follows a particular order in which the operations are performed. The order is First In First Out (FIFO).
## Implementation

I have created two classes named "DoubleQueue" and "SquareQueue" along with a Trait named "Queue".

## Classes :

DoubleQueue class enqueues the element after doubling them. SquareQueue class enqueues the element after Squaring them.

## Trait :

Queue trait includes two methods "enqueue" and "dequeue" where enqueue is abstract method and dequeue is concrete method.
## Commands

### Compile code

```bash
  sbt compile
```

### Execute main class

```bash
  sbt run
```

### Delete all generated files

```bash
  sbt clean
```

### Generate scalastyle config file

```bash
  sbt scalastyleGenerateConfig
```

### Execute scalastyle plugin

```bash
  sbt scalastyle
```
