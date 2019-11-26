package defpackage;

/* renamed from: aqxy */
public final class aqxy extends anxo implements anzf {
    private aqxy() {
        super(aqxw.c);
    }

    /* synthetic */ aqxy(byte b) {
        super(aqxw.c);
    }

    public final aqxy a(int i) {
        copyOnWrite();
        aqxw aqxw = (aqxw) this.instance;
        if (i != 0) {
            aqxw.a |= 1;
            aqxw.b = i - 1;
            return this;
        }
        throw new NullPointerException();
    }
}
