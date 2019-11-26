package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: tqr */
final class tqr implements tqo {
    tqr() {
    }

    public final Rect a(View view) {
        Rect rect = new Rect();
        if (abe.H(view)) {
            view.getLocalVisibleRect(rect);
        }
        return rect;
    }
}
