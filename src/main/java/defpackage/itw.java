package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: itw */
final /* synthetic */ class itw implements eyr {
    private final View a;

    itw(View view) {
        this.a = view;
    }

    public final void a(Rect rect) {
        View view = this.a;
        rect.left -= view.getPaddingLeft();
        rect.right -= view.getPaddingRight();
        rect.top -= view.getPaddingTop();
    }
}
