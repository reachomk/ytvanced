package defpackage;

/* renamed from: altb */
public final class altb {
    private final axrg a = ((axrg) axrh.i.createBuilder());

    public static final altb a(alsy alsy) {
        altb altb = new altb();
        int q = alsy.q();
        axrg axrg = altb.a;
        axrg.copyOnWrite();
        axrh axrh = (axrh) axrg.instance;
        axrh.a |= 64;
        axrh.h = q;
        q = alsy.o();
        axrg = altb.a;
        axrg.copyOnWrite();
        axrh = (axrh) axrg.instance;
        axrh.a |= 8;
        axrh.e = q;
        int p = alsy.p();
        axrg axrg2 = altb.a;
        axrg2.copyOnWrite();
        axrh axrh2 = (axrh) axrg2.instance;
        axrh2.a |= 4;
        axrh2.d = p;
        return altb;
    }

    private altb() {
    }

    public final altb a(alte alte) {
        String str = alte.c;
        axrg axrg = this.a;
        axrg.copyOnWrite();
        axrh axrh = (axrh) axrg.instance;
        if (str != null) {
            axrh.a |= 32;
            axrh.g = str;
            String str2 = alte.b;
            axrg axrg2 = this.a;
            axrg2.copyOnWrite();
            axrh axrh2 = (axrh) axrg2.instance;
            if (str2 != null) {
                axrh2.a |= 16;
                axrh2.f = str2;
                return this;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final altb a(bqn bqn) {
        String a = altc.a(bqn);
        axrg axrg = this.a;
        axrg.copyOnWrite();
        axrh axrh = (axrh) axrg.instance;
        if (a != null) {
            axrh.a |= 2;
            axrh.c = a;
            return this;
        }
        throw new NullPointerException();
    }

    public final axrh a() {
        return (axrh) ((anxl) this.a.build());
    }

    public final altb a(int i) {
        axrg axrg = this.a;
        axrg.copyOnWrite();
        axrh axrh = (axrh) axrg.instance;
        axrh.a |= 1;
        axrh.b = i - 1;
        return this;
    }
}
