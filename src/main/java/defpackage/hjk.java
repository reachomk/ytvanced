package defpackage;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: hjk */
final class hjk implements hjl {
    private hjk() {
    }

    public final Animator a(View view, int i, int i2, long j) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ofObject.setDuration(j);
        ofObject.addUpdateListener(new hjn(view));
        return ofObject;
    }

    /* synthetic */ hjk(byte b) {
    }
}
