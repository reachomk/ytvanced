package defpackage;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/* renamed from: zis */
public final class zis extends SimpleOnScaleGestureListener {
    private final zip a;

    public zis(zip zip) {
        this.a = (zip) amqw.a((Object) zip);
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.a.c(scaleGestureDetector.getScaleFactor());
        return true;
    }
}
