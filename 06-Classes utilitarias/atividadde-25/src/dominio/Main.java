import java.util.Calendar;
import java.util.Date;

void main(){
    Date agora = new Date();
    Calendar calendar = Calendar.getInstance();

    calendar.setTime(agora);

    System.out.println("Dia: " + calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println("Mês: " + (calendar.get(Calendar.MONTH) + 1));
    System.out.println("Ano: " + calendar.get(Calendar.YEAR));

}
