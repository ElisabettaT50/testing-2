import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void formatAndPrintFull() {
        ZonedDateTime dateTime1 = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("UTC"));
        String formattedDateTimeFull = dateTime1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));

        assertEquals("venerdì 1 marzo 2002 13:00:00 Tempo coordinato universale", formattedDateTimeFull);
    }

    @Test
    void formatAndPrintMedium() {
        ZonedDateTime dateTime1 = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("UTC"));
        String formattedDateTimeMedium = dateTime1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));

        assertEquals("1 mar 2002, 13:00:00", formattedDateTimeMedium);
    }
    @Test
    void foratAndPrintShort() {
        ZonedDateTime dateTime1 = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("UTC"));
        String formattedDateTimeShort = dateTime1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

        assertEquals("01/03/02, 13:00", formattedDateTimeShort);
    }
}