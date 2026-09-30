void main() {
    Locale locale = Locale.getDefault();

    Scanner input = new Scanner(System.in);

    System.out.println("""
                    Welcome to a java world, please select your language: 
                    1-Portuguese
                    2-English
                    """);

    var choose = input.nextInt();

    switch (choose) {
        case 1 -> locale = Locale.of("pt", "BR");
        case 2 -> locale = Locale.of("en", "US");
        default-> System.out.println("Invalid input");
    }

    ResourceBundle bundle = ResourceBundle.getBundle("message", locale);

    System.out.println(bundle.getString("bemVindo"));
}