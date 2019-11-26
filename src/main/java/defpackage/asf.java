package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: asf */
public final class asf extends adv {
    public int b;

    public asf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public asf() {
        super(-2, -2);
        this.b = 0;
        this.a = 8388627;
    }

    public asf(asf asf) {
        super((adv) asf);
        this.b = 0;
        this.b = asf.b;
    }

    public asf(adv adv) {
        super(adv);
        this.b = 0;
    }

    public asf(MarginLayoutParams marginLayoutParams) {
        super((LayoutParams) marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public asf(LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }
}
