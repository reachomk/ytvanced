package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: wrt */
public final class wrt implements akot {
    public final akkq a;
    public final Activity b;
    public final aaas c;
    public final akue d;
    public final akzb e;
    public final ViewGroup f;
    public final wsa g;
    public final acwa h;
    public akyw i = null;
    public ajwn j;
    public int k;
    private final FrameLayout l;
    private wrv m;
    private wrv n;
    private wrv o;

    public wrt(Activity activity, akkq akkq, akzb akzb, aaas aaas, akuh akuh, wsa wsa, acwa acwa, ViewGroup viewGroup) {
        this.b = activity;
        this.a = akkq;
        this.c = aaas;
        this.e = akzb;
        this.f = viewGroup;
        this.g = wsa;
        this.h = acwa;
        int a = xwe.a(activity, R.attr.ytStaticWhite, 0);
        this.d = akuh.a.a(a).b(a).b();
        this.l = new FrameLayout(activity);
        this.l.setLayoutParams(new LayoutParams(-1, -1));
    }

    public final View K_() {
        return this.l;
    }

    public final void a(akpb akpb) {
        this.j = null;
    }

    public static aygk a(ajwn ajwn, boolean z) {
        aygn aygn;
        aygk aygk;
        aygo aygo = ajwn.j;
        if (aygo != null) {
            aygn = aygo.b;
            if (aygn == null) {
                aygn = aygn.d;
            }
        } else {
            aygn = null;
        }
        if (z) {
            aygk = aygn.c;
            if (aygk == null) {
                return aygk.f;
            }
        }
        aygk = aygn.b;
        if (aygk == null) {
            return aygk.f;
        }
        return aygk;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        ajwn ajwn = this.j;
        return (ajwn == null || ajwn.i) ? false : true;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ajwn ajwn = (ajwn) obj;
        this.j = ajwn;
        this.k = this.b.getResources().getConfiguration().orientation;
        int i = this.j.l == 2 ? R.layout.onboarding_interstitial_promo_view : R.layout.interstitial_promo_view;
        if (this.i == null) {
            Object b = akor.b("overlay_controller_param", null);
            if (b instanceof akyw) {
                this.i = (akyw) b;
            }
        }
        this.l.removeAllViews();
        wrv wrv;
        if (this.k == 1) {
            wrv = this.o;
            if (wrv == null || i != wrv.b) {
                this.o = new wrv(this, i);
            }
            this.m = this.o;
        } else {
            wrv = this.n;
            if (wrv == null || i != wrv.b) {
                this.n = new wrv(this, i);
            }
            this.m = this.n;
        }
        this.m.a(ajwn);
        this.l.addView(this.m.a);
    }
}
