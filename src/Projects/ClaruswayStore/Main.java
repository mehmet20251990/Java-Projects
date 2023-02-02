package Projects.ClaruswayStore;

public class Main {
    /*
    Clarusway firması bizlerden kendi dükkanında satmak üzere bir program yazmamızı talep etmektedir.

Dükkanda sadece Laptop ve Cep Telefonu satılacaktır.

5 farklı class 1 tane Abtract class creat etmeniz beklenmektedir.

Brand

Product (Abstract Class)

Notebook

MobilePhone

Store

Main

Brand Class ı Nitelikleri:

id = Ürün id si
name; Ürün markası
List<Brand> brandList=new ArrayList<>() = Ürün marka listesi

Brand Class ı Metotları:

id ve name parametrelerinin kabul edildiği  bir constructor create ediniz

createBrands() → Markaların marka listesine atıldığı ve brandList listesine ekleme işleminin yapıldığı bir metot oluştrunuz.

printBrands() → Marka isimlerinin konsolda görünmesini sağlayacak bir metot oluşturunuz.

Brand getBrand(int id) Parametre olarak marka id sini alarak bizlere ilgili markayı return etmeyi sağlayan bir metot oluşturunuz.

Store Class ı Nitelikleri:

Bulunamamaktadır.

Store Class ı Metotları:

run() → Notebook işlemlerinin yapıldığı, MobilePhone işlemlerinin yapıldığı, Markaların listelendiği ve çıkış yapılabildiği
bir metot oluşturunuz.

Product Abs. Nitelikleri:

Scanner scanner=new Scanner(System.in);
id = Ürün id si
name = Ürün ismi
price = Ürün fiyatı
discountRate = Ürün indirim oranı
amount = Ürün stoğu
Brand brand = Brand
screenSize = Ürün ekran boyutu
ram = Ürün ram i
memory = Ürün hafızası

Product Abs. Metotları:

void menu()

void addItem()

void getProducts()

void deleteItem()

NoteBook Class ı Nitelikleri:

**Notebook Class ı Products a extend  olmalıdır.

nId=1;
ArrayList<Notebook> notebooks=new ArrayList<>() = notebook listesi

NoteBook Class ı Metotları:

 name,price,discountRate,amount,brand,screenSize,ram,memory → niteliklerinin aldığı bir constructor create edilmelidir.
 super class a assign edilmelidir

menu() → Override edilmelidir. bu metoda notebook için işlemler bulunmalıdır (Notebook ekleme, listesinin görüntülenmesi,
silme, markaya göre filtreleme)

addItem() → Override edilmelidir. Bu metodda ürünün ilgili özelliklerinin (name,price,discountRate,amount,brand,screenSize,
ram,memory) olduğu ve notebook listesine eklendiği işlemler yapılmalıdır.

getProducts() → Override edilmelidir.

print(ArrayList<Notebook> notebookList) → Notebook listesindeki ürünler olmalıdır.

| ID | Ürün Adı     | Fiyatı      | Markası      | Stoğu     | İndirim Oranı    | RAM    | Ekran Boyutu      | Hafızası   |

deleteItem() → Override edilmelidir.  Silme işlemi yapılmalıdır.

brandFilter() → Filtreleme işlemleri yapılmalıdır.

Main Class ı Metotları
***
Programın çalışabilmesi için obj. create etmek ve programı çalıştırmak için kullanılmalıdır
     */
    public static void main(String[] args) {
        Store claruswayStore = new Store();
        claruswayStore.run();
    }
}