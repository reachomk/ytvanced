package defpackage;

/* renamed from: aqtz */
public final class aqtz extends anxo implements anzf {
    private aqtz() {
        super(aqtw.e);
    }

    public final aqtz a(int i) {
        copyOnWrite();
        aqtw aqtw = (aqtw) this.instance;
        aqtw.a |= 1;
        aqtw.b = i;
        return this;
    }

    public final aqtz b(int i) {
        copyOnWrite();
        aqtw aqtw = (aqtw) this.instance;
        aqtw.a |= 2;
        aqtw.c = i;
        return this;
    }

    /* synthetic */ aqtz(byte b) {
        super(aqtw.e);
    }
}
