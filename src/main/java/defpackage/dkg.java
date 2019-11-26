package defpackage;

/* renamed from: dkg */
final class dkg implements bcaa {
    private final int a;
    private final /* synthetic */ dkf b;

    dkg(dkf dkf, int i) {
        this.b = dkf;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        dkf dkf;
        Object obj;
        Object obj2;
        switch (i) {
            case 0:
                dkf = this.b;
                obj = dkf.a;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dkf.a;
                        if (obj2 instanceof baqe) {
                            obj2 = new ikc(dkf.k(), dkf.e.c(), dkf.e.cA(), dkf.e());
                            dkf.a = bapx.a(dkf.a, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (aiyh) obj;
            case 1:
                return this.b.a();
            case 2:
                return this.b.E();
            case 3:
                return this.b.b();
            case 4:
                return this.b.I();
            case 5:
                return this.b.d();
            case 6:
                return this.b.f();
            case 7:
                dkf = this.b;
                obj = dkf.b;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dkf.b;
                        if (obj2 instanceof baqe) {
                            diu diu = dkf.e;
                            bcaa bcaa = diu.em;
                            if (bcaa == null) {
                                bcaa = new dlk(diu, 530);
                                diu.em = bcaa;
                            }
                            obj2 = new ijy(new gqt(bcaa), dkf.e());
                            dkf.b = bapx.a(dkf.b, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (aiyh) obj;
            case 8:
                return this.b.h();
            case 9:
                return this.b.H();
            case 10:
                return new dke(this.b);
            case 11:
                return this.b.g();
            case 12:
                dkf = this.b;
                obj = dkf.c;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dkf.c;
                        if (obj2 instanceof baqe) {
                            obj2 = new aizw(dkf.F());
                            dkf.c = bapx.a(dkf.c, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (aizw) obj;
            case 13:
                return this.b.F();
            case 14:
                dkf = this.b;
                obj = dkf.d;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dkf.d;
                        if (obj2 instanceof baqe) {
                            obj2 = new ajok(dkf.e.ou(), dkf.e.oB(), dkf.i(), dkf.e.n());
                            dkf.d = bapx.a(dkf.d, obj2);
                        }
                    }
                    obj = obj2;
                }
                return amuw.a((ajok) obj);
            default:
                throw new AssertionError(i);
        }
    }
}
