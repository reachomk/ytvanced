package defpackage;

/* renamed from: ameb */
public final class ameb extends anxo implements anzf {
    private ameb() {
        super(amec.g);
    }

    public final ameb a(int i) {
        copyOnWrite();
        amec amec = (amec) this.instance;
        amec.a |= 4;
        amec.d = i;
        return this;
    }

    public final ameb a(long j) {
        copyOnWrite();
        amec amec = (amec) this.instance;
        amec.a |= 8;
        amec.e = j;
        return this;
    }

    public final ameb b(long j) {
        copyOnWrite();
        amec amec = (amec) this.instance;
        amec.a |= 16;
        amec.f = j;
        return this;
    }

    /* synthetic */ ameb(byte b) {
        super(amec.g);
    }

    public final ameb b(int i) {
        copyOnWrite();
        amec amec = (amec) this.instance;
        amec.a |= 1;
        amec.b = i - 1;
        return this;
    }

    public final ameb c(int i) {
        copyOnWrite();
        amec amec = (amec) this.instance;
        amec.a |= 2;
        amec.c = i - 1;
        return this;
    }
}
