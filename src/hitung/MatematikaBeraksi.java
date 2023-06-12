
package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args){
        //membuat objek
        Matematika nina = new Matematika(7,5);
        
        System.out.println("Hasil penjumlahan: "+nina.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+nina.setPengurangan());
        System.out.println("Hasil perkalian: "+nina.setPerkalian());
        System.out.println("Hasil pembagian: "+nina.setPembagian());
    }
}
