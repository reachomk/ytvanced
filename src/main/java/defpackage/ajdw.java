package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* renamed from: ajdw */
public final class ajdw {
    public final amro a;
    public final String b;
    public final acum c;
    public final amro d;
    public boolean e;
    public long f;
    private final afqv g;
    private final xhv h;
    private final afmi i;
    private final PriorityQueue j;
    private final PriorityQueue k;
    private final Executor l;
    private final ajea m;
    private final zzl n;

    protected ajdw(afqv afqv, xhv xhv, afmi afmi, amro amro, List list, List list2, String str, Executor executor, ajea ajea, acum acum, zzl zzl, amro amro2) {
        this.g = (afqv) amqw.a((Object) afqv);
        this.h = (xhv) amqw.a((Object) xhv);
        this.i = (afmi) amqw.a((Object) afmi);
        this.a = (amro) amqw.a((Object) amro);
        this.j = new PriorityQueue((Collection) amqw.a((Object) list));
        this.k = new PriorityQueue((Collection) amqw.a((Object) list2));
        this.b = (String) amqw.a((Object) str);
        this.l = (Executor) amqw.a((Object) executor);
        this.m = (ajea) amqw.a((Object) ajea);
        this.c = acum;
        this.n = zzl;
        this.d = amro2;
    }

    public final synchronized void a(ahkm ahkm) {
        if (ahkm.g) {
            this.f = ahkm.a;
            while (this.j.size() > 0) {
                aakm aakm = (aakm) this.j.peek();
                long j = this.f;
                if (aakm.a.length() <= 0 || ((long) (aakm.a(0) * 1000)) > j) {
                    break;
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    this.l.execute(new ajdz(this, aakm));
                } else {
                    a(aakm, this.f);
                }
                this.j.remove();
            }
            while (!this.k.isEmpty()) {
                aakf aakf = (aakf) this.k.peek();
                if (((long) (aakf.b * 1000)) > this.f) {
                    break;
                }
                awak awak = (awak) awal.d.createBuilder();
                String str = this.b;
                awak.copyOnWrite();
                awal awal = (awal) awak.instance;
                if (str != null) {
                    awal.a = 1 | awal.a;
                    awal.b = str;
                    anvu anvu = aakf.a;
                    awak.copyOnWrite();
                    awal awal2 = (awal) awak.instance;
                    if (anvu != null) {
                        awal2.a |= 2;
                        awal2.c = anvu;
                        awal awal3 = (awal) ((anxl) awak.build());
                        asmz asmz = (asmz) asmw.f.createBuilder();
                        asmz.copyOnWrite();
                        asmw asmw = (asmw) asmz.instance;
                        if (awal3 != null) {
                            asmw.c = awal3;
                            asmw.b = 214;
                            this.c.a((asmw) ((anxl) asmz.build()));
                            this.k.remove();
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            if (!this.e) {
                awdw awdw = this.n.b().l;
                if (awdw == null) {
                    awdw = awdw.E;
                }
                if (awdw.s) {
                    this.e = true;
                    this.l.execute(new ajdy(this));
                }
            }
        }
    }

    public final void a(aakm aakm, long j) {
        xvo a = xvo.a(aakm.a());
        for (aako aako : aakm.b) {
            xak.b();
            int ordinal = aako.ordinal();
            if (ordinal == 0) {
                for (Entry entry : ((Map) this.a.get()).entrySet()) {
                    a.b((String) entry.getKey(), (String) entry.getValue());
                }
            } else if (ordinal == 2) {
                this.i.a(a);
            } else if (ordinal == 3) {
                a.b("cpn", this.b);
            } else if (ordinal == 4) {
                a.a("conn", this.h.k());
            } else if (ordinal == 5) {
                a.b("cmt", String.valueOf(j / 1000));
            }
        }
        Uri a2 = a.a();
        if (this.m.a(a2)) {
            a2 = this.m.b(a2);
        }
        afsd aakn = new aakn(aakm);
        String.valueOf(a2).length();
        afqy a3 = afqv.a("remarketing");
        a3.a(a2);
        a3.e = true;
        a3.a(aakn);
        this.g.a(a3, aftp.a);
    }

    public final synchronized ajed a() {
        return new ajed(this.j, this.k, this.b);
    }
}
