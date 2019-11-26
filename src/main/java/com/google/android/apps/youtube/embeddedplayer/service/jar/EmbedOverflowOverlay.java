package com.google.android.apps.youtube.embeddedplayer.service.jar;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
import defpackage.aahn;
import defpackage.aajq;
import defpackage.aiay;
import defpackage.aicd;
import defpackage.aieh;
import defpackage.aiei;
import defpackage.aiek;
import defpackage.aigf;
import defpackage.aihy;
import defpackage.ajis;
import defpackage.xpr;
import defpackage.xsb;
import defpackage.xtl;
import java.util.List;

public final class EmbedOverflowOverlay extends FrameLayout implements aiei, OnClickListener, AnimationListener {
    private int A;
    public LinearLayout a;
    public aiek[] b;
    public aicd c;
    public aieh d;
    public aiay e;
    public aihy f;
    private RelativeLayout g;
    private LinearLayout h;
    private TouchImageView i;
    private View j;
    private LinearLayout k;
    private TextView l;
    private TouchImageView m;
    private TextView n;
    private View o;
    private Animation p;
    private Animation q;
    private Animation r;
    private Animation s;
    private boolean t;
    private boolean u;
    private boolean v;
    private aajq[] w;
    private int x;
    private boolean y;
    private aahn[] z;

    public EmbedOverflowOverlay(Context context) {
        this(context, null);
    }

    public final void a(aigf aigf) {
    }

    public final void a(ajis ajis) {
    }

