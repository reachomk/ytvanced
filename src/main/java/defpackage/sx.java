package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: sx */
final class sx extends ss {
    sx(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }
}
