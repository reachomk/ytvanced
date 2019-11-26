package defpackage;

/* renamed from: auvm */
public final class auvm extends anxo implements anzf {
    private auvm() {
        super(auvj.j);
    }

    public final auvm a(auvl auvl) {
        copyOnWrite();
        auvj auvj = (auvj) this.instance;
        if (auvl != null) {
            auvj.b = auvl;
            auvj.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final boolean a() {
        return (((auvj) this.instance).a & 2) != 0;
    }

    public final auvp b() {
        auvp auvp = ((auvj) this.instance).c;
        return auvp == null ? auvp.h : auvp;
    }

    public final auvm a(auvp auvp) {
        copyOnWrite();
        auvj auvj = (auvj) this.instance;
        if (auvp != null) {
            auvj.c = auvp;
            auvj.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final auvm a(auvs auvs) {
        copyOnWrite();
        auvj auvj = (auvj) this.instance;
        auvj.c = (auvp) ((anxl) auvs.build());
        auvj.a |= 2;
        return this;
    }

    public final boolean c() {
        return (((auvj) this.instance).a & 4) != 0;
    }

    public final auwb d() {
        auwb auwb = ((auvj) this.instance).d;
        return auwb == null ? auwb.l : auwb;
    }

    public final auvm a(auwe auwe) {
        copyOnWrite();
        auvj auvj = (auvj) this.instance;
        auvj.d = (auwb) ((anxl) auwe.build());
        auvj.a |= 4;
        return this;
    }

    public final boolean e() {
        return (((auvj) this.instance).a & 16) != 0;
    }

    public final auvf f() {
        auvf auvf = ((auvj) this.instance).f;
        return auvf == null ? auvf.g : auvf;
    }

    public final auvm a(auvi auvi) {
        copyOnWrite();
        auvj auvj = (auvj) this.instance;
        auvj.f = (auvf) ((anxl) auvi.build());
        auvj.a |= 16;
        return this;
    }

    /* synthetic */ auvm(byte b) {
        super(auvj.j);
    }
}
