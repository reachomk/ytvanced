package com.google.android.libraries.youtube.player.features.overlay.overflow.ui;

import android.app.AlertDialog.Builder;
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
import defpackage.aien;
import defpackage.aigf;
import defpackage.aihy;
import defpackage.ajis;
import defpackage.xpr;
import defpackage.xsb;
import defpackage.xtl;
import java.util.List;

public final class DefaultOverflowOverlay extends FrameLayout implements aiei, OnClickListener, AnimationListener {
    private int A;
    private Builder B;
    public aieh a;
    public aiay b;
    public aihy c;
    private RelativeLayout d;
    private LinearLayout e;
    private TouchImageView f;
    private View g;
    private LinearLayout h;
    private TextView i;
    private TouchImageView j;
    private TextView k;
    private View l;
    private aiek[] m;
    private Animation n;
    private Animation o;
    private Animation p;
    private Animation q;
    private aicd r;
    private boolean s;
    private boolean t;
    private boolean u;
    private aajq[] v;
    private int w;
    private Builder x;
    private boolean y;
    private aahn[] z;

    public DefaultOverflowOverlay(Context context) {
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

    public DefaultOverflowOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new aiek[0];
        this.x = new Builder(context).setTitle(context.getString(R.string.quality_title)).setNegativeButton(R.string.cancel, new aien());
        this.B = new Builder(context).setTitle(context.getString(R.string.audio_selection_title)).setNegativeButton(R.string.cancel, new aien());
        this.n = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.o = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        this.o.setAnimationListener(this);
        long integer = (long) context.getResources().getInteger(R.integer.fade_overlay_fade_duration);
        this.n.setDuration(integer);
        this.o.setDuration(integer);
        this.p = AnimationUtils.loadAnimation(context, R.anim.zoom_in);
        this.q = AnimationUtils.loadAnimation(context, R.anim.zoom_out);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (RelativeLayout) findViewById(R.id.overflow_buttons_container);
        this.e = (LinearLayout) findViewById(R.id.plugins_container);
        findViewById(R.id.top_plugins_container);
        this.g = findViewById(R.id.quality_button);
        this.g.setOnClickListener(this);
        this.f = (TouchImageView) findViewById(R.id.quality_icon);
        this.h = (LinearLayout) findViewById(R.id.audio_track_select_button);
        this.h.setOnClickListener(this);
        this.i = (TextView) findViewById(R.id.audio_track_language);
        this.l = findViewById(R.id.cc_button);
        this.l.setOnClickListener(this);
        this.j = (TouchImageView) findViewById(R.id.cc_icon);
        this.k = (TextView) findViewById(R.id.cc_button_text);
        setOnClickListener(this);
    }

    public final void a(aicd aicd) {
        this.r = aicd;
    }

    public final void a(aieh aieh) {
        this.a = aieh;
    }

    public final void a(aiay aiay) {
        this.b = aiay;
    }

    public final void a(aihy aihy) {
        this.c = aihy;
    }

    public final void a(aiek... aiekArr) {
        this.m = (aiek[]) xsb.a(this.m, (Object[]) aiekArr);
        aiek aiek = aiekArr[0];
        this.e.addView(aiek.a());
        aiek.a().setOnClickListener(this);
    }

    public final void a() {
        for (aiek b : this.m) {
            b.b();
        }
        clearAnimation();
        setVisibility(0);
        this.d.startAnimation(this.p);
        startAnimation(this.n);
    }

    public final void b() {
        this.d.startAnimation(this.q);
        startAnimation(this.o);
    }

    public final void a(Animation animation) {
        if (getVisibility() == 0) {
            startAnimation(animation);
        }
    }

    public final void c() {
        clearAnimation();
        setVisibility(8);
        this.o.setStartTime(0);
    }

