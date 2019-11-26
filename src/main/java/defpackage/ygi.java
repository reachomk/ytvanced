package defpackage;

import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: ygi */
final /* synthetic */ class ygi implements Runnable {
    private final ygg a;
    private final View b;
    private final float c;

    ygi(ygg ygg, View view, float f) {
        this.a = ygg;
        this.b = view;
        this.c = f;
    }

    public final void run() {
        ygg ygg = this.a;
        View view = this.b;
        float f = this.c;
        int width = ygg.i.getWidth();
        view.measure(MeasureSpec.makeMeasureSpec(width, aocf.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(width, aocf.UNSET_ENUM_VALUE));
        view.setLayoutParams(new LayoutParams(ygg.i.getWidth(), (int) (((float) view.getMeasuredHeight()) * f)));
    }
}
