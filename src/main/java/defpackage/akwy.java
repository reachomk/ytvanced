package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: akwy */
public class akwy extends aktq {
    private static final akxe a = new akxc();
    private final akpb b;
    private final akxh c;
    public final RecyclerView o;
    public int p;
    private final akxe q;
    private akxf r;
    private akxg t;
    private int u;

    public akwy(akyd akyd, RecyclerView recyclerView, akpe akpe, akwn akwn, aana aana, xci xci, akwb akwb, xoi xoi, acvx acvx, akpb akpb, akxw akxw, akxj akxj) {
        this(akyd, recyclerView, akpe, akwn, aana, xci, akwb, xoi, acvx, akpb, akxw, akxj, a);
    }

    public akwy(akyd akyd, RecyclerView recyclerView, akpe akpe, akwn akwn, aana aana, xci xci, akwb akwb, xoi xoi, acvx acvx, akpb akpb, akxw akxw, akxj akxj, akxe akxe) {
        akpe akpe2 = akpe;
        super(akyd, akpe.a((akpb) amqw.a((Object) akpb)), akwn, aana, xci, akwb, xoi, acvx, akxw, akxj);
        this.o = (RecyclerView) amqw.a((Object) recyclerView);
        this.b = akpb;
        this.q = akxe;
        this.u = recyclerView.getResources().getConfiguration().smallestScreenWidthDp;
        this.c = new akxh(this.d);
        this.d.b(this.c);
        this.o.setOnHierarchyChangeListener(new acwo(acvx));
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        akpb akpb = this.b;
        if (akpb instanceof akph) {
            this.o.a(((akph) akpb).b);
        }
        this.r = this.q.a(this.o, (akpd) this.e);
        akxf akxf = this.r;
        if (akxf == null) {
            this.o.a((apa) this.e);
            ((akpd) this.e).aa_();
        } else {
            akxf.a(this.o);
        }
        if (this.t == null) {
            this.t = new akxg(this);
        }
        this.o.a(this.t);
    }

    public final boolean a(aafn aafn, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            this.e.a(aknt.a);
        }
        f();
        c(aafn);
        if (z) {
            this.e.a(this.d);
        }
        a(bundle);
        if (z) {
            RecyclerView recyclerView = this.o;
            if (recyclerView != null) {
                apa apa = recyclerView.m;
                if (apa != null) {
                    apa.aa_();
                }
            }
        }
        this.c.b();
        return z;
    }

    public void f() {
        a(false);
        this.c.b();
    }

    public final void a(Configuration configuration) {
        for (akvy a : this.f) {
            a.a(configuration);
        }
        if (this.u != configuration.smallestScreenWidthDp) {
            this.u = configuration.smallestScreenWidthDp;
            RecyclerView recyclerView = this.o;
            apn apn = recyclerView.n;
            recyclerView.a(null);
            this.o.e.d().a();
            this.o.a(apn);
        }
        ((akpd) this.e).aa_();
        ao_();
        akxf akxf = this.r;
        if (akxf != null) {
            akxf.a(this.o, configuration);
        }
    }

    /* Access modifiers changed, original: protected */
    public void ao_() {
        this.o.post(new akxb(this, this.p));
    }

    public final Bundle t() {
        Bundle bundle = new Bundle();
        int s = ((ans) this.o.n).s();
        if (this.c.a < s) {
            s = -1;
        }
        bundle.putInt("scroll_position", s);
        return bundle;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Bundle bundle) {
        if (bundle != null) {
            int i = bundle.getInt("scroll_position", 0);
            if (i <= 0) {
                h();
                return;
            } else {
                this.o.post(new akxa(this, i));
                return;
            }
        }
        h();
    }

    private final void h() {
        if (this.o.n != null && ((akpd) this.e).a() > 0) {
            this.o.c(0);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(int i) {
        this.o.post(new akxd(this, i));
    }

    public void c() {
        super.c();
        akxf akxf = this.r;
        if (akxf != null) {
            akxf.b(this.o);
            this.r = null;
        }
        apv apv = this.t;
        if (apv != null) {
            this.o.b(apv);
        }
        this.o.a(null);
        this.o.a(null);
    }

    public final /* bridge */ /* synthetic */ View i() {
        return this.o;
    }
}
