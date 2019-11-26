package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;

/* renamed from: hvx */
public final class hvx extends hwk implements ell {
    public final Rect a = new Rect();
    public int b;
    public int c;
    private final akkq d;
    private final acvx e;
    private final ena f;
    private final hvg g;
    private final boolean h;
    private final bdfu i = new bdfu();
    private final int j;
    private ViewGroup k;
    private ImageView l;
    private ProgressBar m;
    private ImageView n;
    private View o;
    private View p;
    private boolean q;
    private boolean r;
    private boolean s;
    private awfe t;

    public hvx(Context context, akkq akkq, acvx acvx, zyw zyw, ena ena, elm elm, hvg hvg) {
        super(context);
        this.d = (akkq) amqw.a((Object) akkq);
        this.e = (acvx) amqw.a((Object) acvx);
        this.h = foh.o(zyw);
        this.f = (ena) amqw.a((Object) ena);
        this.g = (hvg) amqw.a((Object) hvg);
        elm.a(this);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.autonav_top_bar_background_height);
    }

    public final LayoutParams b() {
        return new aiuh(-1, -1, false);
    }

    public final View a(Context context) {
        boolean z = false;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.lite_autonav_overlay, null, false);
        this.k = (ViewGroup) viewGroup.findViewById(R.id.core_container);
        this.l = (ImageView) viewGroup.findViewById(R.id.mini_thumbnail);
        this.m = (ProgressBar) viewGroup.findViewById(R.id.mini_countdown);
        this.n = (ImageView) viewGroup.findViewById(R.id.mini_play);
        this.n.setOnClickListener(new hwa(this));
        this.o = viewGroup.findViewById(R.id.top_bar_background);
        this.p = viewGroup.findViewById(R.id.bottom_bar_background);
        this.g.a(this, this.k);
        View view = this.p;
        if (this.g.a() > 0) {
            z = true;
        }
        xpr.a(view, z);
        h();
        this.k.addOnLayoutChangeListener(new hvz(this));
        return viewGroup;
    }

    public final void a(Context context, View view) {
        super.a(context, view);
        if (c(8)) {
            this.k.setPadding(this.a.left, this.a.top, this.a.right, this.a.bottom);
            LayoutParams layoutParams = this.o.getLayoutParams();
            layoutParams.height = this.j + this.a.top;
            this.o.setLayoutParams(layoutParams);
            h();
        }
        if (c(22)) {
            this.g.a(this.c, this.b);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(awfe awfe, boolean z) {
        this.g.a(awfe, z);
        if (!amqq.a(this.t, awfe)) {
            this.t = awfe;
            this.s = false;
            g();
            aphg b = ahlr.b(awfe);
            if (b != null) {
                this.q = true;
                xpr.a(this.n, this.r);
                this.e.a(new acvs(b.r.d()), null);
                return;
            }
            this.q = false;
            xpr.a(this.n, false);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(ejd ejd) {
        this.g.a(ejd);
        h();
        boolean f = ejd.f();
        boolean z = false;
        boolean z2 = this.q && !this.h && f;
        this.r = z2;
        xpr.a(this.n, z2);
        View view = this.m;
        boolean z3 = !this.h && f;
        xpr.a(view, z3);
        xpr.a(this.l, f);
        g();
        z2 = f ^ 1;
        xpr.a(this.k, z2);
        xpr.a(this.o, z2);
        view = this.p;
        if (this.g.a() > 0 && !f) {
            z = true;
        }
        xpr.a(view, z);
    }

    /* Access modifiers changed, original: final */
    public final void a(long j, long j2) {
        if (this.m.getVisibility() == 0) {
            this.m.setMax((int) j2);
            this.m.setProgress((int) j);
        }
        this.g.a(j, j2);
    }

    public final void A_() {
        this.i.a(this.f.b.a(new hwc(this)));
    }

    public final void ar_() {
        this.i.a();
    }

    private final void g() {
        if (!this.s && this.l.getVisibility() == 0) {
            awfe awfe = this.t;
            if (awfe != null) {
                akkq akkq = this.d;
                ImageView imageView = this.l;
                aygk aygk = awfe.k;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                akkq.a(imageView, aygk);
                this.s = true;
            }
        }
    }

    private final void h() {
        LayoutParams layoutParams = this.p.getLayoutParams();
        layoutParams.height = this.g.a() + this.a.bottom;
        this.p.setLayoutParams(layoutParams);
    }
}
