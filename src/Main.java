public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Author name1 = new Author("Лев", "Толстой");
        System.out.print(name1.getName() + " ");
        System.out.println(name1.getSurName());
        System.out.println();
        Author name2 = new Author("Николай", "Гоголь");
        System.out.print(name2.getName() + " ");
        System.out.println(name2.getSurName());
        System.out.println();
        Books book1 = new Books("Война и мир.", 1865, name1);
        System.out.println(book1.getBook() + " ");
        System.out.println(book1.getYear() + " ");
        System.out.println(book1.author.getName());
        System.out.println();
        Books book2 = new Books("Мертвые души.", 1842, name2);
        System.out.println(book2.getBook());
        System.out.println(book2.getYear());
        System.out.println(book2.author.getName());
        System.out.println();
        book2.setYear(1845);
        System.out.println(book2.getYear());
    }
}
