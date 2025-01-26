public class StrMtds {
    public static void main(String[] args) {
        String book = "Human Nature";
        System.out.println(book.toUpperCase());
        System.out.println(book.length()+" Including the White Space");
        // This is to replace all the gvn existing chars in the string with the new char
        System.out.println(book.replace('a', '4'));
        System.err.println(book.subSequence(0, 5));
        

    }
}
