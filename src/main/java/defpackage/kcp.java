package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: kcp */
public final class kcp implements akot {
    public final Context a;
    public final akkq b;
    public final flu c;
    public final FrameLayout d;
    public final akop e;
    public final akvo f;
    public final est g;
    public final eur h;
    private akot i;
    private akot j;

    public kcp(Context context, akkq akkq, flu flu, akop akop, akvo akvo, est est, eur eur) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.e = akop;
        this.f = akvo;
        this.g = est;
        this.h = eur;
        this.c = (flu) amqw.a((Object) flu);
        this.d = new FrameLayout(context);
        flu.a(this.d);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        akot akot;
        ajvw ajvw = (ajvw) obj;
        akor.a.a(ajvw.h, null);
        if (etj.a(akor)) {
            if (this.j == null) {
                this.j = new kco(this);
            }
            akot = this.j;
        } else {
            if (this.i == null) {
                this.i = new kcr(this);
            }
            akot = this.i;
        }
        if (this.d != akot.K_().getParent()) {
            this.d.removeAllViews();
            this.d.addView(akot.K_());
        }
        akot.a_(akor, ajvw);
        this.c.a(akor);
    }
}
