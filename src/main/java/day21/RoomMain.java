package day21;

public class RoomMain {
    public static void main(String[] args) {
        // 有一間房間(診間)
        Room room = new Room();
        // 有三位病人
        Person p1 = new Person(room);
        Person p2 = new Person(room);
        Person p3 = new Person(room);
        Writer w1 = new Writer(room);
        Writer w2 = new Writer(room);
        Writer w3 = new Writer(room);
        // 設定執行緒名稱
        p1.setName("小明");
        p2.setName("小華");
        p3.setName("小英");
        w1.setName("John");
        w2.setName("Mary");
        w3.setName("Helen");
        // 爭先恐後去看診
        p1.start();
        p2.start();
        p3.start();
        // 爭先恐後去填資料
        w1.start();
        w2.start();
        w3.start();
    }
}
