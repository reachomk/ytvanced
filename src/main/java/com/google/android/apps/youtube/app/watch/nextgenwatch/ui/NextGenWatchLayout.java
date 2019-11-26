package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;
import defpackage.abe;
import defpackage.acvs;
import defpackage.acvx;
import defpackage.acwc;
import defpackage.acxf;
import defpackage.aocf;
import defpackage.eyb;
import defpackage.eyh;
import defpackage.fkd;
import defpackage.lif;
import defpackage.lij;
import defpackage.lil;
import defpackage.lip;
import defpackage.lja;
import defpackage.lkd;
import defpackage.lkv;
import defpackage.lkz;
import defpackage.lla;
import defpackage.log;
import defpackage.loj;
import defpackage.lok;
import defpackage.lol;
import defpackage.lpx;
import defpackage.lqb;
import defpackage.lqe;
import defpackage.lqf;
import defpackage.lqg;
import defpackage.lqh;
import defpackage.lqi;
import defpackage.lqj;
import defpackage.lqk;
import defpackage.lqq;
import defpackage.th;
import defpackage.xoj;
import defpackage.xpr;
import defpackage.xss;
import defpackage.zyw;
import java.util.LinkedList;

public class NextGenWatchLayout extends ViewGroup implements lif, lil, lkd, lkz, lqk {
    private int A = 0;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private float I;
    private Paint J;
    public final eyh a = new eyh();
    public fkd b;
    public zyw c;
    public lqj d;
    public eyb e;
    public acvx f;
    public View g;
    public View h;
    public View i;
    public lqb j;
    public log k;
    public lqg l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private View r;
    private View s;
    private LinkedList t;
    private boolean u;
    private lqe v;
    private lqf w;
    private lqh x;
    private xoj y;
    private boolean z;

    public NextGenWatchLayout(Context context) {
        super(context);
        a(context, null);
    }

