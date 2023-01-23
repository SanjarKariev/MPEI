package Employees;
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String firstName;
    private String lastName;
    private String patronymic;
    private double salary;

    public Employee(String firstName, String lastName, String patronymic, double salary) throws IllegalArgumentException {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.patronymic = patronymic;
            this.salary = salary;
        }
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Director extends Employee {
    private List<Employee> subordinates;

    public Director(String firstName, String lastName, String patronymic, double salary) {
        super(firstName, lastName, patronymic, salary);
        subordinates = new ArrayList<>();
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void hireEmployee(Employee employee) {
        subordinates.add(employee);
    }

    public void fireEmployee(Employee employee) {
        subordinates.remove(employee);
    }
}

class Accountant extends Employee {
    private double rate;

    public Accountant(String firstName, String lastName, String patronymic, double salary, double rate) {
        super(firstName, lastName, patronymic, salary);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateWages(double hours) {
        return rate * hours;
    }
}

class Guard extends Employee {
    private String specialMeans;

    public Guard(String firstName, String lastName, String patronymic, double salary, String specialMeans) {
        super(firstName, lastName, patronymic, salary);
        this.specialMeans = specialMeans;
    }

    public String getSpecialMeans() {
        return specialMeans;
    }

    public void setSpecialMeans(String specialMeans) {
        this.specialMeans = specialMeans;
    }
}

class Programmer extends Employee {
    public enum Level {
        JUNIOR, MIDDLE, SENIOR, LEAD
    }

    private Level level;
    private List<String> technologies;

    public Programmer(String firstName, String lastName, String patronymic, int salary, Level level) {
        super(firstName, lastName, patronymic, salary);
        this.level = level;
        this.technologies = new ArrayList<>();
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public void addTechnology(String technology) {
        this.technologies.add(technology);
    }
}

class Initials extends Employee {
    private String email;
    private String phoneNumber;

    public Initials(String firstName, String lastName, String patronymic, int salary, String email, String phoneNumber) {
        super(firstName, lastName, patronymic, salary);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class Payments extends Employee {
    private double bankAccount;

    public Payments(String firstName, String lastName, String patronymic, double salary, double bankAccount) throws IllegalArgumentException {
        super(firstName, lastName, patronymic, salary);
        this.bankAccount = bankAccount;
    }

    public double getPayments() {
        return this.bankAccount;
    }
}