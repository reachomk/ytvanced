package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import androidx.viewpager.widget.ViewPager;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: jng */
public final class jng extends aqd implements AnimatorUpdateListener, jnf {
    private final ValueAnimator a = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    private final Set b;
    private final xoj c;
    private final int d;
    private boolean e;

    public jng(xoj xoj, int i) {
        this.c = (xoj) amqw.a((Object) xoj);
        this.d = i;
        this.a.setDuration(250);
        this.a.setInterpolator(new LinearInterpolator());
        a(1.0f);
        this.a.addUpdateListener(this);
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    public final void a() {
        if (this.a.isRunning()) {
            this.a.reverse();
        } else if (b() >= 0.5f) {
            c(true);
        } else {
            b(true);
        }
    }

    public final void b(boolean z) {
        if (z) {
            this.a.start();
        } else {
            a(1.0f);
        }
    }

    public final void c(boolean z) {
        if (z) {
            this.a.reverse();
        } else {
            a(0.0f);
        }
    }

    public final float b() {
        return this.a.getAnimatedFraction();
    }

    public final void a(jni jni) {
        this.b.add(jni);
    }

    public final void b(jni jni) {
        this.b.remove(jni);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = this.a.getAnimatedFraction();
        for (jni a : this.b) {
            a.a(animatedFraction);
        }
    }

    private final void a(float f) {
        if (VERSION.SDK_INT >= 22) {
            this.a.setCurrentFraction(f);
        } else {
            this.a.setCurrentPlayTime((long) (f * 250.0f));
        }
    }

    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            this.c.e(motionEvent);
                        }
                    }
                } else if (this.e) {
                    return false;
                } else {
                    this.c.a(motionEvent);
                    if (this.c.a(motionEvent, 2)) {
                        return true;
                    }
                    if (this.c.a(motionEvent, 1)) {
                        this.e = true;
                        return false;
                    }
                }
            }
            this.c.a();
        } else {
            this.c.b(motionEvent);
            this.e = false;
            ViewParent parent = recyclerView.getParent();
            while (parent instanceof View) {
                View view = (View) parent;
                if (view instanceof ViewPager) {
                    ((ViewPager) view).requestDisallowInterceptTouchEvent(true);
                    break;
                }
                parent = view.getParent();
            }
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:4:0x000e, code skipped:
            if (r0 != 3) goto L_0x0030;
     */
    public final void a(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r0 = r7.getActionMasked();
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = 0;
        r3 = 2;
        r4 = 1;
        if (r0 == r4) goto L_0x0031;
    L_0x000b:
        if (r0 == r3) goto L_0x0011;
    L_0x000d:
        r5 = 3;
        if (r0 == r5) goto L_0x0031;
    L_0x0010:
        goto L_0x0030;
    L_0x0011:
        r0 = r6.c;
        r7 = r0.c(r7);
        if (r7 == 0) goto L_0x0030;
    L_0x0019:
        r0 = r6.b();
        r3 = r6.d;
        r3 = (float) r3;
        r0 = r0 * r3;
        r7 = (float) r7;
        r0 = r0 - r7;
        r0 = r0 / r3;
        r7 = java.lang.Math.min(r0, r1);
        r7 = java.lang.Math.max(r7, r2);
        r6.a(r7);
    L_0x0030:
        return;
    L_0x0031:
        r0 = r6.b();
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0064;
    L_0x0039:
        r0 = r6.b();
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 == 0) goto L_0x0064;
    L_0x0041:
        r0 = r6.c;
        r7 = r0.c(r7, r3);
        if (r7 == r4) goto L_0x0061;
    L_0x0049:
        if (r7 == r3) goto L_0x005d;
    L_0x004b:
        r7 = r6.b();
        r0 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        if (r7 <= 0) goto L_0x0059;
    L_0x0055:
        r6.b(r4);
        return;
    L_0x0059:
        r6.c(r4);
        return;
    L_0x005d:
        r6.c(r4);
        return;
    L_0x0061:
        r6.b(r4);
    L_0x0064:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jng.a(android.view.MotionEvent):void");
    }
}
