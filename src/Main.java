import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(5);
        myList.add(3);
        myList.add(1);
        myList.add(555);
        myList.add(1234);
        System.out.println(myList);
        myList.size();
        System.out.println(myList);
        myList.get(3);
        myList.remove(4);
        System.out.println(myList);
    }
}
