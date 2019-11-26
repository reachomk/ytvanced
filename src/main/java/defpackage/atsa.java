package defpackage;

/* renamed from: atsa */
public final class atsa extends anxo implements anzf {
    private atsa() {
        super(atsb.e);
    }

    public final atsa a(String str) {
        copyOnWrite();
        atsb atsb = (atsb) this.instance;
        if (str != null) {
            atsb.a |= 1;
            atsb.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final atsa a(azfa azfa) {
        copyOnWrite();
        atsb atsb = (atsb) this.instance;
        if (azfa != null) {
            atsb.c = azfa;
            atsb.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final atsa a(atst atst) {
        copyOnWrite();
        atsb atsb = (atsb) this.instance;
        if (atst != null) {
            atsb.d = atst;
            atsb.a |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atsa(byte b) {
        super(atsb.e);
    }
}
