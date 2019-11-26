package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: akpd */
public final class akpd extends apa implements akng, akos {
    public aknh c;
    private final akpb d;
    private final akmy e;
    private final HashSet f;
    private final LayoutParams g;

    private akpd(akpb akpb, LayoutParams layoutParams) {
        this.d = (akpb) amqw.a((Object) akpb);
        this.g = new LayoutParams((LayoutParams) amqw.a((Object) layoutParams));
        this.e = new akmy();
        this.c = aknt.a;
        this.f = new HashSet();
    }

    @Deprecated
    public akpd(akpb akpb) {
        this(akpb, new LayoutParams(-1, -2));
    }

    akpd(akpi akpi, akpb akpb) {
        this(akpb);
        a(new akpc(akpi));
    }

    akpd(akpi akpi, akpb akpb, LayoutParams layoutParams) {
        this(akpb, layoutParams);
        a(new akpf(akpi));
    }

    public final void a(akov akov) {
        this.f.add(akov);
    }

    public final void b(akov akov) {
        this.f.remove(akov);
    }

    public final void a(akoq akoq) {
        this.e.a(akoq);
    }

    public final void a(aknh aknh) {
        if (aknh != this.c) {
            amqw.a((Object) aknh);
            this.c.a((akng) this);
            this.c = aknh;
            this.c.b(this);
            aa_();
        }
    }

    public final Object getItem(int i) {
        return this.c.c(i);
    }

    public final long b(int i) {
        return this.c.a(i);
    }

    public final int a() {
        return this.c.d();
    }

    public final int a(int i) {
        return a(getItem(i));
    }

    public final int a(Object obj) {
        int a = this.d.a(obj);
        return a == -1 ? -1 : a;
    }

    /* renamed from: c */
    public final akoy a(ViewGroup viewGroup, int i) {
        return new akoy(d(viewGroup, i));
    }

    public final akot d(ViewGroup viewGroup, int i) {
        akot akns;
        if (i == -1) {
            akns = new akns(viewGroup.getContext());
        } else {
            akns = this.d.a(i, viewGroup);
        }
        View K_ = akns.K_();
        akoz.a(K_, akns, i);
        if (K_.getLayoutParams() == null) {
            K_.setLayoutParams(new LayoutParams(this.g));
        }
        return akns;
    }

    public final void a(akoy akoy, int i) {
        akot akot = akoy.p;
        a(akot, a(akot, i), getItem(i));
    }

    public final void a(akot akot, akor akor, Object obj) {
        akot.a_(akor, obj);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((akov) it.next()).a(akot, obj);
        }
    }

    public final void a(akoy akoy) {
        a(akoy.a);
    }

    public final void a(View view) {
        akpb akpb = this.d;
        amqw.a((Object) view);
        akot a = akoz.a(view);
        if (a != null) {
            akoz.a(a, view, akpb);
        }
    }

    public final akor a(akot akot, int i) {
        View K_ = akot.K_();
        akor c = K_ != null ? akoz.c(K_) : null;
        if (c == null) {
            c = new akor();
            akoz.a(K_, c);
        }
        c.a();
        c.a("position", Integer.valueOf(i));
        this.e.a(c, this.c, i);
        this.c.a(c, i);
        return c;
    }

    public final void bF_() {
        aa_();
    }

    public final void d_(int i, int i2) {
        a(i, i2);
    }

    public final void e_(int i, int i2) {
        c(i, i2);
    }

    public final void f_(int i, int i2) {
        b(i, i2);
    }

    public final void g_(int i, int i2) {
        d(i, i2);
    }
}
