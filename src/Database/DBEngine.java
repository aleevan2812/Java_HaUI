package Database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DBEngine {
    public void SaveFile(String fileName, Object obj) throws Exception {
        FileOutputStream fs = new FileOutputStream(fileName);
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(obj);
        fs.close();
        os.close();
    }

    public Object ReadFile(String fileName) throws Exception {
        Object kq = null;
        FileInputStream fi = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fi);
        kq = ois.readObject();
        fi.close();ois.close();
        return kq;
    }
}
