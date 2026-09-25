import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import java.util.ArrayList;
import java.util.List;

public class SextaFeira13 {

    public static List<LocalDate> calcularQuantidadeSextaFeira13(int ano){
        int quantidadeSextaFeira13 = 0;

        List<LocalDate> sextaFeiras = new ArrayList<>();

        LocalDate ld = LocalDate.of(ano, Month.JANUARY, 13);

        while(ld.getYear() == ano){

            if(ld.getDayOfWeek() == DayOfWeek.FRIDAY){
                quantidadeSextaFeira13++;
                sextaFeiras.add(ld);
            }

            ld = ld.plusMonths(1);
        }

        return sextaFeiras;
    }
}
