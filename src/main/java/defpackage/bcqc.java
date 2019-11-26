package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: bcqc */
public final class bcqc extends bcrl {
    public static final long serialVersionUID = -4481126543819298617L;
    public bcqd a;
    public bcpn b;

    public bcqc(bcqd bcqd, bcpn bcpn) {
        this.a = bcqd;
        this.b = bcpn;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.a());
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        this.a = (bcqd) objectInputStream.readObject();
        this.b = ((bcpm) objectInputStream.readObject()).a(this.a.b);
    }

    public final bcpn a() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return this.a.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final bcpl c() {
        return this.a.b;
    }
}
