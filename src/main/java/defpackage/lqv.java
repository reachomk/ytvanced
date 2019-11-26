package defpackage;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: lqv */
public final class lqv extends aisj implements adqi, aikd, lre {
    public final adqf a;
    public final Set b;
    private final bcaa c;
    private final lrd d;
    private final Map e = new HashMap();
    private final Map f;

    public lqv(bcaa bcaa, zzl zzl, adqf adqf, lrd lrd) {
        this.c = bcaa;
        this.a = adqf;
        this.d = lrd;
        this.f = new lqy(foh.b(zzl), zzl);
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    public final void b(adqe adqe) {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized lqz a(enm enm) {
        lqz lqz = (lqz) this.e.get(enm);
        if (lqz != null) {
            return lqz;
        }
        lqz = d(enm);
        lqz.a(amqq.a(enm, ((aikf) this.c.get()).b()));
        return lqz;
    }

    /* Access modifiers changed, original: final */
    public final void a(lqw lqw) {
        this.b.remove(lqw);
    }

    private final synchronized void c(enm enm) {
        lqz lqz;
        for (lqz lqz2 : this.e.values()) {
            if (!amqq.a(lqz2.a, enm)) {
                lqz2.a(false);
            }
        }
        if (enm != null) {
            lqz = (lqz) this.e.get(enm);
            if (lqz == null) {
                lqz = d(enm);
            }
            lqz.a(true);
        } else {
            lqz = null;
        }
        for (lqw a : this.b) {
            a.a(lqz);
        }
    }

    public final synchronized void a(lqz lqz, aafv aafv) {
        if (!b()) {
            enm enm = lqz.a;
            if (aafv != null) {
                this.f.put(enm, aafv);
            } else {
                this.f.remove(enm);
            }
        }
    }

    public final synchronized aafv b(enm enm) {
        if (b()) {
            return null;
        }
        lqz lqz = (lqz) this.e.get(enm);
        if (lqz == null) {
            return null;
        }
        return lqz.e();
    }

    public final aafv a(abkg abkg) {
        enm enm = (enm) ((aikf) this.c.get()).b();
        if (enm != null) {
            aiqq e = enm.e();
            String str = abkg.a;
            String str2 = abkg.b;
            int i = abkg.c;
            String str3 = abkg.d;
            if (TextUtils.equals(str, e.b()) && TextUtils.equals(str2, e.c()) && i == e.d() && TextUtils.equals(str3, e.h())) {
                return b(enm);
            }
        }
        return null;
    }

    public final synchronized void a() {
        for (lqz lqz : this.e.values()) {
            if (lqz.i == null && lqz.f() != null) {
                lqz.a(8);
            }
        }
    }

    public final void a(adqe adqe) {
        c();
    }

    public final void c(adqe adqe) {
        c();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(Collection collection) {
        this.e.keySet().retainAll(collection);
        this.f.keySet().retainAll(collection);
        aikf aikf = (aikf) this.c.get();
        int a = aikf.a();
        if (a != -1) {
            int i = !b() ? 3 : 0;
            aikk aikk = aikf.e;
            for (int i2 = 0; i2 < aikk.size(); i2++) {
                if (Math.abs(a - i2) > i) {
                    enm enm = (enm) aikk.get(i2);
                    this.f.remove(enm);
                    lqz lqz = (lqz) this.e.get(enm);
                    if (lqz != null) {
                        int i3;
                        if (lqz.i != null) {
                            lqz.i = null;
                            if (lqz.f() == null) {
                                i3 = 8;
                                lqz.a(i3 | lqz.b(null));
                            }
                        }
                        i3 = 0;
                        lqz.a(i3 | lqz.b(null));
                    }
                }
            }
        }
    }

    private final synchronized lqz d(enm enm) {
        lqz lqz;
        lqz = new lqz((aamj) lrd.a((aamj) this.d.a.get(), 1), (enm) lrd.a(enm, 2), this);
        this.e.put(enm, lqz);
        return lqz;
    }

    private final boolean b() {
        return this.a.c() != null;
    }

    private final synchronized void c() {
        this.f.clear();
        for (lqz a : this.e.values()) {
            a.a(null);
        }
    }
}
