package day21;

// 病人 Patient
public class Person extends Thread {
    private Room room;
    // 病人擁有房間
    public Person(Room room) {
        this.room = room;
    }
    @Override
    public void run() {
        try {
            // 去看診 
            room.watch();
        } catch (Exception e) {
        }
    }
    
}
