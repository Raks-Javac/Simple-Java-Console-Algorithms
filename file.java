import javafx.util.Pair;
import java.util.Scanner;

class file {
    //Market exchange prices taken from XE.com
    double UsdRate = 362.725; //1 US Dollar
    double EuroRate = 399.691; //1 Euro
    double GbpRate = 453.585; //1 Great Britain Pound
    double InrRate = 5.10728; //1 Indian Rupees
    double AudRate = 246.344; //1 Australian Dollar
    double SgdRate = 263.957; //1 Singapore Dollar
    double CadRate = 273.316; //1 Canadian Dollar
    double AedRate = 98.7691; //1 Emirati Dirham
    double SarRate = 96.7278; //1 Saudi Arabian Riyal
    double CnyRate = 51.1169; //1 Chinese Yuan

    public NairaConvert() {

    }

    public NairaConvert(double usdRate, double euroRate, double gbpRate,
        double inrRate, double audRate, double sgdRate, double cadRate,
        double aedRate, double sarRate, double cnyRate) {
        UsdRate = usdRate;
        EuroRate = euroRate;
        GbpRate = gbpRate;
        InrRate = inrRate;
        AudRate = audRate;
        SgdRate = sgdRate;
        CadRate = cadRate;
        AedRate = aedRate;
        SarRate = sarRate;
        CnyRate = cnyRate;
    }

    public Pair[] ConvertNaira(double naira) {
        return new Pair[] {
            new Pair < > ("USD", naira / UsdRate),
                new Pair < > ("EURO", naira / EuroRate),
                new Pair < > ("GBP", naira / GbpRate),
                new Pair < > ("INR", naira / InrRate),
                new Pair < > ("AUD", naira / AudRate),
                new Pair < > ("SGD", naira / SgdRate),
                new Pair < > ("CAD", naira / CadRate),
                new Pair < > ("AED", naira / AedRate),
                new Pair < > ("SAR", naira / SarRate),
                new Pair < > ("CNY", naira / CnyRate)

        };

    }
}
public class file {
    public static void main(String[] args) {
        NairaConvert XENaira = new NairaConvert();
        Scanner in = new Scanner(System.in);
        System.out.println("Naira to 10 currency converter \n");
        System.out.println("Please enter the amount in Naira: \n");
        String naira = in .nextLine();
        try {
            //  Block of code to try
            Double nairaValue = Double.parseDouble(naira);

            Pair[] result = XENaira.ConvertNaira(nairaValue);

            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i].getKey() + " : " + result[i].getValue() + "\n");
            }
        } catch (Exception e) {
            //  Block of code to handle errors
            System.out.println("Something went wrong. Maybe try entering numbers not alphabets");
        }

    }
}