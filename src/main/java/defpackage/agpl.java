package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: agpl */
public final class agpl implements agxk {
    private static final long a = TimeUnit.MINUTES.toMillis(1);
    private final xsc b;
    private final SharedPreferences c;
    private final agej d;
    private final agps e;
    private final bcaa f;
    private final Map g = new HashMap();

    public agpl(xsc xsc, SharedPreferences sharedPreferences, agej agej, agps agps, bcaa bcaa) {
        this.b = xsc;
        this.c = sharedPreferences;
        this.d = agej;
        this.e = agps;
        this.f = bcaa;
    }

    public final void a() {
    }

    public final void a(agqz agqz) {
    }

    public final void b() {
    }

    public final void b(agqz agqz) {
    }

    public final void c(agqz agqz) {
    }

    public final void d(agqz agqz) {
        if (agpp.a(this.d, agqz.f)) {
            String b = agxj.b(agqz.f);
            if (!this.g.containsKey(b) || this.b.a() - ((Long) this.g.get(b)).longValue() >= a) {
                avqv avqv = (avqv) ((anxo) agpp.a(agqz).toBuilder());
                avqv.c(10);
                this.e.a((avqw) ((anxl) avqv.build()));
                this.g.put(b, Long.valueOf(this.b.a()));
            }
        }
    }

    public final void e(agqz agqz) {
        if (agpp.a(this.d, agqz.f) && (agqz.c & 512) == 0) {
            avqv avqv = (avqv) ((anxo) agpp.a(agqz).toBuilder());
            avqv.c(6);
            avqv.a(agpp.a(agqz.c));
            this.e.a((avqw) ((anxl) avqv.build()));
        }
    }

    public final void f(agqz agqz) {
        if (agpp.a(this.d, agqz.f)) {
            avqv avqv = (avqv) ((anxo) agpp.a(agqz).toBuilder());
            avqv.c(13);
            this.e.a((avqw) ((anxl) avqv.build()));
        }
    }

    private static void a(avqv avqv, agqz agqz) {
        long u = agxj.u(agqz.g);
        long v = agxj.v(agqz.g);
        avqv.copyOnWrite();
        avqw avqw = (avqw) avqv.instance;
        avqw.a |= 512;
        avqw.k = u / 1024;
        avqv.copyOnWrite();
        avqw avqw2 = (avqw) avqv.instance;
        avqw2.a |= 256;
        avqw2.j = v / 1024;
    }

    private static void b(avqv avqv, agqz agqz) {
        avqx avqx = (avqx) avqy.d.createBuilder();
        int G = agxj.G(agqz.g);
        avqx.copyOnWrite();
        avqy avqy = (avqy) avqx.instance;
        if (G != 0) {
            avqy.a |= 2;
            avqy.c = G - 1;
            String D = agxj.D(agqz.g);
            if (D != null) {
                avqx.copyOnWrite();
                avqy avqy2 = (avqy) avqx.instance;
                avqy2.a |= 1;
                avqy2.b = D;
            }
            avqv.copyOnWrite();
            avqw avqw = (avqw) avqv.instance;
            avqw.z = (avqy) ((anxl) avqx.build());
            avqw.a |= 536870912;
            return;
        }
        throw new NullPointerException();
    }

    public final void a(agqz agqz, int i, agqf agqf) {
        if (agqz.b == agrc.COMPLETED) {
            this.c.edit().putLong(xuq.a("%s_offline_download_success", ((agwc) this.f.get()).c()), this.b.a()).apply();
        }
        if (agpp.a(this.d, agqz.f)) {
            avqv avqv = (avqv) ((anxo) agpp.a(agqz).toBuilder());
            int ordinal = agqz.b.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    avqv.c(3);
                    this.e.a((avqw) ((anxl) avqv.build()));
                } else if (ordinal == 2) {
                    avqv.c(5);
                    agpl.a(avqv, agqz);
                    String b = agxj.b(agqz.f);
                    boolean z = false;
                    if (!(b == null || b.isEmpty())) {
                        agqy a = ((agwc) this.f.get()).b().k().a(b);
                        if (a != null) {
                            agqw agqw = a.j;
                            if (agqw != null) {
                                avqc avqc = agqw.b;
                                if (avqc != null && avqc.h) {
                                    z = true;
                                }
                            }
                        }
                    }
                    avqv.copyOnWrite();
                    avqw avqw = (avqw) avqv.instance;
                    avqw.a |= 16777216;
                    avqw.v = z;
                    agpl.b(avqv, agqz);
                    this.e.a((avqw) ((anxl) avqv.build()));
                    return;
                } else if (ordinal == 3) {
                    avqv.c(7);
                    avqv.d(i);
                    agpl.a(avqv, agqz);
                    agpl.b(avqv, agqz);
                    this.e.a((avqw) ((anxl) avqv.build()));
                    return;
                }
                return;
            }
            avqv.c(6);
            avqv.a(agpp.a(agqz.c));
            this.e.a((avqw) ((anxl) avqv.build()));
        }
    }
}
