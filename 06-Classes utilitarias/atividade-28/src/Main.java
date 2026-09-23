void main() {

Locale brazil = new Locale("pt", "BR");
Locale eua =  new Locale("en", "AU");

NumberFormat[] nf = new NumberFormat[2];
DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, brazil);
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

nf[0]= NumberFormat.getCurrencyInstance(brazil);
nf[1]= NumberFormat.getCurrencyInstance(eua);


Calendar calendar = Calendar.getInstance(brazil);

try {
    System.out.println(sdf.parse("11/09/2200"));
} catch (ParseException e) {
    throw new RuntimeException(e);
}

System.out.println(df.format(calendar.getTime()));
System.out.println(brazil.getDisplayCountry(eua));
System.out.println(Locale.ITALY.getDisplayCountry(Locale.KOREA));
System.out.println(nf[0].format(100999.99));
System.out.println(nf[1].format(100999.99));
System.out.println(sdf.format(new Date()));

}
