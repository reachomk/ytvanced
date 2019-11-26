package com.google.android.libraries.video.trim;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.youtube.R;
import defpackage.amuw;
import defpackage.ra;
import defpackage.uhv;
import defpackage.uhy;
import defpackage.uir;
import defpackage.uit;
import defpackage.uiv;
import defpackage.uiw;
import defpackage.uix;
import defpackage.uja;
import defpackage.ujb;
import defpackage.uje;
import defpackage.ujf;
import defpackage.ujh;
import defpackage.ujk;
import defpackage.ujo;
import defpackage.ukz;
import defpackage.uor;
import defpackage.uov;
import defpackage.uoz;
import defpackage.upe;
import defpackage.upf;
import defpackage.upg;
import defpackage.uph;
import defpackage.upk;
import defpackage.upl;
import defpackage.upm;
import defpackage.upn;
import defpackage.upo;
import defpackage.upp;
import defpackage.upq;
import defpackage.upr;
import defpackage.ups;
import defpackage.upu;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class VideoTrimView extends ViewGroup implements uje, ujk, upe {
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private int I;
    private final boolean J;
    private final boolean K;
    private final boolean L;
    private final boolean M;
    private final boolean N;
    private final Paint O;
    private final ImageView P;
    private final ImageView Q;
    private final Runnable R = new upl(this);
    private final List S;
    private final List T;
    private ujf U;
    private ukz V;
    private upf W;
    public uit a;
    private upf aa;
    private int ab;
    private float ac;
    private float ad;
    private float ae;
    private long af;
    private long ag;
    private int ah;
    private long ai = -1;
    private int aj;
    private upq ak = new upq(this);
    private upr al = new upr(this);
    private Animator am;
    private Animator an;
    private final int ao;
    public final float b;
    public final int c;
    public final int d;
    public final boolean e;
    public float f;
    public boolean g;
    public uiv h;
    public upk i;
    public boolean j;
    public boolean k;
    public float l;
    public long m;
    public ups n = ups.a;
    public final Rect o = new Rect();
    public uja p;
    public uoz q;
    public upf r;
    public uph s;
    public upu t;
    public boolean u;
    public float v;
    private boolean w;
    private Rect x;
    private final int y;
    private final int z;

    public VideoTrimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.I = ViewConfiguration.getLongPressTimeout();
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uir.a);
        boolean z = true;
        this.b = obtainStyledAttributes.getFraction(uir.g, 1, 100, 1.0f);
        this.y = (int) (resources.getDimension(R.dimen.video_trim_view_thumbnail_height) * this.b);
        this.z = (int) (resources.getDimension(R.dimen.video_trim_view_thumbnail_spacing) * this.b);
        this.B = (int) (resources.getDimension(R.dimen.video_trim_view_container_border_width) * this.b);
        this.C = (int) (resources.getDimension(R.dimen.video_trim_view_callout_offset) * this.b);
        this.e = obtainStyledAttributes.getBoolean(uir.f, true);
        int integer = obtainStyledAttributes.getInteger(uir.h, 1);
        boolean z2 = integer >= 0 && integer < upp.a().length;
        uhy.a(z2);
        this.ao = upp.a()[integer];
        integer = obtainStyledAttributes.getResourceId(uir.d, R.drawable.ic_trim_handle);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.color.video_trim_view_container_border);
        this.A = ra.a(context, integer).getIntrinsicWidth() / 2;
        boolean z3 = obtainStyledAttributes.getBoolean(uir.e, false);
        this.L = obtainStyledAttributes.getBoolean(uir.b, false);
        this.M = obtainStyledAttributes.getBoolean(uir.c, false);
        this.N = obtainStyledAttributes.getBoolean(uir.i, true);
        obtainStyledAttributes.recycle();
        this.j = true;
        this.m = TimeUnit.MILLISECONDS.toMicros((long) resources.getInteger(R.integer.video_trim_view_zoomed_duration_ms));
        this.D = resources.getDimensionPixelSize(R.dimen.video_trim_view_handle_touchable_width);
        this.E = resources.getDimensionPixelSize(R.dimen.video_trim_view_scroll_edge_width);
        this.l = (float) resources.getInteger(R.integer.video_trim_view_scroll_speed_ms_speed_per_second);
        this.c = resources.getInteger(R.integer.video_trim_view_zoom_in_vibrate_duration_ms);
        this.F = resources.getInteger(R.integer.video_trim_view_frame_change_vibrate_duration_ms);
        this.G = resources.getInteger(R.integer.video_trim_view_frame_change_vibrate_disable_delay_ms);
        this.H = resources.getInteger(R.integer.video_trim_view_frame_change_vibrate_enable_delay_ms);
        this.aj = this.G;
        this.O = new Paint();
        this.O.setColor(resources.getColor(resourceId));
        this.O.setStrokeWidth((float) this.B);
        this.O.setStyle(Style.STROKE);
        this.P = a(context, integer);
        addView(this.P);
        this.Q = a(context, integer);
        addView(this.Q);
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.i = new upk(context);
        boolean z4 = context.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0;
        this.J = z4;
        if (!(z3 && z4)) {
            z = false;
        }
        this.K = z;
        setWillNotDraw(false);
        if (this.L) {
            setClipToPadding(false);
        }
    }

    public final void Q_() {
    }

    public final void a(uor uor) {
    }

    private final ImageView a(Context context, int i) {
        upg upg = new upg(context, i, (float) this.B);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(upg);
        imageView.setScaleType(ScaleType.CENTER);
        return imageView;
    }

    public final void a(ujf ujf, uoz uoz, uja uja) {
        ukz ukz;
        boolean z = true;
        if (ujf != null) {
            uhy.a((Object) uoz);
            ukz = ujf.b;
            uhy.a(ukz.equals(uoz.a()));
            boolean h = ujf.h();
            this.k = h;
            if (h) {
                this.P.setVisibility(0);
                this.Q.setVisibility(0);
            } else {
                this.P.setVisibility(8);
                this.Q.setVisibility(8);
            }
        } else {
            uhy.a(uoz == null);
            ukz = null;
        }
        uhy.a((Object) uja);
        if (!a((Object) ujf, this.U) || uoz != this.q) {
            if (this.U != null) {
                j();
                this.U.b((ujk) this);
                this.q = null;
                this.r.b(this);
                this.r = null;
                this.W.b(this);
                this.W = null;
                this.aa = null;
                if (this.s != null) {
                    z = false;
                }
                uhy.b(z);
            }
            this.U = ujf;
            this.V = ukz;
            this.q = uoz;
            ups b = b(this.o.width());
            ujf ujf2 = this.U;
            if (ujf2 != null) {
                ujf2.a((ujk) this);
                this.r = this.q.c();
                this.r.a((upe) this);
                this.W = this.q.d();
                this.W.a((upe) this);
                this.aa = this.q.b();
            }
            if (this.ao == 3 && this.V != null) {
                long j = this.U.a.d * 10;
                this.m = j;
                this.l = (float) (j / 2000);
            }
            uja uja2 = this.p;
            if (uja2 != null) {
                uja2.b((uje) this);
            }
            this.p = uja;
            this.p.a((uje) this);
            post(new upm(this, b, ujf));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        uhy.b(MeasureSpec.getMode(i) != 0);
        setMeasuredDimension(resolveSizeAndState(MeasureSpec.getSize(i), i, 0), resolveSizeAndState((getPaddingTop() + this.y) + getPaddingBottom(), i2, 0));
        i = this.A;
        i = MeasureSpec.makeMeasureSpec(i + i, 1073741824);
        i2 = MeasureSpec.makeMeasureSpec(this.y, 1073741824);
        this.P.measure(i, i2);
        this.Q.measure(i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.x = new Rect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.o.left = Math.min(this.x.left + this.A, this.x.right);
        this.o.top = this.x.top;
        this.o.right = Math.max(this.x.right - this.A, this.x.left);
        this.o.bottom = this.x.bottom;
        int i5 = this.x.top;
        i = this.x.bottom;
        i2 = this.o.left;
        i3 = this.A;
        i2 -= i3;
        this.P.layout(i2, i5, (i3 + i3) + i2, i);
        i2 = this.o.right;
        i3 = this.A;
        i2 -= i3;
        this.Q.layout(i2, i5, (i3 + i3) + i2, i);
        l();
        ups b = b(this.o.width());
        if (!a((Object) b, this.n)) {
            a(b);
        }
        if (!this.L || i() || this.p.a()) {
            this.i.setBounds(this.x);
        } else {
            this.i.setBounds(this.o);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(this.x);
        canvas.save();
        canvas.clipRect(d(0), (float) this.x.top, d(k()), (float) this.x.bottom);
        for (uov a : this.S) {
            a.a(canvas, this.U.n());
        }
        canvas.restore();
        this.i.draw(canvas);
        if (this.k) {
            float strokeWidth = this.O.getStrokeWidth() / 2.0f;
            Canvas canvas2 = canvas;
            canvas2.drawRect(m(), ((float) this.o.top) + strokeWidth, n(), ((float) this.o.bottom) - strokeWidth, this.O);
        }
        canvas.restore();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof uov);
    }

    public final int getPaddingLeft() {
        if (this.L) {
            return Math.max((super.getPaddingLeft() - this.A) + (this.B / 2), 0);
        }
        return super.getPaddingLeft();
    }

    public final int getPaddingRight() {
        if (this.L) {
            return Math.max((super.getPaddingRight() - this.A) + (this.B / 2), 0);
        }
        return super.getPaddingRight();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.ak.a();
                    j();
                }
            } else if (motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.ab)) {
                this.ak.a();
                j();
            }
        } else if (motionEvent.getPointerCount() == 1) {
            actionMasked = motionEvent.getPointerId(0);
            this.ab = actionMasked;
            float a = a(motionEvent, actionMasked);
            this.v = a;
            RectF rectF = new RectF();
            a(this.P, rectF);
            float f = rectF.left;
            float f2 = rectF.right;
            a(this.Q, rectF);
            float f3 = rectF.left;
            float f4 = rectF.right;
            if (f2 > f3) {
                float f5 = (f2 - f3) / 2.0f;
                f -= f5;
                f2 -= f5;
                f3 += f5;
                f4 += f5;
            }
            upu upu = null;
            if (a >= f && a <= f2) {
                upu = upu.Begin;
            } else if (a >= f3 && a <= f4) {
                upu = upu.End;
            } else if (a > f2 && a < f3) {
                upu = upu.Both;
            }
            this.t = upu;
            if (this.t != null) {
                b();
                if (a()) {
                    this.ak.a((long) this.I, this.v);
                    if (this.M && !this.u) {
                        a(true, this.t == upu.Begin);
                    }
                }
            }
        }
        return this.t != null;
    }

    /* JADX WARNING: Missing block: B:11:0x001d, code skipped:
            if (r1 != 6) goto L_0x01ca;
     */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
        r12 = this;
        r0 = r12.t;
        if (r0 != 0) goto L_0x0009;
    L_0x0004:
        r13 = super.onTouchEvent(r13);
        return r13;
    L_0x0009:
        r0 = r12.ab;
        r0 = a(r13, r0);
        r1 = r13.getActionMasked();
        r2 = 1;
        if (r1 == r2) goto L_0x01b6;
    L_0x0016:
        r3 = 2;
        if (r1 == r3) goto L_0x002b;
    L_0x0019:
        r3 = 3;
        if (r1 == r3) goto L_0x0021;
    L_0x001c:
        r3 = 6;
        if (r1 == r3) goto L_0x01b6;
    L_0x001f:
        goto L_0x01ca;
    L_0x0021:
        r13 = r12.ak;
        r13.a();
        r12.j();
        goto L_0x01ca;
    L_0x002b:
        r13 = r12.k;
        if (r13 == 0) goto L_0x01ca;
    L_0x002f:
        r13 = r12.u;
        if (r13 != 0) goto L_0x0044;
    L_0x0033:
        r13 = r12.ac;
        r13 = r13 - r0;
        r13 = java.lang.Math.abs(r13);
        r1 = r12.d;
        r1 = (float) r1;
        r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1));
        if (r13 <= 0) goto L_0x0044;
    L_0x0041:
        r12.c();
    L_0x0044:
        r13 = r12.u;
        if (r13 == 0) goto L_0x01ca;
    L_0x0048:
        r13 = r12.ak;
        r1 = r12.I;
        r4 = (long) r1;
        r13.a(r4, r0);
        r13 = r12.t;
        if (r13 == 0) goto L_0x0056;
    L_0x0054:
        r13 = 1;
        goto L_0x0057;
    L_0x0056:
        r13 = 0;
    L_0x0057:
        defpackage.uhy.b(r13);
        r13 = r12.ac;
        r1 = r12.o;
        r1 = r1.width();
        r4 = r12.p;
        r13 = r0 - r13;
        r1 = (float) r1;
        r13 = r13 / r1;
        r4 = r4.a(r13);
        r13 = r12.al;
        r13 = r13.a();
        r1 = 0;
        if (r13 != 0) goto L_0x0173;
    L_0x0075:
        r13 = r12.t;
        r13 = r13.ordinal();
        if (r13 == 0) goto L_0x00ad;
    L_0x007d:
        if (r13 == r2) goto L_0x00a6;
    L_0x007f:
        if (r13 == r3) goto L_0x0082;
    L_0x0081:
        goto L_0x00b3;
    L_0x0082:
        r6 = r12.ag;
        r8 = r12.af;
        r6 = r6 - r8;
        r13 = r12.V;
        r10 = r13.g;
        r10 = r10 - r6;
        r8 = r8 + r4;
        r4 = java.lang.Math.min(r10, r8);
        r4 = r12.e(r4);
        r13 = r12.U;
        r13.a(r4);
        r13 = r12.U;
        r6 = r6 + r4;
        r13.b(r6);
        r13 = r12.U;
        r13.a(r4);
        goto L_0x00b3;
    L_0x00a6:
        r6 = r12.ag;
        r6 = r6 + r4;
        r12.b(r6);
        goto L_0x00b3;
    L_0x00ad:
        r6 = r12.af;
        r6 = r6 + r4;
        r12.a(r6);
    L_0x00b3:
        r13 = r12.N;
        if (r13 == 0) goto L_0x00bc;
    L_0x00b7:
        r12.l();
        goto L_0x0170;
    L_0x00bc:
        r13 = r12.o;
        r13 = r13.left;
        r13 = (float) r13;
        r4 = r12.o;
        r4 = r4.left;
        r5 = r12.o;
        r5 = r5.width();
        r4 = r4 + r5;
        r4 = (float) r4;
        r5 = r12.U;
        r5 = r5.b();
        r7 = r12.o;
        r7 = r7.width();
        r7 = (long) r7;
        r5 = r5 * r7;
        r7 = r12.i();
        if (r7 != 0) goto L_0x00e9;
    L_0x00e2:
        r7 = r12.U;
        r7 = r7.a();
        goto L_0x00eb;
    L_0x00e9:
        r7 = r12.m;
    L_0x00eb:
        r5 = r5 / r7;
        r5 = (float) r5;
        r6 = r12.U;
        r6 = r6.a;
        r6 = r6.c;
        r8 = r12.o;
        r8 = r8.width();
        r8 = (long) r8;
        r6 = r6 * r8;
        r8 = r12.i();
        if (r8 != 0) goto L_0x0109;
    L_0x0102:
        r8 = r12.U;
        r8 = r8.a();
        goto L_0x010b;
    L_0x0109:
        r8 = r12.m;
    L_0x010b:
        r6 = r6 / r8;
        r6 = (float) r6;
        r7 = r12.m();
        r8 = r12.n();
        r9 = r12.t;
        r9 = r9.ordinal();
        if (r9 == 0) goto L_0x0157;
    L_0x011d:
        if (r9 == r2) goto L_0x0142;
    L_0x011f:
        if (r9 == r3) goto L_0x0122;
    L_0x0121:
        goto L_0x016d;
    L_0x0122:
        r3 = r12.ac;
        r3 = r0 - r3;
        r5 = r12.ad;
        r6 = r5 + r3;
        r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r6 < 0) goto L_0x0139;
    L_0x012e:
        r13 = r12.ae;
        r6 = r13 + r3;
        r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x013b;
    L_0x0136:
        r3 = r4 - r13;
        goto L_0x013b;
    L_0x0139:
        r3 = r13 - r5;
    L_0x013b:
        r7 = r5 + r3;
        r13 = r12.ae;
        r8 = r13 + r3;
        goto L_0x016d;
    L_0x0142:
        r13 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r13 <= 0) goto L_0x014c;
    L_0x0146:
        r6 = r6 + r7;
        r13 = java.lang.Math.min(r0, r6);
        goto L_0x014d;
    L_0x014c:
        r13 = r0;
    L_0x014d:
        r5 = r5 + r7;
        r13 = java.lang.Math.max(r13, r5);
        r8 = java.lang.Math.min(r4, r13);
        goto L_0x016d;
    L_0x0157:
        r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r3 <= 0) goto L_0x0162;
    L_0x015b:
        r3 = r8 - r6;
        r3 = java.lang.Math.max(r0, r3);
        goto L_0x0163;
    L_0x0162:
        r3 = r0;
    L_0x0163:
        r4 = r8 - r5;
        r3 = java.lang.Math.min(r3, r4);
        r7 = java.lang.Math.max(r13, r3);
    L_0x016d:
        r12.a(r7, r8);
    L_0x0170:
        r12.invalidate();
    L_0x0173:
        r13 = r12.a();
        if (r13 == 0) goto L_0x01b0;
    L_0x0179:
        r13 = r12.i();
        if (r13 == 0) goto L_0x01b0;
    L_0x017f:
        r13 = r12.o;
        r13 = r13.left;
        r3 = r12.A;
        r4 = r12.o;
        r4 = r4.right;
        r5 = r12.A;
        r4 = r4 + r5;
        r4 = (float) r4;
        r13 = r13 - r3;
        r13 = (float) r13;
        r13 = r0 - r13;
        r13 = java.lang.Math.max(r1, r13);
        r3 = r12.E;
        r3 = (float) r3;
        r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1));
        if (r13 < 0) goto L_0x019e;
    L_0x019c:
        r13 = 0;
        goto L_0x01a0;
    L_0x019e:
        r13 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x01a0:
        r4 = r4 - r0;
        r1 = java.lang.Math.max(r1, r4);
        r3 = r12.E;
        r3 = (float) r3;
        r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r1 < 0) goto L_0x01ae;
    L_0x01ac:
        r1 = r13;
        goto L_0x01b0;
    L_0x01ae:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x01b0:
        r13 = r12.al;
        r13.a(r1);
        goto L_0x01ca;
    L_0x01b6:
        r1 = r13.getActionIndex();
        r3 = r12.ab;
        r13 = r13.findPointerIndex(r3);
        if (r1 != r13) goto L_0x01ca;
    L_0x01c2:
        r13 = r12.ak;
        r13.a();
        r12.j();
    L_0x01ca:
        r12.v = r0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.video.trim.VideoTrimView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private static float a(MotionEvent motionEvent, int i) {
        i = motionEvent.findPointerIndex(i);
        if (i == -1) {
            return Float.NaN;
        }
        return motionEvent.getX(i);
    }

    private final void a(ImageView imageView, RectF rectF) {
        float f = ((float) this.D) / 2.0f;
        float x = imageView.getX() + ((float) this.A);
        float f2 = x - f;
        x += f;
        f = 0.0f;
        if (f2 < 0.0f) {
            f = -f2;
        } else if (x > ((float) getWidth())) {
            f = ((float) getWidth()) - x;
        }
        rectF.left = f2 + f;
        rectF.top = (float) imageView.getTop();
        rectF.right = x + f;
        rectF.bottom = (float) imageView.getBottom();
    }

    public final boolean a() {
        return this.t == upu.Begin || this.t == upu.End;
    }

    public final void b() {
        this.ac = this.v;
        this.af = f();
        this.ag = g();
        this.ad = m();
        this.ae = n();
    }

    public final void c() {
        uhy.b(this.t != null);
        uhy.b(this.u ^ 1);
        this.u = true;
        ujf ujf = this.U;
        Set set = this.t.d;
        for (ujk a : ujf.c) {
            a.a(ujf, set);
        }
        if (a()) {
            uiv uiv = this.h;
            if (uiv != null) {
                long g;
                if (uiv.d != null) {
                    uiv.a();
                    uiv.e = new uiw(uiv.b, uiv.f, uiv.g, uiv.h);
                    uiv.d.add(uiv.e);
                    uiv.e.setAlpha(0);
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(uiv.e, "alpha", new int[]{255});
                    ofInt.setDuration((long) uiv.a);
                    ofInt.start();
                }
                if (this.t != upu.Begin) {
                    g = g();
                } else {
                    g = f();
                }
                b(d(g));
            }
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        uit uit = this.a;
        if (uit != null && !this.w) {
            uit.a("trim_handle_interaction");
            this.w = true;
        }
    }

    private final void j() {
        if (this.M && a()) {
            a(false, this.t == upu.Begin);
        }
        if (this.u) {
            uhy.b(true);
            ujf ujf = this.U;
            amuw amuw = this.t.d;
            for (ujk b : ujf.c) {
                b.b(ujf, amuw);
            }
            this.t = null;
            this.u = false;
            uiv uiv = this.h;
            if (uiv != null) {
                uiv.a();
            }
            if (i()) {
                uhy.b(i());
                this.f = 0.0f;
                uja uja = this.p;
                uhy.b(uja.c);
                uja.a(new ujb(0, uja.b), false);
                d();
                b();
                this.s.b((upe) this);
                this.s.f();
                this.s = null;
            }
            this.al.a(0.0f);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    private final void a(boolean z, boolean z2) {
        View view;
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animator;
        if (z2) {
            animator = this.am;
            if (animator != null) {
                animator.cancel();
            }
            this.am = animatorSet;
            view = this.P;
        } else {
            animator = this.an;
            if (animator != null) {
                animator.cancel();
            }
            this.an = animatorSet;
            view = this.Q;
        }
        float scaleX = view.getScaleX();
        float f = 2.0f;
        float f2 = (!z ? 1.0f : 2.0f) * this.b;
        long integer = (long) getContext().getResources().getInteger(17694720);
        Builder with = animatorSet.play(ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{scaleX, f2})).with(ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{scaleX, f2}));
        if (VERSION.SDK_INT >= 21) {
            f2 = view.getTranslationZ();
            if (!z) {
                f = 0.0f;
            }
            float f3 = this.b;
            with.with(ObjectAnimator.ofFloat(view, View.TRANSLATION_Z, new float[]{f2, f * f3}));
        }
        animatorSet.setDuration(integer);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
    }

    public final void d() {
        String str;
        ArrayList arrayList = new ArrayList(this.T);
        this.T.clear();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            str = "alpha";
            if (i >= size) {
                break;
            }
            uov uov = (uov) arrayList.get(i);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(uov, str, new int[]{0});
            ofInt.addListener(new upo(this, uov));
            ofInt.start();
            i++;
        }
        this.p.g = true;
        a(this.n);
        for (uov uov2 : this.T) {
            uov2.a(true);
            ObjectAnimator.ofInt(uov2, str, new int[]{0, 255}).start();
        }
        this.p.g = false;
    }

    private final void b(float f) {
        if (a() && this.h != null) {
            long f2;
            boolean z;
            int i;
            boolean z2 = true;
            if (this.t == upu.Begin) {
                f2 = f();
                z = true;
            } else {
                f2 = g();
                z = false;
            }
            Object a = uix.a(getContext(), f2 / 1000, i());
            if (this.al.a()) {
                if (f >= ((float) this.o.centerX())) {
                    i = this.o.right;
                } else {
                    i = this.o.left;
                }
                f = (float) i;
            }
            float strokeWidth = this.O.getStrokeWidth() / 2.0f;
            if (z) {
                strokeWidth = -strokeWidth;
            }
            int i2 = -this.C;
            uiv uiv = this.h;
            i = (int) (f + strokeWidth);
            if (uiv.d != null && uiv.e != null) {
                Object a2 = uhy.a((Object) this);
                while (true) {
                    View view = (View) a2;
                    if (view == uiv.c) {
                        break;
                    }
                    i = (int) (((float) i) + view.getX());
                    i2 = (int) (((float) i2) + view.getY());
                    a2 = view.getParent();
                    uhy.b(a2 instanceof View);
                }
                uiw uiw = uiv.e;
                uhy.a(a);
                if (!uhv.a(uiw.b, a)) {
                    uiw.b = a;
                    uiw.c = (int) uiw.a.measureText(a);
                    uiw.invalidateSelf();
                }
                uiw uiw2 = uiv.e;
                int width = uiv.c.getWidth();
                int intrinsicWidth = uiw2.getIntrinsicWidth();
                int intrinsicHeight = i2 - uiw2.getIntrinsicHeight();
                if (!z) {
                    i -= intrinsicWidth;
                }
                int i3 = i + intrinsicWidth;
                if (z) {
                    if (i3 > width) {
                        i -= intrinsicWidth;
                        i3 -= intrinsicWidth;
                        z2 = false;
                        uiw2.d = z2;
                        uiw2.setBounds(i, intrinsicHeight, i3, i2);
                    }
                } else if (i < 0) {
                    int i4 = i3;
                    i3 += intrinsicWidth;
                    i = i4;
                    uiw2.d = z2;
                    uiw2.setBounds(i, intrinsicHeight, i3, i2);
                }
                z2 = z;
                uiw2.d = z2;
                uiw2.setBounds(i, intrinsicHeight, i3, i2);
            }
        }
    }

    public final void b(upf upf) {
        post(new upn(this, upf));
    }

    public final void a(Exception exception) {
        ujo.a("Failed to render thumbnail", exception);
    }

    public final void a(ujf ujf, Set set) {
        c(-1);
    }

    public final void b(ujf ujf, Set set) {
        c(-1);
    }

    public final void a(ujf ujf, ujh ujh) {
        int ordinal = ujh.ordinal();
        if (ordinal == 0) {
            if (!this.u) {
                l();
                invalidate();
            }
            c(ujf.j());
        } else if (ordinal == 1) {
            if (!this.u) {
                l();
                invalidate();
            }
            c(ujf.l());
        } else if (ordinal == 2) {
            a(b(this.o.width()));
        }
    }

    public final void o() {
        for (uov uov : this.S) {
            float d = d(uov.c);
            Rect bounds = uov.getBounds();
            float centerX = ((float) bounds.centerX()) - d;
            if (centerX != 0.0f) {
                int i = (int) (((float) bounds.left) - centerX);
                uov.setBounds(i, bounds.top, bounds.width() + i, bounds.bottom);
            }
        }
        l();
        invalidate();
    }

    public final void P_() {
        a(this.n);
        l();
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superViewInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("trimHandleInteractionAlreadyLogged", this.w);
        return bundle;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.w = bundle.getBoolean("trimHandleInteractionAlreadyLogged");
            parcelable = bundle.getParcelable("superViewInstanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final void a(long j) {
        j = e(j);
        if (this.ao == 3) {
            long l = this.U.l();
            if (l - j < this.U.b()) {
                j = this.V.b(this.V.c((l - this.U.b()) - 1));
            }
        }
        this.U.a(j);
    }

    public final void b(long j) {
        j = e(j);
        if (this.ao == 3) {
            long j2 = this.U.j();
            if (j - j2 < this.U.b()) {
                int b = this.V.b((j2 + this.U.b()) + 1);
                j = b < 0 ? this.U.a() : this.V.b(b);
            }
        }
        this.U.b(j);
    }

    public final void a(int i) {
        if (this.J) {
            ((Vibrator) getContext().getSystemService("vibrator")).vibrate((long) i);
        }
    }

    private final void c(long j) {
        if (j < 0) {
            this.ah = -1;
            this.ai = -1;
            return;
        }
        if (this.K) {
            ukz ukz = this.V;
            if (ukz != null) {
                int a = ukz.a(j);
                if (a != this.ah) {
                    if (i() && !e()) {
                        this.ai = System.currentTimeMillis();
                        int i = this.H;
                        this.aj = i;
                        postDelayed(this.R, (long) i);
                    }
                    this.ah = a;
                }
            }
        }
    }

    public final boolean e() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.ai < ((long) this.aj)) {
            return false;
        }
        a(this.F);
        this.aj = this.G;
        this.ai = currentTimeMillis;
        return true;
    }

    public final long f() {
        ujf ujf = this.U;
        return ujf != null ? ujf.j() : 0;
    }

    public final long g() {
        ujf ujf = this.U;
        return ujf != null ? ujf.l() : k();
    }

    private final long k() {
        ukz ukz = this.V;
        if (ukz == null) {
            return 1;
        }
        return ukz.g;
    }

    public final long h() {
        ujf ujf = this.U;
        return ujf != null ? ujf.b() : 1;
    }

    /* JADX WARNING: Missing block: B:39:0x014a, code skipped:
            if (java.lang.Math.abs(r11 - r15) >= java.lang.Math.abs(r11 - r13)) goto L_0x014f;
     */
    public final void a(defpackage.ups r19) {
        /*
        r18 = this;
        r0 = r18;
        r1 = defpackage.uhy.a(r19);
        r1 = (defpackage.ups) r1;
        r0.n = r1;
        r1 = r0.n;
        r2 = r1.b;
        r3 = r0.z;
        r3 = (float) r3;
        r2 = r2 + r3;
        r1 = r1.d;
        r3 = r0.f;
        r3 = r3 % r2;
        r4 = r18.i();
        r5 = 0;
        r6 = 0;
        if (r4 == 0) goto L_0x004c;
    L_0x001f:
        r4 = r18.getWidth();
        r5 = r18.getPaddingLeft();
        r7 = r18.getPaddingRight();
        r4 = r4 - r5;
        r4 = r4 - r7;
        r4 = (float) r4;
        r4 = r4 / r2;
        r4 = (double) r4;
        r4 = java.lang.Math.ceil(r4);
        r7 = r0.o;
        r7 = r7.left;
        r7 = (float) r7;
        r7 = r7 + r3;
        r7 = r7 / r2;
        r7 = (double) r7;
        r7 = java.lang.Math.ceil(r7);
        r7 = (int) r7;
        r8 = -r7;
        r9 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r4 = r4 + r9;
        r4 = (int) r4;
        r4 = r4 - r7;
        r1 = r1 + r4;
        r5 = r0.aa;
        r4 = 0;
        goto L_0x005f;
    L_0x004c:
        r4 = r0.r;
        if (r4 == 0) goto L_0x005d;
    L_0x0050:
        r4 = r4.e();
        if (r4 == 0) goto L_0x005d;
    L_0x0056:
        r5 = r0.r;
        r4 = r0.g;
        r0.g = r6;
        goto L_0x005e;
    L_0x005d:
        r4 = 0;
    L_0x005e:
        r8 = 0;
    L_0x005f:
        r7 = r8;
    L_0x0060:
        r9 = 1;
        if (r7 < r1) goto L_0x00c5;
    L_0x0063:
        r2 = r0.T;
        r2 = r2.size();
        r3 = r1 - r8;
        if (r2 <= r3) goto L_0x007f;
    L_0x006d:
        r2 = r0.T;
        r3 = r2.size();
        r3 = r3 + -1;
        r2 = r2.remove(r3);
        r2 = (defpackage.uov) r2;
        r0.a(r2);
        goto L_0x0063;
    L_0x007f:
        if (r4 == 0) goto L_0x00c4;
    L_0x0081:
        r1 = 0;
    L_0x0082:
        r2 = r0.T;
        r2 = r2.size();
        if (r1 >= r2) goto L_0x00c4;
    L_0x008a:
        r2 = r0.T;
        r2 = r2.get(r1);
        r2 = (defpackage.uov) r2;
        r2.a(r6);
        r3 = r1 * 50;
        r4 = r2.d;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 == 0) goto L_0x00c1;
    L_0x009f:
        r4 = r2.a;
        r4.cancel();
        r4 = r2.a;
        r7 = new float[r9];
        r7[r6] = r5;
        r4.setFloatValues(r7);
        r4 = r2.a;
        r7 = (long) r3;
        r4.setStartDelay(r7);
        r3 = r2.a;
        r7 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r3.setDuration(r7);
        r3 = r2.a;
        r3.start();
        r2.d = r5;
    L_0x00c1:
        r1 = r1 + 1;
        goto L_0x0082;
    L_0x00c4:
        return;
    L_0x00c5:
        r10 = r7 - r8;
        r11 = r0.T;
        r11 = r11.size();
        if (r11 <= r10) goto L_0x00d8;
    L_0x00cf:
        r11 = r0.T;
        r10 = r11.get(r10);
        r10 = (defpackage.uov) r10;
        goto L_0x00eb;
    L_0x00d8:
        r11 = new uov;
        r11.<init>();
        r12 = r0.T;
        r12.add(r10, r11);
        r11.setCallback(r0);
        r10 = r0.S;
        r10.add(r11);
        r10 = r11;
    L_0x00eb:
        r11 = r0.o;
        r11 = r11.left;
        r11 = (float) r11;
        r12 = (float) r7;
        r12 = r12 * r2;
        r11 = r11 + r12;
        r11 = r11 + r3;
        r12 = r0.n;
        r12 = r12.b;
        r12 = r12 + r11;
        r13 = r18.getPaddingTop();
        r13 = (float) r13;
        r14 = r0.n;
        r14 = r14.c;
        r15 = r0.y;
        r15 = (float) r15;
        r16 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r17 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1));
        if (r17 <= 0) goto L_0x0111;
    L_0x010c:
        r15 = r14 - r15;
        r15 = r15 / r16;
        r13 = r13 - r15;
    L_0x0111:
        r15 = (int) r11;
        r6 = (int) r13;
        r9 = (int) r12;
        r13 = r13 + r14;
        r13 = (int) r13;
        r10.setBounds(r15, r6, r9, r13);
        r12 = r12 - r11;
        r12 = r12 / r16;
        r11 = r11 + r12;
        r11 = r0.a(r11);
        r10.c = r11;
        if (r5 == 0) goto L_0x0155;
    L_0x0125:
        r6 = 1;
        r6 = r5.a(r11, r6);
        r9 = r10.b;
        if (r9 != 0) goto L_0x012f;
    L_0x012e:
        goto L_0x014c;
    L_0x012f:
        if (r6 == 0) goto L_0x014c;
    L_0x0131:
        r13 = r9.a();
        r15 = r6.a();
        r9 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1));
        if (r9 <= 0) goto L_0x014c;
    L_0x013d:
        r15 = r11 - r15;
        r15 = java.lang.Math.abs(r15);
        r11 = r11 - r13;
        r11 = java.lang.Math.abs(r11);
        r9 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1));
        if (r9 >= 0) goto L_0x014f;
    L_0x014c:
        r10.a(r6);
    L_0x014f:
        if (r6 != 0) goto L_0x0152;
    L_0x0151:
        goto L_0x0155;
    L_0x0152:
        r6.d();
    L_0x0155:
        r7 = r7 + 1;
        r6 = 0;
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.video.trim.VideoTrimView.a(ups):void");
    }

    private final void l() {
        a(d(f()), d(g()));
    }

    private final void a(float f, float f2) {
        this.P.setX(f - ((float) this.A));
        this.Q.setX(f2 - ((float) this.A));
        int i = this.A;
        float f3 = (((float) (i + i)) + f) - f2;
        if (f3 > 0.0f) {
            float f4 = (float) i;
            f3 = (f4 - f3) / f4;
        } else {
            f3 = 1.0f;
        }
        ((upg) this.P.getDrawable()).a(f3, false);
        ((upg) this.Q.getDrawable()).a(f3, true);
        upk upk = this.i;
        upk.b = f;
        upk.c = f2;
        if (this.t != upu.Begin) {
            f = f2;
        }
        b(f);
    }

    public final void a(uov uov) {
        uov.a(null);
        uov.setCallback(null);
        this.S.remove(uov);
    }

    public final boolean i() {
        return this.p.c;
    }

    private final float m() {
        return this.P.getX() + ((float) this.A);
    }

    private final float n() {
        return this.Q.getX() + ((float) this.A);
    }

    public final long a(float f) {
        return this.p.b((f - ((float) this.o.left)) / ((float) this.o.width()));
    }

    private final float d(long j) {
        return (this.p.a(j) * ((float) this.o.width())) + ((float) this.o.left);
    }

    /* JADX WARNING: Missing block: B:21:0x005a, code skipped:
            if ((r1[r0] - r9) > (r9 - r1[r4])) goto L_0x005c;
     */
    private final long e(long r9) {
        /*
        r8 = this;
        r0 = r8.ao;
        r1 = r0 + -1;
        if (r0 == 0) goto L_0x008f;
    L_0x0006:
        r0 = 1;
        r6 = 0;
        if (r1 == r0) goto L_0x006e;
    L_0x000a:
        r2 = 2;
        if (r1 == r2) goto L_0x000e;
    L_0x000d:
        return r9;
    L_0x000e:
        r1 = r8.V;
        if (r1 == 0) goto L_0x006d;
    L_0x0012:
        r2 = r1.h;
        r3 = r1.e(r6);
        r3 = r2[r3];
        r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r2 >= 0) goto L_0x0023;
    L_0x001e:
        r0 = r1.e(r6);
        goto L_0x005d;
    L_0x0023:
        r2 = r1.h;
        r3 = -1;
        r4 = r1.e(r3);
        r4 = r2[r4];
        r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0035;
    L_0x0030:
        r0 = r1.e(r3);
        goto L_0x005d;
    L_0x0035:
        r2 = r1.d(r9);
        if (r2 == r3) goto L_0x003c;
    L_0x003b:
        r6 = 1;
    L_0x003c:
        defpackage.uhy.b(r6);
        r4 = r1.e(r2);
        r5 = r1.e();
        r5 = r5 + r3;
        if (r2 == r5) goto L_0x005c;
    L_0x004a:
        r2 = r2 + r0;
        r0 = r1.e(r2);
        r1 = r1.h;
        r2 = r1[r0];
        r2 = r2 - r9;
        r6 = r1[r4];
        r6 = r9 - r6;
        r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x005d;
    L_0x005c:
        r0 = r4;
    L_0x005d:
        r1 = r8.V;
        r2 = r1.b(r0);
        r0 = r8.V;
        r4 = r0.g;
        r0 = r9;
        r0 = a(r0, r2, r4);
        return r0;
    L_0x006d:
        return r9;
    L_0x006e:
        r2 = 0;
        r0 = r8.V;
        r4 = r0.g;
        r0 = r9;
        r4 = a(r0, r2, r4);
        r0 = r8.aa;
        r6 = r0.a(r9, r6);
        if (r6 == 0) goto L_0x008e;
    L_0x0081:
        r2 = r6.a();
        r0 = r9;
        r0 = a(r0, r2, r4);
        r6.d();
        return r0;
    L_0x008e:
        return r4;
    L_0x008f:
        r0 = 0;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.video.trim.VideoTrimView.e(long):long");
    }

    private static long a(long j, long j2, long j3) {
        return Math.abs(j2 - j) < Math.abs(j3 - j) ? j2 : j3;
    }

    private final ups b(int i) {
        boolean z = false;
        uhy.a(i >= 0);
        if (i == 0) {
            return ups.a;
        }
        int n;
        ukz ukz = this.V;
        float c = ukz != null ? ukz.c() : 1.7777778f;
        ujf ujf = this.U;
        if (ujf != null) {
            n = ((ujf.n() % 360) + 360) % 360;
            if (n % 90 == 0 && n >= 0) {
                z = true;
            }
            uhy.a(z);
            if (n == 90 || n == 270) {
                c = 1.0f / c;
            }
        }
        int i2 = this.y;
        n = this.z;
        int max = Math.max(1, (int) Math.floor((double) (((float) (i + n)) / ((((float) i2) * c) + ((float) n)))));
        float f = ((float) (i - (this.z * (max - 1)))) / ((float) max);
        return new ups(f, f / c, max);
    }

    private static boolean a(Object obj, Object obj2) {
        boolean equals;
        if (obj != null) {
            equals = obj.equals(obj2);
        } else if (obj2 == null) {
            return true;
        } else {
            equals = false;
        }
        return equals;
    }
}
