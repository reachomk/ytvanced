package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.youtube.app.playlist.ui.OnAnimationEndRelativeLayout;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint;

/* renamed from: gwq */
public final class gwq extends nd implements acwa, OnClickListener, lbs {
    public int Z;
    public int aa;
    public View ab;
    public OnAnimationEndRelativeLayout ac;
    public View ad;
    public TopPeekingScrollView ae;
    public RecyclerView af;
    public boolean ag;
    public acvx ah;
    public emd ai;
    public lbu aj;
    public xwb ak;
    private int al;
    private int am;
    private aej an;
    private String ao;
    private akpd ap;
    private boolean aq;
    private ValueAnimator ar;

    public final void W_() {
        super.W_();
        Window window = this.c.getWindow();
        window.addFlags(2);
        window.setDimAmount(0.0f);
    }

    public final void a(Context context) {
        super.a(context);
        this.an = (aej) context;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((gwy) xse.a(this.an)).a(this);
        a(2, this.ak.a);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ab = layoutInflater.inflate(R.layout.playlist_add_to_fragment, viewGroup, false);
        this.ad = this.ab.findViewById(R.id.overlay);
        this.ae = (TopPeekingScrollView) this.ab.findViewById(R.id.top_peeking_scroll_view);
        this.af = (RecyclerView) this.ab.findViewById(R.id.list);
        this.af.a(new ans());
        this.af.setVisibility(4);
        this.ac = (OnAnimationEndRelativeLayout) this.ab.findViewById(R.id.add_to_playlist_bottom_sheet_close_button);
        int dimensionPixelSize = this.ab.getResources().getDimensionPixelSize(R.dimen.add_to_playlist_close_button_width);
        if (dimensionPixelSize > 0) {
            LayoutParams layoutParams = this.ac.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            this.ac.setLayoutParams(layoutParams);
        }
        this.ac.setOnClickListener(new gwt(this));
        this.ac.a = new gws(this);
        View view = this.ac;
        xpr.a(view, view.getBackground());
        this.ad.setOnClickListener(this);
        this.ae.c(M_().getResources().getDisplayMetrics().heightPixels - fpf.a(this.an));
        TopPeekingScrollView topPeekingScrollView = this.ae;
        topPeekingScrollView.l = this.ad;
        topPeekingScrollView.m = this.af;
        this.al = q().getInteger(R.integer.abc_config_activityDefaultDur);
        this.am = q().getInteger(R.integer.abc_config_activityShortDur);
        this.Z = q().getInteger(R.integer.abc_config_activityShortDur);
        this.aa = q().getInteger(17694720);
        this.ab.getViewTreeObserver().addOnGlobalLayoutListener(new gwu(this));
        return this.ab;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        apxu a = aaax.a(this.j.getByteArray("navigation_endpoint"));
        anxr access$000 = anxl.checkIsLite(AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint);
        a.a(access$000);
        Object b = a.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        String str = ((AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint) b).b;
        lbu lbu = this.aj;
        afsw lbm = new lbm(lbu.a, (xoi) lbu.a((xoi) lbu.b.get(), 2), (akpe) lbu.a((akpe) lbu.c.get(), 3), (aaas) lbu.a((aaas) lbu.d.get(), 4), (akzb) lbu.a((akzb) lbu.e.get(), 5), (xci) lbu.a((xci) lbu.f.get(), 6), (Activity) lbu.a(this.an, 7), (lbs) lbu.a(this, 8), (String) lbu.a(str, 9));
        abfz a2 = ((abfm) lbm.a.get()).a();
        a2.c(lbm.c);
        a2.g();
        ((abfm) lbm.a.get()).a(a2, lbm);
    }

    public final void B() {
        super.B();
        this.ao = this.ai.b();
    }

    public final void ad_() {
        super.ad_();
        this.ai.a(this.ao);
    }

    public final void dismiss() {
        this.ad.animate().alpha(0.0f).setDuration((long) this.aa).start();
        this.ac.animate().translationY((float) this.ac.getHeight()).setDuration((long) this.Z).setStartDelay((long) this.am).setInterpolator(new LinearInterpolator()).setListener(new gwx(this)).start();
        ValueAnimator valueAnimator = this.ar;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.aq = true;
        ViewPropertyAnimator animate = this.ae.animate();
        int height = this.ab.getHeight();
        int i = this.ae.k;
        animate.translationY((float) (((height - i) - this.ac.getHeight()) + this.ae.getScrollY())).setDuration((long) this.am).setInterpolator(new LinearInterpolator()).start();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ab.addOnLayoutChangeListener(new gww(this, this.ab.getHeight()));
    }

    public final void onClick(View view) {
        if (view == this.ad) {
            dismiss();
        }
    }

    public final void a(akpd akpd) {
        this.ap = akpd;
        if (this.ag) {
            W();
        }
    }

    public final void W() {
        if (this.ap != null && !this.aq) {
            this.af.setVisibility(0);
            this.af.a(this.ap);
            this.ap = null;
            this.af.getViewTreeObserver().addOnGlobalLayoutListener(new gwz(this));
        }
    }

    public final void f(boolean z) {
        apa apa = this.af.m;
        if (apa != null) {
            amqp amqp;
            aknh aknh = ((akpd) apa).c;
            int d = aknh.d();
            int i = 0;
            int i2 = 0;
            while (i < aknh.d()) {
                if (!(aknh.c(i) instanceof awgz)) {
                    if (this.af.getChildAt(i) == null) {
                        amqp = ampo.a;
                        break;
                    } else {
                        i2 += this.af.getChildAt(i).getHeight();
                        i++;
                    }
                } else {
                    d = i;
                    break;
                }
            }
            View childAt = this.af.getChildAt(d);
            if (childAt != null) {
                amqp = amqp.b(Integer.valueOf(i2 + (childAt.getHeight() * (this.af.m.a() - d))));
            } else {
                amqp = ampo.a;
            }
            if (amqp.a()) {
                d = xss.a(M_().getResources().getDisplayMetrics(), 365);
            } else {
                d = Integer.MAX_VALUE;
            }
            int intValue = ((Integer) amqp.a(Integer.valueOf(Integer.MAX_VALUE))).intValue();
            i = Math.max(0, (this.ab.getHeight() - this.ac.getHeight()) - Math.min(d, intValue));
            intValue = Math.min(Math.max(intValue - d, 0), i);
            TopPeekingScrollView topPeekingScrollView = this.ae;
            if (i != topPeekingScrollView.k) {
                if (z) {
                    this.ar = new ValueAnimator();
                    this.ar.setIntValues(new int[]{this.ae.k, i});
                    this.ar.setInterpolator(new ayr());
                    this.ar.setDuration((long) this.al);
                    this.ar.addUpdateListener(new gwv(this, intValue));
                    this.ar.start();
                    return;
                }
                topPeekingScrollView.a(i, intValue, true);
            }
        }
    }

    public final void g(boolean z) {
        if (z) {
            dismiss();
        } else {
            super.f();
        }
    }

    public final acvx t() {
        return this.ah;
    }
}
