package employees;

public class Main {
    public static void main(String[] args) {
        Contractor conSergeev = new Contractor("Sergeev", "Igor", 25, 2700.00);
        System.out.println(conSergeev);
        System.out.println(conSergeev.getIncomTaxSum());
        NonResidentHour nrhSidorov = new NonResidentHour("Vasiljev", "Maksim", 54, "Turkey",160.0, 17.0);
        System.out.println(nrhSidorov);
        System.out.println(nrhSidorov.printCertificate());
    }
}
