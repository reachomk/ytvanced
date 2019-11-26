package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

/* renamed from: aiuh */
public final class aiuh extends LayoutParams {
    public final boolean a;

    public aiuh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahfr.a);
        this.a = obtainStyledAttributes.getBoolean(ahfr.b, true);
        obtainStyledAttributes.recycle();
    }

    public aiuh(int i, int i2, boolean z) {
        super(i, i2);
        this.a = z;
    }

    public aiuh(LayoutParams layoutParams) {
        super(layoutParams);
        this.a = true;
    }
}
