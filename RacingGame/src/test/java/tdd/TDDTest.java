package tdd;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.in;
import static org.assertj.core.api.Assertions.not;
import static org.assertj.core.api.Assertions.notIn;


import static org.assertj.jodatime.api.Assertions.assertThat;
import static org.joda.time.DateTimeZone.UTC;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.junit.Test;

import static org.assertj.jodatime.api.Assertions.assertThat;

import static org.joda.time.DateTimeZone.UTC;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by betterFLY on 2018. 4. 14.
 * Github : http://github.com/betterfly88
 */

public class TDDTest {

    @Before
    public void setUp(){

    }

    @Test
    public void 자바_유틸(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, Calendar.JANUARY, 1, 0, 0, 0);

        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss.SSS");
        calendar.add(Calendar.DAY_OF_MONTH, 90);
        System.out.println(sdf.format(calendar.getTime()));
    }

    @Test
    public void 조다타임(){
        DateTime dateTime = new DateTime(2018, 4, 13, 0, 0, 0, 0);
        System.out.println(dateTime.plusDays(90).toString("yyyy-MM-dd E HH:mm:ss.SSS"));

        DateTime nowTime = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime("2018-04-13 00:23:54");
        String result = DateTimeFormat.forPattern("aa").withLocale(new Locale("ko")).print(nowTime);
        assertThat(result).isEqualTo("오전");

        DateTime utcTime = new DateTime(2013, 6, 10, 0, 0, DateTimeZone.UTC);
        DateTime cestTime = new DateTime(2013, 6, 10, 2, 0, DateTimeZone.forID("Europe/Berlin"));

        assertThat(utcTime).as("in UTC time").isEqualTo(cestTime);

    }

    @Test
    public void 시간검증_기본(){
        assertThat(new DateTime("1999-12-30")).isBefore(new DateTime("2000-01-01"));
        assertThat(new DateTime("2000-01-01")).isAfter(new DateTime("1999-12-30"));

        assertThat(new DateTime("2000-01-01")).isBeforeOrEqualTo(new DateTime("2000-01-01"));
        assertThat(new DateTime("2000-01-01")).isAfterOrEqualTo(new DateTime("2000-01-01"));
    }

    @Test
    public void 시간무시(){
        // ... milliseconds
        DateTime dateTime1 = new DateTime(2000, 1, 1, 0, 0, 1, 0, UTC);
        DateTime dateTime2 = new DateTime(2000, 1, 1, 0, 0, 1, 456, UTC);
        assertThat(dateTime1).isEqualToIgnoringMillis(dateTime2);
        // ... seconds
        dateTime1 = new DateTime(2000, 1, 1, 23, 50, 0, 0, UTC);
        dateTime2 = new DateTime(2000, 1, 1, 23, 50, 10, 456, UTC);
        assertThat(dateTime1).isEqualToIgnoringSeconds(dateTime2);
        // ... minutes
        dateTime1 = new DateTime(2000, 1, 1, 23, 50, 0, 0, UTC);
        dateTime2 = new DateTime(2000, 1, 1, 23, 00, 2, 7, UTC);
        assertThat(dateTime1).isEqualToIgnoringMinutes(dateTime2);
        // ... hours
        dateTime1 = new DateTime(2000, 1, 1, 23, 59, 59, 999, UTC);
        dateTime2 = new DateTime(2000, 1, 1, 00, 00, 00, 000, UTC);
        assertThat(dateTime1).isEqualToIgnoringHours(dateTime2);

    }

    @Test
    public void not_in(){

        assertThat(new DateTime("2000-01-01")).isIn(new DateTime("1999-12-22"), new DateTime("2000-01-01")); //A~B까지의 시간안에 포함
        assertThat(new DateTime("2000-01-01")).isNotIn(new DateTime("1999-12-31"), new DateTime("2000-01-02")); //B가 기준 날짜보다 크므로 not in 임
        // same assertions but parameters is String based representation of LocalDateTime
        assertThat(new LocalDateTime("2000-01-01")).isIn("1999-12-31", "2000-01-01").isNotIn("1999-12-31", "2000-01-02");



    }



}