    public NextGenWatchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public NextGenWatchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public NextGenWatchLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fa  */
    private final void a(android.content.Context r4, android.util.AttributeSet r5) {
        /*
        r3 = this;
        r0 = defpackage.xse.b(r4);
        r0 = (defpackage.lqc) r0;
        r0.a(r3);
        r0 = new android.graphics.Paint;
        r0.<init>();
        r3.J = r0;
        r0 = 0;
        r1 = 2130772256; // 0x7f010120 float:1.7147625E38 double:1.052741371E-314;
        r1 = defpackage.xwe.a(r4, r1, r0);
        r2 = r3.J;
        r2.setColor(r1);
        r1 = defpackage.lqp.e;
        r5 = r4.obtainStyledAttributes(r5, r1);
        r1 = defpackage.lqp.j;
        r1 = r5.getResourceId(r1, r0);
        r3.m = r1;
        r1 = defpackage.lqp.i;
        r1 = r5.getResourceId(r1, r0);
        r3.n = r1;
        r1 = defpackage.lqp.h;
        r1 = r5.getResourceId(r1, r0);
        r3.o = r1;
        r1 = defpackage.lqp.k;
        r2 = -1;
        r1 = r5.getResourceId(r1, r2);
        r3.q = r1;
        r1 = defpackage.lqp.g;
        r1 = r5.getResourceId(r1, r0);
        r3.p = r1;
        r1 = defpackage.lqp.f;
        r1 = r5.getResourceId(r1, r2);
        r3.H = r1;
        r1 = defpackage.lqp.f;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = r5.getFloat(r1, r2);
        r3.I = r1;
        r1 = r3.m;
        r2 = 1;
        if (r1 == 0) goto L_0x0065;
    L_0x0063:
        r1 = 1;
        goto L_0x0066;
    L_0x0065:
        r1 = 0;
    L_0x0066:
        defpackage.amqw.b(r1);
        r1 = r3.p;
        if (r1 == 0) goto L_0x006f;
    L_0x006d:
        r1 = 1;
        goto L_0x0070;
    L_0x006f:
        r1 = 0;
    L_0x0070:
        defpackage.amqw.b(r1);
        r5.recycle();
        r5 = new java.util.LinkedList;
        r5.<init>();
        r3.t = r5;
        r5 = new xoj;
        r5.<init>(r4);
        r3.y = r5;
        r5 = new lqh;
        r5.<init>(r3);
        r3.x = r5;
        r5 = r3.d;
        r5.a(r3);
        r5 = r3.c;
        r5 = defpackage.foh.o(r5);
        if (r5 == 0) goto L_0x00a0;
    L_0x0098:
        r5 = new lpz;
        r5.<init>(r3, r4);
        r3.l = r5;
        goto L_0x00a7;
    L_0x00a0:
        r5 = new lqd;
        r5.<init>(r3, r4);
        r3.l = r5;
    L_0x00a7:
        r4 = r3.c;
        r5 = defpackage.foh.p(r4);
        if (r5 == 0) goto L_0x00c2;
    L_0x00af:
        r4 = r4.a();
        if (r4 == 0) goto L_0x00c2;
    L_0x00b5:
        r4 = r4.e;
        if (r4 != 0) goto L_0x00bb;
    L_0x00b9:
        r4 = defpackage.aulu.bw;
    L_0x00bb:
        r4 = r4.L;
        if (r4 != 0) goto L_0x00c0;
    L_0x00bf:
        goto L_0x00c2;
    L_0x00c0:
        r4 = 1;
        goto L_0x00c3;
    L_0x00c2:
        r4 = 0;
    L_0x00c3:
        r3.D = r4;
        r4 = r3.c;
        r4 = defpackage.foh.f(r4);
        r3.E = r4;
        r4 = r3.c;
        r4 = r4.a();
        if (r4 == 0) goto L_0x00e1;
    L_0x00d5:
        r4 = r4.e;
        if (r4 != 0) goto L_0x00db;
    L_0x00d9:
        r4 = defpackage.aulu.bw;
    L_0x00db:
        r4 = r4.bq;
        if (r4 != 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x00e1;
    L_0x00e0:
        r0 = 1;
    L_0x00e1:
        r3.F = r0;
        r4 = new ffs;
        r5 = new lpy;
        r5.<init>();
        r4.<init>();
        r4 = r3.E;
        r4 = r4 ^ r2;
        r3.G = r4;
        r4 = r3.c;
        r4 = defpackage.foh.f(r4);
        if (r4 == 0) goto L_0x00fe;
    L_0x00fa:
        r4 = 2;
        r3.setImportantForAccessibility(r4);
    L_0x00fe:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout.a(android.content.Context, android.util.AttributeSet):void");
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != null) {
            this.u = false;
        }
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == null) {
            return;
        }
        if (this.g == view) {
            throw new IllegalStateException("Player view must not be removed.");
        } else if (this.r != view) {
            if (this.t.contains(view)) {
                this.t.remove(view);
            }
        } else {
            throw new IllegalStateException("Metadata view must not be removed.");
        }
    }

    public final View e() {
        return this.g;
    }

    public final void a(View view) {
        if (!this.t.contains(view)) {
            this.t.add(view);
            addView(view);
            requestLayout();
        }
    }

    public final void b(View view) {
        if (this.t.contains(view)) {
            this.t.remove(view);
            removeView(view);
            requestLayout();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = findViewById(this.m);
        this.r = findViewById(this.p);
        this.s = findViewById(this.q);
        this.h = findViewById(this.n);
        this.i = findViewById(this.o);
        if (!this.F) {
            i();
        }
        this.v = new lqe(this.d, this.r);
        this.w = new lqf(this.d, this.a);
        this.l.c();
        if (!this.u) {
            super.bringChildToFront(this.h);
            super.bringChildToFront(this.g);
            super.bringChildToFront(this.r);
            View view = this.s;
            if (view instanceof ViewStub) {
                super.bringChildToFront(view);
            }
            int size = this.t.size();
            for (int i = 0; i < size; i++) {
                super.bringChildToFront((View) this.t.get(i));
            }
            super.bringChildToFront(this.i);
            this.u = true;
        }
        j();
    }

    public final View c() {
        return this.h;
    }

    public final View d() {
        return this.i;
    }

    public final void a(lkz lkz) {
        this.d.a(lkz);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lqj lqj = this.d;
        lkv lkv = lqj.f;
        int i = 0;
        if (lkv != null) {
            lkv.f();
        }
        while (i < lqj.b.size()) {
            ((lkv) lqj.b.get(i)).f();
            i++;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lqj lqj = this.d;
        lkv lkv = lqj.f;
        int i = 0;
        if (lkv != null) {
            lkv.g();
        }
        while (i < lqj.b.size()) {
            ((lkv) lqj.b.get(i)).g();
            i++;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.H == -1) {
            this.I = 1.0f;
            return;
        }
        TypedValue typedValue = new TypedValue();
        getResources().getValue(this.H, typedValue, true);
        this.I = typedValue.getFloat();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b(i, i2);
        if (!this.F) {
            i();
        }
    }

    private final void i() {
        View view;
        if (xss.b(getContext())) {
            view = this.s;
            if ((view instanceof ViewStub) && (view.getParent() instanceof ViewGroup)) {
                this.s = ((ViewStub) this.s).inflate();
                this.a.a((ViewGroup) this.s);
            }
        }
        if (!this.a.a()) {
            view = this.s;
            if (!(view instanceof ViewStub) && view != null) {
                this.a.a((ViewGroup) view);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        MeasureSpec.getSize(i);
        int size = MeasureSpec.getSize(i2);
        if (this.E) {
            i = MeasureSpec.makeMeasureSpec((int) ((this.I * ((float) getDefaultSize(((View) getParent()).getMeasuredWidth(), i))) + 0.5f), 1073741824);
        }
        int size2 = MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
        boolean b = b(size2, size);
        j();
        if (!this.d.aF_() || b) {
            lla a = this.d.a();
            this.v.f();
            this.w.f();
            if (this.d.j()) {
                Rect k = a.k();
                this.h.measure(MeasureSpec.makeMeasureSpec(k.width(), 1073741824), MeasureSpec.makeMeasureSpec(k.height(), 1073741824));
                this.l.b(a);
            }
            Rect i3 = a.i();
            i2 = i3.width();
            i = i3.height();
            this.g.measure(MeasureSpec.makeMeasureSpec(i2, 1073741824), MeasureSpec.makeMeasureSpec(i, 1073741824));
            size = this.t.size();
            for (size2 = 0; size2 < size; size2++) {
                ((View) this.t.get(size2)).measure(MeasureSpec.makeMeasureSpec(i2, aocf.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(i, aocf.UNSET_ENUM_VALUE));
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.d.aF_()) {
            lla a = this.d.a();
            this.v.g();
            this.w.g();
            Rect i5 = a.i();
            a(this.g, z, i5.left, i5.top, i5.left + this.g.getMeasuredWidth(), i5.top + this.g.getMeasuredHeight());
            i3 = this.t.size();
            for (i4 = 0; i4 < i3; i4++) {
                View view = (View) this.t.get(i4);
                a(view, z, i5.left, i5.top, i5.left + view.getMeasuredWidth(), i5.top + view.getMeasuredHeight());
            }
            if (this.d.j()) {
                i5 = a.k();
                a(this.h, z, i5.left, i5.top, i5.left + this.h.getMeasuredWidth(), i5.top + this.h.getMeasuredHeight());
            }
            this.l.a(a);
        }
    }

    public static void a(View view, boolean z, int i, int i2, int i3, int i4) {
        if (view == null) {
            return;
        }
        if (z || view.getVisibility() != 8) {
            view.layout(i, i2, i3, i4);
        }
    }

    private final boolean b(int i, int i2) {
        this.d.b(this);
        lqj lqj = this.d;
        boolean h = h();
        lkv lkv = lqj.f;
        int i3 = 0;
        if (lkv != null) {
            lkv.a(h);
        }
        for (int i4 = 0; i4 < lqj.b.size(); i4++) {
            ((lkv) lqj.b.valueAt(i4)).a(h);
        }
        lqj = this.d;
        boolean z = true;
        if (i == lqj.d && i2 == lqj.e) {
            z = false;
        }
        lqj.d = i;
        lqj.e = i2;
        lkv lkv2 = lqj.f;
        if (lkv2 != null) {
            lkv2.b_(i, i2);
        }
        while (i3 < lqj.b.size()) {
            ((lkv) lqj.b.valueAt(i3)).b_(lqj.d, lqj.e);
            i3++;
        }
        this.d.a((lkz) this);
        return z;
    }

    public final void a(lla lla) {
        if (isInLayout()) {
            post(new lpx(this));
        } else {
            requestLayout();
        }
        if (this.d.h()) {
            this.v.h();
            this.w.h();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean a;
        if (view == this.h) {
            int save = canvas.save();
            if (this.E && this.G) {
                canvas.clipRect(this.d.a().i(), Op.DIFFERENCE);
            }
            a = a(canvas, view, j);
            canvas.restoreToCount(save);
            return a;
        } else if (view != this.r && view != this.s) {
            return a(canvas, view, j);
        } else {
            Rect l;
            lla a2 = this.d.a();
            if (view == this.s) {
                l = a2.l();
            } else {
                l = a2.j();
            }
            float q;
            if (view == this.s) {
                q = a2.q();
            } else {
                q = a2.n();
            }
            int save2 = canvas.save();
            canvas.clipRect(l);
            if (lja.a(this.c, getContext()) && q > 0.0f && q < 1.0f) {
                canvas.drawRect(l, this.J);
            }
            a = a(canvas, view, j);
            canvas.restoreToCount(save2);
            return a;
        }
    }

    private final boolean a(Canvas canvas, View view, long j) {
        this.l.a(canvas, view);
        boolean drawChild = super.drawChild(canvas, view, j);
        this.l.b(canvas, view);
        return drawChild;
    }

    private final void j() {
        boolean aF_ = this.d.a.aF_() ^ 1;
        xpr.a(this.g, aF_);
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            xpr.a((View) this.t.get(i), aF_);
        }
        xpr.a(this.h, this.d.j());
        xpr.a(this.i, lqj.a(this.d.a().p()));
        xpr.a(this.r, this.d.h());
        if (this.F && (this.s instanceof ViewStub) && this.d.i()) {
            i();
        }
        View view = this.s;
        if (view != null && !(view instanceof ViewStub)) {
            xpr.a(view, this.d.i());
        }
    }

    public final void a(int i, lqq lqq) {
        a(i, false, lqq);
    }

    public final void a(int i, boolean z, lqq lqq) {
        if (this.d.a.a(i) || this.k != null) {
            a(null);
            lqb lqb = this.j;
            if (lqb != null) {
                if (i == 0) {
                    lqb.a(z);
                } else if (i == 1) {
                    lqb.c(z);
                } else if (i == 2) {
                    lqb.b(z);
                } else if (i == 3) {
                    lqb.d(z);
                }
            }
            this.l.a(i == 2 ? 1.0f : 0.0f);
        }
        if (lqq != null) {
            lqq.a();
        }
    }

    public final int a(int i, int i2) {
        int f = this.d.f();
        int a = a(f);
        if (lol.a(a, i2)) {
            return a(f, a, i, i2);
        }
        return 2;
    }

    public final int a(int i, int i2, int i3, int i4) {
        log log = this.k;
        if (log != null) {
            log.b();
            log = this.k;
            if (log.b == i2 && log.c == i4) {
                return 1;
            }
        }
        a(new log(this, i2, i4, this.d.a(i), this.d.a(i3), this.x));
        return 0;
    }

    public final int a(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? this.l.b() : 1;
        } else {
            return this.l.a();
        }
    }

    private final void a(log log) {
        log log2 = this.k;
        if (log2 != null) {
            log2.b();
            loj loj = log2.d.b;
            if (loj != null) {
                loj.a();
            }
        }
        this.k = log;
        lqj lqj = this.d;
        log2 = this.k;
        lla lla = log2 != null ? log2.d : null;
        if (lla != lkv.b(lqj.f)) {
            if (lla != null) {
                lqj.f = lqj.a(lla);
                lqj.f.b_(lqj.d, lqj.e);
                lqj.f.a(lqj.c);
            } else {
                lqj.f = null;
            }
            lqj.k();
        }
    }

    private final boolean k() {
        log log = this.k;
        return log != null && log.a();
    }

    private final boolean l() {
        return this.A != 0;
    }

    private final void b(int i) {
        i = c(i);
        a(lol.a(i), i);
    }

    private final int c(int i) {
        if (m() && i != 0) {
            if (this.d.g() && i == 4) {
                return a(2);
            }
            if (this.d.b()) {
                return this.l.a(i);
            }
        }
        return 0;
    }

    private final void d(int i) {
        if (l()) {
            b(false);
            if (!(this.k == null || k())) {
                float o = o();
                if (i != 1 ? i != 2 || n() >= 0 : n() <= 0) {
                    if (o <= 0.5f) {
                        this.k.b();
                        log log = this.k;
                        log.b();
                        View view = log.a;
                        int i2 = log.c;
                        int i3 = log.b;
                        lok lok = log.d;
                        lok.a();
                        this.k = new log(view, i2, i3, lok, log.e);
                        this.k.a(1.0f - o, new lqi(this, true, null));
                    }
                }
                i = lol.a(this.k.c);
                if (i != this.d.f()) {
                    if (i == 2 || i == 1 || i == 3) {
                        acxf acvs;
                        acvx acvx = this.f;
                        if (i == 2) {
                            acvs = new acvs(acwc.WATCH_MINIMIZE_BUTTON);
                        } else {
                            acvs = new acvs(acwc.MINI_PLAYER_EXPAND_BUTTON);
                        }
                        acvx.a(65, acvs, null);
                    } else if (i == 0) {
                        this.f.a(3, new acvs(acwc.MINI_PLAYER_DISMISSAL_BUTTON), null);
                    }
                }
                this.k.a(o, new lqi(this, true, null));
            }
            this.A = 0;
        }
    }

    private final boolean m() {
        return this.d.b() || this.d.g();
    }

    private final int n() {
        log log = this.k;
        if (log == null) {
            return 0;
        }
        if (this.A != 2) {
            return log.a(1);
        }
        int a = log.a(2);
        if (h()) {
            a = -a;
        }
        return a;
    }

    private final float o() {
        int n = n();
        int min = Math.min(0, n);
        int max = Math.max(0, n);
        int i = this.A;
        if (i == 1) {
            max = th.a(this.C, min, max);
            this.C = max;
        } else if (i != 2) {
            return 0.0f;
        } else {
            max = th.a(this.B, min, max);
            this.B = max;
        }
        return ((float) max) / ((float) n);
    }

    public final FlexyBehavior a() {
        lip f = f();
        return f != null ? f.a : null;
    }

    public final lij b() {
        return f();
    }

    public final lip f() {
        lla b = lkv.b(this.d.a(1));
        if (b instanceof lip) {
            return (lip) b;
        }
        return null;
    }

    public final lqj g() {
        return this.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARNING: Missing block: B:11:0x002a, code skipped:
            if (r2 != 3) goto L_0x00f0;
     */
    /* JADX WARNING: Missing block: B:61:0x00e9, code skipped:
            if (r4 == 0) goto L_0x00f0;
     */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r0 = r8.getX();
        r0 = (int) r0;
        r1 = r8.getY();
        r1 = (int) r1;
        r2 = r7.k();
        r3 = 1;
        if (r2 != 0) goto L_0x00f6;
    L_0x0011:
        r2 = r7.m();
        r4 = 0;
        if (r2 == 0) goto L_0x00f5;
    L_0x0018:
        r2 = r7.isEnabled();
        if (r2 == 0) goto L_0x00f5;
    L_0x001e:
        r2 = r8.getActionMasked();
        if (r2 == 0) goto L_0x008d;
    L_0x0024:
        if (r2 == r3) goto L_0x0084;
    L_0x0026:
        r0 = 3;
        r1 = 2;
        if (r2 == r1) goto L_0x002e;
    L_0x002a:
        if (r2 == r0) goto L_0x0084;
    L_0x002c:
        goto L_0x00f0;
    L_0x002e:
        r2 = r7.l();
        if (r2 != 0) goto L_0x0083;
    L_0x0034:
        r2 = r7.d;
        r2 = r2.b();
        if (r2 == 0) goto L_0x0043;
    L_0x003c:
        r2 = r7.l;
        r2 = r2.d();
        goto L_0x0044;
    L_0x0043:
        r2 = 1;
    L_0x0044:
        r5 = r7.y;
        r5 = r5.b(r8, r2);
        r6 = r7.z;
        if (r6 == 0) goto L_0x0058;
    L_0x004e:
        r6 = 4;
        if (r5 == r6) goto L_0x0058;
    L_0x0051:
        r8 = r7.y;
        r8.a();
        goto L_0x00f0;
    L_0x0058:
        r6 = r7.c(r5);
        if (r6 == 0) goto L_0x00f0;
    L_0x005e:
        r6 = r7.y;
        r8 = r6.a(r8, r2);
        if (r8 == 0) goto L_0x00f0;
    L_0x0066:
        r8 = r7.k;
        if (r8 != 0) goto L_0x00f0;
    L_0x006a:
        if (r5 == r3) goto L_0x0071;
    L_0x006c:
        if (r5 != r0) goto L_0x006f;
    L_0x006e:
        goto L_0x0071;
    L_0x006f:
        r8 = 0;
        goto L_0x0072;
    L_0x0071:
        r8 = 1;
    L_0x0072:
        if (r8 != 0) goto L_0x0075;
    L_0x0074:
        r1 = 1;
    L_0x0075:
        r7.A = r1;
        r7.B = r4;
        r7.C = r4;
        r7.b(r5);
        r7.b(r3);
        goto L_0x00f0;
    L_0x0083:
        return r3;
    L_0x0084:
        r7.d(r4);
        r8 = r7.y;
        r8.a();
        goto L_0x00f0;
    L_0x008d:
        r2 = r7.d;
        r2 = r2.a();
        r5 = r7.d;
        r5 = r5.h();
        if (r5 == 0) goto L_0x00bf;
    L_0x009b:
        r2 = r2.j();
        r2 = r2.contains(r0, r1);
        if (r2 == 0) goto L_0x00bf;
    L_0x00a5:
        r2 = r7.f();
        if (r2 == 0) goto L_0x00b4;
    L_0x00ab:
        r2 = r2.a;
        r2 = r2.a;
        if (r2 != 0) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00b4;
    L_0x00b2:
        r2 = 1;
        goto L_0x00b5;
    L_0x00b4:
        r2 = 0;
    L_0x00b5:
        r5 = r7.D;
        if (r5 != 0) goto L_0x00ba;
    L_0x00b9:
        goto L_0x00bf;
    L_0x00ba:
        if (r2 == 0) goto L_0x00bd;
    L_0x00bc:
        goto L_0x00bf;
    L_0x00bd:
        r2 = 1;
        goto L_0x00c0;
    L_0x00bf:
        r2 = 0;
    L_0x00c0:
        r7.z = r2;
        if (r2 == 0) goto L_0x00c5;
    L_0x00c4:
        goto L_0x00eb;
    L_0x00c5:
        r2 = r7.d;
        r2 = r2.a();
        r5 = r2.i();
        r5 = r5.contains(r0, r1);
        r6 = r7.d;
        r6 = r6.j();
        if (r6 == 0) goto L_0x00e7;
    L_0x00db:
        r2 = r2.k();
        r0 = r2.contains(r0, r1);
        if (r0 != 0) goto L_0x00e6;
    L_0x00e5:
        goto L_0x00e7;
    L_0x00e6:
        r4 = 1;
    L_0x00e7:
        if (r5 != 0) goto L_0x00eb;
    L_0x00e9:
        if (r4 == 0) goto L_0x00f0;
    L_0x00eb:
        r0 = r7.y;
        r0.b(r8);
    L_0x00f0:
        r8 = r7.l();
        return r8;
    L_0x00f5:
        return r4;
    L_0x00f6:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = r5.k();
        r1 = 1;
        if (r0 == 0) goto L_0x000d;
    L_0x0007:
        r6 = r5.y;
        r6.a();
        return r1;
    L_0x000d:
        r0 = r5.l();
        r2 = 0;
        if (r0 == 0) goto L_0x00c5;
    L_0x0014:
        r0 = r5.y;
        r0.a(r6);
        r0 = r6.getActionMasked();
        if (r0 == 0) goto L_0x00bf;
    L_0x001f:
        r3 = 2;
        if (r0 == r1) goto L_0x00a3;
    L_0x0022:
        r4 = 3;
        if (r0 == r3) goto L_0x0033;
    L_0x0025:
        if (r0 == r4) goto L_0x0029;
    L_0x0027:
        goto L_0x00c4;
    L_0x0029:
        r5.d(r2);
        r6 = r5.y;
        r6.a();
        goto L_0x00c4;
    L_0x0033:
        r0 = r5.A;
        if (r0 != r1) goto L_0x003f;
    L_0x0037:
        r0 = r5.y;
        r6 = r0.d(r6);
    L_0x003d:
        r2 = -r6;
        goto L_0x0049;
    L_0x003f:
        if (r0 == r3) goto L_0x0042;
    L_0x0041:
        goto L_0x0049;
    L_0x0042:
        r0 = r5.y;
        r6 = r0.c(r6);
        goto L_0x003d;
    L_0x0049:
        r6 = r5.k();
        if (r6 != 0) goto L_0x0071;
    L_0x004f:
        r6 = r5.A;
        if (r6 != r1) goto L_0x0059;
    L_0x0053:
        r6 = r5.C;
        r6 = r6 + r2;
        r5.C = r6;
        goto L_0x0066;
    L_0x0059:
        if (r6 != r3) goto L_0x0066;
    L_0x005b:
        r6 = r5.B;
        r6 = r6 + r2;
        r5.B = r6;
        if (r6 >= 0) goto L_0x0063;
    L_0x0062:
        r4 = 1;
    L_0x0063:
        r5.b(r4);
    L_0x0066:
        r6 = r5.k;
        if (r6 == 0) goto L_0x0071;
    L_0x006a:
        r0 = r5.o();
        r6.a(r0);
    L_0x0071:
        r6 = r5.k;
        if (r6 == 0) goto L_0x00c4;
    L_0x0075:
        r6 = r5.o();
        r0 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r6 < 0) goto L_0x00c4;
    L_0x007f:
        r6 = r5.k;
        r0 = r6.b;
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r0 != r2) goto L_0x008c;
    L_0x0087:
        r0 = r6.c;
        if (r0 != r3) goto L_0x00c4;
    L_0x008b:
        goto L_0x0092;
    L_0x008c:
        if (r0 != r3) goto L_0x00c4;
    L_0x008e:
        r0 = r6.c;
        if (r0 != r2) goto L_0x00c4;
    L_0x0092:
        r6 = r6.c;
        if (r6 != r2) goto L_0x009a;
    L_0x0096:
        r5.d(r1);
        goto L_0x009d;
    L_0x009a:
        r5.d(r3);
    L_0x009d:
        r6 = r5.y;
        r6.a();
        goto L_0x00c4;
    L_0x00a3:
        r0 = r5.A;
        if (r0 != r1) goto L_0x00ae;
    L_0x00a7:
        r0 = r5.y;
        r2 = r0.c(r6, r1);
        goto L_0x00b6;
    L_0x00ae:
        if (r0 != r3) goto L_0x00b6;
    L_0x00b0:
        r0 = r5.y;
        r2 = r0.c(r6, r3);
    L_0x00b6:
        r5.d(r2);
        r6 = r5.y;
        r6.a();
        goto L_0x00c4;
    L_0x00bf:
        r0 = r5.y;
        r0.b(r6);
    L_0x00c4:
        return r1;
    L_0x00c5:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.y.a();
    }

    private final void b(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void a(boolean z) {
        if (this.G != z) {
            this.G = z;
            invalidate();
        }
    }

    public final boolean h() {
        return abe.g(this) == 1;
    }
}
