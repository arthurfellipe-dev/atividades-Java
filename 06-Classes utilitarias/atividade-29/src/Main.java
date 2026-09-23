void main() {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
    NumberFormat nf = NumberFormat.getCurrencyInstance(new  Locale("pt", "BR"));

    System.out.println(nf.format(1250.39));

    System.out.println(sdf.format(new Date()));


}
