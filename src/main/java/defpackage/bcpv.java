package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: bcpv */
final class bcpv implements Serializable {
    public static final long serialVersionUID = -6471952376487863581L;
    private transient String a;

    bcpv(String str) {
        this.a = str;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeUTF(this.a);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        this.a = objectInputStream.readUTF();
    }

    private final Object readResolve() {
        return bcpt.a(this.a);
    }
}
