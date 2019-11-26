package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: hwj */
public final class hwj extends ahkw implements ejc, iiz, xcp {
    private final eme g;
    private ejd h;
    private boolean i;
    private boolean j;
    private boolean k;

    public hwj(ahku ahku, ahlm ahlm, emd emd, aaas aaas, acvx acvx, aizy aizy, xpt xpt, xhv xhv, xci xci) {
        super(ahku, ahlm, emd, aaas, acvx, aizy, xpt, xhv, xci);
        this.g = new eme(emd);
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (this.h != ejd2) {
            this.h = ejd2;
            if (this.h.e()) {
                this.g.a();
            } else {
                this.g.b();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        if (!this.k) {
            ejd ejd = this.h;
            if (!(ejd == null || ejd.g() || d())) {
                return true;
            }
        }
        return false;
    }

    public final void a(int i, boolean z) {
        boolean d = d();
        boolean z2 = this.i;
        boolean z3 = true;
        if (!(i == 2 || i == 1)) {
            z3 = false;
        }
        this.i = z3;
        if (z3 != z2 || (!this.j && z)) {
            this.j = z;
        }
        if (d != d()) {
            c();
        }
    }

    private final boolean d() {
        return this.i && this.j;
    }

    public final bcuo[] a(ajam ajam) {
        bcuo[] a = super.a(ajam);
        bcuo[] bcuoArr = new bcuo[]{ajam.Q().d.a(new hwm(this))};
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, bcuoArr);
        Collections.addAll(arrayList, a);
        return (bcuo[]) arrayList.toArray(new bcuo[arrayList.size()]);
    }

    public final void a(ahkr ahkr) {
        this.k = ahkr.a == 9;
        c();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != hwj.class) {
            return ahlz.a(this, obj, i);
        }
        Class[] clsArr;
        if (i == -1) {
            clsArr = new Class[]{ahkr.class};
        } else if (i == 0) {
            a((ahkr) obj);
            clsArr = null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
