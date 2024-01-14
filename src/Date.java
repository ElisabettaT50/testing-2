import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
Riprendi l'esercizio sulle date :

Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
Crea dei test per questo esercizio
 */
public class Date {
    public static void main(String[] args) {
        String date1 = "2002-03-01T13:00:00Z";
        formatAndPrintFull(date1, "UTC");
        formatAndPrintMedium(date1, "UTC");
        formatAndPrintShort(date1, "UTC");

    }
    public static void formatAndPrintFull(String date, String zoneId) {
        ZonedDateTime dateTime1 = OffsetDateTime.parse(date).atZoneSimilarLocal(ZoneId.of(zoneId));
        String formattedDateTimeFull = dateTime1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));

        System.out.println("Data in formato FULL: " + formattedDateTimeFull);

    }
    public static void formatAndPrintMedium(String date, String zoneId) {
        ZonedDateTime dateTime1 = OffsetDateTime.parse(date).atZoneSimilarLocal(ZoneId.of(zoneId));
        String formattedDateTimeMedium = dateTime1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));

        System.out.println("Data in formato MEDIUM: " + formattedDateTimeMedium);
    }
    public static void formatAndPrintShort(String date, String zoneId) {
        ZonedDateTime dateTime1 = OffsetDateTime.parse(date).atZoneSimilarLocal(ZoneId.of(zoneId));
        String formattedDateTimeShort = dateTime1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

        System.out.println("Data in formato SHORT: " + formattedDateTimeShort);
    }
}