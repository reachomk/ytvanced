package defpackage;

/* renamed from: ausr */
public final class ausr extends anxo implements anzf {
    private ausr() {
        super(auss.d);
    }

    public final ausu a() {
        ausu ausu = ((auss) this.instance).c;
        return ausu == null ? ausu.l : ausu;
    }

    public final ausr a(aust aust) {
        copyOnWrite();
        auss auss = (auss) this.instance;
        auss.c = (ausu) ((anxl) aust.build());
        auss.a |= 2;
        return this;
    }

    /* synthetic */ ausr(byte b) {
        super(auss.d);
    }

    public final ausr a(int i) {
        copyOnWrite();
        auss auss = (auss) this.instance;
        auss.a |= 1;
        auss.b = i - 1;
        return this;
    }
}
