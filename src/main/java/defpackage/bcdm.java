package defpackage;

/* renamed from: bcdm */
public final class bcdm extends anxo implements anzf {
    private bcdm() {
        super(bcdj.c);
    }

    public final String a() {
        return ((bcdj) this.instance).b;
    }

    public final bcdm a(String str) {
        copyOnWrite();
        bcdj bcdj = (bcdj) this.instance;
        if (str != null) {
            bcdj.a |= 1;
            bcdj.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ bcdm(byte b) {
        super(bcdj.c);
    }
}
