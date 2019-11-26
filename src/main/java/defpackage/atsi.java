package defpackage;

/* renamed from: atsi */
public final class atsi extends anxo implements anzf {
    private atsi() {
        super(atsj.d);
    }

    public final atsi a(String str) {
        copyOnWrite();
        atsj atsj = (atsj) this.instance;
        if (str != null) {
            atsj.a |= 1;
            atsj.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final atsi a(int i) {
        copyOnWrite();
        atsj atsj = (atsj) this.instance;
        atsj.a |= 2;
        atsj.c = i;
        return this;
    }

    /* synthetic */ atsi(byte b) {
        super(atsj.d);
    }
}
