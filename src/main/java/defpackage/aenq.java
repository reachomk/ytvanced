package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: aenq */
public final class aenq implements aeer {
    public static final aepc a;
    private static final aeoc m = new aenp();
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Map c = new ConcurrentHashMap();
    public final Set d = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Map e = new ConcurrentHashMap();
    public final Map f = new ConcurrentHashMap();
    public final Set g = Collections.synchronizedSet(new HashSet());
    public final xsc h;
    public final aenz i;
    public final zzl j;
    public boolean k = false;
    public int l;
    private final Map n = new ConcurrentHashMap();
    private final ExecutorService o;
    private final aeoc p;
    private aent q;
    private boolean r = false;
    private long s = 5000;

    public aenq(ExecutorService executorService, xsc xsc, afjj afjj, zzl zzl) {
        aeoc aeoc = m;
        this.o = executorService;
        this.h = xsc;
        this.p = aeoc;
        this.j = zzl;
        this.l = 1;
        this.i = new aenz(afjj);
        this.q = new aent(this);
        this.k = c();
    }

    public final synchronized void a(aepc aepc) {
        aepc aepc2 = aepc;
        synchronized (this) {
            amqw.a(aepc2.b);
            int i = this.l;
            if (i == 1 || i == 2) {
                this.g.add(aepc2.c);
                this.i.a(aepc2.c, aepc2.d, aepc2.b.length, aepc2.i, 1);
                aens aens = new aens(aepc2.c, aepc2.d, aepc2.e, aepc2.f, aepc2.j, this.k);
                boolean contains = this.b.contains(aens);
                if (!aepc2.g) {
                    if (!contains) {
                        byte[] bArr = aepc2.b;
                        a(aepc2, bArr, 0, bArr.length);
                        this.l = 2;
                        return;
                    }
                }
                this.q.a(aepc2);
                if (!contains) {
                    this.b.add(aens);
                }
                this.l = 2;
                return;
            }
        }
    }

    public final synchronized boolean a(byte[] bArr) {
        int i = this.l;
        if (i != 1 && i != 2) {
            return true;
        }
        aent aent = this.q;
        if (aent.a == null && aent.b == null) {
            aent.a = aent.c.p.a(bArr);
            aent.b = aent.c.o.submit(aent);
        }
        this.l = 2;
        return true;
    }

    public final synchronized void a(aeox aeox) {
        aenx a = aenx.a(aeox.a(), aeox.b(), aeox.e());
        aeox aeox2 = (aeox) this.n.get(a);
        if (aeox2 == null || aeox2.c() != aeox.c()) {
            this.n.put(a, aeox);
        } else {
            afpc.a(1, afpf.onesie, "duplicate_stream_metadata");
        }
    }

    public final synchronized void a(njk njk) {
        int i = this.l;
        if (i == 1 || i == 2) {
            i = njk.a;
            if ((i & 2) != 0) {
                if ((i & 4) != 0) {
                    this.f.put(njk.b, new aeoa(this, njk));
                    this.l = 2;
                    return;
                }
            }
            afpc.a(1, afpf.onesie, "live_metadata_missing_information");
        }
    }

    public final synchronized void a(boolean z, long j) {
        this.r = z;
        if (j < 0) {
            j = 5000;
        }
        this.s = j;
        if (this.l == 1) {
            this.l = 2;
        }
    }

    public final synchronized void a() {
        if (this.l == 2) {
            aent aent = this.q;
            if (aent.b == null) {
                this.l = 4;
                notifyAll();
                return;
            }
            aent.a(a);
            this.l = 3;
        }
    }

    public final synchronized void b() {
        this.c.clear();
        this.d.clear();
        if (this.l != 1) {
            Future future = this.q.b;
            if (future != null) {
                future.cancel(true);
            }
            this.q = new aent(this);
            this.b.clear();
            this.g.clear();
            this.e.clear();
            this.n.clear();
            this.f.clear();
            this.l = 1;
            this.k = c();
            this.i.a();
            notifyAll();
        }
    }

    public final synchronized void a(aent aent, aepc aepc, byte[] bArr, int i, int i2) {
        if (aent == this.q) {
            a(aepc, bArr, i, i2);
        }
    }

    private final synchronized void a(aepc aepc, byte[] bArr, int i, int i2) {
        aepc aepc2 = aepc;
        synchronized (this) {
            String str = aepc2.c;
            int i3 = aepc2.d;
            String.valueOf(str).length();
            this.i.a(aepc2.c, aepc2.d, aepc2.b.length, aepc2.i, 2);
            aens aens = new aens(aepc2.c, aepc2.d, aepc2.e, aepc2.f, aepc2.j, this.k);
            aeob aeob = (aeob) this.c.get(aens);
            if (aeob == null) {
                if (this.r) {
                    aeob = new aenr(aepc2.i);
                } else {
                    aeob = new aenw(aepc2.i);
                }
                this.c.put(aens, aeob);
            }
            aeob.a(bArr, i, i2, aepc2.k);
            if (aepc2.h) {
                aeob.b();
            }
            notifyAll();
        }
    }

    public final synchronized void a(String str, int i, long j, String str2) {
        synchronized (this) {
            this.d.add(new aens(str, i, j, -1, str2, this.k));
        }
    }

    private final boolean c() {
        arvt b = this.j.b();
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            avtg avtg = auuo.c;
            if (avtg == null) {
                avtg = avtg.k;
            }
            avte avte = avtg.e;
            if (avte == null) {
                avte = avte.x;
            }
            if (avte.w) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void a(String str, String str2) {
        if (this.l != 1) {
            this.e.put(str, str2);
        }
    }

    public final boolean a(String str, String str2, long j) {
        int a = aajy.a(str2);
        str2 = aajy.b(str2);
        if (!this.r) {
            return j == 0 && a(str, a, str2);
        } else {
            aeox aeox = (aeox) this.n.get(aenx.a(str, a, str2));
            if (aeox == null || !aeox.g().a()) {
                return j == 0 && a(str, a, str2);
            } else {
                j /= 1000;
                aepa aepa = (aepa) aeox.g().b();
                return j >= aepa.a() - this.s && j <= aepa.b();
            }
        }
    }

    private final boolean a(String str, int i, String str2) {
        if (this.c.size() + this.b.size() <= 20) {
            for (aens aens : this.d) {
                if (aens.a.equals(str) && aens.b == i && TextUtils.equals(str2, aens.c)) {
                    return true;
                }
            }
            for (aens aens2 : this.c.keySet()) {
                if (aens2.a.equals(str) && aens2.b == i && TextUtils.equals(str2, aens2.c)) {
                    return true;
                }
            }
            for (aens aens22 : this.b) {
                if (aens22.a.equals(str) && aens22.b == i && TextUtils.equals(str2, aens22.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized void a(aent aent) {
        if (aent == this.q) {
            this.l = 4;
            notifyAll();
        }
    }

    static {
        String str = "";
        a = new aepc(new byte[0], str, str);
    }
}
