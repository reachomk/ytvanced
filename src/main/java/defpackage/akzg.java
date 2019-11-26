package defpackage;

import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: akzg */
public final class akzg implements akxf {
    private final dad a;
    private final akzn b;
    private final akpd c;
    private final OnPreDrawListener d;
    private final OnLayoutChangeListener e;
    private int f = 0;
    private int g = 0;
    private int h;
    private boolean i;

    public akzg(RecyclerView recyclerView, akpd akpd, akei akei, sxd sxd, acvx acvx, aket aket, akhr akhr, syb syb) {
        akzf akzf;
        RecyclerView recyclerView2 = recyclerView;
        akpd akpd2 = akpd;
        recyclerView.getContext();
        this.c = akpd2;
        if (akhr.e()) {
            LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (!(layoutParams.height == -2 || layoutParams.width == -2)) {
                recyclerView2.r = true;
            }
        }
        if (akhr.f()) {
            recyclerView2.a(0);
        }
        cmg cmg = new cmg(recyclerView.getContext(), "LithoRVSLCBinder", new akdv(sxd));
        cwj cwj = new cwj(cmg);
        dbf dbf = new dbf();
        ans ans = (ans) recyclerView2.n;
        if (ans != null) {
            dbf.c = new czq(ans);
        }
        akev a = aket.a();
        if (akhr.c()) {
            dbf.v = new akzo(akpd2);
        }
        dbf.j = true;
        dbf.k = 200000;
        dbf.w = akhr.d();
        dbf.a = akhr.a();
        dbf.b = akhr.b();
        dbf.n = true;
        dbf.o = amul.a(new cms("YouTube", "LithoView:0-height"));
        cxj a2 = cxk.a();
        a2.a = akhr.g();
        a2.b = akhr.h();
        a2.c = akhr.i();
        cxk a3 = a2.a();
        dbf.u = a3.e;
        dbf.q = a3.l;
        dbf.r = a3.m;
        this.a = dbf.a(cmg);
        dad dad = this.a;
        boolean g = akhr.g();
        if (a.i()) {
            akzf = new akzf(akei);
        } else {
            akei akei2 = akei;
            akzf = null;
        }
        this.b = new akzn(cwj, dad, akpd, akei, acvx, g, a3, akzf, akhr.c(), akhr.j(), syb, akhr.p());
        this.d = new akzj(this, recyclerView2);
        this.e = new akzi(this);
    }

    public final void a(RecyclerView recyclerView) {
        recyclerView.getContext();
        akzn akzn = this.b;
        bbmz bbmz = akzn.g;
        if (bbmz != null) {
            bbmz.bK_();
        }
        akzn.g = new bbmz();
        this.c.a(this.b);
        this.b.a();
        c(recyclerView);
        recyclerView.getViewTreeObserver().addOnPreDrawListener(this.d);
        recyclerView.addOnLayoutChangeListener(this.e);
    }

    public final void b(RecyclerView recyclerView) {
        recyclerView.getViewTreeObserver().removeOnPreDrawListener(this.d);
        recyclerView.removeOnLayoutChangeListener(this.e);
        this.c.b(this.b);
        apn apn = recyclerView.n;
        this.a.a(recyclerView);
        bbmz bbmz = this.b.g;
        if (bbmz != null) {
            bbmz.bK_();
        }
        recyclerView.a(apn);
        this.g = 0;
        this.f = 0;
    }

    public final void c(RecyclerView recyclerView) {
        int width = recyclerView.getWidth();
        int height = recyclerView.getHeight();
        if (this.f == width && this.g == height) {
            this.a.b(recyclerView);
            return;
        }
        this.f = width;
        this.g = height;
        if (this.i) {
            this.a.a(recyclerView);
        }
        this.a.c(width, height);
        this.a.b(recyclerView);
        if (this.i) {
            recyclerView.getClass();
            recyclerView.post(new akzl(recyclerView));
        }
        this.i = false;
    }

    public final void a(RecyclerView recyclerView, Configuration configuration) {
        if (configuration.orientation != this.h) {
            this.i = true;
            this.h = configuration.orientation;
        }
        c(recyclerView);
    }
}
