package defpackage;

/* renamed from: atss */
public final class atss extends anxo implements anzf {
    private atss() {
        super(atst.q);
    }

    public final atss a(attd attd) {
        copyOnWrite();
        atst atst = (atst) this.instance;
        if (attd != null) {
            atst.a();
            atst.d.add(attd);
            return this;
        }
        throw new NullPointerException();
    }

    public final atss a(attc attc) {
        copyOnWrite();
        atst atst = (atst) this.instance;
        atst.a();
        atst.d.add((attd) ((anxl) attc.build()));
        return this;
    }

    public final atsz a() {
        atsz atsz = ((atst) this.instance).h;
        return atsz == null ? atsz.d : atsz;
    }

    public final atss a(atsy atsy) {
        copyOnWrite();
        atst atst = (atst) this.instance;
        atst.h = (atsz) ((anxl) atsy.build());
        atst.a |= 64;
        return this;
    }

    public final atss a(atsi atsi) {
        copyOnWrite();
        atst atst = (atst) this.instance;
        atst.j = (atsj) ((anxl) atsi.build());
        atst.a |= 4096;
        return this;
    }

    public final atss a(atsh atsh) {
        copyOnWrite();
        atst atst = (atst) this.instance;
        if (atsh != null) {
            atst.k = atsh;
            atst.a |= 8192;
            return this;
        }
        throw new NullPointerException();
    }

    public final atss a(atsg atsg) {
        copyOnWrite();
        atst atst = (atst) this.instance;
        atst.k = (atsh) ((anxl) atsg.build());
        atst.a |= 8192;
        return this;
    }

    public final atss a(atsq atsq) {
        copyOnWrite();
        atst atst = (atst) this.instance;
        atst.m = (atsr) ((anxl) atsq.build());
        atst.a |= 16777216;
        return this;
    }

    public final atss a(atsd atsd) {
        copyOnWrite();
        atst atst = (atst) this.instance;
        if (atsd != null) {
            atst.n = atsd;
            atst.a |= 268435456;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atss(byte b) {
        super(atst.q);
    }
}