    public final void a(List list) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public EmbedOverflowOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new aiek[0];
        this.p = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.q = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        this.q.setAnimationListener(this);
        long integer = (long) context.getResources().getInteger(R.integer.fade_overlay_fade_duration);
        this.p.setDuration(integer);
        this.q.setDuration(integer);
        this.r = AnimationUtils.loadAnimation(context, R.anim.zoom_in);
        this.s = AnimationUtils.loadAnimation(context, R.anim.zoom_out);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (RelativeLayout) findViewById(R.id.overflow_buttons_container);
        this.h = (LinearLayout) findViewById(R.id.plugins_container);
        this.a = (LinearLayout) findViewById(R.id.top_plugins_container);
        this.j = findViewById(R.id.quality_button);
        this.j.setOnClickListener(this);
        this.i = (TouchImageView) findViewById(R.id.quality_icon);
        this.k = (LinearLayout) findViewById(R.id.audio_track_select_button);
        this.k.setOnClickListener(this);
        this.l = (TextView) findViewById(R.id.audio_track_language);
        this.o = findViewById(R.id.cc_button);
        this.o.setOnClickListener(this);
        this.m = (TouchImageView) findViewById(R.id.cc_icon);
        this.n = (TextView) findViewById(R.id.cc_button_text);
        setOnClickListener(this);
    }

    public final void a(aicd aicd) {
        this.c = aicd;
    }

    public final void a(aieh aieh) {
        this.d = aieh;
    }

    public final void a(aiay aiay) {
        this.e = aiay;
    }

    public final void a(aihy aihy) {
        this.f = aihy;
    }

    public final void a(aiek... aiekArr) {
        this.b = (aiek[]) xsb.a(this.b, (Object[]) aiekArr);
        for (aiek aiek : aiekArr) {
            this.h.addView(aiek.a());
            aiek.a().setOnClickListener(this);
        }
    }

    public final void a() {
        for (aiek b : this.b) {
            b.b();
        }
        clearAnimation();
        setVisibility(0);
        this.g.startAnimation(this.r);
        startAnimation(this.p);
    }

    public final void b() {
        this.g.startAnimation(this.s);
        startAnimation(this.q);
    }

    public final void a(Animation animation) {
        if (getVisibility() == 0) {
            startAnimation(animation);
        }
    }

    public final void c() {
        clearAnimation();
        setVisibility(8);
        this.q.setStartTime(0);
    }

    private final void e() {
        f();
        g();
        this.k.setEnabled(this.y);
        xpr.a(this.k, this.y);
        if (this.y) {
            aahn[] aahnArr = this.z;
            if (aahnArr != null) {
                int i = this.A;
                if (i >= 0 && i < aahnArr.length) {
                    this.l.setText(getContext().getString(R.string.current_audio_track_name, new Object[]{this.z[this.A].b}));
                    return;
                }
            }
            xtl.c("Invalid data for audio tracks when audio track selection is enabled.");
            this.k.setEnabled(false);
            this.k.setVisibility(8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, RETURN} */
    public final void onClick(android.view.View r13) {
        /*
        r12 = this;
        r0 = defpackage.mvb.a;
        r1 = 0;
        if (r0 == 0) goto L_0x0012;
    L_0x0005:
        r2 = r0.get();
        if (r2 == 0) goto L_0x0012;
    L_0x000b:
        r0 = r0.get();
        r0 = (android.content.Context) r0;
        goto L_0x001d;
    L_0x0012:
        r0 = new java.lang.Object[r1];
        r2 = "Current context was null, falling back to default context";
        defpackage.ammj.a(r2, r0);
        r0 = r12.getContext();
    L_0x001d:
        r2 = r12.j;
        r3 = 2131951943; // 0x7f130147 float:1.9540315E38 double:1.0533242136E-314;
        if (r13 != r2) goto L_0x00c0;
    L_0x0024:
        r2 = r12.w;
        if (r2 == 0) goto L_0x00c0;
    L_0x0028:
        r2 = r2.length;
        if (r2 <= 0) goto L_0x00c0;
    L_0x002b:
        r13 = new android.app.AlertDialog$Builder;
        r13.<init>(r0);
        r2 = 2131953388; // 0x7f1306ec float:1.9543246E38 double:1.0533249275E-314;
        r0 = r0.getString(r2);
        r13 = r13.setTitle(r0);
        r0 = new mtk;
        r0.<init>(r1);
        r13 = r13.setNegativeButton(r3, r0);
        r0 = r12.w;
        r2 = r12.getResources();
        r3 = r0.length;
        r3 = new java.lang.CharSequence[r3];
        r4 = 0;
    L_0x004e:
        r5 = r0.length;
        if (r4 >= r5) goto L_0x00aa;
    L_0x0051:
        r5 = r0[r4];
        r6 = r5.b;
        r5 = r5.c;
        r7 = 1;
        if (r5 == 0) goto L_0x0065;
    L_0x005a:
        r5 = new java.lang.Object[r7];
        r5[r1] = r6;
        r6 = 2131953387; // 0x7f1306eb float:1.9543244E38 double:1.053324927E-314;
        r6 = r2.getString(r6, r5);
    L_0x0065:
        r5 = r0[r4];
        r5 = r5.d;
        r5 = r5.iterator();
    L_0x006d:
        r8 = r5.hasNext();
        if (r8 == 0) goto L_0x00a5;
    L_0x0073:
        r8 = r5.next();
        r8 = (defpackage.arlz) r8;
        r8 = r8.a;
        r8 = r8 & r7;
        if (r8 == 0) goto L_0x006d;
    L_0x007e:
        r8 = new android.text.SpannableStringBuilder;
        r8.<init>(r6);
        r6 = 32;
        r8.append(r6);
        r6 = new android.text.style.ImageSpan;
        r9 = r12.getContext();
        r10 = 2130837592; // 0x7f020058 float:1.7280142E38 double:1.052773651E-314;
        r6.<init>(r9, r10, r7);
        r9 = r8.length();
        r9 = r9 + -1;
        r10 = r8.length();
        r11 = 33;
        r8.setSpan(r6, r9, r10, r11);
        r6 = r8;
        goto L_0x006d;
    L_0x00a5:
        r3[r4] = r6;
        r4 = r4 + 1;
        goto L_0x004e;
    L_0x00aa:
        r0 = r12.x;
        r1 = new mtn;
        r2 = r12.w;
        r1.<init>(r12, r2);
        r13 = r13.setSingleChoiceItems(r3, r0, r1);
        r13 = r13.create();
        r13.show();
        goto L_0x012d;
    L_0x00c0:
        r2 = r12.k;
        if (r13 != r2) goto L_0x010a;
    L_0x00c4:
        r2 = r12.z;
        if (r2 == 0) goto L_0x010a;
    L_0x00c8:
        r2 = r2.length;
        if (r2 <= 0) goto L_0x010a;
    L_0x00cb:
        r13 = new android.app.AlertDialog$Builder;
        r13.<init>(r0);
        r2 = 2131951891; // 0x7f130113 float:1.954021E38 double:1.053324188E-314;
        r0 = r0.getString(r2);
        r13 = r13.setTitle(r0);
        r0 = new mtk;
        r0.<init>(r1);
        r13 = r13.setNegativeButton(r3, r0);
        r0 = r12.z;
        r2 = r0.length;
        r2 = new java.lang.String[r2];
    L_0x00e9:
        r3 = r0.length;
        if (r1 >= r3) goto L_0x00f5;
    L_0x00ec:
        r3 = r0[r1];
        r3 = r3.b;
        r2[r1] = r3;
        r1 = r1 + 1;
        goto L_0x00e9;
    L_0x00f5:
        r0 = r12.A;
        r1 = new mtl;
        r3 = r12.z;
        r1.<init>(r12, r3);
        r13 = r13.setSingleChoiceItems(r2, r0, r1);
        r13 = r13.create();
        r13.show();
        goto L_0x012d;
    L_0x010a:
        r0 = r12.o;
        if (r13 != r0) goto L_0x0114;
    L_0x010e:
        r13 = r12.d;
        r13.a();
        goto L_0x012d;
    L_0x0114:
        r0 = r12.b;
        r2 = r0.length;
    L_0x0117:
        if (r1 >= r2) goto L_0x012d;
    L_0x0119:
        r3 = r0[r1];
        r4 = r3.a();
        if (r13 != r4) goto L_0x012a;
    L_0x0121:
        r13 = r12.d;
        r13.c();
        r3.c();
        goto L_0x012d;
    L_0x012a:
        r1 = r1 + 1;
        goto L_0x0117;
    L_0x012d:
        r13 = r12.q;
        r13 = r13.hasStarted();
        if (r13 != 0) goto L_0x013d;
    L_0x0135:
        r12.b();
        r13 = r12.d;
        r13.b();
    L_0x013d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.jar.EmbedOverflowOverlay.onClick(android.view.View):void");
    }

    public final void d(boolean z) {
        if (this.t != z) {
            this.t = z;
            f();
        }
    }

    public final void g(boolean z) {
        this.v = z;
        g();
    }

    public final void d() {
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = null;
        this.x = -1;
        this.y = false;
        this.z = null;
        this.A = -1;
        e();
    }

    public final void e(boolean z) {
        if (this.u != z) {
            this.u = z;
            f();
        }
    }

    /* JADX WARNING: Missing block: B:11:0x003e, code skipped:
            if (r0 == false) goto L_0x004e;
     */
    private final void f() {
        /*
        r3 = this;
        r0 = r3.t;
        r1 = 0;
        if (r0 == 0) goto L_0x000e;
    L_0x0005:
        r0 = r3.c;
        r0 = r0.u;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        goto L_0x000e;
    L_0x000c:
        r0 = 1;
        goto L_0x000f;
    L_0x000e:
        r0 = 0;
    L_0x000f:
        r2 = r3.o;
        r2.setVisibility(r1);
        r1 = r3.o;
        r1.setEnabled(r0);
        r1 = r3.m;
        r1.setEnabled(r0);
        r1 = r3.m;
        r2 = r3.u;
        r1.setSelected(r2);
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r1 >= r2) goto L_0x003e;
    L_0x002b:
        if (r0 != 0) goto L_0x0036;
    L_0x002d:
        r0 = r3.m;
        r1 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r0.setAlpha(r1);
        goto L_0x004e;
    L_0x0036:
        r0 = r3.m;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.setAlpha(r1);
        goto L_0x0041;
    L_0x003e:
        if (r0 != 0) goto L_0x0041;
    L_0x0040:
        goto L_0x004e;
    L_0x0041:
        r0 = r3.u;
        if (r0 == 0) goto L_0x004e;
    L_0x0045:
        r0 = r3.n;
        r1 = 2131953087; // 0x7f1305bf float:1.9542635E38 double:1.053324779E-314;
        r0.setText(r1);
        return;
    L_0x004e:
        r0 = r3.n;
        r1 = 2131953086; // 0x7f1305be float:1.9542633E38 double:1.0533247783E-314;
        r0.setText(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.jar.EmbedOverflowOverlay.f():void");
    }

    private final void g() {
        boolean z = this.v && this.c.u;
        this.j.setVisibility(0);
        this.j.setEnabled(z);
        this.i.setEnabled(z);
        if (VERSION.SDK_INT >= 21) {
            return;
        }
        if (z) {
            this.i.setAlpha(1.0f);
        } else {
            this.i.setAlpha(0.3f);
        }
    }

    public final void a(aajq[] aajqArr, int i, boolean z) {
        this.w = aajqArr;
        this.x = i;
    }

    public final void f(boolean z) {
        this.y = z;
        e();
    }

    public final void a(aahn[] aahnArr, int i) {
        this.z = aahnArr;
        this.A = i;
        e();
    }

    public final void onAnimationEnd(Animation animation) {
        if (animation == this.q) {
            c();
            this.q.setStartTime(0);
        }
    }
}
