package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: gmi */
final class gmi implements gog {
    private final /* synthetic */ RecyclerView a;
    private final /* synthetic */ ans b;
    private final /* synthetic */ gmd c;

    gmi(gmd gmd, RecyclerView recyclerView, ans ans) {
        this.c = gmd;
        this.a = recyclerView;
        this.b = ans;
    }

    public final void a() {
        gmd gmd = this.c;
        int i = gmd.i;
        if (i != -1) {
            gmd.k.e(i);
        }
    }

    public final float b() {
        if (this.c.i == -1) {
            return 0.0f;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        this.a.getGlobalVisibleRect(rect);
        View c = this.b.c(this.c.i);
        if (c == null) {
            return 0.0f;
        }
        int i;
        int i2;
        c.getGlobalVisibleRect(rect2);
        if (rect2.right <= rect.right) {
            i = rect2.right;
            i2 = rect.left;
        } else {
            i = rect.right;
            i2 = rect2.left;
        }
        return ((float) (i - i2)) / ((float) rect.width());
    }
}
