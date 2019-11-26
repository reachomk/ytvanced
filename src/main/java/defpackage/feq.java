package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources.Theme;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: feq */
public final class feq implements ffb {
    public LinearLayout a;
    private final Activity b;
    private FrameLayout c;
    private TextView d;
    private ImageView e;
    private boolean f = false;
    private AlphaAnimation g;
    private TranslateAnimation h;
    private TranslateAnimation i;
    private AnimationSet j;
    private AnimationSet k;
    private ValueAnimator l;
    private fez m;
    private final akvp n;
    private FrameLayout o;
    private Theme p;

    public feq(Activity activity, akvp akvp) {
        this.b = activity;
        this.n = akvp;
    }

    public final void a(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.o;
        if (frameLayout2 != null) {
            FrameLayout frameLayout3 = this.c;
            if (frameLayout3 != null) {
                frameLayout2.removeView(frameLayout3);
            }
        }
        this.m = null;
        this.o = null;
        this.o = frameLayout;
        if (this.c != null) {
            d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x010b  */
    public final void a(defpackage.fez r7) {
        /*
        r6 = this;
        r0 = r6.o;
        if (r0 == 0) goto L_0x014f;
    L_0x0004:
        r0 = r6.c;
        r1 = 0;
        if (r0 != 0) goto L_0x0028;
    L_0x0009:
        r0 = r6.b;
        r0 = android.view.LayoutInflater.from(r0);
        r2 = 2131034230; // 0x7f050076 float:1.7678972E38 double:1.052870803E-314;
        r3 = r6.o;
        r0 = r0.inflate(r2, r3, r1);
        r0 = (android.widget.FrameLayout) r0;
        r6.c = r0;
        r6.d();
        r0 = r6.a;
        r2 = r0.getBackground();
        defpackage.xpr.a(r0, r2);
    L_0x0028:
        r0 = r6.o;
        r0 = r0.getContext();
        r0 = r0.getTheme();
        r6.p = r0;
        r2 = r6.p;
        r3 = r6.f;
        if (r3 != 0) goto L_0x00e0;
    L_0x003a:
        r3 = r6.b;
        r4 = 2131099676; // 0x7f06001c float:1.7811712E38 double:1.052903138E-314;
        r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r4);
        r3 = (android.view.animation.AlphaAnimation) r3;
        r6.g = r3;
        r3 = r6.b;
        r4 = 2131099672; // 0x7f060018 float:1.7811704E38 double:1.052903136E-314;
        r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r4);
        r3 = (android.view.animation.TranslateAnimation) r3;
        r6.h = r3;
        r3 = r6.b;
        r4 = 2131099673; // 0x7f060019 float:1.7811706E38 double:1.0529031363E-314;
        r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r4);
        r3 = (android.view.animation.TranslateAnimation) r3;
        r6.i = r3;
        r3 = r6.b;
        r4 = 2131099674; // 0x7f06001a float:1.7811708E38 double:1.052903137E-314;
        r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r4);
        r3 = (android.view.animation.AnimationSet) r3;
        r6.j = r3;
        r3 = r6.b;
        r4 = 2131099675; // 0x7f06001b float:1.781171E38 double:1.0529031373E-314;
        r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r4);
        r3 = (android.view.animation.AnimationSet) r3;
        r6.k = r3;
        r3 = 2;
        r3 = new int[r3];
        r3 = {51, 0};
        r3 = android.animation.ValueAnimator.ofInt(r3);
        r6.l = r3;
        r3 = r6.l;
        r4 = r6.b;
        r4 = r4.getResources();
        r5 = 2131820554; // 0x7f11000a float:1.9273826E38 double:1.053259299E-314;
        r4 = r4.getInteger(r5);
        r4 = (long) r4;
        r3.setDuration(r4);
        r3 = r6.l;
        r4 = r6.b;
        r4 = r4.getResources();
        r5 = 2131820555; // 0x7f11000b float:1.9273828E38 double:1.0532592993E-314;
        r4 = r4.getInteger(r5);
        r4 = (long) r4;
        r3.setStartDelay(r4);
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 22;
        if (r3 < r4) goto L_0x00d6;
    L_0x00b3:
        r3 = new ayr;
        r3.<init>();
        r4 = r6.g;
        r4.setInterpolator(r3);
        r4 = r6.h;
        r4.setInterpolator(r3);
        r4 = r6.i;
        r4.setInterpolator(r3);
        r4 = r6.j;
        r4.setInterpolator(r3);
        r4 = r6.k;
        r4.setInterpolator(r3);
        r4 = r6.l;
        r4.setInterpolator(r3);
    L_0x00d6:
        r3 = r6.i;
        r4 = new fes;
        r4.<init>(r6);
        r3.setAnimationListener(r4);
    L_0x00e0:
        r3 = r6.f;
        if (r3 != 0) goto L_0x00e5;
    L_0x00e4:
        goto L_0x00ed;
    L_0x00e5:
        if (r0 != r2) goto L_0x00e8;
    L_0x00e7:
        goto L_0x0104;
    L_0x00e8:
        r0 = r6.l;
        r0.removeAllUpdateListeners();
    L_0x00ed:
        r0 = r6.o;
        r0 = r0.getContext();
        r2 = 2130772278; // 0x7f010136 float:1.714767E38 double:1.0527413817E-314;
        r0 = defpackage.xwe.a(r0, r2, r1);
        r2 = r6.l;
        r3 = new fet;
        r3.<init>(r6, r0);
        r2.addUpdateListener(r3);
    L_0x0104:
        r0 = 1;
        r6.f = r0;
        r0 = r6.m;
        if (r7 == r0) goto L_0x012f;
    L_0x010b:
        r6.m = r7;
        r0 = r6.d;
        r2 = r7.a();
        r0.setText(r2);
        r0 = r6.n;
        r7 = r7.b();
        r7 = r0.a(r7);
        r0 = r6.b;
        r0 = r0.getResources();
        r7 = r0.getDrawable(r7);
        r0 = r6.e;
        r0.setImageDrawable(r7);
    L_0x012f:
        r7 = r6.c;
        r7.bringToFront();
        r7 = r6.a;
        r7.setVisibility(r1);
        r7 = r6.a;
        r0 = r6.h;
        r7.startAnimation(r0);
        r7 = r6.d;
        r0 = r6.g;
        r7.startAnimation(r0);
        r7 = r6.e;
        r0 = r6.j;
        r7.startAnimation(r0);
        return;
    L_0x014f:
        r7 = new java.lang.IllegalStateException;
        r0 = "Controller must be initialized for a feed before the content pill can be shown.";
        r7.<init>(r0);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feq.a(fez):void");
    }

    public final void a(boolean z) {
        if (!(this.o == null || this.c == null)) {
            if (z) {
                this.a.startAnimation(this.i);
                return;
            }
            this.a.setVisibility(8);
        }
    }

    public final amqp a() {
        return amqp.c(this.m);
    }

    public final amqp b() {
        if (a().a()) {
            return amqp.c(this.c);
        }
        return ampo.a;
    }

    public final amqp c() {
        if (a().a()) {
            return amqp.c(this.a);
        }
        return ampo.a;
    }

    private final void d() {
        this.o.addView(this.c);
        this.c = (FrameLayout) this.o.findViewById(R.id.bar_wrapper);
        this.a = (LinearLayout) this.c.findViewById(R.id.bar_layout);
        this.d = (TextView) this.c.findViewById(R.id.bar_text);
        this.e = (ImageView) this.c.findViewById(R.id.bar_icon);
    }
}
