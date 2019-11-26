package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import defpackage.aocf;
import defpackage.bed;

public class PreferenceImageView extends ImageView {
    private int a;
    private int b;

    public PreferenceImageView(Context context) {
        this(context, null);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bed.J, i, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(bed.L, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(bed.K, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    public final void setMaxWidth(int i) {
        this.a = i;
        super.setMaxWidth(i);
    }

    public final int getMaxWidth() {
        return this.a;
    }

    public final void setMaxHeight(int i) {
        this.b = i;
        super.setMaxHeight(i);
    }

    public final int getMaxHeight() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int size;
        int i3;
        int mode = MeasureSpec.getMode(i);
        if (mode == aocf.UNSET_ENUM_VALUE || mode == 0) {
            size = MeasureSpec.getSize(i);
            i3 = this.a;
            if (i3 != Integer.MAX_VALUE && (i3 < size || mode == 0)) {
                i = MeasureSpec.makeMeasureSpec(i3, aocf.UNSET_ENUM_VALUE);
            }
        }
        mode = MeasureSpec.getMode(i2);
        if (mode == aocf.UNSET_ENUM_VALUE || mode == 0) {
            size = MeasureSpec.getSize(i2);
            i3 = this.b;
            if (i3 != Integer.MAX_VALUE && (i3 < size || mode == 0)) {
                i2 = MeasureSpec.makeMeasureSpec(i3, aocf.UNSET_ENUM_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }
}
