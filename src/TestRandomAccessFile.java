import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) {
        RandomAccessFile inout = new RandomAccessFile("input.dat","rw");
        inout.setLength(0);
        for(int i=0;i<200;i++){
            inout.writeInt(i);
        }
    }
}
