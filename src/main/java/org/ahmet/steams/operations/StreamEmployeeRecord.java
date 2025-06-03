package org.ahmet.steams.operations;

import org.ahmet.dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.*;
import static org.ahmet.dto.EmployeeRepository.getEmployeeRecords;

public class StreamEmployeeRecord {

    public static void main(String[] args) {
//        // Retrieve the list of employees from the repository
//        List<Employee> employees = getEmployeeRecords(); // Fetch employee records from the repository
//
//        // Perform various stream operations and print results
//        printHighEarners(employees); // Filter employees with salary over 70,000
//        printEngineers(employees); // Filter engineers only
//        printRecentHires(employees); // Filter employees hired after 2020
//        printEmployeesByDepartment(employees); // Group employees by department
//        printEmployeeCountByDepartment(employees); // Count employees per department
//        printNamesByPosition(employees); // Group by position, collect names only
//        printPartitionedBySalary(employees); // Partition employees by salary > 65,000
//        printPartitionedByDepartment(employees); // Partition based on Engineering department
//        printPartitionedByHireDate(employees); // Partition based on hiring date after 2020

        // Retrieve the list of employees from the repository
        List<Employee> employees = getEmployeeRecords(); // Fetch employee records from the repository

        // Perform various stream operations and print results
        System.out.println("High Earners: " + getHighEarners(employees)); // Filter employees with salary over 70,000
        System.out.println("Engineers: " + getEngineers(employees)); // Filter engineers only
        System.out.println("Recent Hires: " + getRecentHires(employees)); // Filter employees hired after 2020
        System.out.println("Employees by Department: " + getEmployeesByDepartment(employees)); // Group employees by department
        System.out.println("Employee Count by Department: " + getEmployeeCountByDepartment(employees)); // Count employees per department
        System.out.println("Names by Position: " + getNamesByPosition(employees)); // Group by position, collect names only
        System.out.println("Partitioned by Salary > 65,000: " + getPartitionedBySalary(employees)); // Partition employees by salary > 65,000
        System.out.println("Partitioned by Engineering Department: " + getPartitionedByDepartment(employees)); // Partition based on Engineering department
        System.out.println("Partitioned by Hire Date after 2020: " + getPartitionedByHireDate(employees)); // Partition based on hiring date after 2020

    }
//
//    // 🔹 a) Filter employees with salary over 70,000
//    private static void printHighEarners(List<Employee> employees) {
//        List<Employee> highEarners = employees.stream()
//                .filter(e -> e.salary() > 70000) // Filter employees whose salary is greater than 70,000
//                .toList(); // Collect the filtered employees into a list
//        System.out.println("High Earners: " + highEarners);
//    }
//
//    // 🔹 b) Filter engineers only
//    private static void printEngineers(List<Employee> employees) {
//        List<Employee> engineers = employees.stream()
//                .filter(e -> e.department().equalsIgnoreCase("Engineering")) // Filter employees in the Engineering department
//                .toList(); // Collect the filtered employees into a list
//        System.out.println("Engineers: " + engineers);
//    }
//
//    // 🔹 c) Employees hired after 2020
//    private static void printRecentHires(List<Employee> employees) {
//        List<Employee> recentHires = employees.stream()
//                .filter(e -> e.hireDate().compareTo("2020-12-31") > 0) // Filter employees hired after 2020
//                .toList(); // Collect the filtered employees into a list
//        System.out.println("Recent Hires: " + recentHires);
//    }
//
//    // 🔹 a) Group employees by department
//    private static void printEmployeesByDepartment(List<Employee> employees) {
//        Map<String, List<Employee>> byDepartment = employees.stream()
//                .collect(Collectors.groupingBy(Employee::department)); // Group employees by their department
//        System.out.println("Employees by Department: " + byDepartment);
//    }
//
//    // 🔹 b) Count of employees per department
//    private static void printEmployeeCountByDepartment(List<Employee> employees) {
//        Map<String, Long> departmentCounts = employees.stream()
//                .collect(Collectors.groupingBy(Employee::department, Collectors.counting())); // Count employees in each department
//        System.out.println("Employee Count by Department: " + departmentCounts);
//    }
//
//    // 🔹 c) Group by position, collect names only
//    private static void printNamesByPosition(List<Employee> employees) {
//        Map<String, List<String>> namesByPosition = employees.stream()
//                .collect(Collectors.groupingBy(
//                        Employee::position, // Group employees by their position
//                        Collectors.mapping(Employee::name, Collectors.toList()) // Collect only the names of employees in each position
//                ));
//        System.out.println("Names by Position: " + namesByPosition);
//    }
//
//    // 🔹 a) Partition employees by salary > 65,000
//    private static void printPartitionedBySalary(List<Employee> employees) {
//        Map<Boolean, List<Employee>> partitionedBySalary = employees.stream()
//                .collect(Collectors.partitioningBy(e -> e.salary() > 65000)); // Partition employees based on whether their salary is greater than 65,000
//        System.out.println("Partitioned by Salary > 65,000: " + partitionedBySalary);
//    }
//
//    // 🔹 b) Partition based on Engineering department
//    private static void printPartitionedByDepartment(List<Employee> employees) {
//        Map<Boolean, List<Employee>> partitionedByDept = employees.stream()
//                .collect(Collectors.partitioningBy(e -> e.department().equalsIgnoreCase("Engineering"))); // Partition employees based on whether they belong to the Engineering department
//        System.out.println("Partitioned by Engineering Department: " + partitionedByDept);
//    }
//
//    // 🔹 c) Partition based on hiring date after 2020
//    private static void printPartitionedByHireDate(List<Employee> employees) {
//        Map<Boolean, List<Employee>> partitionedByHireDate = employees.stream()
//                .collect(Collectors.partitioningBy(e -> e.hireDate().compareTo("2020-12-31") > 0)); // Partition employees based on whether they were hired after 2020
//        System.out.println("Partitioned by Hire Date after 2020: " + partitionedByHireDate);
//    }

