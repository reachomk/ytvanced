package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: kjr */
final class kjr extends apk {
    private final /* synthetic */ int a;
    private final /* synthetic */ kjm b;

    kjr(kjm kjm, int i) {
        this.b = kjm;
        this.a = i;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        super.a(rect, view, recyclerView, aqh);
        if (abe.g(this.b.a) == 1) {
            rect.right = this.a;
        } else {
            rect.left = this.a;
        }
    }
}
