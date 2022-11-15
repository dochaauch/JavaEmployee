package employees;

public class NonResidentHour extends NonResident implements SalaryPerHour{
    private double workHours;
    private double ratePerHours;

    public NonResidentHour(String familyName, String name, int age, String country, double workHours, double ratePerHours) {
        super(familyName, name, age, country);
        this.workHours = workHours;
        this.ratePerHours = ratePerHours;
        this.setSalary(getSalaryHours());
    }

    @Override
    public double getSalaryHours() {
        return workHours * ratePerHours;
    }

    @Override
    public String toString() {
        return super.toString() + "workHours: " + workHours + ", rate per hour: " + ratePerHours;
    }
}
