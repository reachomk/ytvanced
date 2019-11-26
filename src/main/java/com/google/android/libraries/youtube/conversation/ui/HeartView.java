package com.google.android.libraries.youtube.conversation.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.youtube.R;
import defpackage.acr;
import defpackage.amqw;
import defpackage.amrn;
import defpackage.amro;
import defpackage.rz;
import defpackage.xwe;
import defpackage.zbf;
import defpackage.zbg;
import defpackage.zbh;
import defpackage.zbi;
import defpackage.zbj;
import defpackage.zbl;
import defpackage.zbo;
import defpackage.zbq;
import defpackage.zbr;
import defpackage.zbs;

public class HeartView extends View {
    public final int a;
    public final int b;
    public final amro c;
    public final amro d;
    public final amro e;
    public final amro f;
    public final zbr g;
    public final zbr h;
    public boolean i;
    private final zbq j = new zbq(new zbf(this));

    public HeartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = xwe.a(context, R.attr.ytStaticBrandRed, 0);
        this.b = xwe.a(context, R.attr.ytIconInactive, 0);
        Drawable drawable = (Drawable) amqw.a(rz.a(context.getResources(), R.drawable.quantum_ic_favorite_white_24, context.getTheme()));
        this.g = new zbr(this, drawable, this.b);
        this.h = new zbr(this, drawable, 0);
        this.c = amrn.a(new zbh(this));
        this.d = amrn.a(new zbg(this));
        this.e = amrn.a(new zbj(this));
        this.f = amrn.a(new zbi(this));
        this.i = true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        float f = !this.i ? 1.0f : 1.64f;
        setMeasuredDimension((int) (((float) Math.max(this.g.a(), this.h.a())) * f), (int) (f * ((float) Math.max(this.g.b(), this.h.b()))));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i3 -= i;
        i4 -= i2;
        int a = this.g.a();
        i2 = getPaddingLeft() + ((i3 - a) / 2);
        int paddingBottom = i4 - getPaddingBottom();
        this.g.a(i2, paddingBottom - this.g.b(), a + i2, paddingBottom);
        a = this.h.a();
        i2 = getPaddingLeft() + ((i3 - a) / 2);
        i4 -= getPaddingBottom();
        this.h.a(i2, i4 - this.h.b(), a + i2, i4);
        setPivotX((float) (getWidth() / 2));
        setPivotY((float) i4);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.g.a(canvas);
        this.h.a(canvas);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((Animator) this.c.get()).cancel();
        ((Animator) this.d.get()).cancel();
        ((Animator) this.e.get()).cancel();
        ((Animator) this.f.get()).cancel();
        this.g.c();
        this.h.c();
    }

    public final void a(boolean z, boolean z2) {
        zbq zbq;
        zbs zbs;
        if (z2) {
            zbq = this.j;
            if (z) {
                zbs = zbs.HEART_CLICK;
            } else {
                zbs = zbs.UNHEART_CLICK;
            }
            zbq.a(zbs);
            return;
        }
        zbq = this.j;
        if (z) {
            zbs = zbs.HEART_UPDATE;
        } else {
            zbs = zbs.UNHEART_UPDATE;
        }
        zbq.a(zbs);
    }

    public final void a() {
        this.j.a(zbs.ANIMATION_FINISHED);
    }

    public final Animator a(float f, float f2, long j, float f3, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        r2 = new Animator[2];
        r2[0] = ObjectAnimator.ofFloat(this, "scaleX", new float[]{f, f2});
        r2[1] = ObjectAnimator.ofFloat(this, "scaleY", new float[]{f, f2});
        animatorSet.playTogether(r2);
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(a(f3, f4));
        return animatorSet;
    }

    public final Animator b(float f, float f2, long j, float f3, float f4) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rotation", new float[]{f, f2});
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(a(f3, f4));
        return ofFloat;
    }

    public static Animator a(zbr zbr, float f, float f2, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zbr, "scale", new float[]{f, f2});
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(a(1.0f, 0.05f));
        return ofFloat;
    }

    public static Animator b(zbr zbr, float f, float f2, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zbr, "alpha", new float[]{f, f2});
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(a(1.0f, 0.05f));
        return ofFloat;
    }

    public static Animator a(zbr zbr, int i, int i2, long j) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new zbo(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ofObject.setDuration(j);
        ofObject.setInterpolator(a(1.0f, 0.05f));
        ofObject.addUpdateListener(new zbl(zbr));
        return ofObject;
    }

    private static Interpolator a(float f, float f2) {
        return acr.a(f2, 0.0f, 1.0f - f, 1.0f);
    }
}
