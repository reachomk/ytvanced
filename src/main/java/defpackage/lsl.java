package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: lsl */
public final class lsl {
    public final akpd a;
    public final epc b = new epc();
    public lsq c;
    public int d;
    private final xci e;
    private final xoi f;
    private final acvx g;
    private final aana h;
    private akpk i;
    private RecyclerView j;
    private LoadingFrameLayout k;
    private boolean l;

    public lsl(xci xci, aaas aaas, abka abka, xoi xoi, akpe akpe, akph akph, acvx acvx) {
        this.e = xci;
        this.f = xoi;
        this.h = abka;
        this.g = (acvx) amqw.a((Object) acvx);
        this.a = akpe.a(akph);
        this.a.a(new akod(acvx));
        this.a.a(new aknv(aaas));
        this.a.a(this.b.a);
        this.l = false;
    }

    public final void a(RecyclerView recyclerView) {
        this.j = (RecyclerView) amqw.a((Object) recyclerView);
        this.j.a(this.a);
        this.a.aa_();
    }

    public final void a(Object obj) {
        epc epc = this.b;
        if (obj != epc.c) {
            epc.c = obj;
            aknh akpk = new akpk();
            if (obj != null) {
                akpk.add(0, obj);
            }
            epc.a.a(epc.b, akpk);
            epc.b = akpk;
        }
    }

    public final void a(LoadingFrameLayout loadingFrameLayout) {
        this.k = (LoadingFrameLayout) amqw.a((Object) loadingFrameLayout);
    }

    private final void b() {
        if (!this.l) {
            if (this.k == null) {
                xtl.d("loadingFrame is not initialized. Will not display the playlist.");
            } else if (this.j == null) {
                xtl.d("recyclerView is not initialized. Will not display the playlist.");
            } else {
                this.b.a(aknt.a);
                this.a.aa_();
                this.i = new akpk();
                this.c = new lsq(this.h, this.e, xci.a(), this.f, this.g, this.i);
                this.j.a(new lso(this));
                this.l = true;
            }
        }
    }

    public final void a(ajya ajya) {
        if (ajya != null) {
            b();
            akpk akpk = this.i;
            Collection arrayList = new ArrayList();
            for (ajxz ajxz : ajya.c) {
                ajyc ajyc = ajxz.b;
                if (ajyc != null) {
                    arrayList.add(ajyc);
                } else {
                    awjh awjh = ajxz.d;
                    if (awjh != null) {
                        arrayList.add(awjh);
                    }
                }
            }
            akpk.a(arrayList);
            akpk = this.i;
            ArrayList arrayList2 = new ArrayList();
            for (ajxz ajxz2 : ajya.c) {
                awjb awjb = ajxz2.c;
                if (awjb != null) {
                    arrayList2.add(awjb);
                }
            }
            akpk.addAll(arrayList2);
            this.c.a(abmn.a(ajya));
            aknh aknh = this.i;
            if (aknh != null) {
                b();
                this.k.b();
                this.b.a(aknh);
            }
            int i = ajya.d;
            int i2 = 0;
            while (i2 < i) {
                if (i2 < this.i.size() && !(this.i.get(i2) instanceof ajyc)) {
                    i++;
                }
                i2++;
            }
            i2 = Math.max((i + this.b.b.d()) - 1, 0);
            apn apn = this.j.n;
            if (apn instanceof ans) {
                ((ans) apn).a_(i2, 0);
            }
        }
    }

    public final void a() {
        if (this.l) {
            this.k.a();
            this.i.clear();
            lsq lsq = this.c;
            if (lsq != null) {
                lsq.n();
            }
        }
    }
}