    // 🔹 a) Filter employees with salary over 70,000
    private static List<Employee> getHighEarners(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.salary() > 70000) // Filter employees whose salary is greater than 70,000
                .toList(); // Collect the filtered employees into a list
    }

    // 🔹 b) Filter engineers only
    private static List<Employee> getEngineers(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.department().equalsIgnoreCase("Engineering")) // Filter employees in the Engineering department
                .toList(); // Collect the filtered employees into a list
    }

    // 🔹 c) Employees hired after 2020
    private static List<Employee> getRecentHires(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.hireDate().compareTo("2020-12-31") > 0) // Filter employees hired after 2020
                .toList(); // Collect the filtered employees into a list
    }

    // 🔹 a) Group employees by department
    private static Map<String, List<Employee>> getEmployeesByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::department)); // Group employees by their department
    }

    // 🔹 b) Count of employees per department
    private static Map<String, Long> getEmployeeCountByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::department, Collectors.counting())); // Count employees in each department
    }

    // 🔹 c) Group by position, collect names only
    private static Map<String, List<String>> getNamesByPosition(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::position, // Group employees by their position
                        Collectors.mapping(Employee::name, Collectors.toList()) // Collect only the names of employees in each position
                ));
    }

    // 🔹 a) Partition employees by salary > 65,000
    private static Map<Boolean, List<Employee>> getPartitionedBySalary(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.partitioningBy(e -> e.salary() > 65000)); // Partition employees based on whether their salary is greater than 65,000
    }

    // 🔹 b) Partition based on Engineering department
    private static Map<Boolean, List<Employee>> getPartitionedByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.partitioningBy(e -> e.department().equalsIgnoreCase("Engineering"))); // Partition employees based on whether they belong to the Engineering department
    }

    // 🔹 c) Partition based on hiring date after 2020
    private static Map<Boolean, List<Employee>> getPartitionedByHireDate(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.partitioningBy(e -> e.hireDate().compareTo("2020-12-31") > 0)); // Partition employees based on whether they were hired after 2020
    }
}