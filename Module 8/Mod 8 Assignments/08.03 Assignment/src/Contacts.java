/**
 * Purpose: Contact
 *
 * @version 3/18/2022
 * @ Manit Mishra
 */
public class Contacts {
    String name;
    String relation;
    String birthday;
    String phoneNumber;
    String emailAddress;

    public Contacts(String n,String r,String b,String p,String e){
        name = n;
        relation = r;
        birthday = b;
        phoneNumber = p;
        emailAddress = e;
    }

    public String getName(){return name;}
    public void setName(String n){name = n;}

    public String getRelation(){return relation;}
    public void setRelation(String r){relation = r;}

    public String getBirthday(){return birthday;}
    public void setBirthday(String b){birthday = b;}

    public String getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(String p){phoneNumber = p;}

    public String getEmailAddress(){return emailAddress;}
    public void setEmailAddress(String e){emailAddress = e;}

    public String toString(){
        String str = String.format("%-20s %-10s %-12s %-18s %-22s", name, relation, birthday, phoneNumber, emailAddress);
        return str;
    }
}