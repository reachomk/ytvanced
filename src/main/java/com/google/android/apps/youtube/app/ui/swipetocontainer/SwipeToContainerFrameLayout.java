package com.google.android.apps.youtube.app.ui.swipetocontainer;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.amqw;
import defpackage.apxn;
import defpackage.aulu;
import defpackage.bctz;
import defpackage.bdfu;
import defpackage.kyf;
import defpackage.kyj;
import defpackage.kyk;
import defpackage.kyl;
import defpackage.kyn;
import defpackage.kyq;
import defpackage.xoj;
import defpackage.xse;
import defpackage.zyw;

public class SwipeToContainerFrameLayout extends FrameLayout {
    public zyw a;
    public bctz b;
    public SharedPreferences c;
    public int d = 0;
    public int e;
    public xoj f;
    public kyn g;
    public boolean h;
    public boolean i;
    private int j;
    private final bdfu k = new bdfu();
    private View l;
    private View m;
    private ObjectAnimator n;
    private ObjectAnimator o;
    private kyq p;
    private float q;
    private float r;

    public SwipeToContainerFrameLayout(Context context) {
        super(context);
        a(context, null);
    }

    public SwipeToContainerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public SwipeToContainerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public SwipeToContainerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        ((kyj) xse.b(getContext())).a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kyf.a);
        boolean z = false;
        this.e = obtainStyledAttributes.getResourceId(kyf.b, 0);
        this.j = obtainStyledAttributes.getResourceId(kyf.c, 0);
        obtainStyledAttributes.recycle();
        amqw.a(this.e != 0, (Object) "containerViewId must be specified");
        amqw.a(this.j != 0, (Object) "watchWhileViewId must be specified");
        zyw zyw = this.a;
        if (!(zyw == null || this.c == null)) {
            apxn a = zyw.a();
            if (a != null) {
                aulu aulu = a.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                if (aulu.ar && this.c.getBoolean("enable_swipe_container", false)) {
                    z = true;
                }
            }
        }
        this.h = z;
        if (z) {
            this.f = new xoj(getContext());
            this.p = new kyq(this);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        this.k.a();
        if (this.h) {
            this.k.a(this.b.a(new kyk(this)));
        }
        super.onAttachedToWindow();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        this.k.a();
        super.onDetachedFromWindow();
    }

    public final Parcelable onSaveInstanceState() {
        kyl kyl = new kyl(super.onSaveInstanceState());
        e();
        kyl.a = c();
        return kyl;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof kyl) {
            kyl kyl = (kyl) parcelable;
            super.onRestoreInstanceState(kyl.getSuperState());
            if (kyl.a) {
                b();
                return;
            } else {
                a();
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            View view = this.m;
            if (!(view == null || this.l == null)) {
                i = this.d;
                if (i == 0) {
                    view.setTranslationX(0.0f);
                    this.l.setTranslationX((float) (-getRight()));
                } else if (i == 1) {
                    view.setTranslationX((float) getRight());
                    this.l.setTranslationX(0.0f);
                } else if (i == 2) {
                    a();
                }
            }
        }
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.h && view != null) {
            int id = view.getId();
            String str = "translationX";
            if (this.e == id) {
                this.l = view;
                this.l.setVisibility(8);
                this.o = ObjectAnimator.ofFloat(this.l, str, new float[]{0.0f});
            } else if (this.j == id) {
                this.m = view;
                this.n = ObjectAnimator.ofFloat(this.m, str, new float[]{0.0f});
            }
        }
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (this.h && view != null) {
            int id = view.getId();
            if (this.e == id) {
                this.l = null;
                this.o = null;
            } else if (this.j == id) {
                this.m = null;
                this.n = null;
            }
        }
    }

    /* JADX WARNING: Missing block: B:19:0x0031, code skipped:
            if (r6 != 4) goto L_0x007a;
     */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = r5.i();
        r1 = 0;
        if (r0 == 0) goto L_0x007a;
    L_0x0007:
        r0 = r5.f;
        if (r0 == 0) goto L_0x007a;
    L_0x000b:
        r0 = r6.getActionMasked();
        if (r0 == 0) goto L_0x0065;
    L_0x0011:
        r2 = 1;
        if (r0 == r2) goto L_0x005a;
    L_0x0014:
        r3 = 3;
        r4 = 2;
        if (r0 == r4) goto L_0x0024;
    L_0x0018:
        if (r0 == r3) goto L_0x005a;
    L_0x001a:
        r2 = 6;
        if (r0 == r2) goto L_0x001e;
    L_0x001d:
        goto L_0x007a;
    L_0x001e:
        r0 = r5.f;
        r0.e(r6);
        goto L_0x007a;
    L_0x0024:
        r0 = r5.f;
        r6 = r0.b(r6, r3);
        if (r6 == r2) goto L_0x004a;
    L_0x002c:
        if (r6 == r4) goto L_0x0044;
    L_0x002e:
        if (r6 == r3) goto L_0x0034;
    L_0x0030:
        r0 = 4;
        if (r6 == r0) goto L_0x0044;
    L_0x0033:
        goto L_0x007a;
    L_0x0034:
        r6 = r5.d;
        if (r6 != r2) goto L_0x003e;
    L_0x0038:
        r6 = r5.f;
        r6.a();
        goto L_0x007a;
    L_0x003e:
        if (r6 != r4) goto L_0x0043;
    L_0x0040:
        r5.e();
    L_0x0043:
        return r2;
    L_0x0044:
        r6 = r5.f;
        r6.a();
        goto L_0x007a;
    L_0x004a:
        r6 = r5.d;
        if (r6 != 0) goto L_0x0054;
    L_0x004e:
        r6 = r5.f;
        r6.a();
        goto L_0x007a;
    L_0x0054:
        if (r6 != r4) goto L_0x0059;
    L_0x0056:
        r5.e();
    L_0x0059:
        return r2;
    L_0x005a:
        r6 = r5.f;
        r6.a();
        r6 = 0;
        r5.q = r6;
        r5.r = r6;
        goto L_0x007a;
    L_0x0065:
        r0 = r5.f;
        r0.b(r6);
        r6 = r5.m;
        r6 = r6.getTranslationX();
        r5.q = r6;
        r6 = r5.l;
        r6 = r6.getTranslationX();
        r5.r = r6;
    L_0x007a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Missing block: B:8:0x001c, code skipped:
            if (r0 != 3) goto L_0x0099;
     */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r0 = r7.i();
        r1 = 0;
        if (r0 == 0) goto L_0x009a;
    L_0x0007:
        r0 = r7.f;
        if (r0 == 0) goto L_0x009a;
    L_0x000b:
        r0.a(r8);
        r7.d();
        r0 = r8.getActionMasked();
        r2 = 1;
        r3 = 2;
        if (r0 == r2) goto L_0x008b;
    L_0x0019:
        if (r0 == r3) goto L_0x0020;
    L_0x001b:
        r1 = 3;
        if (r0 == r1) goto L_0x008b;
    L_0x001e:
        goto L_0x0099;
    L_0x0020:
        r0 = r7.f;
        r4 = r0.g;
        r4 = r8.findPointerIndex(r4);
        if (r4 < 0) goto L_0x0032;
    L_0x002a:
        r8 = r8.getX(r4);
        r0 = r0.d;
        r0 = r0 - r8;
        r1 = (int) r0;
    L_0x0032:
        r8 = -r1;
        r8 = (float) r8;
        r0 = 0;
        r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r0 == 0) goto L_0x0099;
    L_0x0039:
        r0 = r7.m;
        r1 = r0.getLeft();
        r4 = r7.getRight();
        r5 = r7.q;
        r5 = r5 + r8;
        r1 = (float) r1;
        r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r6 <= 0) goto L_0x0052;
    L_0x004b:
        r1 = (float) r4;
        r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r4 < 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0052;
    L_0x0051:
        r1 = r5;
    L_0x0052:
        r0.setX(r1);
        r0 = r7.l;
        r1 = r7.getLeft();
        r4 = r7.getRight();
        r5 = r7.r;
        r5 = r5 + r8;
        r8 = (float) r1;
        r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r1 > 0) goto L_0x006d;
    L_0x0067:
        r8 = -r4;
        r8 = (float) r8;
        r8 = java.lang.Math.max(r8, r5);
    L_0x006d:
        r0.setX(r8);
        r8 = r7.g;
        if (r8 == 0) goto L_0x0099;
    L_0x0074:
        r0 = r7.e;
        r1 = r7.d;
        if (r1 != r3) goto L_0x0085;
    L_0x007a:
        r1 = r7.f();
        r3 = r7.getRight();
        r3 = (float) r3;
        r1 = r1 / r3;
        goto L_0x0087;
    L_0x0085:
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x0087:
        r8.a(r0, r1);
        goto L_0x0099;
    L_0x008b:
        r0 = r7.f;
        r8 = r0.c(r8, r3);
        r7.a(r8);
        r8 = r7.f;
        r8.a();
    L_0x0099:
        return r2;
    L_0x009a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        xoj xoj = this.f;
        if (xoj != null) {
            xoj.a();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    private final void d() {
        if (this.d != 2) {
            this.d = 2;
            if (!a(this.l)) {
                this.l.setVisibility(0);
                this.l.bringToFront();
                this.l.setX((float) (-getRight()));
                this.r = this.l.getTranslationX();
            }
            if (!a(this.m)) {
                this.m.setVisibility(0);
            }
        }
    }

    private final void e() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private final void a(int i) {
        float g;
        this.o.removeAllListeners();
        this.n.removeAllListeners();
        if (i == 1) {
            g = g();
        } else if (i == 2) {
            g = f();
        } else if (h()) {
            g = g();
        } else {
            g = f();
        }
        int round = Math.round(Math.min(Math.max(g / ((float) getRight()), 0.0f), 1.0f) * 400.0f);
        if (i == 2 || i == 1) {
            round = (int) (((float) round) * 0.8f);
        }
        long j = (long) round;
        if (i != 0) {
            if (i == 1) {
                b(j);
            } else if (i == 2) {
                a(j);
            }
        } else if (h()) {
            b(j);
        } else {
            a(j);
        }
    }

    public final boolean a() {
        if (this.d == 0) {
            return false;
        }
        d();
        a(2);
        return true;
    }

    private final void a(long j) {
        kyq kyq = this.p;
        kyq.a = this.l;
        kyq.b = 0;
        this.o.addListener(kyq);
        this.o.setDuration(j);
        this.o.setFloatValues(new float[]{(float) (-getRight())});
        this.n.setDuration(j);
        this.n.setFloatValues(new float[]{0.0f});
        this.o.start();
        this.n.start();
        kyn kyn = this.g;
        if (kyn != null) {
            kyn.a(this.e, 0.0f);
        }
    }

    public final boolean b() {
        if (c() || !i()) {
            return false;
        }
        d();
        a(1);
        return true;
    }

    private final void b(long j) {
        kyq kyq = this.p;
        kyq.a = this.m;
        kyq.b = 1;
        this.n.addListener(kyq);
        this.n.setDuration(j);
        this.n.setFloatValues(new float[]{(float) getRight()});
        this.o.setDuration(j);
        this.o.setFloatValues(new float[]{0.0f});
        this.o.start();
        this.n.start();
        kyn kyn = this.g;
        if (kyn != null) {
            kyn.a(this.e, 1.0f);
        }
    }

    public final boolean c() {
        int i = this.d;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = false;
            } else if (this.p.b == 1) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    private final float f() {
        return ((float) this.l.getMeasuredWidth()) - (((float) getLeft()) - this.l.getX());
    }

    private final float g() {
        return Math.abs(this.l.getX());
    }

    private final boolean h() {
        return this.d == 2 && g() < ((float) (getRight() / 2));
    }

    private static boolean a(View view) {
        return view != null && view.getVisibility() == 0;
    }

    private final boolean i() {
        if (!(this.l == null || this.m == null)) {
            kyn kyn = this.g;
            if (kyn != null && kyn.b()) {
                return true;
            }
        }
        return false;
    }
}
