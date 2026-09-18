import java.util.ArrayList;
import java.util.List;

class EmployeeInfo {
    private String managerName;
    private String department;
    private String status;
    private String reviewDate;
    private String nextReviewDate;
    private double salary;

    public EmployeeInfo(String managerName, String department, String status, String reviewDate, String nextReviewDate,double salary) {
        this.managerName = managerName;
        this.department = department;
        this.status = status;
        this.reviewDate = reviewDate;
        this.nextReviewDate = nextReviewDate;
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
    private String zipCode;
    private String imgPath;


    public Employee(String name, String address, String city, String state, String country, String zipCode, String imgPath) {
        name = name;
        address = address;
        city = city;
        state = state;
        country = country;
        zipCode = zipCode;
        imgPath = imgPath;

    }


    public void displayRecord(){
        System.out.println("Employee Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("ImgPath: " + imgPath);

    }

}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<EmployeeInfo> empinfo = new ArrayList<>();

        employees.add(new Employee("Mann Kandoi","Raopura","Vadodara", "Gujarat","India","Sp101",
                "Mann.jpg"));
        empinfo.add(new EmployeeInfo("Dhruv Mistry","IT","Active" ,"2025-12-22","2025-12-23",5000));


        employees.add(new Employee("Divyang Rana","Bhayandar","Surat", "Gujarat","India","Ss101",
                "Divyang.jpg"));
        empinfo.add(new EmployeeInfo("Kaustubh Soni","HR","OnLeave" ,"2026-09-22","2026-09-23",3000));


        employees.add(new Employee("Manthan Jaiswal","Mira Road","Naintal", "Utrakhand","India","ps1101",
                "Manthan.jpg"));
        empinfo.add(new EmployeeInfo("Suraj Patni","Accountant","Active" ,"2026-12-12","2026-12-13",2000));


        employees.add(new Employee("Sunil Agrawal","Dahisar","Jaipur", "Rajasthan","India","RJ001",
                "Sunil.jpg"));
        empinfo.add(new EmployeeInfo("Viru Shihalya","HR","Busy" ,"2026-11-01","2026-11-02",8000));

        employees.add(new Employee("Nirav","Borlivali","Mumbai", "Maharashtra","India","GJ011",
                "Nirav.jpg"));
        empinfo.add(new EmployeeInfo("Samir","Sales Officer","Active" ,"2026-10-21","2026-10-22",9000));



        System.out.println("Displaying All Records: \n");
        for(Employee emp : employees){
            System.out.println();
            emp.displayRecord();
            System.out.println();
        }

        System.out.println("Displaying Job Information: \n");

        for(EmployeeInfo info : empinfo){
            info.displayJobInfo();
            System.out.println();
        }
    }

}
