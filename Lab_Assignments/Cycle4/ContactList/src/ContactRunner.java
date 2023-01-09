import java.util.LinkedList;

public class ContactRunner {
    public static void main (String[] args)
    {
        // create LinkedList
        LinkedList<Contact> contactList = new LinkedList<Contact>();

        // add 5 Contacts to list
        contactList.add(new Contact( "George Washington", "(800) 555-1234" ));
        contactList.add(new Contact( "John Adams", "(800) 555-4567" ));
        contactList.add(new Contact( "Thomas Jefferson", "(800) 555-7890" ));
        contactList.add(new Contact( "James Madison", "(800) 555-3456" ));
        contactList.add(new Contact( "James Monroe", "(800) 555-2345" ));

        // get first and last Contact from list
        Contact first = contactList.getFirst();
        Contact last = contactList.getLast();

        // print out contact info for first and last object
        System.out.println("FIRST: " + first.getName() + ": " + first.getNumber() );
        System.out.println("LAST : " + last.getName() + ": " + last.getNumber() );

        // print out names from entire list
        for (int i=0; i<contactList.size(); i++)
        {
            Contact c = contactList.get(i);
            System.out.print(c.getName() + ", ");
        }
    }
}
