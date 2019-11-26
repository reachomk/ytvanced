package defpackage;

import android.graphics.Rect;

/* renamed from: iuz */
final /* synthetic */ class iuz implements eyr {
    private final iuw a;

    iuz(iuw iuw) {
        this.a = iuw;
    }

    public final void a(Rect rect) {
        iuw iuw = this.a;
        rect.left -= iuw.a.getPaddingLeft();
        rect.right -= iuw.a.getPaddingRight();
        rect.top -= iuw.a.getPaddingTop();
    }
}
