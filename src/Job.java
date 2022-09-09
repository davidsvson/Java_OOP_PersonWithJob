public class Job {
    private String company;
    private double salary;

    public Job(String company, double salary) {
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
