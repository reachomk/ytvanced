package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: kqk */
public final class kqk implements akot, fgz, fhn {
    public final Context a;
    public final akkq b;
    public final aaas c;
    public final akvp d;
    public final akvo e;
    public final vmn f;
    public final tpu g;
    public final vod h;
    public final xci i;
    public final dwk j;
    public final ViewGroup k;
    public final FrameLayout l;
    public final fhb m;
    public final gal n;
    public final elv o;
    public final jty p;
    public final jup q;
    private final Resources r;
    private kqm s;
    private kqm t;
    private kqm u;
    private foq v;
    private boolean w;

    protected kqk(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, xci xci, fhb fhb, gal gal, elv elv, jty jty, jup jup, ViewGroup viewGroup, dwk dwk) {
        this.a = context;
        this.b = akkq;
        this.c = aaas;
        this.d = akvp;
        this.e = akvo;
        this.f = vmn;
        this.g = tpu;
        this.h = vod;
        this.i = xci;
        this.j = dwk;
        this.m = fhb;
        this.n = gal;
        this.o = elv;
        this.p = jty;
        this.q = jup;
        this.r = context.getResources();
        this.k = viewGroup;
        this.l = new FrameLayout(context);
    }

    public final fhc b() {
        return null;
    }

    public final View K_() {
        return this.l;
    }

    public final void a(akpb akpb) {
        amqw.a(this.u);
        kqm kqm = this.u;
        kqm.l = false;
        kqm.b.a();
        if (kqm.k) {
            kqm.c.a(akpb);
        }
        this.w = false;
        this.v = null;
    }

    public final View a() {
        kqm kqm = this.u;
        return kqm.k ? kqm.c.A : null;
    }

    public final void a(boolean z) {
        this.w = z;
        kqm kqm = this.u;
        if (kqm.k && kqm.l != z) {
            kqm.l = z;
            if (z) {
                kqm.c.b();
            }
        }
    }

    public final bblt a(int i) {
        kqm kqm = this.u;
        if (kqm.k) {
            return kqm.c.a(i, (fgz) this);
        }
        return bblt.a();
    }

    public final boolean a(fhn fhn) {
        if (fhn instanceof kqk) {
            kqm kqm = this.u;
            foq foq = ((kqk) fhn).v;
            foq foq2 = this.v;
            if (kqm.k) {
                return foa.a(foq, foq2);
            }
        }
        return false;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        View view;
        obj = (jtn) obj;
        amqw.a((Object) akor);
        amqw.a(obj);
        this.l.removeAllViews();
        if (this.r.getConfiguration().orientation != 2) {
            if (this.s == null) {
                this.s = new kqm(this, R.layout.promoted_discovery_app_promo_portrait, true);
            }
            this.u = this.s;
        } else {
            if (this.t == null) {
                this.t = new kqm(this, R.layout.promoted_discovery_app_promo_landscape, false);
            }
            this.u = this.t;
        }
        a(this.w);
        kqm kqm = this.u;
        if (obj.c == null) {
            anze anze = obj.a.b;
            if (anze == null) {
                anze = awpo.i;
            }
            obj.c = (ajym) ajzv.a(anze, ajym.class);
        }
        ajym ajym = obj.c;
        awpq a = obj.a();
        if (obj.e == null) {
            anyd anyd = obj.a.d;
            obj.e = new awqs[anyd.size()];
            for (int i = 0; i < anyd.size(); i++) {
                obj.e[i] = (awqs) anyd.get(i);
            }
        }
        Object[] objArr = obj.e;
        if (obj.b == null) {
            aojc aojc = obj.a.e;
            if (aojc == null) {
                aojc = aojc.f;
            }
            obj.b = aojc;
        }
        aojc aojc2 = obj.b;
        kqm.h = akor.a;
        kqm.i = (aphg) ajzv.a(ajym.k, aphg.class);
        kqm.j = null;
        apxu apxu = a.f;
        if (apxu == null) {
            apxu = apxu.d;
        }
        apxu apxu2 = a.h;
        if (apxu2 == null) {
            apxu2 = apxu.d;
        }
        kvl kvl = kqm.a;
        apxu[] apxuArr = new apxu[]{ajym.j};
        kvl.a = ajym.h;
        kvl.b = apxuArr;
        kvl.c = apxu;
        kvl.d = apxu2;
        kvo kvo = kqm.b;
        acvx acvx = akor.a;
        awps awps = obj.a;
        String str = (awps.a & 32) != 0 ? awps.g : null;
        if (obj.f == null) {
            obj.f = awps.f.d();
        }
        kvo.a(acvx, obj, str, ajym, objArr, aojc2, obj.f);
        if (kqm.k) {
            kqm.m.v = fod.b(obj);
            kqi kqi = kqm.c;
            acvx = kqm.h;
            kqi.a_(akor, kqm.m.v);
            kqi.z.a(acvx, obj, ajym, a, false);
            float f = ajym.d;
            int i2 = ajym.e;
            int i3 = ajym.f;
            Spanned a2 = ajqy.a(ajym.n);
            arml arml = a.i;
            if (arml == null) {
                arml = arml.f;
            }
            Spanned a3 = ajqy.a(arml);
            aygk aygk = a.g;
            if (aygk == null) {
                aygk = aygk.f;
            }
            kqt.a(kqi.a, kqi.b, f, i2, i3);
            kqt.a(kqi.c, a2);
            kqt.a(kqi.d, a3);
            kqt.a(kqi.e, aygk, kqi.g);
        } else {
            kqm.d.a(kqm.h, obj, ajym, a);
        }
        kqm.e.a(kqm.h, kqm.i, null);
        FrameLayout frameLayout = this.l;
        kqm kqm2 = this.u;
        if (kqm2.k) {
            view = kqm2.f;
        } else {
            view = kqm2.g;
        }
        frameLayout.addView(view);
    }
}
