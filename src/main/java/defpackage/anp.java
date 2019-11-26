package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: anp */
public class anp extends MarginLayoutParams {
    public float g;
    public int h;

    public anp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, afy.aI);
        this.g = obtainStyledAttributes.getFloat(afy.aK, 0.0f);
        this.h = obtainStyledAttributes.getInt(afy.aJ, -1);
        obtainStyledAttributes.recycle();
    }

    public anp(int i) {
        super(i, -2);
        this.h = -1;
        this.g = 0.0f;
    }

    public anp(LayoutParams layoutParams) {
        super(layoutParams);
        this.h = -1;
    }
}
