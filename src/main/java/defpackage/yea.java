package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: yea */
final class yea extends apk {
    private final /* synthetic */ ydw a;

    yea(ydw ydw) {
        this.a = ydw;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        int i;
        int f = RecyclerView.f(view);
        int g = abe.g(recyclerView);
        int i2 = 0;
        if (f == 0 || g == 1) {
            i = 0;
        } else {
            i = this.a.d;
        }
        rect.left = i;
        if (f != 0 && g == 1) {
            i2 = this.a.d;
        }
        rect.right = i2;
    }
}
