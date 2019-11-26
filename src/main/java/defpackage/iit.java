package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: iit */
final class iit extends apk {
    private final /* synthetic */ iir a;

    iit(iir iir) {
        this.a = iir;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        int e = RecyclerView.e(view);
        int g = abe.g(view);
        int i = 0;
        int i2 = g == 1 ? this.a.c : e != 0 ? 0 : this.a.c;
        rect.left = i2;
        if (g != 1) {
            i = this.a.c;
        } else if (e == 0) {
            i = this.a.c;
        }
        rect.right = i;
    }
}
