package ibkozin.java_dt.addressbook.tests;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String titlePerson;
    private final String companyName;
    private final String addressMain;
    private final String homePhone;
    private final String mobilePhone;
    private final String workPhone;
    private final String email1;
    private final String addressSecondary;

    public ContactData(String firstName, String middleName, String lastName, String nickName, String titlePerson, String companyName, String addressMain, String homePhone, String mobilePhone, String workPhone, String email1, String addressSecondary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.titlePerson = titlePerson;
        this.companyName = companyName;
        this.addressMain = addressMain;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.email1 = email1;
        this.addressSecondary = addressSecondary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitlePerson() {
        return titlePerson;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddressMain() {
        return addressMain;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getEmail1() {
        return email1;
    }

    public String getAddressSecondary() {
        return addressSecondary;
    }
}
