package employees;

public class NonResident extends Empoyees implements CountryAbility{
    private String country;

    public NonResident(String familyName, String name, int age, double salary, String country) {
        super(familyName, name, age, salary);
        super.setPensionInsRate(0.0);
        super.setIncomeTaxRate(0.0);
        super.setSocialTaxRate(0.0);
        super.setUnemplTaxRate(0);
        super.setNonTaxMinimum(0);
        this.country = country;
    }

    public NonResident(String familyName, String name, int age, String country) {
        super(familyName, name, age);
        super.setPensionInsRate(0.0);
        super.setIncomeTaxRate(0.0);
        super.setSocialTaxRate(0.0);
        super.setUnemplTaxRate(0);
        super.setNonTaxMinimum(0);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String printCertificate() {
        return (getFamilyName() + " " + getName() + " " + getSalary() +
                "EUR. the above-mentioned person is a non-resident");
    }

    @Override
    public String showCountry() {
        return "Our person's residence relates to the country of  " + getCountry();
    }

    @Override
    public String toString() {
        return "NonResident " + super.toString() + ", country: " + country;
    }
}
