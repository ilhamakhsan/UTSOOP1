
package uts_oop1;

import java.util.LinkedList;
import java.util.List;

public class funtion {
    private static List<Data> DaftarMhs = new LinkedList<Data>();

    public static void addData(Data mhs) {
        DaftarMhs.add(mhs);
    }

    public static void editData(Data mhs, int id) {
        DaftarMhs.set(id, mhs);
    }

    public static void deleteData(int id) {
        DaftarMhs.remove(id);
    }

    public static List<Data> getListData() {
        return DaftarMhs;
    }
}
