package defpackage;

/* renamed from: aodc */
public final class aodc extends anxo implements anzf {
    private aodc() {
        super(aocz.f);
    }

    public final aodc a() {
        copyOnWrite();
        aocz aocz = (aocz) this.instance;
        aocz.a |= 1;
        aocz.b = 3;
        return this;
    }

    public final aodc b() {
        copyOnWrite();
        aocz aocz = (aocz) this.instance;
        aocz.a |= 2;
        aocz.c = 3;
        return this;
    }

    public final aodc a(float f) {
        copyOnWrite();
        aocz aocz = (aocz) this.instance;
        if (!aocz.d.a()) {
            aocz.d = anxl.mutableCopy(aocz.d);
        }
        aocz.d.a(f);
        return this;
    }

    /* synthetic */ aodc(byte b) {
        super(aocz.f);
    }

    public final aodc a(int i) {
        copyOnWrite();
        aocz aocz = (aocz) this.instance;
        aocz.a |= 4;
        aocz.e = 1;
        return this;
    }
}
