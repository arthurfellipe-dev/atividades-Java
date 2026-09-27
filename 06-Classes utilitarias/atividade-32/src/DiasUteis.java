import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DiasUteis {

    public static List<LocalDate> calcularDiasUteisEntre(LocalDate inicio, LocalDate fim){

        List<LocalDate> diasUteis = new ArrayList<>();

        while(!inicio.isAfter(fim)){

            if(inicio.getDayOfWeek() != DayOfWeek.SATURDAY && inicio.getDayOfWeek() != DayOfWeek.SUNDAY){
                diasUteis.add(inicio);
            }

            inicio = inicio.plusDays(1);
        }
        return diasUteis;
    }
}
