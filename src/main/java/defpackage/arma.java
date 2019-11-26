package defpackage;

/* renamed from: arma */
public final class arma extends anxo implements anzf {
    private arma() {
        super(armb.d);
    }

    public final arma a(long j) {
        copyOnWrite();
        armb armb = (armb) this.instance;
        armb.a |= 4;
        armb.b = j;
        return this;
    }

    public final arma b(long j) {
        copyOnWrite();
        armb armb = (armb) this.instance;
        armb.a |= 8;
        armb.c = j;
        return this;
    }

    /* synthetic */ arma(byte b) {
        super(armb.d);
    }
}
