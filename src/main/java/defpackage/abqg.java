package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: abqg */
public final class abqg {
    public final abxj a;
    public final ViewGroup b;
    public final boolean c = true;
    public abxg d;
    private final abwn e;
    private final abxh f;
    private final abwl g;
    private final abwx h;
    private final abqy i;
    private abxb j;
    private abro k;
    private abri l;

    public abqg(abxh abxh, abwn abwn, abxj abxj, abwl abwl, abwx abwx, abqy abqy, ViewGroup viewGroup) {
        this.f = abxh;
        this.e = abwn;
        this.a = abxj;
        this.g = abwl;
        this.h = abwx;
        this.i = abqy;
        this.b = viewGroup;
    }

    public final abro a() {
        if (this.k == null) {
            abwn abwn = this.e;
            this.k = new abwk((Context) abwn.a((Context) abwn.a.get(), 1), (akvz) abwn.a((akvz) abwn.b.get(), 2), (akpe) abwn.a((akpe) abwn.c.get(), 3), (acwa) abwn.a((acwa) abwn.d.get(), 4), (View) abwn.a(this.b, 5));
        }
        return this.k;
    }

    public final abri b() {
        if (this.l == null) {
            if (!this.c) {
                if (this.j == null) {
                    abxh abxh = this.f;
                    abro a = a();
                    ViewGroup viewGroup = this.b;
                    Context context = (Context) abxh.a((Context) abxh.a.get(), 1);
                    abwl abwl = (abwl) abxh.a((abwl) abxh.b.get(), 2);
                    abru abru = (abru) abxh.a((abru) abxh.c.get(), 3);
                    abrf abrf = (abrf) abxh.a((abrf) abxh.d.get(), 4);
                    abxh.a(a, 5);
                    this.j = new abxb(context, abwl, abru, abrf, (View) abxh.a(viewGroup, 6));
                }
                this.l = this.j.d;
            } else if (this.i.a()) {
                this.l = this.h.a(this.b, false);
            } else {
                this.l = this.g.a(this.b, true);
            }
        }
        return this.l;
    }
}
