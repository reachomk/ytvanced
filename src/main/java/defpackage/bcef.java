package defpackage;

/* renamed from: bcef */
public final class bcef extends anxo implements anzf {
    private bcef() {
        super(bceg.g);
    }

    public final bcef a(String str) {
        copyOnWrite();
        bceg bceg = (bceg) this.instance;
        if (str != null) {
            bceg.a |= 1;
            bceg.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final bcef a(int i) {
        copyOnWrite();
        bceg bceg = (bceg) this.instance;
        bceg.a |= 4;
        bceg.d = i;
        return this;
    }

    /* synthetic */ bcef(byte b) {
        super(bceg.g);
    }
}
