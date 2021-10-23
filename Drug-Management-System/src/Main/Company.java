package Main;
import java.util.Date;

public class Company {
    private String companyName;
    private Date establishedDate;
    private Address address;
    private Category category;

    public Company(String companyName, Date establishedDate, Address address, Category category) {
        this.companyName = companyName;
        this.establishedDate = establishedDate;
        this.address = address;
        this.category = category;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(Date establishedDate) {
        this.establishedDate = establishedDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }



    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", establishedDate=" + establishedDate +
                ", address=" + address +
                ", category=" + category +
                '}';
    }
}
