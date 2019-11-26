package com.google.android.apps.youtube.app.extensions.reel.watch.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import defpackage.ajkj;

public class ReelPlayerView extends ajkj {
    public ReelPlayerView(Context context) {
        super(context);
    }

    public ReelPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.i;
        if (view != null) {
            i2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            double d = (double) measuredHeight;
            double d2 = (double) i2;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double measuredHeight2 = (double) view.getMeasuredHeight();
            double d4 = (double) measuredWidth;
            Double.isNaN(measuredHeight2);
            Double.isNaN(d4);
            measuredHeight2 /= d4;
            if (d3 > measuredHeight2) {
                Double.isNaN(d);
                i2 = (int) (d / measuredHeight2);
            } else if (d3 < measuredHeight2 && measuredHeight2 != 0.0d) {
                Double.isNaN(d2);
                measuredHeight = (int) (d2 * measuredHeight2);
            }
            view.measure(MeasureSpec.makeMeasureSpec(i2, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }
}
