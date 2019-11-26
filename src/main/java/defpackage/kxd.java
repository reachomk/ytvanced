package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: kxd */
final class kxd extends apk {
    private final Drawable a;
    private final int b;
    private final int c;

    kxd(Drawable drawable, int i, int i2) {
        this.a = drawable;
        this.b = i / 2;
        this.c = i2;
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        apn apn = recyclerView.n;
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            int f = RecyclerView.f(childAt);
            canvas.save();
            if (f > 0) {
                int h = apn.h(childAt);
                Drawable drawable = this.a;
                int i2 = this.b;
                drawable.setBounds(h - i2, 0, h + i2, this.c);
                this.a.draw(canvas);
            }
        }
    }
}
