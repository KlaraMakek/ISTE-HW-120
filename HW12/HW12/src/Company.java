/**
 *  Company thing
 * @author Klara Makek
 * @version 29.11.2022.
 * Course: ISTE-120
 * HW 12
 */
/************** JAVADOC ************************/
public interface Company {
    String companyName = "Super Employer Inc.";
    String companyAddress = "Rochester, NY";
    int weepPaid = 52;

    void setPay(double pay);
    double calcAnnualPay();
    double calcWeeklyPay();
}
