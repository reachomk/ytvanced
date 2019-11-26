package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: ajw */
public abstract class ajw extends ViewGroup {
    public final ajv a;
    public final Context b;
    public ActionMenuView c;
    public akf d;
    public int e;
    public abr f;
    private boolean g;
    private boolean h;

    ajw(Context context) {
        this(context, null);
    }

    public static int a(int i, int i2, boolean z) {
        return !z ? i + i2 : i - i2;
    }

    public void a(int i) {
        throw null;
    }

    ajw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ajw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ajv(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, afy.a, R.attr.actionBarStyle, 0);
        a(obtainStyledAttributes.getLayoutDimension(afy.l, 0));
        obtainStyledAttributes.recycle();
        akf akf = this.d;
        if (akf != null) {
            akf.l = ahs.a(akf.b).a();
            aiw aiw = akf.c;
            if (aiw != null) {
                aiw.b(true);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            abr abr = this.f;
            if (abr != null) {
                abr.a();
            }
            super.setVisibility(i);
        }
    }

    public static int a(View view, int i, int i2) {
        view.measure(MeasureSpec.makeMeasureSpec(i, aocf.UNSET_ENUM_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        i2 += (i3 - measuredHeight) / 2;
        if (z) {
            view.layout(i - measuredWidth, i2, i, measuredHeight + i2);
            return -measuredWidth;
        }
        view.layout(i, i2, i + measuredWidth, measuredHeight + i2);
        return measuredWidth;
    }
}
