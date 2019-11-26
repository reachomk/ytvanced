package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: ydj */
final class ydj extends apk {
    private final int a;
    private final boolean b;

    public ydj(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        if (this.b) {
            rect.right = this.a;
        } else {
            rect.left = this.a;
        }
        if (RecyclerView.e(view) != 0) {
            return;
        }
        if (this.b) {
            rect.left = this.a;
        } else {
            rect.right = this.a;
        }
    }
}
