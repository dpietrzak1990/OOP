package DayOfTheWeekend;

import sun.security.provider.Sun;

import java.awt.*;

/**
 * Created by RENT on 2017-08-24.
 */
public class Days {

    public enum DayOfTheWeek {
        MONDAY("PONIEDZIALEK"){
            public DayOfTheWeek next(){
                return TUESDAY;
            }
        },
        TUESDAY("WTOREK"){
            public DayOfTheWeek next(){
                return TUESDAY;
            }
        },
        WEDNESDAY("SRODA"){
            public DayOfTheWeek next(){
                return WEDNESDAY;
            }
        },
        THURSDAY("CZWARTEK"){
            public DayOfTheWeek next(){
                return THURSDAY;
            }
        },
        FRIDAY("PIATEK"){
            public DayOfTheWeek next(){
                return FRIDAY;
            }
        },
        SATURDAY("SOBOTA"){
            public DayOfTheWeek next(){
                return SATURDAY;
            }
        },
        SUNDAY("NIEDZIELA"){
            public DayOfTheWeek next(){
                return SUNDAY;
            }
        };

        private final String dzienTygodnia;

        public abstract DayOfTheWeek next();


        DayOfTheWeek(String dzienTygodnia) {
            this.dzienTygodnia = dzienTygodnia;
        }

        public String getDzienTygodnia() {
            return dzienTygodnia;
        }
    }
    public static void main(String[] args) {
        for(DayOfTheWeek day : DayOfTheWeek.values()) {
            System.out.printf("%s %s\n", day.getDzienTygodnia(), day.next().getDzienTygodnia());
        }
    }

}
