package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: abvd */
final class abvd extends apk {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ abuy c;

    abvd(abuy abuy, int i, int i2) {
        this.c = abuy;
        this.a = i;
        this.b = i2;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        int i = this.c.a.a;
        int e = RecyclerView.e(view);
        int a = recyclerView.m.a() - this.c.d;
        int i2 = a % i;
        if (i2 == 0) {
            i2 = i;
        }
        Object obj = null;
        if (a - i2 <= e && e < a) {
            obj = 1;
        }
        if (e < i) {
            rect.top = this.a;
        }
        if (obj != null) {
            rect.bottom = this.b;
        }
    }
}
