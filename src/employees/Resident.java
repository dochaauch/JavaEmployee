package employees;

public class Resident extends Empoyees{
    public Resident(String familyName, String name, int age, double salary) {
        super(familyName, name, age, salary);
        super.setPensionInsRate(4.0);
        super.setIncomeTaxRate(20.0);
        super.setSocialTaxRate(0.33);
        super.setUnemplTaxRate(2.0);
        super.setNonTaxMinimum(2000.00);
    }

    public Resident(String familyName, String name, int age) {
        super(familyName, name, age);
        super.setPensionInsRate(4.0);
        super.setIncomeTaxRate(20.0);
        super.setSocialTaxRate(0.33);
        super.setUnemplTaxRate(2.0);
        super.setNonTaxMinimum(2000.00);
    }


    @Override
    public String toString() {
        return "Resident: "+ super.toString();
    }
}
