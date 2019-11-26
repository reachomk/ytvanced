package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;

/* renamed from: jg */
public class jg extends FrameLayout {
    private static final OnTouchListener f = new jj();
    public jh a;
    public je b;
    public int c;
    public final float d;
    public final float e;

    public jg(Context context) {
        this(context, null);
    }

    public jg(Context context, AttributeSet attributeSet) {
        super(hd.b(context, attributeSet, 0, 0), attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jk.a);
        if (obtainStyledAttributes.hasValue(jk.f)) {
            abe.d((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(jk.f, 0));
        }
        this.c = obtainStyledAttributes.getInt(jk.d, 0);
        this.d = obtainStyledAttributes.getFloat(jk.e, 1.0f);
        this.e = obtainStyledAttributes.getFloat(jk.b, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f);
        setFocusable(true);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        setOnTouchListener(onClickListener == null ? f : null);
        super.setOnClickListener(onClickListener);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        abe.u(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        je jeVar = this.b;
        if (jeVar != null) {
            jeVar.a();
        }
    }
}
