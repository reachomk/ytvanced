package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: iiv */
public final class iiv {
    public final acvx a;
    public final ija b = new ija();
    public final lcm c;
    public arnu d;
    public boolean e;
    private final Set f = Collections.newSetFromMap(new WeakHashMap());
    private final int g;
    private final int h;
    private final boolean i;
    private final iij j;
    private final iiw k;
    private final Context l;
    private final Rect m = new Rect();
    private View n;
    private View o;
    private View p;
    private TextView q;
    private RecyclerView r;
    private xqc s;
    private iir t;
    private iik u;
    private boolean v;

    public iiv(Context context, acvx acvx, iij iij, iiw iiw, lcm lcm, zyw zyw) {
        this.a = (acvx) amqw.a((Object) acvx);
        this.j = iij;
        this.k = iiw;
        this.c = lcm;
        this.l = context;
        this.g = context.getResources().getDimensionPixelSize(R.dimen.fullscreen_engagement_header_height);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.metadata_highlights_max_top_margin);
        boolean d = foh.d(zyw);
        this.i = d;
        if (!d) {
            c();
        }
    }

    private final void c() {
        this.n = LayoutInflater.from(this.l).inflate(!this.i ? R.layout.fullscreen_engagement_overlay : R.layout.fullscreen_engagement_overlay_performance, null);
        this.q = (TextView) this.n.findViewById(R.id.engagement_title);
        this.n.findViewById(R.id.engagement_overflow_button).setOnClickListener(new iiy(this));
        this.o = this.n.findViewById(R.id.engagement_content);
        this.p = this.n.findViewById(R.id.engagement_header_background);
        this.r = (RecyclerView) this.n.findViewById(R.id.metadata_highlights);
        iiw iiw = this.k;
        this.t = new iir((Context) iiw.a((Context) iiw.a.get(), 1), (iis) iiw.a((iis) iiw.b.get(), 2), (akpe) iiw.a((akpe) iiw.c.get(), 3), (zyw) iiw.a((zyw) iiw.d.get(), 4), (RecyclerView) iiw.a(this.r, 5));
        iij iij = this.j;
        this.u = new iik((acvx) iij.a((acvx) iij.a.get(), 1), (lux) iij.a((lux) iij.b.get(), 2), (iji) iij.a((iji) iij.c.get(), 3), (iih) iij.a((iih) iij.d.get(), 4), (iio) iij.a((iio) iij.e.get(), 5), (zyw) iij.a((zyw) iij.f.get(), 6), (ViewGroup) iij.a((ViewGroup) this.n.findViewById(R.id.action_bar), 7), (View) iij.a(this.n.findViewById(R.id.action_bar_background), 8));
        ija ija = this.b;
        ija.a = (ImageView) this.n.findViewById(R.id.engagement_close_button);
        ija.a(ija.b);
        ija.a(ija.c);
        this.s = new xnz(this.n, (byte) 0);
        this.s.b(300);
        this.s.a(300);
        this.s.a(new iix(this));
        this.s.b(false);
        if (this.d != null) {
            d();
        }
        e();
        this.v = true;
    }

    public final void a(arnu arnu) {
        if (this.d != arnu) {
            this.d = arnu;
            if (this.v) {
                d();
            }
        }
    }

    private final void d() {
        arnu arnu;
        boolean z = true;
        if (this.d != null) {
            arml arml;
            this.a.a(new acvs(acwc.FULLSCREEN_ENGAGEMENT_EXPLICIT_CLOSE_BUTTON));
            TextView textView = this.q;
            arnu = this.d;
            if ((arnu.a & 1) != 0) {
                arml = arnu.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
        }
        this.t.a(this.d);
        iik iik = this.u;
        arnu = this.d;
        iik.a.removeAllViews();
        kkk kkk = iik.c;
        if (kkk != null) {
            kkk.a();
        }
        kkk = iik.d;
        if (kkk != null) {
            kkk.a();
        }
        kka kka = iik.e;
        if (kka != null) {
            kka.a();
        }
        iik.a(iik.a(arnu));
        if (iik.a.getChildCount() <= 0) {
            z = false;
        }
        xpr.a(iik.a, z);
        xpr.a(iik.b, z);
    }

    public final void a(iiz iiz) {
        this.f.add(iiz);
    }

    public final View a() {
        if (!this.v) {
            c();
        }
        return this.n;
    }

    public final boolean b() {
        return this.v && this.s.e() != 0;
    }

    public final void a(Rect rect) {
        if (!this.m.equals(rect)) {
            this.m.set(rect);
            if (this.v) {
                e();
            }
        }
    }

    private final void e() {
        this.o.setPadding(this.m.left, this.m.top, this.m.right, this.m.bottom);
        iir iir = this.t;
        Rect rect = this.m;
        if (!iir.b.equals(rect)) {
            iir.b.set(rect);
            iir.a.setPadding(rect.left, 0, rect.right, 0);
            iir.a.c(0);
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.p.getLayoutParams();
        marginLayoutParams.topMargin = this.m.top;
        this.p.setLayoutParams(marginLayoutParams);
        if (this.i) {
            marginLayoutParams = (MarginLayoutParams) this.r.getLayoutParams();
            marginLayoutParams.topMargin = (this.h + this.g) + this.m.top;
            this.r.setLayoutParams(marginLayoutParams);
        }
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        if (!this.v) {
            if (z) {
                c();
            }
        }
        boolean z4 = this.e;
        this.e = z2;
        if (z == this.s.b() && z2 != z4) {
            a(this.s.e(), z2);
        } else if (z) {
            this.s.a(z3);
        } else {
            this.s.b(z3);
        }
    }

    public final void a(int i, boolean z) {
        for (iiz a : this.f) {
            a.a(i, z);
        }
    }
}
