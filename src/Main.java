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


    public String getManagerName() {
        return managerName;
    }

    public String getDepartment() {
        return department;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public LocalDate getNextReviewDate() {
        return nextReviewDate;
    }

    public double getSalary() {
        return salary;
    }


    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    public void setNextReviewDate(LocalDate nextReviewDate) {
        this.nextReviewDate = nextReviewDate;
    }

    public void setSalary(double salary) {
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

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getImgPath() {
        return imgPath;
    }

    public List<EmployeeInfo> getJobInfos() {
        return jobInfos;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setImgPath(String imgPath) {
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

        if (jobInfos.isEmpty()) {
            System.out.println("No Job Information Available.");
        }

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
                    "Yash.jpg"
            );

            emp1.addJobInfos(new EmployeeInfo(
                    "Divyang",
                    "Backend Developer",
                    "Active",
                    "2025-12-22",
                    "2025-12-23",
                    25000
            ));

            emp1.addJobInfos(new EmployeeInfo(
                    "Mann Kandoi",
                    "HR",
                    "InActive",
                    "2025-12-01",
                    "2025-12-02",
                    30000
            ));

            employees.add(emp1);

            Employee emp2 = new Employee(
                    "Mann",
                    "Gotri",
                    "Vadodara",
                    "Gujarat",
                    "India",
                    390021,
                    "Mann.jpg"
            );

            emp2.addJobInfos(new EmployeeInfo(
                    "Yash",
                    "Frontend Developer",
                    "Active",
                    "2025-11-10",
                    "2025-12-10",
                    20000
            ));

            employees.add(emp2);

            Employee emp3 = new Employee(
                    "Divyang",
                    "Alkapuri",
                    "Vadodara",
                    "Gujarat",
                    "India",
                    390007,
                    "Divyang.jpg"
            );

            emp3.addJobInfos(new EmployeeInfo(
                    "Mann",
                    "Database Developer",
                    "Active",
                    "2025-10-15",
                    "2025-11-15",
                    35000
            ));

            employees.add(emp3);

            Employee emp4 = new Employee(
                    "Rahul",
                    "Akota",
                    "Vadodara",
                    "Gujarat",
                    "India",
                    390020,
                    "Rahul.jpg"
            );

            employees.add(emp4);

            Employee emp5 = new Employee(
                    "Jay",
                    "Manjalpur",
                    "Vadodara",
                    "Gujarat",
                    "India",
                    390011,
                    "Jay.jpg"
            );

            emp5.addJobInfos(new EmployeeInfo(
                    "Rahul",
                    "Software Developer",
                    "Active",
                    "2025-09-01",
                    "2025-10-01",
                    55000
            ));

            emp5.addJobInfos(new EmployeeInfo(
                    "Yash",
                    "Testing",
                    "Active",
                    "2025-08-01",
                    "2025-09-01",
                    80000
            ));

            employees.add(emp5);

        } catch (NumberFormatException e) {
            System.out.println("Invalid ZipCode! Please Enter numbers in ZipCode.");

        } catch (Exception e) {
            System.out.println("Some other error occurred: " + e.getMessage());
        }


        System.out.println("Displaying All Records:\n");

        for (Employee emp : employees) {
            System.out.println();
            emp.displayRecord();
            System.out.println();
        }
    }
}