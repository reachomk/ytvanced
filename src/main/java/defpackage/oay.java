package defpackage;

import android.view.Surface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: oay */
public final class oay implements oah, obn, obs, odr, olo, oom, ova, pah, pai {
    public final CopyOnWriteArraySet a;
    public final oaz b;
    public oaf c;
    private final oye d;
    private final oav e;

    protected oay(oaf oaf, oye oye) {
        if (oaf != null) {
            this.c = oaf;
        }
        this.d = (oye) oxz.a((Object) oye);
        this.a = new CopyOnWriteArraySet();
        this.b = new oaz();
        this.e = new oav();
    }

    public final void e() {
    }

    public final void g() {
        throw null;
    }

    public final void h() {
        throw null;
    }

    public final void c() {
        if (!this.b.g) {
            obb j = j();
            this.b.g = true;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((obc) it.next()).b(j);
            }
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList(this.b.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oba oba = (oba) arrayList.get(i);
            b(oba.c, oba.a);
        }
    }

    public final void a(olj olj) {
        j();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).k();
        }
    }

    public final void c(odk odk) {
        j();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(1, odk);
        }
    }

    public final void b(String str, long j, long j2) {
        obb k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(k, 1, str, j2);
        }
    }

    public final void b(nzw nzw) {
        k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(1, nzw);
        }
    }

    public final void a(int i, long j, long j2) {
        obb k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(k, j, j2);
        }
    }

    public final void d(odk odk) {
        obb i = i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(i, 1, odk);
        }
    }

    public final void b(int i) {
        obb k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(k, i);
        }
    }

    public final void a(odk odk) {
        j();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(2, odk);
        }
    }

    public final void a(String str, long j, long j2) {
        obb k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(k, 2, str, j2);
        }
    }

    public final void a(nzw nzw) {
        k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(2, nzw);
        }
    }

    public final void a(int i, long j) {
        obb i2 = i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(i2, i, j);
        }
    }

    public final void b(odk odk) {
        obb i = i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(i, 2, odk);
        }
    }

    public final void a(Surface surface) {
        k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(surface);
        }
    }

    public final void a(int i, int i2, int i3, float f) {
        k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(i, i2);
        }
    }

    public final void f() {
        k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).j();
        }
    }

    public final void a(int i, ook ook) {
        oau oau;
        oaz oaz = this.b;
        if (oaz.f.a(ook.a) == -1) {
            oau = oau.a;
        } else {
            oau = oaz.f;
        }
        oba oba = new oba(ook, oau, i);
        oaz.a.add(oba);
        oaz.b.put(ook, oba);
        if (oaz.a.size() == 1 && !oaz.f.c()) {
            oaz.a();
        }
        d(i, ook);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).f();
        }
    }

    public final void b(int i, ook ook) {
        d(i, ook);
        oaz oaz = this.b;
        oba oba = (oba) oaz.b.remove(ook);
        if (oba != null) {
            oaz.a.remove(oba);
            oba = oaz.e;
            if (oba != null && ook.equals(oba.a)) {
                oaz.e = !oaz.a.isEmpty() ? (oba) oaz.a.get(0) : null;
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((obc) it.next()).g();
            }
        }
    }

    public final void a(int i, ook ook, ooy ooy, opb opb) {
        d(i, ook);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).b();
        }
    }

    public final void b(int i, ook ook, ooy ooy, opb opb) {
        d(i, ook);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).c();
        }
    }

    public final void c(int i, ook ook, ooy ooy, opb opb) {
        d(i, ook);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).d();
        }
    }

    public final void a(int i, ook ook, ooy ooy, opb opb, IOException iOException, boolean z) {
        obb d = d(i, ook);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(d, iOException);
        }
    }

    public final void c(int i, ook ook) {
        oaz oaz = this.b;
        oaz.e = (oba) oaz.b.get(ook);
        d(i, ook);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).h();
        }
    }

    public final void a(int i, ook ook, opb opb) {
        d(i, ook);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).e();
        }
    }

    public final void b(int i, ook ook, opb opb) {
        d(i, ook);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(opb);
        }
    }

    public final void a(oau oau) {
        oaz oaz = this.b;
        for (int i = 0; i < oaz.a.size(); i++) {
            oba a = oaz.a((oba) oaz.a.get(i), oau);
            oaz.a.set(i, a);
            oaz.b.put(a.a, a);
        }
        oba oba = oaz.e;
        if (oba != null) {
            oaz.e = oaz.a(oba, oau);
        }
        oaz.f = oau;
        oaz.a();
        obb j = j();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(j);
        }
    }

    public final void a() {
        j();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a();
        }
    }

    public final void a(boolean z) {
        j();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(z);
        }
    }

    public final void a(boolean z, int i) {
        obb j = j();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(j, z, i);
        }
    }

    public final void a(nyy nyy) {
        obb l;
        if (nyy.a == 0) {
            l = l();
        } else {
            l = j();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(l, nyy);
        }
    }

    public final void a(int i) {
        this.b.a();
        j();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(i);
        }
    }

    public final void a(oag oag) {
        obb j = j();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(j, oag);
        }
    }

    public final void b() {
        oaz oaz = this.b;
        if (oaz.g) {
            oaz.g = false;
            oaz.a();
            obb j = j();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((obc) it.next()).c(j);
            }
        }
    }

    public final void b(int i, long j, long j2) {
        l();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).i();
        }
    }

    public final void a(Exception exception) {
        obb k = k();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obc) it.next()).a(k, exception);
        }
    }

    private final obb a(oau oau, int i, ook ook) {
        if (oau.c()) {
            ook = null;
        }
        long a = this.d.a();
        Object obj = null;
        if (oau == this.c.r() && i == this.c.k()) {
            obj = 1;
        }
        if (ook == null || !ook.a()) {
            if (obj != null) {
                this.c.q();
            } else if (!oau.c()) {
                oau.a(i, this.e).a();
            }
        } else if (obj != null && this.c.o() == ook.b && this.c.p() == ook.c) {
            this.c.l();
        }
        long l = this.c.l();
        this.c.n();
        return new obb(a, oau, i, l);
    }

    private final obb a(oba oba) {
        oxz.a(this.c);
        if (oba == null) {
            int k = this.c.k();
            oaz oaz = this.b;
            ook ook = null;
            for (int i = 0; i < oaz.a.size(); i++) {
                oba oba2 = (oba) oaz.a.get(i);
                int a = oaz.f.a(oba2.a.a);
                if (a != -1 && oaz.f.a(a, oaz.c).b == k) {
                    if (ook != null) {
                        ook = null;
                        break;
                    }
                    ook = oba2;
                }
            }
            if (ook != null) {
                oba = ook;
            } else {
                oau r = this.c.r();
                if (k >= r.a()) {
                    r = oau.a;
                }
                return a(r, k, null);
            }
        }
        return a(oba.b, oba.c, oba.a);
    }

    private final obb i() {
        return a(this.b.d);
    }

    private final obb j() {
        oaz oaz = this.b;
        oba oba = null;
        if (!(oaz.a.isEmpty() || oaz.f.c() || oaz.g)) {
            oba = (oba) oaz.a.get(0);
        }
        return a(oba);
    }

    private final obb k() {
        return a(this.b.e);
    }

    private final obb l() {
        oba oba;
        oaz oaz = this.b;
        if (oaz.a.isEmpty()) {
            oba = null;
        } else {
            ArrayList arrayList = oaz.a;
            oba = (oba) arrayList.get(arrayList.size() - 1);
        }
        return a(oba);
    }

    private final obb d(int i, ook ook) {
        oxz.a(this.c);
        if (ook != null) {
            obb a;
            oba oba = (oba) this.b.b.get(ook);
            if (oba == null) {
                a = a(oau.a, i, ook);
            } else {
                a = a(oba);
            }
            return a;
        }
        oau r = this.c.r();
        if (i >= r.a()) {
            r = oau.a;
        }
        return a(r, i, null);
    }
}
