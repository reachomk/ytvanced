package defpackage;

/* renamed from: aocy */
public final class aocy extends anxo implements anzf {
    private aocy() {
        super(aocv.f);
    }

    public final aocy a(double d) {
        copyOnWrite();
        aocv aocv = (aocv) this.instance;
        aocv.a |= 1;
        aocv.b = d;
        return this;
    }

    public final aocy b(double d) {
        copyOnWrite();
        aocv aocv = (aocv) this.instance;
        aocv.a |= 2;
        aocv.c = d;
        return this;
    }

    public final aocy c(double d) {
        copyOnWrite();
        aocv aocv = (aocv) this.instance;
        aocv.a |= 4;
        aocv.d = d;
        return this;
    }

    public final aocy d(double d) {
        copyOnWrite();
        aocv aocv = (aocv) this.instance;
        aocv.a |= 8;
        aocv.e = d;
        return this;
    }

    /* synthetic */ aocy(byte b) {
        super(aocv.f);
    }
}
