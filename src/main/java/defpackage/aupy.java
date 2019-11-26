package defpackage;

/* renamed from: aupy */
public final class aupy extends anxo implements anzf {
    private aupy() {
        super(aupv.d);
    }

    public final aupy a(String str) {
        copyOnWrite();
        aupv aupv = (aupv) this.instance;
        if (str != null) {
            aupv.a |= 2;
            aupv.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aupy(byte b) {
        super(aupv.d);
    }

    public final aupy a(int i) {
        copyOnWrite();
        aupv aupv = (aupv) this.instance;
        aupv.a |= 1;
        aupv.b = i - 1;
        return this;
    }
}
