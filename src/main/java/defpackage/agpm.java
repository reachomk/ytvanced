package defpackage;

/* renamed from: agpm */
public final class agpm implements agps {
    private final acum a;
    private final agwa b;
    private final xhv c;
    private final xsc d;

    public agpm(acum acum, agwa agwa, xhv xhv, xsc xsc) {
        this.a = (acum) amqw.a((Object) acum);
        this.b = agwa;
        this.c = xhv;
        this.d = xsc;
    }

    public final void a(avqw avqw) {
        long a = this.d.a();
        xvd.a(avqw.b);
        int a2 = avqs.a(avqw.e);
        boolean z = false;
        if (!(a2 == 0 || a2 == 1)) {
            z = true;
        }
        amqw.a(z);
        avqv avqv = (avqv) ((anxo) avqw.toBuilder());
        long c = this.b.c();
        avqv.copyOnWrite();
        avqw avqw2 = (avqw) avqv.instance;
        avqw2.a |= 64;
        avqw2.h = c / 1024;
        a2 = this.c.m();
        avqv.copyOnWrite();
        avqw avqw3 = (avqw) avqv.instance;
        if (a2 != 0) {
            avqw3.a |= 2048;
            avqw3.l = a2 - 1;
            avqw = (avqw) ((anxl) avqv.build());
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (avqw != null) {
                asmw.c = avqw;
                asmw.b = 2;
                this.a.a((asmw) ((anxl) asmz.build()), a);
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void a(avng avng) {
        long a = this.d.a();
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (avng != null) {
            asmw.c = avng;
            asmw.b = 22;
            this.a.a((asmw) ((anxl) asmz.build()), a);
            return;
        }
        throw new NullPointerException();
    }

    public final void a(avms avms) {
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (avms != null) {
            asmw.c = avms;
            asmw.b = 103;
            this.a.a((asmw) ((anxl) asmz.build()));
            return;
        }
        throw new NullPointerException();
    }

    public final void a(avoh avoh) {
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (avoh != null) {
            asmw.c = avoh;
            asmw.b = 217;
            this.a.a((asmw) ((anxl) asmz.build()));
            return;
        }
        throw new NullPointerException();
    }

    public final void a(String str, int i, azfa azfa, int i2, int i3, boolean z) {
        avol avol = (avol) avom.h.createBuilder();
        avol.copyOnWrite();
        avom avom = (avom) avol.instance;
        if (str != null) {
            avom.a |= 1;
            avom.b = str;
            avol.copyOnWrite();
            avom avom2 = (avom) avol.instance;
            if (i != 0) {
                avom2.a |= 2;
                avom2.c = i - 1;
                avol.copyOnWrite();
                avom2 = (avom) avol.instance;
                if (azfa != null) {
                    avom2.d = azfa;
                    avom2.a |= 8;
                    avol.copyOnWrite();
                    avom2 = (avom) avol.instance;
                    avom2.a |= 32;
                    avom2.e = i2;
                    avol.copyOnWrite();
                    avom2 = (avom) avol.instance;
                    avom2.a |= 64;
                    avom2.f = i3;
                    avol.copyOnWrite();
                    avom2 = (avom) avol.instance;
                    avom2.a |= 256;
                    avom2.g = z;
                    avom2 = (avom) ((anxl) avol.build());
                    asmz asmz = (asmz) asmw.f.createBuilder();
                    asmz.copyOnWrite();
                    asmw asmw = (asmw) asmz.instance;
                    if (avom2 != null) {
                        asmw.c = avom2;
                        asmw.b = 63;
                        this.a.a((asmw) ((anxl) asmz.build()));
                        return;
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void a(String str, boolean z, int i, int i2, long j, String str2, String str3, int i3, boolean z2) {
        avpp avpp = (avpp) avpq.j.createBuilder();
        avpp.copyOnWrite();
        avpq avpq = (avpq) avpp.instance;
        if (str != null) {
            avpq.a |= 1;
            avpq.b = str;
            avpp.copyOnWrite();
            avpq avpq2 = (avpq) avpp.instance;
            avpq2.a |= 2;
            avpq2.c = z;
            if (str3 != null) {
                avpp.copyOnWrite();
                avpq2 = (avpq) avpp.instance;
                avpq2.a |= 128;
                avpq2.h = str3;
            }
            if (str2 != null) {
                avpp.copyOnWrite();
                avpq2 = (avpq) avpp.instance;
                avpq2.a |= 256;
                avpq2.i = str2;
            }
            avpp.copyOnWrite();
            avpq2 = (avpq) avpp.instance;
            if (i3 != 0) {
                avpr avpr;
                avpq avpq3;
                avpq2.a |= 8;
                avpq2.d = i3 - 1;
                if (i != 0) {
                    avpr = (avpr) avps.c.createBuilder();
                    avpr.a(i);
                    avpp.copyOnWrite();
                    avpq3 = (avpq) avpp.instance;
                    avpq3.f = (avps) ((anxl) avpr.build());
                    avpq3.a |= 32;
                }
                if (i2 != 0) {
                    avpr = (avpr) avps.c.createBuilder();
                    avpr.a(i2);
                    avpp.copyOnWrite();
                    avpq3 = (avpq) avpp.instance;
                    avpq3.g = (avps) ((anxl) avpr.build());
                    avpq3.a |= 64;
                }
                avpp.copyOnWrite();
                avpq2 = (avpq) avpp.instance;
                avpq2.a |= 16;
                avpq2.e = z2;
                asmz asmz = (asmz) asmw.f.createBuilder();
                asmz.copyOnWrite();
                asmw asmw = (asmw) asmz.instance;
                asmw.c = (anxl) avpp.build();
                asmw.b = 35;
                this.a.a((asmw) ((anxl) asmz.build()), j);
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void a(amqp amqp, int i, int i2) {
        awbq awbq = (awbq) awbr.e.createBuilder();
        if (amqp.a()) {
            String str = (String) amqp.b();
            awbq.copyOnWrite();
            awbr awbr = (awbr) awbq.instance;
            if (str != null) {
                awbr.a |= 1;
                awbr.b = str;
            } else {
                throw new NullPointerException();
            }
        }
        awbq.copyOnWrite();
        awbr awbr2 = (awbr) awbq.instance;
        if (i != 0) {
            awbr2.a |= 2;
            awbr2.c = i - 1;
            awbq.copyOnWrite();
            awbr2 = (awbr) awbq.instance;
            awbr2.a |= 4;
            awbr2.d = i2 - 1;
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            asmw.c = (anxl) awbq.build();
            asmw.b = 186;
            this.a.a((asmw) ((anxl) asmz.build()));
            return;
        }
        throw new NullPointerException();
    }
}
