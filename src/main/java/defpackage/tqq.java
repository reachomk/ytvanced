package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: tqq */
final class tqq implements tqt {
    tqq() {
    }

    public final Rect a(View view) {
        Rect rect = new Rect();
        if (abe.H(view)) {
            view.getGlobalVisibleRect(rect);
        }
        return rect;
    }
}
