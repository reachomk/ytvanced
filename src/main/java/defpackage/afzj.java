package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: afzj */
public final class afzj implements agvu {
    public final bcaa a;
    public final agbg b;
    private final bcaa c;
    private final Executor d;
    private final bcaa e;

    public afzj(bcaa bcaa, Executor executor, bcaa bcaa2, bcaa bcaa3, agbg agbg) {
        this.c = bcaa;
        this.d = (Executor) amqw.a((Object) executor);
        this.a = bcaa2;
        this.e = bcaa3;
        this.b = agbg;
    }

    public final void a(String str, aakj aakj, avsi avsi, byte[] bArr, boolean z) {
        xak.b();
        if (this.b.v()) {
            str = ((agdi) this.c.get()).a(str, aakj);
            if (str != null) {
                aakj = aakj.s();
                if (aakj != null) {
                    ((agdo) this.e.get()).a(aakj.b(), avsi, aakj.x(), z);
                }
                ((agdo) this.e.get()).a(str, avsi, bArr, z);
            }
        }
    }

    public final String a(String str, aakj aakj, avsi avsi) {
        xak.b();
        return this.b.v() ? ((agdi) this.c.get()).a(str, aakj) : null;
    }

    public final List a(String str) {
        xak.b();
        if (this.b.v()) {
            return ((agfi) this.a.get()).v((String) amqw.a((Object) str));
        }
        return amul.g();
    }

    public final vse a(String str, String str2) {
        xak.b();
        return this.b.v() ? ((agfi) this.a.get()).a((String) amqw.a((Object) str), (String) amqw.a((Object) str2)) : null;
    }

    public final void b(String str) {
        amqw.a((Object) str);
        this.d.execute(new afzm(this, str));
    }

    public final void b(String str, String str2) {
        amqw.a((Object) str);
        amqw.a((Object) str2);
        this.d.execute(new afzl(this, str, str2));
    }

    public final int c(String str, String str2) {
        xak.b();
        amqw.a((Object) str);
        amqw.a((Object) str2);
        if (this.b.v()) {
            ager a = ((agfi) this.a.get()).f.a(str, str2);
            if (a != null) {
                return a.g;
            }
        }
        return 0;
    }

    public final Map a() {
        if (!this.b.v()) {
            return amwm.a;
        }
        agdi agdi = (agdi) this.c.get();
        List<ageu> e = agdi.a.e();
        HashMap hashMap = new HashMap();
        for (ageu ageu : e) {
            String str = ageu.a.a;
            atcn atcn = (atcn) atco.f.createBuilder();
            int ordinal = ageu.a.d.ordinal();
            if (ordinal == 0) {
                atcn.c(1);
                atcn.b(0);
            } else if (ordinal == 1) {
                atcn.c(3);
                atcn.b((int) Math.max(0, TimeUnit.MILLISECONDS.toSeconds(ageu.a.e - agdi.b.a())));
                ager ager = ageu.a;
                atcn.a(Math.max(0, ager.f - ager.g));
            } else if (ordinal == 2) {
                agep agep = ageu.b;
                if (agep == null || agep.c != agqf.COMPLETE) {
                    atcn.c(4);
                } else {
                    atcn.c(5);
                }
                atcn.b((int) Math.max(0, TimeUnit.MILLISECONDS.toSeconds(ageu.a.e - agdi.b.a())));
                String str2 = ageu.a.b;
                atcn.copyOnWrite();
                atco atco = (atco) atcn.instance;
                if (str2 != null) {
                    atco.a = 2 | atco.a;
                    atco.c = str2;
                    ager ager2 = ageu.a;
                    atcn.a(Math.max(0, ager2.f - Math.max(ageu.b.b, ager2.g)));
                } else {
                    throw new NullPointerException();
                }
            }
            atcr atcr = (atcr) atcs.b.createBuilder();
            atcr.copyOnWrite();
            atcs atcs = (atcs) atcr.instance;
            if (!atcs.a.a()) {
                atcs.a = anxl.mutableCopy(atcs.a);
            }
            atcs.a.add((atco) ((anxl) atcn.build()));
            atcs atcs2 = (atcs) ((anxl) atcr.build());
            List list = (List) hashMap.get(str);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(str, list);
            }
            list.add(atcs2);
        }
        return hashMap;
    }

    public final void c(String str) {
        amqw.a((Object) str);
        this.d.execute(new afzo(this, str));
    }

    public final int d(String str) {
        xak.b();
        if (this.b.v()) {
            agep b = ((agfi) this.a.get()).g.b(str);
            if (b != null) {
                return b.b;
            }
        }
        return 0;
    }

    public final agqf e(String str) {
        xak.b();
        if (!this.b.v()) {
            return null;
        }
        agep b = ((agfi) this.a.get()).g.b(str);
        return b != null ? b.c : agqf.DELETED;
    }
}
