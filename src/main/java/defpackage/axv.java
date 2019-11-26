package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: axv */
public final class axv {
    public int a;

    public axv(View view, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, awr.a, i, i2);
            this.a = obtainStyledAttributes.getInteger(awr.b, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }
}
