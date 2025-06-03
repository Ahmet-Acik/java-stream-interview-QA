package org.ahmet.steams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTasks {

    //reorder log messages form format in chronological order
    public static void main(String[] args) {
//        String[] logs = {
//            "2023-10-01 10:00:00 INFO User logged in",
//            "2023-10-01 09:30:00 WARN Low disk space",
//            "2023-10-01 10:05:00 INFO User logged out",
//            "2023-10-01 09:45:00 ERROR Disk error",
//            "2023-10-01 10:02:00 INFO File uploaded",
//            "2023-10-01 09:50:00 INFO Backup started",
//        };
//
//        // Sort and print logs using streams
//        Arrays.stream(logs)
//                .sorted((a, b) -> a.substring(0, 19).compareTo(b.substring(0, 19)))
//                .forEach(System.out::println);

        List<String> logs = Arrays.asList(
                "14:30:3:Server started",
                "14:30:1:User logged in",
                "14:29:4:Database connected",
                "18:33:2:User logged out",
                "14:31:5:File uploaded"
        );
//        // Sort and print logs using streams
//        logs.stream()
//                .sorted((a, b) -> {
//                    String[] aParts = a.split(":");
//                    String[] bParts = b.split(":");
//                    int aTime = Integer.parseInt(aParts[0]) * 3600 + Integer.parseInt(aParts[1]) * 60 + Integer.parseInt(aParts[2]);
//                    int bTime = Integer.parseInt(bParts[0]) * 3600 + Integer.parseInt(bParts[1]) * 60 + Integer.parseInt(bParts[2]);
//                    return Integer.compare(aTime, bTime);
//                })
//                .forEach(System.out::println);
        logs.stream()
              .sorted(Comparator.comparing(log -> log.substring(0, 19)))
              .forEach(System.out::println);
    }

}
