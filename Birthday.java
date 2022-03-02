import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthday [YYYY-MM-DD]");
        String birthday = sc.nextLine();
        sc.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate realBirthday = LocalDate.parse(birthday, formatter);
        int month = realBirthday.getMonth().getValue();
        int day = realBirthday.getDayOfMonth();

        // Ares
        if (month >= 3 && month <= 4) {
            if (month == 3) {
                if (day >= 21 && day <= 31) {
                    System.out.println("You are an Ares");
                }
            } else if (month == 4) {
                if (day >= 1 && day <= 19) {
                    System.out.println("You are an Ares");
                }

            }

        }

        // Taurus
        else if (month >= 4 && month <= 5) {
            if (month == 4) {
                if (day >= 20 && day <= 30) {
                    System.out.println("You are a Taurus");
                }
            } else if (month == 5) {
                if (day >= 1 && day <= 20) {
                    System.out.println("You are a Taurus");
                }

            }

        }

        // Gemini
        else if (month >= 5 && month <= 6) {
            if (month == 5) {
                if (day >= 21 && day <= 31) {
                    System.out.println("You are a Gemini");
                }
            } else if (month == 6) {
                if (day >= 1 && day <= 20) {
                    System.out.println("You are a Gemini");
                }

            }

        }

        // Cancer
        else if (month >= 6 && month <= 7) {
            if (month == 6) {
                if (day >= 21 && day <= 30) {
                    System.out.println("You are a Cancer");
                }
            } else if (month == 7) {
                if (day >= 1 && day <= 22) {
                    System.out.println("You are a Cancer");
                }

            }

        }

        // Leo
        else if (month >= 7 && month <= 8) {
            if (month == 7) {
                if (day >= 21 && day <= 31) {
                    System.out.println("You are a Leo");
                }
            } else if (month == 8) {
                if (day >= 1 && day <= 22) {
                    System.out.println("You are a Leo");
                }

            }

        }

        // Virgo
        else if (month >= 8 && month <= 9) {
            if (month == 8) {
                if (day >= 23 && day <= 31) {
                    System.out.println("You are a Virgo");
                }
            } else if (month == 9) {
                if (day >= 1 && day <= 22) {
                    System.out.println("You are a Virgo");
                }

            }

        }

        // Libra
        else if (month >= 9 && month <= 10) {
            if (month == 9) {
                if (day >= 23 && day <= 30) {
                    System.out.println("You are a Libra");
                }
            } else if (month == 10) {
                if (day >= 1 && day <= 22) {
                    System.out.println("You are a Libra");
                }

            }

        }

        // Scorpio
        else if (month >= 10 && month <= 11) {
            if (month == 10) {
                if (day >= 23 && day <= 31) {
                    System.out.println("You are a Scorpio");
                }
            } else if (month == 11) {
                if (day >= 1 && day <= 22) {
                    System.out.println("You are a Scorpio");
                }

            }

        }

        // Sagittarius
        else if (month >= 11 && month <= 12) {
            if (month == 11) {
                if (day >= 22 && day <= 30) {
                    System.out.println("You are a Sagittarius");
                }
            } else if (month == 12) {
                if (day >= 1 && day <= 21) {
                    System.out.println("You are a Sagittarius");
                }

            }

        }

        // Capricorn
        else if (month == 12 || month == 1) {
            if (month == 12) {
                if (day >= 22 && day <= 31) {
                    System.out.println("You are a Capricorn");
                }
            } else if (month == 1) {
                if (day >= 1 && day <= 19) {
                    System.out.println("You are a Capricorn");
                }

            }

        }

        // Aquarius
        else if (month >= 1 && month <= 2) {
            if (month == 1) {
                if (day >= 20 && day <= 31) {
                    System.out.println("You are an Aquarius");
                }
            } else if (month == 2) {
                if (day >= 1 && day <= 18) {
                    System.out.println("You are an Aquariusn");
                }

            }

        }

        // Pisces
        else if (month >= 2 && month <= 3) {
            if (month == 2) {
                if (day >= 19 && day <= 29) {
                    System.out.println("You are an Pisces");
                }
            } else if (month == 3) {
                if (day >= 1 && day <= 20) {
                    System.out.println("You are an Pisces");
                }

            }

        }

    }
}
