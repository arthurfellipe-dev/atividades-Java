void main() {
    LocalDate anniversary  = LocalDate.of(2009, Month.AUGUST, 11);
    LocalDate today = LocalDate.now();
    int howMuchDays;

    if(today.getDayOfYear() == anniversary.getDayOfYear()) {
        howMuchDays = 0;
    } else if (today.getDayOfYear() > anniversary.getDayOfYear()) {
        howMuchDays = 365 - (today.getDayOfYear() - anniversary.getDayOfYear()) ;
    } else{
        howMuchDays = anniversary.getDayOfYear() - today.getDayOfYear();
    }
    if(!today.isLeapYear() || !anniversary.isLeapYear()){
        System.out.println(howMuchDays);
    } else{
        System.out.println(howMuchDays - 1);
    }

}