package defpackage;

/* renamed from: avrd */
public final class avrd extends anxo implements anzf {
    private avrd() {
        super(avre.p);
    }

    public final avrd a(String str) {
        copyOnWrite();
        avre avre = (avre) this.instance;
        if (str != null) {
            avre.a |= 1;
            avre.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final avnc a() {
        avnc avnc = ((avre) this.instance).d;
        return avnc == null ? avnc.c : avnc;
    }

    /* synthetic */ avrd(byte b) {
        super(avre.p);
    }
}
