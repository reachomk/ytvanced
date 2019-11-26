package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.afy;
import defpackage.ajx;
import defpackage.aocf;

public class ActionBarContainer extends FrameLayout {
    public View a;
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public boolean f;
    private boolean g;
    private View h;
    private View i;
    private int j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public final ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        abe.a((View) this, new ajx(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, afy.a);
        this.b = obtainStyledAttributes.getDrawable(afy.d);
        this.c = obtainStyledAttributes.getDrawable(afy.f);
        this.j = obtainStyledAttributes.getDimensionPixelSize(afy.l, -1);
        if (getId() == R.id.split_action_bar) {
            this.e = true;
            this.d = obtainStyledAttributes.getDrawable(afy.e);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (this.e ? this.d == null : this.b == null && this.c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.h = findViewById(R.id.action_bar);
        this.i = findViewById(R.id.action_context_bar);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        drawable = this.c;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.b && !this.e) || ((drawable == this.c && this.f) || ((drawable == this.d && this.e) || super.verifyDrawable(drawable)));
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful()) {
            this.b.setState(getDrawableState());
        }
        drawable = this.c;
        if (drawable != null && drawable.isStateful()) {
            this.c.setState(getDrawableState());
        }
        drawable = this.d;
        if (drawable != null && drawable.isStateful()) {
            this.d.setState(getDrawableState());
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        drawable = this.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void a(boolean z) {
        this.g = z;
        setDescendantFocusability(!z ? 262144 : 393216);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g || super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final void a() {
        this.a = null;
    }

    public final ActionMode startActionModeForChild(View view, Callback callback, int i) {
        return i == 0 ? null : super.startActionModeForChild(view, callback, i);
    }

    public final void onMeasure(int i, int i2) {
        if (this.h == null && MeasureSpec.getMode(i2) == aocf.UNSET_ENUM_VALUE) {
            int i3 = this.j;
            if (i3 >= 0) {
                i2 = MeasureSpec.makeMeasureSpec(Math.min(i3, MeasureSpec.getSize(i2)), aocf.UNSET_ENUM_VALUE);
            }
        }
        super.onMeasure(i, i2);
        if (this.h != null) {
            MeasureSpec.getMode(i2);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.e) {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                return;
            }
        }
        Object obj = 1;
        if (this.b == null) {
            obj = null;
        } else if (this.h.getVisibility() == 0) {
            this.b.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
        } else {
            View view = this.i;
            if (view == null || view.getVisibility() != 0) {
                this.b.setBounds(0, 0, 0, 0);
            } else {
                this.b.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            }
        }
        this.f = false;
        if (obj == null) {
            return;
        }
        invalidate();
    }
}
