/**
 * Purpose: Sort the array of contacts.
 *
 * @version 3/18/2022
 * @ Manit Mishra
 */
public class ContactsTester {
    public static void main(String[] args) {
        Contacts[] contactArray = new Contacts[10];
        contactArray[0] = new Contacts("Diana Prince", "aunt", "Oct 25", "321-555-0811" ,"wonderwoman@theamazon.net");
        contactArray[1] = new Contacts("Joe Smith", "mother", "Mar 4", "342-123-2934" ,"joeSmith@gmail.com");
        contactArray[2] = new Contacts("Jeff Smith", "father", "Nov 23", "174-243-1634" ,"bestsuperman@gmail.com");
        contactArray[3] = new Contacts("Curious George", "aunt", "Jan 5", "153-245-2345" ,"cheeseisgood@gmail.com");
        contactArray[4] = new Contacts("Flat Stanley", "uncle", "Feb 12", "364-235-7452" ,"lookup@gmail.com");
        contactArray[5] = new Contacts("John King", "friend", "Oct 23", "634-314-3461" ,"johnking@gmail.com");
        contactArray[6] = new Contacts("Jeff King", "uncle", "Apr 9", "735-134-3145" ,"bestofall@gmail.com");
        contactArray[7] = new Contacts("Arwen Dayton", "friend", "Apr 29", "634-234-4326" ,"bestbakery@gmail.com");
        contactArray[8] = new Contacts("Down theRoad", "uncle", "Nov 13", "743-362-4273" ,"downtheroad@gmail.com");
        contactArray[9] = new Contacts("Above You", "friend", "Mar 1", "435-734-2345" ,"amazingperson@gmail.com");

        System.out.println("<<Original Table>>");
        printTable(contactArray);

        System.out.println("\n<<Finding name Jeff Smith>>");
        insertionSortNames(contactArray);
        findName(contactArray, "Jeff Smith");

        System.out.println("\n<<Finding name Drake>>");
        insertionSortNames(contactArray);
        findName(contactArray, "Drake");

        System.out.println("\n<<Finding relationship aunt>>");
        insertionSortRelationships(contactArray);
        findRelation(contactArray, "aunt");

        System.out.println("\n<<Finding relationship step brother>>");
        insertionSortRelationships(contactArray);
        findRelation(contactArray, "step brother");

        System.out.println("\n<<Finding Birthdays in March>>");
        findBirthdays(contactArray, "Mar");

        System.out.println("\n<<Finding Birthdays in June>>");
        findBirthdays(contactArray, "June");

        System.out.println("\n<<Finding People with the phone number 342-123-2934>>");
        findPhoneNumbers(contactArray, "342-123-2934");

        System.out.println("\n<<Finding People with the phone number 123-123-1234>>");
        findPhoneNumbers(contactArray, "123-123-1234");

        System.out.println("\n<<Finding People with the email address joeSmith@gmail.com>>");
        findEmailAddress(contactArray, "joeSmith@gmail.com");

        System.out.println("\n<<Finding People with the email address johnKing@gmail.com>>");
        findEmailAddress(contactArray, "johnKing@gmail.com");
    }

    public static void printTable(Contacts[] contactArray){
        for (int i = 0; i < contactArray.length; i++){
            System.out.println(contactArray[i]);
        }
    }

    public static void insertionSortNames(Contacts[] contactArray){
        Contacts [] dest = new Contacts[contactArray.length];
        for (int i = 0; i < contactArray.length; i++){
            Contacts next = contactArray[i];
            int insertindex = 0;
            int k = i;

            while (k > 0 && insertindex == 0){
                if (next.getName().compareTo(dest[k-1].getName()) > 0){
                    insertindex = k;
                }
                else{
                    dest[k] = dest[k-1];
                }
                k--;
            }
            dest[insertindex] = next;
        }
        for (int i = 0; i < contactArray.length; i++){
            contactArray[i] = dest[i];
        }
    }

    public static void insertionSortRelationships(Contacts[] contactArray){
        Contacts [] dest = new Contacts[contactArray.length];

        for (int i = 0; i < contactArray.length; i++){
            Contacts next = contactArray[i];
            int insertindex = 0;
            int k = i;

            while (k > 0 && insertindex == 0){
                if (next.getRelation().compareTo(dest[k-1].getRelation()) > 0){
                    insertindex = k;
                }
                else{
                    dest[k] = dest[k-1];
                }
                k--;
            }
            dest[insertindex] = next;
        }
        for (int i = 0; i < contactArray.length; i++){
            contactArray[i] = dest[i];
        }
    }

    public static void findName(Contacts[] contactArray, String target){
        int high = contactArray.length;
        int low = -1;
        int probe;

        while (high - low > 1){
            probe = (high + low) / 2;

            if (contactArray[probe].getName().compareTo(target) > 0){
                high = probe;
            }
            else{
                low = probe;
                }
            }
        if (low >= 0 && contactArray[low].getName().compareTo(target) == 0){
            System.out.println(contactArray[low]);
        }
        else{
            System.out.println("The name " + target + " is not in this collection");
        }
    }

    public static void findRelation(Contacts[] contactArray, String target){
        int high = contactArray.length;
        int low = -1;
        int probe;

        while (high - low > 1){
            probe = (high + low) / 2;

            if (contactArray[probe].getRelation().compareTo(target) > 0){
                high = probe;
            }
            else{
                low = probe;
                if (contactArray[probe].getRelation().compareTo(target) == 0){
                    break;
                }
            }
        }

        if (low >= 0 && contactArray[low].getRelation().compareTo(target) == 0){
            linearPrintLoc(contactArray, low, target);
        }
        else{
            System.out.println("There are no " + target + "s in this collection");
        }
    }

    public static void findBirthdays(Contacts[] contactArray, String target){
        int found = 0;

        for (int i = 0; i < contactArray.length; i++){
            if (contactArray[i].getBirthday().substring(0, 3).compareTo(target) == 0){
                found = i;
                System.out.println(contactArray[i]);
            }
        }

        if (found == 0){
            System.out.println("There no one in the collection with a birthday in " + target);
        }
    }

    public static void findPhoneNumbers(Contacts[] contactArray, String target){
        int found = 0;

        for (int i = 0; i < contactArray.length; i++){
            if (contactArray[i].getPhoneNumber().compareTo(target) == 0){
                found = i;
                System.out.println(contactArray[i]);
            }
        }
        if (found == 0){
            System.out.println("There is no one in the collection with the phone number " + target);
        }
    }

    public static void findEmailAddress(Contacts[] contactArray, String target){
        int found = 0;

        for (int i = 0; i < contactArray.length; i++){
            if (contactArray[i].getEmailAddress().compareTo(target) == 0){
                found = 1;
                System.out.println(contactArray[i]);
            }
        }
        if (found == 0){
            System.out.println("There is no one in the collection with the email address " + target);
        }
    }

    public static void linearPrintLoc(Contacts[] contactArray, int low, String target){
        int i;
        int start = low;
        int end = low;

        i = low-1;

        //Find starting point

        while (i >= 0 && (contactArray[i].getRelation().compareTo(target) == 0)){
            start = i;
            i--;
        }

        //Find ending point
        i = low + 1;

        while ((i < contactArray.length) && (contactArray[i].getRelation().compareTo(target) == 0)){
            end = i;
            i++;
        }

        for (i = start; i <= end; i++){
            System.out.println(contactArray[i]);
        }
    }










}