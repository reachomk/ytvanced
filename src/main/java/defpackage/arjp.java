package defpackage;

/* renamed from: arjp */
public final class arjp extends anxo implements anzf {
    private arjp() {
        super(arjq.g);
    }

    public final arjp a(String str) {
        copyOnWrite();
        arjq arjq = (arjq) this.instance;
        if (str != null) {
            arjq.a |= 4;
            arjq.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final arjp a() {
        copyOnWrite();
        arjq arjq = (arjq) this.instance;
        arjq.a &= -5;
        arjq.d = arjq.g.d;
        return this;
    }

    /* synthetic */ arjp(byte b) {
        super(arjq.g);
    }
}
