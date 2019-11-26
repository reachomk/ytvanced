package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: kmx */
public final class kmx implements akot, jfy {
    public final Context a;
    public final akkq b;
    public final aaas c;
    public final akvo d;
    public final akvp e;
    public final gal f;
    public final xsc g;
    public final etd h;
    public final akyz i;
    public final jfw j;
    public final hmc k;
    public final fas l;
    public apdj m;
    public ham n;
    private final FrameLayout o;
    private knb p;
    private knb q;
    private knb r;
    private knb s;
    private knb t;

    public kmx(Context context, akkq akkq, aaas aaas, akvo akvo, akvp akvp, gal gal, etd etd, akyz akyz, xsc xsc, jfw jfw, hmc hmc, fas fas) {
        this.a = context;
        this.b = akkq;
        this.c = aaas;
        this.d = akvo;
        this.e = akvp;
        this.f = gal;
        this.h = etd;
        this.i = akyz;
        this.g = xsc;
        this.j = jfw;
        this.k = hmc;
        this.l = fas;
        jfw.a(this);
        this.o = new FrameLayout(context);
        this.o.setBackgroundDrawable(new eza(xwe.a(context, R.attr.ytSeparator, 0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.o;
    }

    public static apxu a(azdt azdt) {
        appu appu = azdt.c == 33 ? (appu) azdt.d : appu.c;
        appw appw = appu.b;
        if (appw == null) {
            appw = appw.f;
        }
        if ((appw.a & 2) == 0) {
            return null;
        }
        appw appw2 = appu.b;
        if (appw2 == null) {
            appw2 = appw.f;
        }
        apxu apxu = appw2.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return apxu;
    }

    public final epu c() {
        knb knb = this.t;
        if (knb != null) {
            knd knd = knb.e;
            if (knd != null) {
                return knd.p;
            }
        }
        return null;
    }

    public final apdj d() {
        return this.m;
    }

    public static apeb b(azdt azdt) {
        apdx apdx = azdt.u;
        if (apdx == null) {
            apdx = apdx.g;
        }
        if ((apdx.a & 2) == 0) {
            return null;
        }
        apdx apdx2 = azdt.u;
        if (apdx2 == null) {
            apdx2 = apdx.g;
        }
        apeb apeb = apdx2.c;
        if (apeb == null) {
            apeb = apeb.e;
        }
        return apeb;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        obj = (ham) obj;
        akor.a.a(obj.b(), null);
        ajus ajus = obj.a;
        if (!ajus.hasExtension(ajur.a)) {
            ajus.setExtension(ajur.a, aris.c);
        }
        if (!((aris) ajus.getExtension(ajur.a)).b) {
            ariv ariv = (ariv) ((anxo) ((aris) ajus.getExtension(ajur.a)).toBuilder());
            ariv.copyOnWrite();
            aris aris = (aris) ariv.instance;
            aris.a |= 1;
            aris.b = true;
            ajus.setExtension(ajur.a, (aris) ((anxl) ariv.build()));
            aabd.a(this.c, ajus.g, obj);
        }
        this.n = obj;
        this.o.removeAllViews();
        if (this.a.getResources().getConfiguration().orientation != 1) {
            if (this.q == null) {
                this.q = new knb(this, R.layout.video_feed_entry);
            }
            this.t = this.q;
        } else if (obj.c() == 4 && !xss.b(this.a)) {
            if (this.r == null) {
                this.r = new kmw(this);
            }
            this.t = this.r;
        } else if (obj.c() != 6 || xss.b(this.a)) {
            if (this.p == null) {
                this.p = new knb(this, R.layout.video_feed_entry);
            }
            this.t = this.p;
        } else {
            if (this.s == null) {
                this.s = new knb(this, R.layout.video_feed_entry_full_bleed);
            }
            this.t = this.s;
        }
        this.t.a(akor);
        this.o.addView(this.t.d);
    }
}
