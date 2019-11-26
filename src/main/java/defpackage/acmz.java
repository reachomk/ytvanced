package defpackage;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/* renamed from: acmz */
final class acmz extends SimpleOnScaleGestureListener {
    private final /* synthetic */ acmw a;

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        acmx acmx = this.a.ad;
        if (acmx != null) {
            acmx.a(scaleGestureDetector.getScaleFactor());
        }
        return true;
    }

    /* synthetic */ acmz(acmw acmw) {
        this.a = acmw;
    }
}
