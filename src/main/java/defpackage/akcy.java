package defpackage;

/* renamed from: akcy */
public final class akcy implements szx {
    private final acxw a;

    public akcy(acxw acxw) {
        this.a = acxw;
    }

    public final int a(int i, szr szr) {
        atyw a = atyw.a(i);
        if (a == null) {
            a = atyw.LATENCY_ACTION_ELEMENTS_PERFORMANCE;
        }
        acxw acxw = this.a;
        atyp atyp = (atyp) atym.i.createBuilder();
        if (szr != null) {
            String a2 = szr.a();
            atyp.copyOnWrite();
            atym atym = (atym) atyp.instance;
            if (a2 != null) {
                atym.a |= 1;
                atym.b = a2;
                Long b = szr.b();
                Long c = szr.c();
                Long d = szr.d();
                if (b != null && c != null) {
                    long longValue = b.longValue();
                    atyp.copyOnWrite();
                    atym atym2 = (atym) atyp.instance;
                    atym2.a |= 8;
                    atym2.e = longValue;
                    atyp.a(c.longValue() - b.longValue());
                } else if (d != null) {
                    atyp.a(d.longValue());
                }
                Integer e = szr.e();
                if (e != null) {
                    int intValue = e.intValue();
                    atyp.copyOnWrite();
                    atym = (atym) atyp.instance;
                    atym.a |= 64;
                    atym.h = intValue;
                }
                if (szr.f() != null) {
                    atyv atyv = (atyv) atys.d.createBuilder();
                    amuw<String> a3 = szr.f().a();
                    if (!(a3 == null || a3.isEmpty())) {
                        for (String str : a3) {
                            atyx atyx = (atyx) atyu.c.createBuilder();
                            atyx.copyOnWrite();
                            atyu atyu = (atyu) atyx.instance;
                            if (str != null) {
                                atyu.a |= 1;
                                atyu.b = str;
                                atyv.copyOnWrite();
                                atys atys = (atys) atyv.instance;
                                if (!atys.b.a()) {
                                    atys.b = anxl.mutableCopy(atys.b);
                                }
                                atys.b.add((atyu) ((anxl) atyx.build()));
                            } else {
                                throw new NullPointerException();
                            }
                        }
                    }
                    atyp.copyOnWrite();
                    atym atym3 = (atym) atyp.instance;
                    atym3.f = (atys) ((anxl) atyv.build());
                    atym3.a |= 16;
                }
            } else {
                throw new NullPointerException();
            }
        }
        return acxw.a(a, "", (atym) ((anxl) atyp.build()));
    }
}
