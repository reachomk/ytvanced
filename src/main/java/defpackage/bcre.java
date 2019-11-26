package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: bcre */
final class bcre implements Serializable {
    public static final long serialVersionUID = -6212696554273812441L;
    private transient bcpt a;

    bcre(bcpt bcpt) {
        this.a = bcpt;
    }

    private final Object readResolve() {
        return bcrf.b(this.a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        this.a = (bcpt) objectInputStream.readObject();
    }
}
