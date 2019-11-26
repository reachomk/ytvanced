package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ihu */
public final class ihu extends aiua implements enc {
    public final bapu a;
    public final akde b;
    public final int c;
    public ihv d;
    public arbs e;
    public swo f;
    public ViewGroup g;
    public ViewGroup h;
    public View i;
    public int j;
    public int k;
    public aole l;
    private final aaas m;
    private ejd n;

    public ihu(Context context, bapu bapu, akde akde, aaas aaas, int i) {
        super(context);
        this.b = (akde) amqw.a((Object) akde);
        this.m = (aaas) amqw.a((Object) aaas);
        this.a = (bapu) amqw.a((Object) bapu);
        this.c = i;
        c();
    }

    public final void c() {
        this.f = null;
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.h.removeAllViews();
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.i.setVisibility(8);
            this.g = null;
            this.h = null;
            this.i = null;
        }
        if (this.e != null) {
            this.b.a(null);
            this.e = null;
        }
        this.j = 0;
        this.k = 0;
        this.l = null;
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final boolean a(ejd ejd) {
        return emq.a(ejd);
    }

    public final void b(ejd ejd) {
        ejd ejd2 = this.n;
        if (ejd2 == null || ejd != ejd2) {
            this.n = ejd;
            d();
        }
    }

    public final void d() {
        ejd ejd = this.n;
        if (!(ejd == null || this.l == null)) {
            if (ejd.f()) {
                this.m.a(this.l.c, e());
            } else if (this.n.a()) {
                this.m.a(this.l.a, e());
            } else {
                this.m.a(this.l.b, e());
            }
        }
    }

    private final Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        return hashMap;
    }
}
