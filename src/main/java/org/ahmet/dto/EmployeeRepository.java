package org.ahmet.dto;

import java.util.List;
import java.util.Arrays;

public class EmployeeRepository {

    private static final Employee[] EMPLOYEE_RECORDS = {
        new Employee("1", "Alice Smith", "Engineering", 75000, "alicesmith@gmail.com", "123-456-7890", "123 Elm St, Springfield", "Software Engineer", "2022-01-15", "3"),
        new Employee("2", "Bob Johnson", "Marketing", 60000, "bobjhonson@gmail.com", "234-567-8901", "456 Oak St, Springfield", "Marketing Specialist", "2021-03-22", "4"),
        new Employee("3", "Charlie Brown", "Engineering", 80000, "charliebrown@gmail.com", "345-678-9012", "789 Pine St, Springfield", "Senior Software Engineer", "2020-05-30", "5"),
        new Employee("4", "Diana Prince", "Human Resources", 55000, "dianaprince@gmail.com", "456-789-0123", "321 Maple St, Springfield", "HR Manager", "2019-07-10", "6"),
        new Employee("5", "Ethan Hunt", "Sales", 70000, "ethanhunt@gamil.com", "567-890-1234", "654 Cedar St, Springfield", "Sales Executive", "2018-09-05", "7"),
        new Employee("6", "Fiona Gallagher", "Finance", 65000, "fionagallagher@gmail.com", "678-901-2345", "987 Birch St, Springfield", "Financial Analyst", "2017-11-20", "8"),
        new Employee("7", "George Costanza", "Customer Support", 50000, "georgecostanza@gmail.com", "789-012-3456", "159 Spruce St, Springfield", "Support Specialist", "2016-02-14", "9"),
        new Employee("8", "Hannah Baker", "Engineering", 72000, "hannahbaker@gmail.com", "890-123-4567", "753 Willow St, Springfield", "DevOps Engineer", "2023-04-01", "10"),
        new Employee("9", "Ian Malcolm", "Research", 68000, "ianmalcolm@gmail.com", "901-234-5678", "852 Fir St, Springfield", "Research Scientist", "2022-06-18", "11"),
        new Employee("10", "Julia Roberts", "Marketing", 62000, "juliaroberts@gmail.com", "012-345-6789", "963 Cypress St, Springfield", "Content Strategist", "2021-08-25", "12"),
        new Employee("11", "Kevin Hart", "Sales", 72000, "kevinhart@gmail.com", "123-456-7891", "147 Redwood St, Springfield", "Sales Manager", "2020-10-30", "13"),
        new Employee("12", "Laura Croft", "Engineering", 85000, "lauracroft@gmail.com", "234-567-8902", "258 Palm St, Springfield", "Lead Software Engineer", "2019-12-05", "14"),
        new Employee("13", "Mike Zorawski", "Customer Support", 52000, "mikezorawski@gamil.com", "345-678-9013", "369 Yew St, Springfield", "Customer Support Lead", "2018-01-12", "15"),
        new Employee("14", "Nina Simone", "Finance", 70000, "ninasimone@gmail.com", "456-789-0124", "741 Sequoia St, Springfield", "Financial Manager", "2017-03-15", "16"),
        new Employee("15", "Oscar Wilde", "Human Resources", 58000, "oscarwilde@gamil.com", "567-890-1235", "852 Magnolia St, Springfield", "HR Specialist", "2016-05-20", "17"),
        new Employee("16", "Paula Patton", "Marketing", 64000, "paulapatton@gmail.com", "678-901-2346", "963 Chestnut St, Springfield", "Digital Marketing Manager", "2023-07-22", "18"),
        new Employee("17", "Quentin Tarantino", "Engineering", 78000, "quentintarantino@gmail.com", "789-012-3457", "147 Dogwood St, Springfield", "Software Architect", "2022-09-30", "19"),
        new Employee("18", "Rachel Green", "Engineering", 71000, "rachelgreen@gmail.com", "890-123-4568", "258 Hawthorn St, Springfield", "Frontend Developer", "2021-11-15", "20"),
        new Employee("19", "Sam Winchester", "Engineering", 69000, "samwinchester@gmail.com", "901-234-5679", "369 Alder St, Springfield", "Backend Developer", "2020-01-10", "21"),
        new Employee("20", "Tina Fey", "Engineering", 73000, "tinafey@gmail.com", "012-345-6780", "741 Elmwood St, Springfield", "Software Engineer in Test", "2019-03-25", "22"),
        new Employee("21", "Ursula K. Le Guin", "Engineering", 72000, "uklguin@gmail.com", "123-456-7892", "852 Maplewood St, Springfield", "Software Engineer in Test", "2018-05-30", "23"),
        new Employee("22", "Victor Hugo", "Research", 80000, "victorhugo@gmail.com", "234-567-8903", "963 Oakwood St, Springfield", "Data Scientist", "2017-07-15", "24"),
        new Employee("23", "Winston Churchill", "Research", 75000, "winstonchurchill@gmail.com", "345-678-9014", "147 Pinewood St, Springfield", "Machine Learning Engineer", "2016-09-20", "25"),
        new Employee("24", "Xena Warrior", "Customer Support", 54000, "xenawarrior@gmail.com", "456-789-0125", "258 Cedarwood St, Springfield", "Customer Support Specialist", "2023-11-01", "26"),
        new Employee("25", "Yara Greyjoy", "Sales", 62000, "yaragreyjoy@gmail.com", "567-890-1236", "369 Birchwood St, Springfield", "Sales Associate", "2022-01-05", "27")
    };

 public static List<Employee> getEmployeeRecords() {
            return Arrays.asList(EMPLOYEE_RECORDS);
        }
}