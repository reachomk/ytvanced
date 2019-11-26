package defpackage;

/* renamed from: dlp */
final class dlp implements bcaa {
    private final int a;
    private final /* synthetic */ dlm b;

    dlp(dlm dlm, int i) {
        this.b = dlm;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        dlm dlm;
        Object obj;
        Object obj2;
        switch (i) {
            case 0:
                dlm = this.b;
                obj = dlm.c;
                if (obj == null) {
                    obj = egt.a(dlm.b());
                    dlm.c = obj;
                }
                return obj;
            case 1:
                return this.b.a();
            case 2:
                dlm = this.b;
                obj = dlm.d;
                if (obj == null) {
                    obj = new ageb(dlm.o.jq(), dlm.o.dr());
                    dlm.d = obj;
                }
                return obj;
            case 3:
                dlm = this.b;
                obj = dlm.e;
                if (obj == null) {
                    obj = new aaez(xex.a(dlm.a), dlm.o.jv(), ampo.a);
                    dlm.e = obj;
                }
                return obj;
            case 4:
                dlm = this.b;
                obj = dlm.f;
                if (obj == null) {
                    obj = urk.a(dlm.b(), new usl(dlm.c(), dlm.o.ka(), dlm.o.oI(), dlm.o.oC(), dlm.o.m()));
                    dlm.f = obj;
                }
                return obj;
            case 5:
                dlm = this.b;
                obj = dlm.g;
                if (obj == null) {
                    obj = new uzr(dlm.o.kl());
                    dlm.g = obj;
                }
                return obj;
            case 6:
                dlm = this.b;
                obj = dlm.h;
                if (obj == null) {
                    obj = new uzq(dlm.o.kn());
                    dlm.h = obj;
                }
                return obj;
            case 7:
                return this.b.c();
            case 8:
                dlm = this.b;
                obj = dlm.i;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dlm.i;
                        if (obj2 instanceof baqe) {
                            obj2 = new akpi();
                            dlm.i = bapx.a(dlm.i, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (akpi) obj;
            case 9:
                dlm = this.b;
                obj = dlm.k;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dlm.k;
                        if (obj2 instanceof baqe) {
                            Object obj3 = dlm.j;
                            if (obj3 instanceof baqe) {
                                Object obj4;
                                synchronized (obj3) {
                                    obj4 = dlm.j;
                                    if (obj4 instanceof baqe) {
                                        obj4 = new egh(xex.a(dlm.a), dlm.o.ox());
                                        dlm.j = bapx.a(dlm.j, obj4);
                                    }
                                }
                                obj3 = obj4;
                            }
                            obj2 = new egk((egh) obj3);
                            dlm.k = bapx.a(dlm.k, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (egk) obj;
            case 10:
                return this.b.e();
            default:
                throw new AssertionError(i);
        }
    }
}