    private final void e() {
        f();
        g();
        this.h.setEnabled(this.y);
        xpr.a(this.h, this.y);
        if (this.y) {
            aahn[] aahnArr = this.z;
            if (aahnArr != null) {
                int i = this.A;
                if (i >= 0 && i < aahnArr.length) {
                    this.i.setText(getContext().getString(R.string.current_audio_track_name, new Object[]{this.z[this.A].b}));
                    return;
                }
            }
            xtl.c("Invalid data for audio tracks when audio track selection is enabled.");
            this.h.setEnabled(false);
            this.h.setVisibility(8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A:{SYNTHETIC, RETURN} */
    public final void onClick(android.view.View r13) {
        /*
        r12 = this;
        r0 = r12.g;
        r1 = 0;
        if (r13 != r0) goto L_0x0086;
    L_0x0005:
        r0 = r12.v;
        if (r0 == 0) goto L_0x0086;
    L_0x0009:
        r2 = r0.length;
        if (r2 <= 0) goto L_0x0086;
    L_0x000c:
        r13 = r12.x;
        r3 = r12.getResources();
        r2 = new java.lang.CharSequence[r2];
        r4 = 0;
    L_0x0015:
        r5 = r0.length;
        if (r4 >= r5) goto L_0x0071;
    L_0x0018:
        r5 = r0[r4];
        r6 = r5.b;
        r5 = r5.c;
        r7 = 1;
        if (r5 == 0) goto L_0x002c;
    L_0x0021:
        r5 = new java.lang.Object[r7];
        r5[r1] = r6;
        r6 = 2131953387; // 0x7f1306eb float:1.9543244E38 double:1.053324927E-314;
        r6 = r3.getString(r6, r5);
    L_0x002c:
        r5 = r0[r4];
        r5 = r5.d;
        r5 = r5.iterator();
    L_0x0034:
        r8 = r5.hasNext();
        if (r8 == 0) goto L_0x006c;
    L_0x003a:
        r8 = r5.next();
        r8 = (defpackage.arlz) r8;
        r8 = r8.a;
        r8 = r8 & r7;
        if (r8 == 0) goto L_0x0034;
    L_0x0045:
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
        goto L_0x0034;
    L_0x006c:
        r2[r4] = r6;
        r4 = r4 + 1;
        goto L_0x0015;
    L_0x0071:
        r0 = r12.w;
        r1 = new aiem;
        r3 = r12.v;
        r1.<init>(r12, r3);
        r13 = r13.setSingleChoiceItems(r2, r0, r1);
        r13 = r13.create();
        r13.show();
        goto L_0x00d9;
    L_0x0086:
        r0 = r12.h;
        if (r13 != r0) goto L_0x00b6;
    L_0x008a:
        r0 = r12.z;
        if (r0 == 0) goto L_0x00b6;
    L_0x008e:
        r2 = r0.length;
        if (r2 <= 0) goto L_0x00b6;
    L_0x0091:
        r13 = r12.B;
        r2 = new java.lang.String[r2];
    L_0x0095:
        r3 = r0.length;
        if (r1 >= r3) goto L_0x00a1;
    L_0x0098:
        r3 = r0[r1];
        r3 = r3.b;
        r2[r1] = r3;
        r1 = r1 + 1;
        goto L_0x0095;
    L_0x00a1:
        r0 = r12.A;
        r1 = new aiel;
        r3 = r12.z;
        r1.<init>(r12, r3);
        r13 = r13.setSingleChoiceItems(r2, r0, r1);
        r13 = r13.create();
        r13.show();
        goto L_0x00d9;
    L_0x00b6:
        r0 = r12.l;
        if (r13 != r0) goto L_0x00c0;
    L_0x00ba:
        r13 = r12.a;
        r13.a();
        goto L_0x00d9;
    L_0x00c0:
        r0 = r12.m;
        r2 = r0.length;
    L_0x00c3:
        if (r1 >= r2) goto L_0x00d9;
    L_0x00c5:
        r3 = r0[r1];
        r4 = r3.a();
        if (r13 != r4) goto L_0x00d6;
    L_0x00cd:
        r13 = r12.a;
        r13.c();
        r3.c();
        goto L_0x00d9;
    L_0x00d6:
        r1 = r1 + 1;
        goto L_0x00c3;
    L_0x00d9:
        r13 = r12.o;
        r13 = r13.hasStarted();
        if (r13 != 0) goto L_0x00e9;
    L_0x00e1:
        r12.b();
        r13 = r12.a;
        r13.b();
    L_0x00e9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.player.features.overlay.overflow.ui.DefaultOverflowOverlay.onClick(android.view.View):void");
    }

    public final void d(boolean z) {
        if (this.s != z) {
            this.s = z;
            f();
        }
    }

    public final void g(boolean z) {
        this.u = z;
        g();
    }

    public final void d() {
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = null;
        this.w = -1;
        this.y = false;
        this.z = null;
        this.A = -1;
        e();
    }

    public final void e(boolean z) {
        if (this.t != z) {
            this.t = z;
            f();
        }
    }

    /* JADX WARNING: Missing block: B:11:0x003e, code skipped:
            if (r0 == false) goto L_0x004e;
     */
    private final void f() {
        /*
        r3 = this;
        r0 = r3.s;
        r1 = 0;
        if (r0 == 0) goto L_0x000e;
    L_0x0005:
        r0 = r3.r;
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
        r2 = r3.l;
        r2.setVisibility(r1);
        r1 = r3.l;
        r1.setEnabled(r0);
        r1 = r3.j;
        r1.setEnabled(r0);
        r1 = r3.j;
        r2 = r3.t;
        r1.setSelected(r2);
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r1 >= r2) goto L_0x003e;
    L_0x002b:
        if (r0 != 0) goto L_0x0036;
    L_0x002d:
        r0 = r3.j;
        r1 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r0.setAlpha(r1);
        goto L_0x004e;
    L_0x0036:
        r0 = r3.j;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.setAlpha(r1);
        goto L_0x0041;
    L_0x003e:
        if (r0 != 0) goto L_0x0041;
    L_0x0040:
        goto L_0x004e;
    L_0x0041:
        r0 = r3.t;
        if (r0 == 0) goto L_0x004e;
    L_0x0045:
        r0 = r3.k;
        r1 = 2131953087; // 0x7f1305bf float:1.9542635E38 double:1.053324779E-314;
        r0.setText(r1);
        return;
    L_0x004e:
        r0 = r3.k;
        r1 = 2131953086; // 0x7f1305be float:1.9542633E38 double:1.0533247783E-314;
        r0.setText(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.player.features.overlay.overflow.ui.DefaultOverflowOverlay.f():void");
    }

    private final void g() {
        boolean z = this.u && this.r.u;
        this.g.setVisibility(0);
        this.g.setEnabled(z);
        this.f.setEnabled(z);
        if (VERSION.SDK_INT >= 21) {
            return;
        }
        if (z) {
            this.f.setAlpha(1.0f);
        } else {
            this.f.setAlpha(0.3f);
        }
    }

    public final void a(aajq[] aajqArr, int i, boolean z) {
        this.v = aajqArr;
        this.w = i;
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
        if (animation == this.o) {
            c();
            this.o.setStartTime(0);
        }
    }
}
