package com.google.android.apps.youtube.app.common.player.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import com.google.android.youtube.R;
import defpackage.aigy;
import defpackage.aihk;
import defpackage.aihq;
import defpackage.aihs;
import defpackage.aihu;
import defpackage.apxn;
import defpackage.aulu;
import defpackage.emi;
import defpackage.emj;
import defpackage.emk;
import defpackage.eml;
import defpackage.emn;
import defpackage.emt;
import defpackage.xpu;
import defpackage.xse;
import defpackage.xss;
import defpackage.zyw;
import java.util.IdentityHashMap;
import java.util.Map;

public class InlineTimeBar extends aigy implements OnLayoutChangeListener {
    private final Map A;
    private xpu B;
    private boolean C;
    public Handler a;
    public zyw b;
    public final Rect c;
    public final Runnable d;
    public final emi e;
    public final emn f;
    public View g;
    public boolean h;
    public int i;
    public Point j;
    public int k;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Paint r;
    private final Paint s;
    private final Paint t;
    private final int u;
    private final Paint v;
    private final int w;
    private final int x;
    private final int y;
    private final boolean z;

    public InlineTimeBar(Context context) {
        this(context, null);
    }

    public InlineTimeBar(Context context, AttributeSet attributeSet) {
        int dimension;
        super(new aihk(), context, attributeSet);
        Resources resources = context.getResources();
        ((emk) xse.b(context)).a(this);
        this.o = new Rect();
        this.c = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Paint();
        this.s = new Paint();
        this.t = new Paint();
        this.A = new IdentityHashMap(4);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, emt.a);
            dimension = (int) obtainStyledAttributes.getDimension(emt.b, 0.0f);
            obtainStyledAttributes.recycle();
        } else {
            dimension = 0;
        }
        if (dimension == 0) {
            dimension = getResources().getDimensionPixelSize(R.dimen.inline_time_bar_size);
        }
        this.w = dimension;
        this.x = ViewConfiguration.get(context).getScaledTouchSlop();
        this.y = ViewConfiguration.getLongPressTimeout();
        this.d = new emj(this);
        zyw zyw = this.b;
        apxn a = zyw != null ? zyw.a() : null;
        if (a != null) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.aD) {
                i = 1;
            }
        }
        this.z = i ^ 1;
        this.u = xss.a(displayMetrics, 4);
        this.v = new Paint();
        this.v.setColor(resources.getColor(R.color.inline_time_bar_ad_break_marker_color));
        this.e = new emi(this);
        this.f = new emn(this, this.w, resources.getDimensionPixelSize(R.dimen.inline_time_bar_scrubber_default_size), resources.getDimensionPixelSize(R.dimen.inline_time_bar_scrubber_drag_size));
    }

    public final void a(int i) {
        if (this.i != i) {
            this.i = i;
            if (!(i == 1 || l())) {
                emn emn = this.f;
                emn.f.removeCallbacks(emn.e);
                if (emn.b() == 0.0f) {
                    emn.c();
                } else {
                    emn.f();
                    emn.f.postInvalidate();
                }
            }
            if (i == 0) {
                b();
            }
        }
    }

    public final void a(boolean z) {
        if (this.C != z) {
            boolean e = e();
            this.C = z;
            if (e != e()) {
                requestLayout();
            }
        }
    }

    public final void a(View view) {
        if (!this.A.containsKey(view)) {
            this.A.put(view, new eml(this, view));
        }
    }

    private final boolean q() {
        return g() > 0;
    }

    public final boolean isEnabled() {
        boolean z = false;
        if (super.isEnabled() && q()) {
            z = true;
        }
        setFocusable(z);
        return z;
    }

    public final void a() {
        if (l() && !isEnabled()) {
            m();
        }
        if (l()) {
            this.f.a();
        } else if (this.i != 1) {
            emn emn = this.f;
            emn.f.removeCallbacks(emn.e);
            if (emn.b() == 0.0f) {
                emn.c();
                return;
            }
            emn.f.postDelayed(emn.e, emn.d);
        }
    }

    public final void b() {
        if (l()) {
            m();
            if (this.i != 1) {
                emn emn = this.f;
                emn.f.removeCallbacks(emn.e);
                emn.c();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        this.p.set(this.c);
        this.q.set(this.c);
        aihq aihq = this.l;
        long g = g();
        long h = h();
        long i = i();
        if (!l()) {
            i = h;
        }
        if (g > 0) {
            long width = (((long) this.c.width()) * f()) / g;
            this.p.right = this.c.left + ((int) width);
            this.k = this.c.left + ((int) ((((long) this.c.width()) * i) / g));
            i = (((long) this.c.width()) * h) / g;
            this.q.right = this.c.left + ((int) i);
        } else {
            this.p.right = this.c.left;
            this.q.right = this.c.left;
            this.k = this.c.left;
        }
        this.t.setColor(aihq.h() | -16777216);
        this.s.setColor(aihq.b());
        this.r.setColor(aihq.f());
        setEnabled(aihq.m());
        invalidate(this.o);
    }

    public final long d() {
        long j = ((aihk) this.l).l;
        if (this.c.width() <= 0) {
            return j;
        }
        return j + ((((long) (this.k - this.c.left)) * g()) / ((long) this.c.width()));
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(float f, float f2) {
        return this.o.contains((int) f, (int) f2);
    }

    private final int r() {
        return getResources().getDimensionPixelSize(R.dimen.inline_controls_bottom_bar_height);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(float f) {
        if (e()) {
            int scaledEdgeSlop = ViewConfiguration.get(getContext()).getScaledEdgeSlop();
            int i = this.o.left + scaledEdgeSlop;
            int i2 = this.o.right - scaledEdgeSlop;
            this.k = this.c.left + ((this.c.width() * (Math.max(i, Math.min(i2, (int) f)) - i)) / (i2 - i));
            return;
        }
        this.k = Math.max(this.c.left, Math.min(this.c.right, (int) f));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Point a = a(motionEvent);
        int i = a.x;
        int i2 = a.y;
        if (this.i != 0 && this.e.b() > 0.0f) {
            if (!l()) {
                for (eml eml : this.A.values()) {
                    if (eml.a.isShown()) {
                        if (eml.b == null) {
                            eml.b = new Rect();
                        }
                        eml.c.getGlobalVisibleRect(eml.b);
                        int i3 = eml.b.left;
                        int i4 = eml.b.top;
                        eml.a.getGlobalVisibleRect(eml.b);
                        if (eml.b.contains(i3 + i, i4 + i2)) {
                        }
                    }
                }
            }
            if (this.z) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    this.a.removeCallbacks(this.d);
                    this.j = null;
                    if (l()) {
                        n();
                        return true;
                    }
                } else if (action != 2) {
                    if (action == 3) {
                        this.a.removeCallbacks(this.d);
                        this.j = null;
                        if (l()) {
                            o();
                            return true;
                        }
                    }
                } else if (l()) {
                    c(i);
                    return true;
                } else {
                    Point point = this.j;
                    if (point != null && Math.abs(i - point.x) > this.x) {
                        this.a.removeCallbacks(this.d);
                        b(i);
                        return true;
                    }
                }
            } else if (a((float) i, (float) i2)) {
                this.j = new Point(i, i2);
                this.a.removeCallbacks(this.d);
                this.a.postAtTime(this.d, motionEvent.getDownTime() + ((long) this.y));
                return true;
            }
            return false;
        }
        this.a.removeCallbacks(this.d);
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        i = MeasureSpec.getSize(i);
        i2 = MeasureSpec.getSize(i2);
        if (e()) {
            i2 += Math.round(((float) (r() - this.w)) / 2.0f);
        }
        setMeasuredDimension(i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a(i3 - i, i4 - i2);
    }

    private final void a(int i, int i2) {
        int r = r();
        int i3 = this.w;
        i2 -= r;
        int paddingLeft = getPaddingLeft();
        i -= getPaddingRight();
        if (!e()) {
            if (this.B == null) {
                this.B = new xpu();
            }
            xpu.a(this.B, this.g, (View) getParent());
            Rect rect = this.B.a;
            if (rect.width() > 0) {
                i = getLeft();
                paddingLeft = rect.left - i;
                i = rect.right - i;
            }
            if (this.h) {
                i2 = (rect.top - getTop()) + ((rect.height() - r) / 2);
            }
        }
        int i4 = ((r - i3) / 2) + i2;
        this.o.set(paddingLeft, i2, i, r + i2);
        this.c.set(this.o);
        Rect rect2 = this.c;
        rect2.top = i4;
        rect2.bottom = i4 + i3;
        c();
    }

    public final void onDraw(Canvas canvas) {
        if (q() || this.e.b() <= 0.0f) {
            int i;
            int i2;
            canvas.save();
            aihq aihq = this.l;
            int round = Math.round(this.e.b() * ((float) this.c.height()));
            int centerY = this.c.centerY() - (round / 2);
            round += centerY;
            if (aihq.j()) {
                i = this.p.left;
                i2 = this.p.right;
            } else {
                i = 0;
                i2 = 0;
            }
            int max = Math.max(Math.max(this.c.left, i2), this.q.right);
            if (max < this.c.right) {
                canvas.drawRect((float) max, (float) centerY, (float) this.c.right, (float) round, this.r);
            }
            i = Math.max(i, this.q.right);
            if (i2 > i) {
                canvas.drawRect((float) i, (float) centerY, (float) i2, (float) round, this.s);
            }
            if (this.q.width() > 0) {
                canvas.drawRect((float) this.q.left, (float) centerY, (float) this.q.right, (float) round, this.t);
            }
            long g = g();
            if (aihq.n()) {
                long j = 0;
                if (g > 0) {
                    Map o = aihq.o();
                    if (o != null && o.containsKey(aihu.AD_MARKER)) {
                        aihs[] aihsArr = (aihs[]) o.get(aihu.AD_MARKER);
                        i = this.u / 2;
                        int length = aihsArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            int min = this.c.left + Math.min(this.c.width() - this.u, Math.max(0, ((int) ((((long) this.c.width()) * Math.min(g, Math.max(j, aihsArr[i3].a))) / g)) - i));
                            canvas.drawRect((float) min, (float) centerY, (float) (min + this.u), (float) round, this.v);
                            i3++;
                            j = 0;
                        }
                    }
                }
            }
            float b = this.e.b();
            emn emn = this.f;
            if (emn.f.isEnabled()) {
                if (emn.f.l()) {
                    centerY = emn.c;
                } else {
                    centerY = emn.b;
                }
                i = emn.a;
                round = Math.round(emn.b() * ((float) (centerY - i))) + i;
            } else {
                round = emn.a;
            }
            int round2 = Math.round((b * ((float) round)) / 2.0f);
            canvas.drawCircle((float) Math.min(this.c.right - round2, Math.max(this.c.left + round2, this.k)), this.c.exactCenterY(), (float) round2, this.t);
            canvas.restore();
        }
    }

    public final boolean e() {
        return this.C || this.g == null;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view == this.g) {
            if (!e()) {
                a(getWidth(), getHeight());
            }
            return;
        }
        view.removeOnLayoutChangeListener(this);
    }
}
