package defpackage;

import android.animation.Animator.AnimatorListener;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: bju */
public final class bju extends Drawable implements Animatable, Callback {
    public bjj a;
    public final bpe b = new bpe();
    public float c = 1.0f;
    public boolean d = true;
    public final ArrayList e;
    public bmb f;
    public String g;
    public bmc h;
    public bjb i;
    public bkn j;
    public boolean k;
    public bnt l;
    public boolean m;
    public boolean n;
    private final Matrix o = new Matrix();
    private int p;

    public bju() {
        HashSet hashSet = new HashSet();
        this.e = new ArrayList();
        this.p = 255;
        this.n = false;
        this.b.addUpdateListener(new bjt(this));
    }

    public final int getOpacity() {
        return -3;
    }

    public final void a() {
        bjj bjj = this.a;
        bjj bjj2 = bjj;
        Rect rect = bjj.h;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        bmy bmy = r6;
        bmy bmy2 = new bmy();
        bnv bnv = r2;
        bnv bnv2 = new bnv(emptyList, bjj2, "__container", -1, 1, -1, null, emptyList2, bmy, 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false);
        bjj = this.a;
        this.l = new bnt(this, bnv, bjj.g, bjj);
    }

    public final void b() {
        bpe bpe = this.b;
        if (bpe.i) {
            bpe.cancel();
        }
        this.a = null;
        this.l = null;
        this.f = null;
        bpe bpe2 = this.b;
        bpe2.h = null;
        bpe2.f = -2.14748365E9f;
        bpe2.g = 2.14748365E9f;
        invalidateSelf();
    }

    public final void invalidateSelf() {
        if (!this.n) {
            this.n = true;
            Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public final void setAlpha(int i) {
        this.p = i;
    }

    public final int getAlpha() {
        return this.p;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        bpb.a("Use addColorFilter instead.");
    }

    public final void draw(Canvas canvas) {
        this.n = false;
        if (this.l != null) {
            int save;
            float f = this.c;
            float min = Math.min(((float) canvas.getWidth()) / ((float) this.a.h.width()), ((float) canvas.getHeight()) / ((float) this.a.h.height()));
            if (f > min) {
                f = this.c / min;
            } else {
                min = f;
                f = 1.0f;
            }
            if (f > 1.0f) {
                save = canvas.save();
                float width = ((float) this.a.h.width()) / 2.0f;
                float height = ((float) this.a.h.height()) / 2.0f;
                float f2 = width * min;
                float f3 = height * min;
                float f4 = this.c;
                canvas.translate((width * f4) - f2, (f4 * height) - f3);
                canvas.scale(f, f, f2, f3);
            } else {
                save = -1;
            }
            this.o.reset();
            this.o.preScale(min, min);
            this.l.a(canvas, this.o, this.p);
            bjd.a();
            if (save > 0) {
                canvas.restoreToCount(save);
            }
        }
    }

    public final void start() {
        c();
    }

    public final void stop() {
        this.e.clear();
        bpe bpe = this.b;
        bpe.g();
        bpe.a(bpe.c());
    }

    public final boolean isRunning() {
        return f();
    }

    public final void c() {
        if (this.l == null) {
            this.e.add(new bjx(this));
            return;
        }
        bpe bpe;
        if (this.d || e() == 0) {
            bpe = this.b;
            bpe.i = true;
            boolean c = bpe.c();
            for (AnimatorListener animatorListener : bpe.a) {
                if (VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(bpe, c);
                } else {
                    animatorListener.onAnimationStart(bpe);
                }
            }
            bpe.a((int) (!bpe.c() ? bpe.d() : bpe.e()));
            bpe.c = System.nanoTime();
            bpe.e = 0;
            bpe.f();
        }
        if (!this.d) {
            float d;
            bpe = this.b;
            if (bpe.b < 0.0f) {
                d = bpe.d();
            } else {
                d = bpe.e();
            }
            a((int) d);
        }
    }

    public final void d() {
        if (this.l == null) {
            this.e.add(new bka(this));
            return;
        }
        bpe bpe = this.b;
        bpe.i = true;
        bpe.f();
        bpe.c = System.nanoTime();
        if (bpe.c() && bpe.d == bpe.d()) {
            bpe.d = bpe.e();
            return;
        }
        if (!bpe.c() && bpe.d == bpe.e()) {
            bpe.d = bpe.d();
        }
    }

    public final void a(int i) {
        if (this.a == null) {
            this.e.add(new bjw(this, i));
        } else {
            this.b.a(i);
        }
    }

    public final void a(float f) {
        bjj bjj = this.a;
        if (bjj == null) {
            this.e.add(new bjv(this, f));
        } else {
            a((int) bpd.a(bjj.i, bjj.j, f));
        }
    }

    public final void b(int i) {
        this.b.setRepeatCount(i);
    }

    public final int e() {
        return this.b.getRepeatCount();
    }

    public final boolean f() {
        return this.b.i;
    }

    public final void b(float f) {
        this.c = f;
        h();
    }

    public final boolean g() {
        return this.a.e.c() > 0;
    }

    public final void h() {
        bjj bjj = this.a;
        if (bjj != null) {
            float f = this.c;
            setBounds(0, 0, (int) (((float) bjj.h.width()) * f), (int) (((float) this.a.h.height()) * f));
        }
    }

    public final float i() {
        return this.b.b();
    }

    public final int getIntrinsicWidth() {
        bjj bjj = this.a;
        if (bjj == null) {
            return -1;
        }
        return (int) (((float) bjj.h.width()) * this.c);
    }

    public final int getIntrinsicHeight() {
        bjj bjj = this.a;
        if (bjj == null) {
            return -1;
        }
        return (int) (((float) bjj.h.height()) * this.c);
    }

    /* JADX WARNING: Missing block: B:9:0x0034, code skipped:
            if ((r0.isEmpty() ^ 1) != 0) goto L_0x003a;
     */
    public final void a(defpackage.bmi r6, java.lang.Object r7, defpackage.bph r8) {
        /*
        r5 = this;
        r0 = r5.l;
        if (r0 == 0) goto L_0x0049;
    L_0x0004:
        r0 = r6.a;
        if (r0 != 0) goto L_0x0037;
    L_0x0008:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r5.l;
        r2 = new bmi;
        r3 = 0;
        r4 = new java.lang.String[r3];
        r2.<init>(r4);
        r1.a(r6, r3, r0, r2);
    L_0x001a:
        r6 = r0.size();
        if (r3 >= r6) goto L_0x002e;
    L_0x0020:
        r6 = r0.get(r3);
        r6 = (defpackage.bmi) r6;
        r6 = r6.a;
        r6.a(r7, r8);
        r3 = r3 + 1;
        goto L_0x001a;
    L_0x002e:
        r6 = r0.isEmpty();
        r6 = r6 ^ 1;
        if (r6 == 0) goto L_0x0048;
    L_0x0036:
        goto L_0x003a;
    L_0x0037:
        r0.a(r7, r8);
    L_0x003a:
        r5.invalidateSelf();
        r6 = defpackage.bkg.A;
        if (r7 != r6) goto L_0x0048;
    L_0x0041:
        r6 = r5.i();
        r5.a(r6);
    L_0x0048:
        return;
    L_0x0049:
        r0 = r5.e;
        r1 = new bjy;
        r1.<init>(r5, r6, r7, r8);
        r0.add(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bju.a(bmi, java.lang.Object, bph):void");
    }

    public final void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    static {
        bju.class.getSimpleName();
    }
}
