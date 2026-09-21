
void main() {
    Calendar data = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println(sdf.format(data.getTime()));

    GerenciadorCalendario.addBusinessDays(data, 7 );

    System.out.println(sdf.format(data.getTime()));


}
