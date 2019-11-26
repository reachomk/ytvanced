package defpackage;

/* renamed from: avry */
public final class avry extends anxo implements anzf {
    private avry() {
        super(avrw.f);
    }

    public final avry a(String str) {
        copyOnWrite();
        avrw avrw = (avrw) this.instance;
        if (str != null) {
            avrw.a |= 1;
            avrw.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ avry(byte b) {
        super(avrw.f);
    }
}
