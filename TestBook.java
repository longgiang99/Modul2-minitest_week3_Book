package minitest_week3;

//import java.util.Arrays;



public class TestBook {
    public static void main(String[] args) {
        Book[] tensach = new Book[10];
        tensach[0] = new ProgrammingBook("P001", "java programming", 10000, "giang", "java", "java framework");
        tensach[1] = new ProgrammingBook("P002", "python programming", 10000, "giang", "java", "python framework");
        tensach[2] = new ProgrammingBook("P003", "ruby programming", 10000, "giang", "java", "ruby framework");
        tensach[3] = new ProgrammingBook("P004", "php programming", 10000, "giang", "java", "php framework");
        tensach[4] = new ProgrammingBook("P005", "js programming", 10000, "giang", "java", "js framework");
        tensach[5] = new FictionBook("F001", "fiction 1", 10000, "giang", "son");
        tensach[6] = new FictionBook("F002", "fiction 2", 10000, "giang", "thi");
        tensach[7] = new FictionBook("F003", "fiction 3", 10000, "giang", "hung");
        tensach[8] = new FictionBook("F004", "fiction 4", 10000, "giang", "giang");
        tensach[9] = new FictionBook("F005", "fiction 5", 200000, "giang", "nam");
double total = 0.0;
        for (Book e: tensach) {
            total += e.getPrice();
        }
        System.out.println("gia tien 10 quyen sach la: "+ total);
//        System.out.println(Arrays.toString(programmingBook));
//        System.out.println(Arrays.toString(fictionBooks) );
//        double total = 0.0;
//        for (ProgrammingBook book : programmingBook) {
//            total += book.getPrice();
//        }
//        for (FictionBook book : fictionBooks) {
//            total += book.getPrice();
//        }
//        System.out.println("tong gia tien 10 quyen sach la: " + total);
        int soSachFiction = 0;
        int soSachGiaDuoi100 = 0;
        for (Book book: tensach) {
//            if(book instanceof FictionBook fictionBook){
//                if(fictionBook.getCatrgory().equals("thi"))
//               {
//                   soSachFiction++;
//               }
//            }
            if(book instanceof FictionBook && ((FictionBook)book).getCatrgory().equals("thi")){
                soSachFiction++;
            }
            if(book.getPrice() <100000){
                soSachGiaDuoi100++;
            }
        }
//        for (FictionBook book : fictionBooks) {
//            if (book.getCatrgory().equals("vien tuong 1")) {
//                soSachFiction++;
//            }
//
//            if (book.getPrice() < 100000) {
//                soSachGiaDuoi100++;
//            }
//        }
        System.out.println("so sach vien tuong 1 la: "+soSachFiction);
        System.out.println("so sach gia duoi 100k la: " + soSachGiaDuoi100);
    }
}
