package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: fmo */
final class fmo extends apk {
    private final /* synthetic */ View a;
    private final /* synthetic */ int b;
    private final /* synthetic */ fmf c;

    fmo(fmf fmf, View view, int i) {
        this.c = fmf;
        this.a = view;
        this.b = i;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        super.a(rect, view, recyclerView, aqh);
        if (view == this.a) {
            rect.bottom = (int) (((float) (-this.b)) * (1.0f - fmf.a(view, this.c.g)));
        }
    }
}
