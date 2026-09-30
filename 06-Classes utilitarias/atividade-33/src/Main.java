void main() {
    Locale brasil = new Locale("pt", "BR");
    Locale usa = new Locale("en", "US");

    ResourceBundle bundle = ResourceBundle.getBundle("message", brasil);
    ResourceBundle bundle1 = ResourceBundle.getBundle("message", usa);

    System.out.println(bundle.getString("bemVindo"));
    System.out.println(bundle1.getString("bemVindo"));
}