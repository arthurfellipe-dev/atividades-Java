import java.util.Calendar;

public class GerenciadorCalendario {

    private GerenciadorCalendario() {
    }

    public static Calendar addBusinessDays(Calendar data, int dias) {
        var adicionados = 0;
        while (adicionados < dias) {

            data.add(Calendar.DAY_OF_MONTH, 1);

            if (data.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && data.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
                adicionados++;
            }
        }

        return data;
    }
}
