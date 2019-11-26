package defpackage;

/* renamed from: anfp */
public final class anfp extends anxo implements anzf {
    private anfp() {
        super(anfq.d);
    }

    /* synthetic */ anfp(byte b) {
        super(anfq.d);
    }

    public final anfp a(float f) {
        copyOnWrite();
        anfq anfq = (anfq) this.instance;
        anfq.a |= 1;
        anfq.b = f;
        return this;
    }

    public final anfp b(float f) {
        copyOnWrite();
        anfq anfq = (anfq) this.instance;
        anfq.a |= 2;
        anfq.c = f;
        return this;
    }
}
