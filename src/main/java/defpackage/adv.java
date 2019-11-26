package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: adv */
public class adv extends MarginLayoutParams {
    public int a;

    public adv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, afy.b);
        this.a = obtainStyledAttributes.getInt(afy.c, 0);
        obtainStyledAttributes.recycle();
    }

    public adv(int i, int i2) {
        super(i, i2);
        this.a = 0;
        this.a = 8388627;
    }

    public adv(adv adv) {
        super(adv);
        this.a = 0;
        this.a = adv.a;
    }

    public adv(LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
