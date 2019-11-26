package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: lfi */
public final class lfi extends ldg implements akxw, lek {
    private static final byte[] i = new byte[0];
    public final bcaa b;
    public final ldm c;
    public final ldo d;
    public final ldq e;
    public leg f;
    public aafn g;
    public ajuo h;
    private final Context j;
    private final aana k;
    private final bcaa l;
    private final eod m;
    private final eoa o;
    private final fly p;
    private SwipeRefreshLayout q;
    private akwy r;
    private enx s;
    private Set t;
    private apxu u;
    private lel v;

    public lfi(Context context, acvx acvx, eod eod, bcaa bcaa, eoa eoa, bcaa bcaa2, ldm ldm, ldo ldo, ldq ldq, fly fly, aana aana) {
        super(acvx);
        this.j = context;
        this.m = eod;
        this.l = bcaa;
        this.o = eoa;
        this.b = bcaa2;
        this.c = ldm;
        this.d = ldo;
        this.e = ldq;
        this.p = fly;
        this.k = (aana) amqw.a((Object) aana);
    }

    public final boolean ap_() {
        return false;
    }

    public final void a(lel lel) {
        this.v = lel;
    }

    public final View f() {
        return this.q;
    }

    public final leg n() {
        return this.f;
    }

    public final void a(apxu apxu) {
        this.u = apxu;
        if (this.q == null) {
            RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(this.j).inflate(R.layout.section_list, null, false);
            apn eyt = new eyt(this.j);
            eyt.b(1);
            recyclerView.a(eyt);
            ((arn) recyclerView.D).g();
            this.q = new SwipeRefreshLayout(this.j);
            this.q.a(xwe.a(this.j, R.attr.ytTextPrimary, -16777216));
            this.q.a(xwe.a(this.j, R.attr.ytText1Inverse, -1));
            this.q.setBackgroundColor(xwe.a(this.j, R.attr.ytBrandBackgroundSolid, -16777216));
            this.q.addView(recyclerView);
            this.s = this.o.a(this.q);
            fly fly = this.p;
            aana aana = this.k;
            this.r = fly.a(null, recyclerView, aana, this.m.a(aana, this.a), this.a, (akpb) ((akvz) this.l.get()).get(), this, this.s, 3, akhs.ENGAGEMENT, syb.a);
            this.s.a(this.r);
            Set<akoq> set = this.t;
            if (set != null) {
                for (akoq a : set) {
                    this.r.a(a);
                }
                this.t.clear();
            }
        }
        this.r.b(this.g);
        this.f.a((lek) this);
    }

    public final void g() {
        akwy akwy = this.r;
        if (akwy != null) {
            akwy.c();
        }
        enx enx = this.s;
        if (enx != null) {
            enx.a();
        }
    }

    public final void h() {
        acwl acwl = acwl.n;
        ajuo ajuo = this.h;
        if (ajuo != null) {
            int i = ajuo.e;
            if (i > 0) {
                acwl a = acwl.a(i);
                if (a != null) {
                    acwl = a;
                }
            }
        }
        this.a.a(acwl, acww.OVERLAY, this.u);
        auko a2 = acwy.a(this.h);
        if (a2 == null || (a2.a & 1) == 0) {
            ajul ajul = this.h.c;
            if (ajul != null) {
                akab akab = ajul.a;
                if (akab != null) {
                    this.a.a(akab.d);
                }
            }
            return;
        }
        this.a.a(new acvs(a2.b));
        this.a.a(this.h, i);
    }

    public final void j() {
        this.a.a(this.h);
        i();
    }

    public final void i() {
        this.a.a();
        this.q.a(false);
        this.q.clearAnimation();
        lel lel = this.v;
        if (lel != null) {
            lel.a();
        }
    }

    public final void a(akoq akoq) {
        if (akoq != null) {
            akwy akwy = this.r;
            if (akwy != null) {
                akwy.a(akoq);
                return;
            }
            if (this.t == null) {
                this.t = new HashSet();
            }
            this.t.add(akoq);
        }
    }

    public final void H_() {
        this.r.H_();
    }

    public final void a(ajtf ajtf) {
        akwy akwy = this.r;
        if (akwy != null) {
            akwy.a(ajtf);
        }
    }

    public final /* bridge */ /* synthetic */ Object e() {
        return this.h;
    }
}
