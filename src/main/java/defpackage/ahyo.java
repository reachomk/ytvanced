package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: ahyo */
public final class ahyo extends aiua {
    public ahyq a;
    public final Animation b;
    public final Animation c;
    public final AnimationListener d;
    public final ColorDrawable e = new ColorDrawable(Color.argb(140, 0, 0, 0));
    private final ValueAnimator f;
    private boolean g = false;
    private final long h;

    public ahyo(Context context) {
        super(context);
        this.h = (long) context.getResources().getInteger(17694720);
        this.b = new AlphaAnimation(0.0f, 1.0f);
        this.b.setDuration(this.h);
        this.c = new AlphaAnimation(1.0f, 0.0f);
        this.c.setDuration(this.h);
        this.d = new ahyp(this);
        this.c.setAnimationListener(this.d);
        this.f = new ValueAnimator();
        this.f.setDuration(this.h);
        this.f.setFloatValues(new float[]{0.0f, 1.0f});
        this.f.addUpdateListener(new ahyn(this));
        abe.h(this);
        c();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g;
    }

    public final void a(boolean z) {
        if (this.g != z) {
            this.g = z;
            abe.b((View) this, !z ? 0 : 4);
            if (z) {
                this.f.start();
                setForeground(this.e);
                return;
            }
            clearAnimation();
            animate().alpha(1.0f).setDuration(this.h).start();
            setForeground(null);
        }
    }

    public final void c() {
        removeAllViews();
        setVisibility(8);
    }

    public final LayoutParams b() {
        return new aiuh(-1, -1, false);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!super.onTouchEvent(motionEvent)) {
            ahyq ahyq = this.a;
            if (ahyq != null) {
                ahyq.a(motionEvent);
            }
        }
        return false;
    }

    public static void a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.clearAnimation();
            if (childAt instanceof ViewGroup) {
                ahyo.a((ViewGroup) childAt);
            }
        }
    }
}
