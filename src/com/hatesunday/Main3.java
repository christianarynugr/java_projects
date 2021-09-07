package com.hatesunday;

// KANTOR CABANG
class abcd{
    String nama; // Parameter
    Integer love; // Parameter

    // Constructor CARA 1
    //abcd(String inputNama, String inputLove){
    //    nama = inputNama;
    //    num = inputLove;
    //}

    // Constructor CARA 2
    abcd(String nama, Integer love){
        this.nama = nama;
        this.love = love;
    }

    // METHOD tanpa return dan tanpa Parameter(a)
    void show(){
        System.out.println("Lucy, " + this.nama);
        System.out.println("I love you " + this.love);
    }
    // METHOD tanpa return dengan Parameter(b)
    void setName(String nama){
        this.nama = nama;
    }
    // METHOD dengan return dan tanpa Parameter(c)
    String getName(){
        return this.nama;
    }
    Integer getLove(){
        return this.love;
    }
    // METHOD dengan return dan dengan parameter(d)
    String lucy(String message){
    return message + " in the sky with " + this.nama;
    }

}

// KANTOR CABANG 2
class efgh {
    String nama;           //Parameter
    efgh(String nama){    //Constructor
        this.nama = nama;
    }
    void show(){           //Method 
        System.out.println(this.nama + " lucu");
    }
    
}

// KANTOR PUSAT
public class Main3 {
    public static void main(String[] args){
        
        abcd object1 = new abcd("Lucy", 3000);
        //tampil (a)
        object1.show();
        //tampil (b)
        object1.setName("Diamonds");
        object1.show();
        //tampil (c)
        // System.out.println(object1.getName());
        // System.out.println(object1.getLove());
        //tampil (d)
        String data = object1.lucy("Lucy");
        System.out.println(data);

        efgh object2 = new efgh("Kamu");
        object2.show();

        test();
    }

    static void test(){
        System.out.println("COMPILING SUCCESSFULL");
    }
}