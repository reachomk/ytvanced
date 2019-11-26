package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: ivf */
public final class ivf extends akpl {
    private final gal a;
    private final akvp b;
    private final akkq c;
    private final aaas d;
    private final akvo e;
    private final Context f;
    private final akou g;
    private final FrameLayout h;
    private akot i;
    private akot j;

    public ivf(Context context, akkq akkq, aaas aaas, flu flu, gal gal, akvo akvo, akvp akvp) {
        this.f = context;
        this.g = (akou) amqw.a((Object) flu);
        this.c = akkq;
        this.d = aaas;
        this.a = gal;
        this.e = akvo;
        this.b = akvp;
        this.h = new FrameLayout(context);
        this.g.a(this.h);
    }

    public final View K_() {
        return this.g.a();
    }

    public final void a(akpb akpb) {
        akot akot = this.i;
        if (akot != null) {
            akot.a(akpb);
        }
        akot = this.j;
        if (akot != null) {
            akot.a(akpb);
        }
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        akot akot;
        azhw azhw = (azhw) obj;
        akor akor2 = new akor(akor);
        akor2.b = azhw.m.d();
        this.h.removeAllViews();
        int a = azgi.a(azhw.j);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 2) {
            if (this.i == null) {
                this.i = new ivh(this.f, this.c, this.d, new akpn(), this.a, this.b);
            }
            akot = this.i;
        } else {
            if (this.j == null) {
                this.j = new ive(this.f, this.c, this.d, new akpn(), this.a, this.e, this.b);
            }
            akot = this.j;
        }
        akot.a_(akor, azhw);
        this.h.addView(akot.K_());
        this.g.a(akor2);
    }
}
