package org.ahmet.steams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsInterviewQuestions {

    // 1. How do you filter a list of integers to only include even numbers?

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }


    // 2. How can you find the maximum value in a list of integers using streams?
    public static Integer getMaxValue(List<Integer> numbers) {
        return numbers.stream()
                .max(Integer::compareTo)
                .orElse(null);
    }

    // 3. How do you convert a list of strings to uppercase using streams?

    public static List<String> convertToUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .toList();
    }
    // 4. How can you sort a list of objects based on a specific field using streams?
    // 5. How do you collect the results of a stream into a list?
    // 6. How can you check if any element in a stream matches a given condition?
    // 7. How do you find the first element in a stream that matches a condition?
    // 8. How can you group elements in a stream by a specific property?
    // 9. How do you calculate the sum of all elements in a stream?
    // 10. How can you create a stream from an array of integers?
    // 11. How do you skip the first n elements in a stream?
    // 12. How can you limit the number of elements processed in a stream?
    // 13. How do you map a stream of objects to a stream of their properties?
    // 14. How can you reduce a stream to a single value?
    // 15. How do you handle exceptions in a stream operation?
    // 16. How can you chain multiple stream operations together?
    // 17. How do you use parallel streams to improve performance?
    // 18. How can you convert a stream back to an array?
    // 19. How do you find the average of a list of integers using streams?
    // 20. How can you remove duplicates from a stream of objects?
    // 21. How do you use the `flatMap` operation in streams?
    // 22. How can you create a stream from a file and process its lines?
    // 23. How do you use the `peek` operation in streams for debugging?
    // 24. How can you use streams to perform a join operation on two lists?
    // 25. How do you use the `collect` method to gather results from a stream?
    // 26. How can you use the `toMap` collector to create a map from a stream?
    // 27. How do you use the `count` operation to get the number of elements in a stream?
    // 28. How can you use the `distinct` operation to filter unique elements in a stream?
    // 29. How do you use the `anyMatch`, `allMatch`, and `noneMatch` operations in streams?
    // 30. How can you use the `findAny` operation to retrieve any element from a stream?
    // 31. How do you use the `sorted` operation to sort elements in a stream?
    // 32. How can you use the `limit` operation to restrict the number of elements in a stream?
    // 33. How do you use the `skip` operation to bypass a certain number of elements in a stream?
    // 34. How can you use the `mapToInt`, `mapToDouble`, and `mapToLong` operations in streams?
    // 35. How do you use the `reduce` operation to combine elements in a stream?
    // 36. How can you use the `collect` operation to gather results into a custom collection?
    // 37. How do you use the `toList` collector to convert a stream to a list?
    // 38. How can you use the `toSet` collector to convert a stream to a set?
    // 39. How do you use the `joining` collector to concatenate strings from a stream?

    // 40. How can you use the `groupingBy` collector to group elements in a stream?
    // This can be done using the `Collectors.groupingBy` method, which allows you to group elements by a classifier function.
    // For example, to group a list of strings by their length:

    public static Map<Integer, List<String>> getGroupedByLength(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length)); // keys will be the lengths, and values will be lists of strings of that length.

    }


    // 41. How do you use the `partitioningBy` collector to split elements into two groups?
    // The `Collectors.partitioningBy` method can be used to partition elements into two groups based on a predicate.
    // For example, to partition a list of integers into even and odd numbers:

    public static Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0)); // true for even, false for odd, key will be the boolean result of the predicate value will be a list of integers that match the predicate.
    }

    // 42. How can you use the `counting` collector to count elements in a stream?

    public static void main(String[] args) {

        System.out.println("Even Numbers: " + getEvenNumbers(Arrays.asList(1, 2, 3, 4, 5, 6)));
        System.out.println("Max Value: " + getMaxValue(Arrays.asList(1, 2, 3, 4, 5, 6)));
        System.out.println("Uppercase Strings: " + convertToUpperCase(Arrays.asList("hello", "world", "java")));
        System.out.println("Grouped by Length: " + getGroupedByLength(Arrays.asList("apple", "banana", "kiwi", "pear", "peach")));
        System.out.println("Partitioned Even and Odd: " + partitionEvenOdd(Arrays.asList(1, 2, 3, 4, 5, 6)));

        // Additional examples can be added here for other questions
    }
}
