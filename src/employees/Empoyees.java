package employees;

public class Empoyees {
    private String familyName;
    private String name;
    private int age;
    private double salary;
    private double socialTaxRate;
    private double incomeTaxRate;
    private double pensionInsRate;
    private double unemplTaxRate;
    private double nonTaxMinimum;

    public Empoyees(String familyName, String name, int age, double salary) {
        this.familyName = familyName;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Empoyees(String familyName, String name, int age) {
        this.familyName = familyName;
        this.name = name;
        this.age = age;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSocialTaxRate() {
        return socialTaxRate;
    }

    public void setSocialTaxRate(double socialTaxRate) {
        this.socialTaxRate = socialTaxRate;
    }

    public double getIncomeTaxRate() {
        return incomeTaxRate;
    }

    public void setIncomeTaxRate(double incomeTaxRate) {
        this.incomeTaxRate = incomeTaxRate;
    }

    public double getPensionInsRate() {
        return pensionInsRate;
    }

    public void setPensionInsRate(double pensionInsRate) {
        this.pensionInsRate = pensionInsRate;
    }

    public double getUnemplTaxRate() {
        return unemplTaxRate;
    }

    public void setUnemplTaxRate(double unemplTaxRate) {
        this.unemplTaxRate = unemplTaxRate;
    }

    public double getNonTaxMinimum() {
        return nonTaxMinimum;
    }

    public void setNonTaxMinimum(double nonTaxMinimum) {
        this.nonTaxMinimum = nonTaxMinimum;
    }

    public double getSocTaxSum (){
        return salary * socialTaxRate;
    }

    public double getPensionTaxSum () {
        if(age < 60) {
            return salary * pensionInsRate;
        } else {
            return 0.0;
        }
    }

    public double getIncomTaxSum()  {
        double sum = salary - nonTaxMinimum;
        double unempl = sum * unemplTaxRate;
        double pens = sum * pensionInsRate;
        return  (sum - unempl - pens) * incomeTaxRate;
    }

    @Override
    public String toString() {
        return "familyName='" + familyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", socialTaxRate=" + socialTaxRate +
                ", incomeTaxRate=" + incomeTaxRate +
                ", pesionInsRate=" + pensionInsRate +
                ", unemplTaxRate=" + unemplTaxRate +
                ", nonTaxMinimum=" + nonTaxMinimum ;
    }
}
