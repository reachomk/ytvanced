package defpackage;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.HorizontalScrollView;

/* renamed from: czk */
final class czk extends HorizontalScrollView {
    public final cpq a;
    public int b;
    public int c;

    public czk(Context context) {
        super(context);
        this.a = new cpq(context);
        addView(this.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        this.a.measure(MeasureSpec.makeMeasureSpec(this.b, 1073741824), MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
    }
}
