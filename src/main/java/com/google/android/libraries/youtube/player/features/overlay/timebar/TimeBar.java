package com.google.android.libraries.youtube.player.features.overlay.timebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.ahfr;
import defpackage.aigy;
import defpackage.aiha;
import defpackage.aihk;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiho;
import defpackage.aihp;
import defpackage.aihq;
import defpackage.aihs;
import defpackage.aihu;
import defpackage.ajrc;
import defpackage.xss;
import java.util.Map;

public class TimeBar extends aigy {
    private int A;
    private String B;
    private final Rect C;
    private final Rect D;
    private int E;
    private int F;
    private int G;
    public Vibrator a;
    public final int b;
    public aihp c;
    private int d;
    private final DisplayMetrics e;
    private final Rect f;
    private final Rect g;
    private final Rect h;
    private final Rect i;
    private final Paint j;
    private final Paint k;
    private final Paint o;
    private final Paint p;
    private final Paint q;
    private final Paint r;
    private final Paint s;
    private final aihn t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private boolean y;
    private boolean z;

    public TimeBar(Context context, aiha aiha) {
        this(context, null);
        a(aiha);
    }

    public TimeBar(Context context, AttributeSet attributeSet) {
        super(new aihk(), context, attributeSet);
        this.d = 2;
        this.e = context.getResources().getDisplayMetrics();
        ViewConfiguration.get(context);
        this.y = true;
        this.z = true;
        this.f = new Rect();
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
        this.j = new Paint();
        this.k = new Paint();
        this.o = new Paint();
        this.p = new Paint();
        this.s = new Paint();
        this.s.setColor(Color.parseColor("#B2FFFF00"));
        float a = (float) xss.a(this.e, 12);
        this.C = new Rect();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ahfr.c, 0, 0);
        this.B = aigy.b(0);
        this.E = 255;
        int i = -1;
        if (obtainStyledAttributes.hasValue(ahfr.i)) {
            i = obtainStyledAttributes.getColor(ahfr.i, -1);
        }
        this.q = new Paint(1);
        this.q.setTypeface(ajrc.ROBOTO_REGULAR.a(context));
        String str = "#50000000";
        this.q.setShadowLayer(6.0f, 1.0f, 1.0f, Color.parseColor(str));
        this.q.setColor(i);
        this.q.setTextSize(a);
        this.q.setTextAlign(Align.CENTER);
        this.q.getTextBounds("0:00:00", 0, 7, this.C);
        this.D = new Rect();
        this.r = new Paint(1);
        this.r.setTypeface(ajrc.ROBOTO_REGULAR.a(context));
        this.r.setShadowLayer(6.0f, 1.0f, 1.0f, Color.parseColor(str));
        this.r.setColor(i);
        this.r.setTextSize(a);
        this.r.setTextAlign(Align.CENTER);
        this.r.getTextBounds("-0:00:00", 0, 8, this.D);
        this.u = obtainStyledAttributes.getDimensionPixelOffset(ahfr.f, xss.a(this.e, 13));
        this.v = obtainStyledAttributes.getDimensionPixelOffset(ahfr.g, xss.a(this.e, 8));
        this.b = obtainStyledAttributes.getDimensionPixelOffset(ahfr.h, xss.a(this.e, 42));
        this.w = obtainStyledAttributes.getDimensionPixelOffset(ahfr.e, xss.a(this.e, 12));
        this.x = obtainStyledAttributes.getDimensionPixelOffset(ahfr.d, xss.a(this.e, 20));
        obtainStyledAttributes.recycle();
        this.t = new aihn(this, this.w, this.x);
        this.a = (Vibrator) context.getSystemService("vibrator");
        this.c = new aiho(this);
        r();
        a(new aihm(this));
    }

    private final String b() {
        return aigy.b(((aihk) this.l).k);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(b());
    }

    private final boolean e() {
        return this.l.k() && g() > 0;
    }

    private final boolean q() {
        return this.l.l() && g() > 0;
    }

    private final boolean r() {
        int width;
        int i = this.A;
        if (q()) {
            width = this.D.width() + (this.t.c / 2);
            this.A = width;
        } else if (!e() || q()) {
            this.A = 0;
            width = 0;
        } else {
            width = this.C.width();
            int i2 = this.v;
            width = (width + (i2 + i2)) + (this.t.c / 2);
            this.A = width;
        }
        if (width != i) {
            a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.A != i) {
            return true;
        }
        return false;
    }

    private final void a(int i, int i2) {
        int i3 = (int) (this.e.density * ((float) this.d));
        int paddingLeft = getPaddingLeft();
        if (!q()) {
            paddingLeft += this.A;
        }
        i2 = (i2 / 2) - (i3 / 2);
        int paddingRight = getPaddingRight();
        this.f.set(paddingLeft, i2, (i - paddingRight) - this.A, i3 + i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        if (r()) {
            requestLayout();
        }
        this.g.set(this.f);
        this.h.set(this.f);
        this.i.set(this.f);
        aihq aihq = this.l;
        long g = g();
        long h = h();
        long i = i();
        if (!l()) {
            i = h;
        }
        this.B = aigy.b(((aihk) this.l).i);
        Paint paint = this.q;
        String str = this.B;
        paint.getTextBounds(str, 0, str.length(), this.C);
        if (g > 0) {
            long width = (((long) this.f.width()) * f()) / g;
            this.g.right = this.f.left + ((int) width);
            long width2 = (((long) this.f.width()) * h) / g;
            this.h.right = this.f.left + ((int) width2);
            this.F = (this.f.left - (this.t.c / 2)) + ((int) ((((long) this.f.width()) * i) / g));
        } else {
            int i2;
            this.g.right = this.f.left;
            Rect rect = this.h;
            if (this.y) {
                i2 = this.f.left;
            } else {
                i2 = this.f.right;
            }
            rect.right = i2;
            this.F = this.f.left - (this.t.c / 2);
        }
        this.h.left = Math.min(this.f.right, Math.max(this.h.left, this.f.left));
        this.h.right = Math.max(this.f.left, Math.min(this.h.right, this.f.right));
        this.g.left = Math.min(this.f.right, Math.max(this.g.left, this.f.left));
        this.g.right = Math.max(this.f.left, Math.min(this.g.right, this.f.right));
        this.o.setColor(aihq.h());
        this.p.setColor(aihq.i());
        this.k.setColor(aihq.b());
        this.j.setColor(aihq.f());
        boolean m = aihq.m();
        if (this.y != m) {
            this.y = m;
            if (!m && l()) {
                m();
            }
            setFocusable(m);
            requestLayout();
        }
        setEnabled(aihq.m());
        invalidate();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        if (!l() || isEnabled()) {
            aihn aihn = this.t;
            if (aihn.e.isEnabled()) {
                boolean l = aihn.e.l() ^ 1;
                if (!aihn.a.isRunning() && aihn.a() == ((float) aihn.d) && !l) {
                    aihn.a.start();
                    aihn.b = false;
                    return;
                } else if (!aihn.a.isRunning() && aihn.a() == ((float) aihn.c) && l) {
                    aihn.a.reverse();
                    aihn.b = true;
                    return;
                } else if (aihn.a.isRunning() && l != aihn.b) {
                    aihn.a.reverse();
                    aihn.b = l;
                }
            } else {
                aihn.a.cancel();
            }
            return;
        }
        m();
        c();
    }

    public final long d() {
        long j = ((aihk) this.l).l;
        if (this.f.width() <= 0) {
            return j;
        }
        return ((((long) ((this.F + (this.t.c / 2)) - this.f.left)) * g()) / ((long) this.f.width())) + j;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        float f = this.e.density;
        int i3 = (int) (f + f);
        if (e() || this.y) {
            i3 = this.b;
        }
        i = getDefaultSize(0, i);
        i2 = resolveSize(i3, i2);
        setMeasuredDimension(i, i2);
        if (e() || this.y) {
            this.G = (i2 / 2) - (this.t.c / 2);
            a(i, i2);
        } else {
            this.f.set(0, 0, i, i2);
        }
        c();
    }

    public final void draw(Canvas canvas) {
        float a;
        float f;
        super.draw(canvas);
        aihq aihq = this.l;
        if (g() > 0) {
            canvas.drawRect(this.f, this.j);
            if (aihq.j()) {
                canvas.drawRect(this.g, this.k);
            }
            canvas.drawRect(this.h, this.o);
            if (this.y) {
                a = this.t.a() / 2.0f;
                f = (float) (this.t.c / 2);
                if (a > 0.0f) {
                    if (this.p.getColor() == 0) {
                        int alpha = this.o.getAlpha();
                        this.o.setAlpha(this.E);
                        canvas.drawCircle(s() + f, ((float) this.G) + f, a, this.o);
                        this.o.setAlpha(alpha);
                    } else {
                        this.p.setAlpha(this.E);
                        canvas.drawCircle(s() + f, ((float) this.G) + f, a, this.p);
                    }
                }
            }
        }
        if (q()) {
            if (!aihq.p()) {
                canvas.drawText(aigy.b(k()), ((float) getWidth()) - ((float) ((this.A * 3) / 7)), (float) ((getHeight() / 2) + (this.D.height() / 2)), this.r);
            }
        } else if (e()) {
            String b;
            a = (float) ((this.A * 3) / 7);
            f = (float) ((getHeight() / 2) + (this.C.height() / 2));
            if (this.z && l()) {
                b = aigy.b(d());
            } else {
                b = b();
            }
            canvas.drawText(b, a, f, this.q);
            canvas.drawText(this.B, ((float) getWidth()) - a, f, this.q);
        }
        Map o = aihq.o();
        long g = g();
        if (aihq.n() && o != null && g > 0) {
            aihs[] aihsArr = (aihs[]) o.get(aihu.AD_MARKER);
            if (aihsArr != null) {
                for (aihs aihs : aihsArr) {
                    this.i.left = this.f.left + ((int) (((((long) this.f.width()) * Math.min(g, Math.max(0, aihs.a))) / g) - 2));
                    Rect rect = this.i;
                    rect.right = rect.left + 4;
                    canvas.drawRect(this.i, this.s);
                }
            }
        }
    }

    private final float s() {
        aihn aihn = this.t;
        int i = aihn.c;
        aihn.a();
        int i2 = i / 2;
        return (float) Math.max(this.f.left - i2, Math.min((this.f.right - i) + i2, this.F));
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(float f, float f2) {
        int i = this.G + this.t.c;
        int i2 = this.f.right + this.t.c;
        if (((float) (this.f.left - this.t.c)) < f && f < ((float) i2)) {
            int i3 = this.G;
            int i4 = this.u;
            if (((float) (i3 - i4)) < f2 && f2 < ((float) (i + i4))) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(float f) {
        int i = this.t.c / 2;
        int i2 = this.f.right - i;
        int i3 = this.f.left - i;
        int i4 = ((int) f) - i;
        this.F = i4;
        i4 = Math.min(i2, Math.max(i3, i4));
        this.F = i4;
        if (i4 - i3 > 0) {
            if (i2 - i4 <= 0) {
                this.F = i2;
            }
            return;
        }
        this.F = i3;
    }
}
