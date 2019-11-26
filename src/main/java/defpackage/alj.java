package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.google.android.youtube.R;

/* renamed from: alj */
public final class alj extends RatingBar {
    private final alh a = new alh(this);

    public alj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        this.a.a(attributeSet, (int) R.attr.ratingBarStyle);
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.a.a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
