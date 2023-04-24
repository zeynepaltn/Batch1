package practises;
import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
          /*

Bir restoranda, müşteriler menüden yemeklerini seçerler.
Restoran, müşterilerin seçtiği yemeği pişirmek için bir
program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
belirlendigi bir program yaziniz

*/
        String yemek="hamburger";
        switch (yemek){
            case "hamburger":
                System.out.println("Hamburger Menusu 200 TL");
                break;
            case"pizza":
                System.out.println("Pizza Menusu 500 TL");
                break;
            case "tavuk":
                System.out.println("Tavuk Menusu 700 TL");
                break;
            default:
                System.out.println("Oyle bir secenek yok");

        }
    /*
    Bir arac kiralama sitesinde secilen araba markasina gore degisen kiralama ucretine gore
    toplam odenecek fiyati gosteren kodu yazin
    SUV==>500.0
    SEDAN==>400.0
    HATCHBACK==>350.0
    GERIYE KALANLAR==>300 TL
    double toplamUcret=kiralamaUcreti*kiralanacakGunSayisi;
     */
    String aracTuru="SUV";
    int kiralanacakGunSayisi=5;
    double kiralamaUcreti;
    switch(aracTuru){
        case "SUV":
            kiralamaUcreti=500.0;
            break;
        case "SEDAN":
            kiralamaUcreti=400.0;
            break;
        case "HATCHBACK":
            kiralamaUcreti=350.0;
            break;
        default:
            kiralamaUcreti=300;
            break;
    }


        double toplamUcret=kiralamaUcreti*kiralanacakGunSayisi;
        System.out.println("toplam ucret= "+toplamUcret);
     /*
Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
kontrol eden bir program yaziniz   (elephant, lion, giraffe, default: belirtilen hayvan bulunamadi)
 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen beslemek istediğiniz hayvanın ismini yazın:");
        String animal = scanner.nextLine();

        switch (animal) {
            case "fil":
                System.out.println("Robot filin yanına gitti ve yemek verdi.");
                break;
            case "aslan":
                System.out.println("Robot aslanın yanına gitti ve yemek verdi.");
                break;
            case "zebra":
                System.out.println("Robot zebranın yanına gitti ve yemek verdi.");
                break;
            default:
                System.out.println("Maalesef beslemek istediğiniz hayvan mevcut değil.");
        }


    }//main
}//class
