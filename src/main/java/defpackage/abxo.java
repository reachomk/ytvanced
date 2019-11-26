package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: abxo */
public final class abxo {
    private final SparseArray a = new SparseArray();
    private ValueAnimator b;
    private ValueAnimator c;
    private int d = 0;
    private int e = 0;

    public final void a(TextView textView, int i) {
        if (i != textView.getCurrentTextColor()) {
            int id = textView.getId();
            ValueAnimator valueAnimator = (ValueAnimator) this.a.get(id);
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.a.remove(id);
            }
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(i)});
            this.a.put(id, ofObject);
            ofObject.setDuration(250);
            ofObject.addUpdateListener(new abxr(textView));
            ofObject.start();
        }
    }

    public static void a(Drawable drawable, ColorFilter colorFilter, int i) {
        if (drawable != null) {
            if (colorFilter != null) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{colorFilter, Integer.valueOf(i)});
                ofObject.setDuration(250);
                ofObject.addUpdateListener(new abxq(drawable));
                return;
            }
            drawable.setColorFilter(i, Mode.SRC_IN);
        }
    }

    public final void a(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, int i, int i2) {
        if (i != this.d) {
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            Object[] objArr = new Object[2];
            int i3 = this.d;
            if (i3 == 0) {
                i3 = i;
            }
            objArr[0] = Integer.valueOf(i3);
            objArr[1] = Integer.valueOf(i);
            this.b = ValueAnimator.ofObject(argbEvaluator, objArr);
            this.b.setDuration(250);
            this.b.addUpdateListener(new abxs(gradientDrawable));
            AnimatorSet animatorSet = new AnimatorSet();
            argbEvaluator = new ArgbEvaluator();
            Object[] objArr2 = new Object[2];
            int i4 = this.e;
            if (i4 == 0) {
                i4 = i2;
            }
            objArr2[0] = Integer.valueOf(i4);
            objArr2[1] = Integer.valueOf(i2);
            this.c = ValueAnimator.ofObject(argbEvaluator, objArr2);
            this.c.setDuration(250);
            this.c.addUpdateListener(new abxv(gradientDrawable2, gradientDrawable3));
            animatorSet.play(this.b).with(this.c);
            this.e = i2;
            animatorSet.start();
            this.d = i;
        }
    }
}
