package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: jhh */
final class jhh extends atg {
    private akot a;
    private int b;
    private int c;
    private final /* synthetic */ jhf d;

    public final int a(RecyclerView recyclerView, aqj aqj) {
        if (!this.d.a(recyclerView) || !this.d.a(aqj)) {
            return 0;
        }
        return atg.b(2, 3) | (atg.b(0, 3) | atg.b(1, 0));
    }

    public final boolean a() {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final void c() {
    }

    public final boolean a(RecyclerView recyclerView, aqj aqj, aqj aqj2) {
        if (this.d.a(recyclerView) && this.d.a(aqj, aqj2)) {
            jhf jhf = this.d;
            akos akos = jhf.c.e;
            akpk akpk = (akpk) jhf.b.get(jhf.b(aqj));
            if (akpk.contains(akos.getItem(aqj.d())) && akpk.contains(akos.getItem(aqj2.d()))) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(RecyclerView recyclerView, aqj aqj, aqj aqj2) {
        if (this.d.a(recyclerView) && this.d.a(aqj, aqj2)) {
            jhf jhf = this.d;
            akos akos = jhf.c.e;
            akpk akpk = (akpk) jhf.b.get(jhf.b(aqj));
            int a = jhf.a(aqj, akpk, akos);
            int a2 = jhf.a(aqj2, akpk, akos);
            if (!(a == -1 || a2 == -1)) {
                this.c = a2;
                akpk.b(a, a2);
                jhf = this.d;
                akot b = jhf.b(aqj);
                if (!(jhf.f == null || ((akpk) jhf.b.get(b)) == null)) {
                    for (jhj a3 : jhf.f) {
                        a3.a(b, a2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void a(aqj aqj) {
        if (aqj != null) {
            View view = aqj.a;
        }
        akot akot = this.a;
        if (akot != null) {
            jhf jhf = this.d;
            int i = this.b;
            int i2 = this.c;
            if (jhf.g != null) {
                akpk akpk = (akpk) jhf.b.get(akot);
                if (akpk != null) {
                    for (jhk a : jhf.g) {
                        a.a(akot, akpk, i, i2);
                    }
                }
            }
            this.a = null;
        }
        if (this.d.a(aqj)) {
            this.a = jhf.b(aqj);
            akot = this.a;
            if (akot != null) {
                int a2 = jhf.a(aqj, (akpk) this.d.b.get(akot), this.d.c.e);
                this.b = a2;
                this.c = a2;
                jhf jhf2 = this.d;
                akot akot2 = this.a;
                if (jhf2.e != null) {
                    akpk akpk2 = (akpk) jhf2.b.get(akot2);
                    if (akpk2 != null) {
                        for (jhm a3 : jhf2.e) {
                            a3.a(akot2, akpk2, a2);
                        }
                    }
                }
            }
        }
    }

    /* synthetic */ jhh(jhf jhf) {
        this.d = jhf;
    }
}
