package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: adsg */
public final class adsg implements adqc {
    public static final String a = xtl.b("MDX.remote");
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final bcaa c;
    public final afrk d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public boolean f;
    private final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    private final wxg i = new adsj(this);
    private final bcaa j;
    private final Set k;
    private final Handler l;
    private final addo m;
    private final Set n = new HashSet();
    private final xci o;
    private final bcaa p;
    private final Object q = new Object();
    private adsk r;

    public adsg(Executor executor, adcu adcu, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, addo addo, xci xci) {
        this.p = bcaa;
        this.j = bcaa2;
        this.c = bcaa3;
        this.m = addo;
        this.o = xci;
        this.d = afrk.a(executor, new adsf(adcu));
        this.l = new adsm(this);
        this.k = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public final void a(adqb adqb) {
        this.k.add(adqb);
    }

    public final void b(adqb adqb) {
        this.k.remove(adqb);
    }

    public final List a() {
        Map b = this.m.e.d.b();
        ArrayList arrayList = new ArrayList(b.size());
        for (Entry entry : b.entrySet()) {
            adjg adjg = (adjg) entry.getKey();
            adda adda = (adda) entry.getValue();
            arrayList.add(adiq.q().a(adjg).a(adda.a()).e(adda.b()).a(adda.e() ^ 1).a(adda.c()).b());
        }
        return arrayList;
    }

    public final List b() {
        return this.g;
    }

    public final List c() {
        return this.b;
    }

    public final adis a(String str) {
        for (adis adis : this.g) {
            if (str.equals(adis.b())) {
                return adis;
            }
        }
        return null;
    }

    public final adis b(String str) {
        Iterator it = this.g.iterator();
        while (true) {
            adjf adjf = null;
            if (!it.hasNext()) {
                return null;
            }
            adis adis = (adis) it.next();
            if (adis instanceof adio) {
                adjf = ((adio) adis).br_();
            } else if (adis instanceof adiq) {
                adjf = ((adiq) adis).k.g();
            }
            if (adjf != null && str.equals(adjf.a)) {
                return adis;
            }
        }
    }

    public final adis a(Bundle bundle) {
        return a(bundle.getString("screen"));
    }

    private final void f() {
        this.o.d(adpz.a);
        for (adqb a : this.k) {
            a.a();
        }
    }

    public final void a(adiy adiy, wxc wxc) {
        adui adui = (adui) this.j.get();
        adui.a.execute(new aduh(adui, adiy, new adsi(this, wxc)));
    }

    public final void c(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "pauseScan: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            str2.concat(valueOf);
        }
        this.n.remove(str);
        if (this.n.isEmpty()) {
            this.f = false;
            this.l.removeMessages(0);
            this.l.removeMessages(1);
        }
    }

    public final void d(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "resumeScan: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            str2.concat(valueOf);
        }
        if (this.n.isEmpty()) {
            this.f = true;
            e();
            d();
            this.f = true;
            this.l.sendEmptyMessageDelayed(0, 5000);
            this.l.sendEmptyMessageDelayed(1, 10000);
        }
        this.n.add(str);
    }

    public final void a(String str, wxg wxg) {
        for (adio adio : this.b) {
            if (str.equals(adio.b())) {
                break;
            }
        }
        adio adio2 = null;
        if (adio2 != null) {
            adtq adtq = (adtq) ((adqf) this.c.get()).c();
            if (adtq != null && adio2.equals(adtq.h())) {
                adtq.b(7);
            }
            b(adio2);
            adui adui = (adui) this.j.get();
            adui.a.execute(new adum(adui, adio2.br_(), new adsl(adio2, wxg)));
        }
    }

    public final void d() {
        this.l.removeMessages(2);
        if (((aebl) this.p.get()).a(3)) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            newSetFromMap.addAll(this.h);
            Handler handler = this.l;
            handler.sendMessageDelayed(Message.obtain(handler, 2, newSetFromMap), 9500);
            synchronized (this.q) {
                addr addr = this.r;
                if (addr != null) {
                    this.m.a(addr);
                }
                this.r = new adsk(this, newSetFromMap);
                this.m.a(this.r, true);
            }
            return;
        }
        if (!this.h.isEmpty()) {
            xtl.c(a, "Network conditions unsatisfactory. Removing all DIAL screens.");
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            this.g.remove((adiq) it.next());
        }
        f();
        this.h.clear();
    }

    public final void e() {
        if (((aebl) this.p.get()).a(4)) {
            adui adui = (adui) this.j.get();
            wxg wxg = this.i;
            adui.a.execute(new aduk(adui, new aduj(adui, wxg, wxg)));
            return;
        }
        if (!this.g.isEmpty()) {
            xtl.c(a, "Network conditions unsatisfactory. Removing all cloud screens.");
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            this.g.remove((adio) it.next());
        }
        f();
        this.b.clear();
    }

    public final void a(adiq adiq) {
        adiq a = a(adiq.d());
        if (a != null) {
            String.valueOf(a).length();
            b(a);
        }
        this.h.add(adiq);
        this.g.add(adiq);
        f();
    }

    public final adiq a(adjg adjg) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            adiq adiq = (adiq) it.next();
            if (adiq.d().equals(adjg)) {
                return adiq;
            }
        }
        return null;
    }

    public final void b(adiq adiq) {
        String.valueOf(adiq).length();
        this.h.remove(adiq);
        this.g.remove(adiq);
        this.e.remove(adiq.d());
        f();
    }

    public final void a(adio adio) {
        if (!this.g.contains(adio)) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                adio adio2 = (adio) it.next();
                if (adio2.br_().equals(adio.br_())) {
                    String.valueOf(adio2).length();
                    b(adio2);
                }
            }
            this.b.add(adio);
            this.g.add(adio);
            f();
        }
    }

    public final void b(adio adio) {
        String.valueOf(adio).length();
        this.b.remove(adio);
        this.g.remove(adio);
        f();
    }

    public final adsh c(adiq adiq) {
        return new adsh(this, adiq);
    }
}
