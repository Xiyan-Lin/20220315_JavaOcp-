package day21;

// 新科成員
public class Writer extends Thread {
    private Room room;
    // 擁有房間
    public Writer(Room room) {
        this.room = room;
    }
    @Override
    public void run() {
        try {
            // 填寫資料
            room.write();
        } catch (Exception e) {
        }
    }
}
