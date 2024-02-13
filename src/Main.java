// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ABook book1 = new ABook();
        ABook book2 = new ABook();
        Contact John = new Contact("John", "John@gmail.com");
        Contact Billy = new Contact("Billy", "billyBoy@gmail.com");
        Contact Ron = new Contact("Ron", "ronOffMyLawn@gmail.com");
        book1.addContact(John);
        book1.addContact(Billy);
        book2.addContact(Billy);
        book2.addContact(Ron);

        System.out.println(book1.getContacts());
        System.out.println(book2.getContacts());
    }
}