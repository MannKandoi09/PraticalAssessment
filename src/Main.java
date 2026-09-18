import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class EmployeeInfo {
    private String managerName;
    private String department;
    private String status;
    private LocalDate reviewDate;
    private LocalDate nextReviewDate;
    private double salary;

    public EmployeeInfo(String managerName, String department, String status,
                        String reviewDate, String nextReviewDate, double salary) {

        this.managerName = managerName;
        this.department = department;
        this.status = status;
        this.reviewDate = LocalDate.parse(reviewDate);
        this.nextReviewDate = LocalDate.parse(nextReviewDate);
        this.salary = salary;
    }

    public void displayJobInfo() {
        System.out.println("Manager Name: " + managerName);
        System.out.println("Department: " + department);
        System.out.println("Status: " + status);
        System.out.println("Review Date: " + reviewDate);
        System.out.println("Next Review Date: " + nextReviewDate);
        System.out.println("Salary: " + salary);
    }
}

class Employee {
    private String name;
    private String address;
    private String city;
    private String state;
    private String country;
    private int zipCode;
    private String imgPath;

    private List<EmployeeInfo> jobInfos = new ArrayList<>();

    public Employee(String name, String address, String city, String state,
                    String country, int zipCode, String imgPath) {

        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        this.imgPath = imgPath;
    }

    public void addJobInfos(EmployeeInfo jobInfo) {
        jobInfos.add(jobInfo);
    }

    public void displayRecord() {
        System.out.println("Employee Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("ImgPath: " + imgPath);

        System.out.println("\nJob Information:");

        for (EmployeeInfo info : jobInfos) {
            info.displayJobInfo();
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        try {
            Employee emp1 = new Employee(
                    "Yash",
                    "Raopura",
                    "Vadodara",
                    "Gujarat",
                    "India",
                    390001,
                    "Mann.jpg"
            );

            emp1.addJobInfos(new EmployeeInfo(
                    "Divyang",
                    "Backend Developer",
                    "Active",
                    "2025-12-22",
                    "2025-12-23",
                    10
            ));

            emp1.addJobInfos(new EmployeeInfo(
                    "Mann Kandoi",
                    "HR",
                    "InActive",
                    "2025-12-01",
                    "2025-12-02",
                    10
            ));

            employees.add(emp1);
        } catch (Exception e) {
            System.out.println("Invalid ZipCode! Please Enter numbers in ZipCode");
        }
        System.out.println("Displaying All Records: \n");

        for (Employee emp : employees) {
            System.out.println();
            emp.displayRecord();
            System.out.println();
        }
    }
}