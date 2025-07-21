package org.ramcharan.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        // Query 1 : How many male and female employees are there in the organization?
        method1();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 2 : Print the name of all departments in the organization?
        method2();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 3 : What is the average age of male and female employees?
        method3();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 4 : Get the details of highest paid employee in the organization?
        method4();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 5 : Get the names of all employees who have joined after 2015?
        method5();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 6 : Count the number of employees in each department?
        method6();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 7 : What is the average salary of each department?
        method7();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 8 : Get the details of younger most male employee in the product
        // development department?
        method8();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 9 : Who has the most working experience in the organization?
        method9();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 10 : How many male and female employees are there in the sales and marketing team?
        method10();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 11 : What is the average salary of male and female employees?
        method11();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 12 : List down the names of all employees in each department?
        method12();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 13 : What is the average salary and total salary of the whole organization?
        method13();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
        method14();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 15 : Who is the oldest employee in the organization? What is his age
        // and which department he belongs to?
        method15();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 16 : Get top 2 salaries from each department
        method16();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 17 : Find the middle element of a list
        method17();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 18 : filer id>150, desc age,desc name,print first.
        method18();
        System.out.println("----------------------------------------------------------------------------------------------");
        // Query 19 : Find the department with the highest total salary.
        method19();
    }



    private static void method1() {
        System.out.println("Query 1 : How many male and female employees are there in the organization?");
        Map<String, Long> query1 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(query1);
    }
    private static void method2() {
        System.out.println("Query 2 : Print the name of all departments in the organization");
        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }
    private static void method3() {
        System.out.println("Query 3 : What is the average age of male and female employees?");
        Map<String, Double> query3 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingInt(Employee::getAge)));
        System.out.println(query3);
    }
    private static void method4() {
        System.out.println("Query 4 : Get the details of highest paid employee in the organization");
        Optional<Employee> query4 = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        query4.ifPresent(System.out::println);


        Optional<Double> max = employeeList.stream()
                .map(Employee::getSalary)
                .max(Double::compare);
        max.ifPresent(System.out::println);

    }
    private static void method5() {
        System.out.println("Query 5 : Get the names of all employees who have joined after 2015");
        employeeList.stream()
                .filter(i -> i.getYearOfJoining() >= 2015)
                .map(Employee::getName)
                .forEach(System.out::println);

        List<Double> list = employeeList.stream()
                .filter(i -> i.getYearOfJoining() >= 2015)
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(list + "\n");
        System.out.println(list.get(0) + " & " + list.get(1) + " are top 2");

    }
    private static void method6() {
        System.out.println("Query 6 : Count the number of employees in each department\n");
        Map<String, Long> query6 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(query6 + "\n");

        for (Map.Entry<String, Long> entry : query6.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    private static void method7() {
        System.out.println("Query 7 : What is the average salary of each department?");
        Map<String, Double> query7 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        //System.out.println(query7);
        for (Map.Entry<String, Double> entry : query7.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    private static void method8() {
        System.out.println("Query 8 : Get the details of younger most male employee in the product development department");
//        Optional<Employee> query8 = employeeList.stream()
//                .filter(i -> i.getGender() == "Male" && i.getDepartment() == "Product Development")
//                .min(Comparator.comparingInt(Employee::getAge));
//        System.out.println("ID: " + query8.get().getId());
//        System.out.println("Name: " + query8.get().getName());

        Optional<Employee> query8 = employeeList.stream()
                .filter(i -> Objects.equals(i.getGender(), "Male") && Objects.equals(i.getDepartment(), "Product Development"))
                .min(Comparator.comparingInt(Employee::getAge));
        System.out.println("ID: " + query8.get().getId());
        System.out.println("Name: " + query8.get().getName());
    }
    private static void method9() {
        System.out.println("Query 9 : Who has the most working experience in the organization?");
        Optional<Employee> query9 = employeeList.stream()
                .min(Comparator.comparingInt(Employee::getYearOfJoining));
        System.out.println(query9.get().getName() + " : " + query9.get().getYearOfJoining());
    }
    private static void method10() {
        System.out.println("Query 10 : How many male and female employees are there in the sales and marketing team?");
        Map<String, Long> query10 = employeeList.stream()
                .filter(i -> Objects.equals(i.getDepartment(), "Sales And Marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(query10);
    }
    private static void method11() {
        System.out.println("Query 11 : What is the average salary of male and female employees?");
        Map<String, Double> query11 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(query11);
    }
    private static void method12() {
        System.out.println("Query 12 : List down the names of all employees in each department?\n");
        Set<Map.Entry<String, List<Employee>>> query12 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment)).entrySet();


        System.out.println(query12 + "\n");

        for (Map.Entry<String, List<Employee>> entry : query12) {
            System.out.println(entry.getKey() + ":");



            List<Employee> list = entry.getValue();
            for (Employee e : list) {
                System.out.println("          " + e.getName());
            }
        }
    }
    private static void method13() {
        System.out.println("Query 13 : What is the average salary and total salary of the whole organization?\n");
        DoubleSummaryStatistics query13 = employeeList.stream()
                                    .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(query13 + "\n");
        // DoubleSummaryStatistics{count=17, sum=359401.000000, min=10500.000000, average=21141.235294, max=35700.000000}

        System.out.println("Average = " + query13.getAverage());
        System.out.println("Total = " + query13.getSum());
    }
    private static void method14() {
        System.out.println("Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years");
        Set<Map.Entry<String, List<Employee>>> query14 = employeeList.stream()
                                            .filter(i -> i.getAge() <= 25)
                                            .collect(Collectors.groupingBy(Employee::getName)).entrySet();
        Set<Map.Entry<String, List<Employee>>> query14_1 = employeeList.stream()
                                            .filter(i -> i.getAge() > 25)
                                            .collect(Collectors.groupingBy(Employee::getName)).entrySet();

        System.out.println();
        System.out.println("Less than or equal to 25 :\n");
        for (Map.Entry<String, List<Employee>> i : query14) {
            System.out.println(i.getKey());
        }
        System.out.println();
        System.out.println("More than 25 :\n");
        for (Map.Entry<String, List<Employee>> j : query14_1) {
            System.out.println(j.getKey());
        }
    }
    private static void method15() {
        System.out.println("Query 15 : Who is the oldest employee in the organization? What is his age\n" +
                "and which department he belongs to?");
        Optional<Employee> query15 = employeeList.stream()
                .max(Comparator.comparingInt(Employee::getAge));
        System.out.println("Name: " + query15.get().getName());
        System.out.println("Age: " + query15.get().getAge());
        System.out.println("Dep: " + query15.get().getDepartment());
    }
    private static void method16(){
        System.out.println("Query 16 : Get top 2 salaries from each department.");
        Map<String,List<Employee>> map1 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("map1:\n" + map1);

        Set<Map.Entry<String, List<Employee>>> set1 = map1.entrySet();

        System.out.println("set1:\n" + set1);
        System.out.println("*****************************");

        for(Map.Entry<String,List<Employee>> entry : set1){

            System.out.println(entry.getKey() + ":");

            List<Employee> list2 = entry.getValue();
            List<Double> salaryList = list2.stream()
                    .map(Employee::getSalary)
                    .sorted(Comparator.reverseOrder())
                    .toList();
            System.out.println(salaryList.get(0) +",\n" + salaryList.get(1));
        }
    }
    private static void method17(){
        System.out.println("Query 17 : Find middle element from the list.");
        List<Integer> list = Arrays.asList(23, 44, 55, 66, 77, 88, 77);
        System.out.println("list: " + list);
        //General way
        int middleIndex = list.size() / 2;
        System.out.println("Middle int type1 = " + list.get(middleIndex));
        //Using streams
        Integer i1 = list.stream()
                .skip(middleIndex)
                .findFirst()
                .orElseThrow();
        System.out.println("Middle int type2 = " + i1);

        //analyze skip()
        List<Integer> i2 = list.stream()
                .skip(middleIndex)
                .toList();
        System.out.println("Middle int type2 skip function = " + i2);

        list.stream()
                .filter(n-> list.indexOf(n) == middleIndex)
                .forEach(e -> System.out.println("Middle int type3 = " + e));
    }
    private static void method18() {
        System.out.println("Query 18 : filer id>150, desc age,desc name,print first.");
        employeeList.stream()
                .filter(e -> e.getId() > 150)
                .sorted(Comparator.comparing(Employee::getAge)
                        .thenComparing(Employee::getName).reversed())
                .forEach(System.out::println);
    }

    private static void method19(){
        System.out.println("Query 19 : Find the department with the highest total salary.");
        Set<Map.Entry<String, DoubleSummaryStatistics>> deptSummarySet = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, Collectors.summarizingDouble(Employee::getSalary)
                ))
                .entrySet();

        System.out.println("deptSummarySet:\n" + deptSummarySet);
        Map.Entry<String, DoubleSummaryStatistics> deptHighestSum = deptSummarySet.stream()
                .max(Comparator.comparingDouble(n -> n.getValue().getSum()))
                .orElse(null);
        System.out.println("deptHighestSum:\n" + deptHighestSum);

        assert deptHighestSum != null;
        System.out.println(deptHighestSum.getKey() + ": " + deptHighestSum.getValue().getSum());

    }
}