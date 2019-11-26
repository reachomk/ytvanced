package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: whx */
public final class whx extends ImageView {
    public whx(Context context) {
        super(context);
        setScaleType(ScaleType.CENTER_CROP);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }
}
