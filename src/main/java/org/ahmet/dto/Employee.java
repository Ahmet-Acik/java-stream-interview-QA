package org.ahmet.dto;

public record Employee(
    String id,
    String name,
    String department,
    double salary,
    String email,
    String phoneNumber,
    String address,
    String position,
    String hireDate,
    String managerId
) {
}
