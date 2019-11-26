package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/* renamed from: beq */
public final class beq extends ImageView {
    public AnimationListener a;
    public int b;

    public beq(Context context) {
        Drawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.b = (int) (3.5f * f);
        if (beq.a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            abe.d((View) this, f * 4.0f);
        } else {
            Drawable shapeDrawable2 = new ShapeDrawable(new bep(this, this.b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.b, (float) i2, (float) i, 503316480);
            int i3 = this.b;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(-328966);
        abe.a((View) this, shapeDrawable);
    }

    private static boolean a() {
        return VERSION.SDK_INT >= 21;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!beq.a()) {
            i = getMeasuredWidth();
            i2 = this.b;
            int measuredHeight = getMeasuredHeight();
            int i3 = this.b;
            setMeasuredDimension(i + (i2 + i2), measuredHeight + (i3 + i3));
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
