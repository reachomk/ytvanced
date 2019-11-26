package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lgw */
class lgw extends aijv {
    private List a;
    private List b;
    public final enl e;
    public final lhf f;

    lgw(enl enl, lhf lhf, aijz aijz) {
        super(aijz);
        this.e = enl;
        this.f = lhf;
    }

    /* Access modifiers changed, original: final */
    public final boolean d() {
        return this.f.e;
    }

    public synchronized int a(enm enm) {
        if (b((aikr) enm)) {
            return super.a((aikr) enm);
        }
        int max = Math.max(0, e() + 1);
        int a = a(0);
        int a2 = a(1);
        if (a > max) {
            a(0, max, a - max);
        }
        if (a2 > 0) {
            a(1, 0, a2);
        }
        a(0, max, Collections.singleton(enm));
        b(max);
        return e();
    }

    public synchronized void c() {
        super.c();
        this.f.a();
    }

    public final void a(int i, List list) {
        if (this.a == null) {
            this.a = new ArrayList(a(i));
        }
        if (this.b == null) {
            this.b = new ArrayList(list.size());
        }
        b(i, this.a);
        for (avjj avjj : list) {
            apxu apxu;
            enl enl = this.e;
            if ((avjj.a & 1) != 0) {
                apxu = avjj.b;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = null;
            }
            this.b.add(enl.a(apxu));
        }
        xtq.a(this.a, this.b, new lgz(this, i));
        this.a.clear();
        this.b.clear();
    }
}
