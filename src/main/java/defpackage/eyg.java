package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: eyg */
public final class eyg extends Drawable implements AnimatorListener, AnimatorUpdateListener, Callback {
    private static final TimeInterpolator e = new eyv();
    public final ValueAnimator a = ValueAnimator.ofInt(new int[0]);
    public eyi b;
    public eyi c;
    public eyi d;
    private final HashSet f;

    public eyg(eyi eyi, int i) {
        this.a.setIntValues(new int[]{255, 0});
        this.a.setDuration((long) i);
        this.a.setStartDelay(1);
        this.a.setInterpolator(e);
        this.a.addUpdateListener(this);
        this.a.addListener(this);
        this.f = new HashSet();
        xak.a();
        if (this.a.isStarted()) {
            this.a.end();
        }
        c(null);
        b(eyi);
        a(null);
        a();
        a();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    private final eyi d() {
        eyi eyi = this.d;
        return eyi == null ? this.b : eyi;
    }

    public final void draw(Canvas canvas) {
        this.b.a.draw(canvas);
        eyi eyi = this.c;
        if (eyi != null) {
            eyi.a.draw(canvas);
        }
    }

    public final void setAlpha(int i) {
        throw new UnsupportedOperationException("Set alpha on the inner drawables instead.");
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("Set color filter on the inner drawables instead.");
    }

    public final int getIntrinsicWidth() {
        return d().a.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        return d().a.getIntrinsicHeight();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        this.b.a.setBounds(rect);
        eyi eyi = this.c;
        if (eyi != null) {
            eyi.a.setBounds(rect);
        }
        eyi = this.d;
        if (eyi != null) {
            eyi.a.setBounds(rect);
        }
    }

    public final void getOutline(Outline outline) {
        outline.setRect(getBounds());
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        eyi eyi = this.c;
        if (eyi != null) {
            eyi.a.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            invalidateSelf();
        }
        eyi = d();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        eyi eyi2 = this.c;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            eyf eyf = (eyf) it.next();
            if (eyf != null) {
                eyf.a(animatedFraction, eyi2, eyi);
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        c(this.b);
        b(this.d);
        a(null);
        boolean z = true;
        amqw.b(this.c != null, (Object) "previousDrawableHolder must not be null in static state.");
        amqw.b(this.b != null, (Object) "currentDrawableHolder must not be null in static state.");
        if (this.d != null) {
            z = false;
        }
        amqw.b(z, (Object) "nextDrawableHolder must be null in static state.");
        amqw.b(f());
        boolean c = c();
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder stringBuilder = new StringBuilder(((valueOf.length() + 56) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("All drawables must be unique. Previous ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", current ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", next ");
        stringBuilder.append(valueOf3);
        amqw.b(c, stringBuilder.toString());
    }

    public final void onAnimationEnd(Animator animator) {
        c(null);
        a(null);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            eyg.b((eyf) it.next());
        }
        this.f.clear();
        a();
    }

    public final void onAnimationCancel(Animator animator) {
        b(this.c);
        c(null);
        a(null);
        a();
    }

    public final void onAnimationRepeat(Animator animator) {
        throw new UnsupportedOperationException("crossFadeAnimator should never repeat.");
    }

    public final boolean setState(int[] iArr) {
        if (!e() || !this.b.a.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    private final void b(eyi eyi) {
        this.b = (eyi) amqw.a((Object) eyi);
        eyi.a.setCallback(this);
        eyi.a.setBounds(getBounds());
        eyi.a.setAlpha(255);
    }

    private final void c(eyi eyi) {
        this.c = eyi;
        if (eyi != null) {
            eyi.a.setCallback(this);
            eyi.a.setBounds(getBounds());
            eyi.a.setAlpha(255);
        }
    }

    public final void a(eyi eyi) {
        this.d = eyi;
        if (eyi != null) {
            eyi.a.setCallback(this);
            eyi.a.setBounds(getBounds());
            eyi.a.setAlpha(255);
        }
    }

    public final void a(eyi eyi, eyf eyf) {
        String.valueOf(eyi).length();
        if (e()) {
            eyg.b(eyf);
            a(null);
        } else if (b()) {
            this.a.cancel();
            eyg.b(eyf);
        } else if (f()) {
            a(eyf);
        } else {
            throw new RuntimeException("In a bad state.");
        }
    }

    public final void a(eyf eyf) {
        this.f.add(eyf);
    }

    private static void b(eyf eyf) {
        if (eyf != null) {
            eyf.a();
        }
    }

    public final void a() {
        boolean z = true;
        amqw.b(this.c == null, (Object) "previousDrawableHolder must be null in static state.");
        amqw.b(this.b != null, (Object) "currentDrawableHolder must not be null in static state.");
        if (this.d != null) {
            z = false;
        }
        amqw.b(z, (Object) "nextDrawableHolder must be null in static state.");
        amqw.b(e());
        boolean c = c();
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder stringBuilder = new StringBuilder(((valueOf.length() + 56) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("All drawables must be unique. Previous ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", current ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", next ");
        stringBuilder.append(valueOf3);
        amqw.b(c, stringBuilder.toString());
    }

    private final boolean e() {
        return this.c == null && this.b != null && this.d == null;
    }

    public final boolean b() {
        return (this.c != null || this.b == null || this.d == null) ? false : true;
    }

    private final boolean f() {
        return (this.c == null || this.b == null || this.d != null) ? false : true;
    }

    public final boolean c() {
        eyi eyi = this.c;
        Drawable drawable = null;
        Drawable drawable2 = eyi != null ? eyi.a : null;
        eyi eyi2 = this.b;
        Drawable drawable3 = eyi2 != null ? eyi2.a : null;
        eyi eyi3 = this.d;
        if (eyi3 != null) {
            drawable = eyi3.a;
        }
        int i = 0;
        if (!((drawable2 == null || drawable3 == null || drawable2 != drawable3) && ((drawable2 == null || drawable == null || drawable2 != drawable) && (drawable3 == null || drawable == null || drawable3 != drawable)))) {
            i = 1;
        }
        return i ^ 1;
    }

    static {
        ColorDrawable colorDrawable = new ColorDrawable(0);
    }
}
