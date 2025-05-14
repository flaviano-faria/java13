# java13

This project demonstrates features introduced in Java 13, focusing on the new switch expression syntax.

## Java 13 Features Used

### Switch Expressions (Preview Feature)
Java 13 introduced a new, more concise form of switch expressions using the `->` arrow syntax. This allows switch statements to be used as expressions, making code more readable and less error-prone. For example:

```java
switch (event) {
    case PLAY -> {
        System.out.println("Started");
    }
    case STOP, PAUSE -> {
        System.out.println("Stopped");
    }
    default -> throw new IllegalStateException("Unexpected value: " + event);
}
```

This feature is demonstrated in `Service.java`.

## How to Run

1. Ensure you have JDK 13 or later installed.
2. Compile the project:
   ```sh
   javac -d out src/main/java/com/java13/service/Service.java src/main/java/com/java13/exec/Main.java
   ```
3. Run the main class:
   ```sh
   java -cp out com.java13.exec.Main
   ```

---

**Note:** Switch expressions are a preview feature in Java 13. You may need to enable preview features when compiling and running:

```sh
javac --enable-preview --release 13 -d out src/main/java/com/java13/service/Service.java src/main/java/com/java13/exec/Main.java
java --enable-preview -cp out com.java13.exec.Main
```