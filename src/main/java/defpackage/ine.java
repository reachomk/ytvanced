package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: ine */
final class ine extends apk {
    private final int a;
    private final /* synthetic */ inb b;

    ine(inb inb, int i) {
        this.b = inb;
        this.a = i;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        int e = RecyclerView.e(view);
        rect.setEmpty();
        if (e == 0) {
            rect.right = this.a;
            rect.bottom = this.b.e() ? this.a : 0;
        } else if (e != 1) {
            if (e == 2) {
                if (this.b.e()) {
                    rect.bottom = this.a;
                } else {
                    rect.top = this.a;
                }
                rect.left = this.a;
            } else if (e == 3) {
                e = this.a;
                rect.left = e;
                rect.top = e;
            }
        } else if (this.b.e()) {
            e = this.a;
            rect.top = e;
            rect.right = e;
        } else {
            e = this.a;
            rect.left = e;
            rect.bottom = e;
        }
    }
}
