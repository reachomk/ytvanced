package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: kpw */
public final class kpw implements akot, fgz, fhn {
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
    private kpy s;
    private kpy t;
    private kpy u;
    private foq v;
    private boolean w;

    protected kpw(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, xci xci, fhb fhb, gal gal, elv elv, jty jty, jup jup, ViewGroup viewGroup, dwk dwk) {
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
        kpy kpy = this.u;
        kpy.l = false;
        kpy.b.a();
        if (kpy.k) {
            kpy.c.a(akpb);
        }
        this.w = false;
        this.v = null;
    }

    public final View a() {
        kpy kpy = this.u;
        return kpy.k ? kpy.c.A : null;
    }

    public final void a(boolean z) {
        this.w = z;
        kpy kpy = this.u;
        if (kpy.k && kpy.l != z) {
            kpy.l = z;
            if (z) {
                kpy.c.b();
            }
        }
    }

    public final bblt a(int i) {
        kpy kpy = this.u;
        if (kpy.k) {
            return kpy.c.a(i, (fgz) this);
        }
        return bblt.a();
    }

    public final boolean a(fhn fhn) {
        if (fhn instanceof kpw) {
            kpy kpy = this.u;
            foq foq = ((kpw) fhn).v;
            foq foq2 = this.v;
            if (kpy.k) {
                return foa.a(foq, foq2);
            }
        }
        return false;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        View view;
        obj = (jtk) obj;
        amqw.a((Object) akor);
        amqw.a(obj);
        this.l.removeAllViews();
        int i = 0;
        if (this.r.getConfiguration().orientation != 2) {
            if (this.s == null) {
                this.s = new kpy(this, R.layout.promoted_discovery_action_portrait, true);
            }
            this.u = this.s;
        } else {
            if (this.t == null) {
                this.t = new kpy(this, R.layout.promoted_discovery_action_landscape, false);
            }
            this.u = this.t;
        }
        a(this.w);
        kpy kpy = this.u;
        if (obj.c == null) {
            anze anze = obj.a.b;
            if (anze == null) {
                anze = awqy.j;
            }
            obj.c = (ajyq) ajzv.a(anze, ajyq.class);
        }
        ajyq ajyq = obj.c;
        awpi a = obj.a();
        if (obj.e == null) {
            anyd anyd = obj.a.d;
            obj.e = new awqq[anyd.size()];
            while (i < anyd.size()) {
                obj.e[i] = (awqq) anyd.get(i);
                i++;
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
        kpy.h = akor.a;
        kpy.i = (aphg) ajzv.a(ajyq.j, aphg.class);
        kpy.j = null;
        apxu apxu = a.f;
        if (apxu == null) {
            apxu = apxu.d;
        }
        apxu apxu2 = a.h;
        if (apxu2 == null) {
            apxu2 = apxu.d;
        }
        kvi kvi = kpy.a;
        apxu apxu3 = ajyq.h;
        apxu[] apxuArr = ajyq.m;
        kvi.a = apxu3;
        kvi.b = apxuArr;
        kvi.c = apxu;
        kvi.d = apxu2;
        kvo kvo = kpy.b;
        acvx acvx = akor.a;
        awpk awpk = obj.a;
        String str = (awpk.a & 32) != 0 ? awpk.g : null;
        if (obj.f == null) {
            obj.f = awpk.f.d();
        }
        kvo.a(acvx, obj, str, ajyq, objArr, aojc2, obj.f);
        if (kpy.k) {
            kpy.m.v = fod.b(obj);
            kpu kpu = kpy.c;
            acvx = kpy.h;
            kpu.a_(akor, kpy.m.v);
            kpu.z.a(acvx, obj, ajyq, a, false);
            arml arml = a.i;
            if (arml == null) {
                arml = arml.f;
            }
            Spanned a2 = ajqy.a(arml);
            Spanned a3 = ajqy.a(ajyq.g);
            aygk aygk = a.g;
            if (aygk == null) {
                aygk = aygk.f;
            }
            kqs.a(kpu.a, a2);
            kqs.a(kpu.c, a3);
            kqs.a(kpu.b, aygk, kpu.g);
        } else {
            kpy.d.a(kpy.h, obj, ajyq, a);
        }
        kpy.e.a(kpy.h, kpy.i, null);
        FrameLayout frameLayout = this.l;
        kpy kpy2 = this.u;
        if (kpy2.k) {
            view = kpy2.f;
        } else {
            view = kpy2.g;
        }
        frameLayout.addView(view);
    }
}
