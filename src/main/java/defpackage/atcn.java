package defpackage;

/* renamed from: atcn */
public final class atcn extends anxo implements anzf {
    private atcn() {
        super(atco.f);
    }

    public final atcn a(int i) {
        copyOnWrite();
        atco atco = (atco) this.instance;
        atco.a |= 4;
        atco.d = i;
        return this;
    }

    public final atcn b(int i) {
        copyOnWrite();
        atco atco = (atco) this.instance;
        atco.a |= 8;
        atco.e = i;
        return this;
    }

    /* synthetic */ atcn(byte b) {
        super(atco.f);
    }

    public final atcn c(int i) {
        copyOnWrite();
        atco atco = (atco) this.instance;
        atco.a |= 1;
        atco.b = i - 1;
        return this;
    }
}
