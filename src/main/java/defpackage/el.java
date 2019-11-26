package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: el */
public final class el extends LayoutParams {
    public int a = 0;
    public float b = 0.5f;

    public el(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eo.n);
        this.a = obtainStyledAttributes.getInt(eo.o, 0);
        this.b = obtainStyledAttributes.getFloat(eo.p, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public el() {
        super(-1, -1);
    }

    public el(byte b) {
        super(-1, -2, 17);
    }

    public el(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
