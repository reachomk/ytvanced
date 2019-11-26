package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: agtl */
public final class agtl {
    public final agvv a;
    public final zzl b;
    private final bcaa c;
    private final Executor d;
    private final xoi e;

    public agtl(ScheduledExecutorService scheduledExecutorService, bcaa bcaa, xoi xoi, agvv agvv, zzl zzl) {
        this.d = scheduledExecutorService;
        this.c = bcaa;
        this.e = xoi;
        this.a = agvv;
        this.b = zzl;
    }

    public final anjv a(aiqq aiqq) {
        wxf a = wxf.a();
        this.d.execute(new agto(this, aiqq, a));
        return a;
    }

    public final anjv b(aiqq aiqq) {
        wxf a = wxf.a();
        this.d.execute(new agtn(this, aiqq, a));
        return a;
    }

    public final void a(agqp agqp, wxg wxg, boolean z) {
        if (agqp == null) {
            wxg.a(null, new NullPointerException());
            return;
        }
        try {
            wxg.a(null, a().l().d(agqp.a()));
        } catch (agly | agmc e) {
            if (z) {
                wxg.a(null, e);
                return;
            }
            ates ates = (ates) atep.l.createBuilder();
            String a = agqp.a();
            ates.copyOnWrite();
            atep atep = (atep) ates.instance;
            if (a != null) {
                atep.a |= 1;
                atep.b = a;
                String b = xvd.b(agqp.b());
                ates.copyOnWrite();
                atep atep2 = (atep) ates.instance;
                if (b != null) {
                    atep2.a |= 2;
                    atep2.c = b;
                    atep atep3 = (atep) ((anxl) ates.build());
                    atdy atdy = (atdy) atdv.o.createBuilder();
                    atdy.copyOnWrite();
                    atdv atdv = (atdv) atdy.instance;
                    atdv.a |= 1;
                    atdv.b = 2;
                    if (this.e.a((Throwable) e) != null) {
                        String a2 = this.e.a((Throwable) e);
                        atdy.copyOnWrite();
                        atdv = (atdv) atdy.instance;
                        if (a2 != null) {
                            atdv.a |= 2;
                            atdv.c = a2;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    avqb avqb = (avqb) avqc.j.createBuilder();
                    avqb.a(2);
                    avqc avqc = (avqc) ((anxl) avqb.build());
                    ajxu ajxu = new ajxu();
                    ajxu.g = atep3;
                    ajxu.a = (atdv) ((anxl) atdy.build());
                    ajxu.i = avqc;
                    wxg.a(null, new aakj(ajxu, 0, null));
                    return;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        } catch (Exception e2) {
            wxg.a(null, e2);
        }
    }

    public final agvz a() {
        return ((agwc) this.c.get()).b();
    }

    public static boolean a(zzl zzl) {
        arvt b = zzl.b();
        if (b != null) {
            awdw awdw = b.l;
            if (awdw == null) {
                awdw = awdw.E;
            }
            if (awdw.k) {
                return true;
            }
        }
        return false;
    }
}
