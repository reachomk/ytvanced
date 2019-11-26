package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: bgq */
final class bgq {
    static ObjectAnimator a(Object obj, Property property, Path path) {
        if (VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(obj, property, null, path);
        }
        return ObjectAnimator.ofFloat(obj, new bgs(property, path), new float[]{0.0f, 1.0f});
    }
}
