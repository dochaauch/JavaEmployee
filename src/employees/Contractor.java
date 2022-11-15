package employees;

public class Contractor extends Empoyees{

    public Contractor(String familyName, String name, int age, double salary) {
        super(familyName, name, age, salary);
        super.setPensionInsRate(0.0);
        super.setIncomeTaxRate(0.2);
        super.setSocialTaxRate(0.33);
        super.setUnemplTaxRate(0);
        super.setNonTaxMinimum(0);
    }

    @Override
    public String toString() {
        return "Contractor " + super.toString();
    }
}
