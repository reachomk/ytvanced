package defpackage;

/* renamed from: djc */
final class djc implements bcaa {
    private final int a;
    private final /* synthetic */ djd b;

    djc(djd djd, int i) {
        this.b = djd;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        djd djd;
        Object obj;
        Object obj2;
        if (i == 0) {
            djd = this.b;
            obj = djd.c;
            if (obj instanceof baqe) {
                synchronized (obj) {
                    obj2 = djd.c;
                    if (obj2 instanceof baqe) {
                        Object obj3 = djd.b;
                        if (obj3 instanceof baqe) {
                            Object obj4;
                            synchronized (obj3) {
                                obj4 = djd.b;
                                if (obj4 instanceof baqe) {
                                    obj4 = new egh(xex.a(djd.a), djd.e.ox());
                                    djd.b = bapx.a(djd.b, obj4);
                                }
                            }
                            obj3 = obj4;
                        }
                        obj2 = new egk((egh) obj3);
                        djd.c = bapx.a(djd.c, obj2);
                    }
                }
                obj = obj2;
            }
            return (egk) obj;
        } else if (i == 1) {
            djd = this.b;
            obj = djd.d;
            if (obj instanceof baqe) {
                synchronized (obj) {
                    obj2 = djd.d;
                    if (obj2 instanceof baqe) {
                        obj2 = new akpi();
                        djd.d = bapx.a(djd.d, obj2);
                    }
                }
                obj = obj2;
            }
            return (akpi) obj;
        } else {
            throw new AssertionError(i);
        }
    }
}
