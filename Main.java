import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        private static String checkBookReturnDeadline(String bookISBN) {

            for (int i = 0; i < patrons.length;i++) {
                String ISBN = patrons[i][1];
                if (ISBN != null) {
                    if (ISBN.equalsIgnoreCase(bookISBN)) {
                        System.out.println(bookISBN + " ISBN numarasına sahip kitap bulundu.");

                        LocalDate bugun = LocalDate.now();
                        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");

                        System.out.println("Kitabın ödünç alındığı tarih      : " + format.format(bugun).toUpperCase());
                        LocalDate teslimTarihi = bugun.plusDays(10);
                        System.out.println("Kitabın getirilmesi gereken tarih : " + format.format(teslimTarihi));

                        Scanner scan = new Scanner(System.in);
                        System.out.print("Kitabın geldiği tarih (gg.aa.yyyy biçimini girin): ");
                        String kitapGelisTarihiStr = scan.next();
                        LocalDate kitapGelisTarihi = LocalDate.parse(kitapGelisTarihiStr, format);

                        if (kitapGelisTarihi.isAfter(teslimTarihi)) {
                            System.out.println("Kitap beklenenden geç geldi!");
                            System.out.println("Kullanıcının 1 ay süreyle kitap ödünç alması yasaktır.");

                            break;
                        } else {
                            System.out.println("Kitap son teslim tarihinden önce teslim edildi.");
                            System.out.println("Kullanıcı kitap ödünç alabilir.");
                        }
                    } else {
                        System.out.println("Bu T.C'ye ait kayıt bulunamadı.");
                        break;
                    }
                } else {
                    break;
                }

            }
            return "Kullanıcı kitap ödünç alabilir. ";

        }

        }
        }



