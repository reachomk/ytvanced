package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/* renamed from: alpr */
public final class alpr extends apk {
    private final Drawable a;
    private final SparseArray b;
    private final boolean c;

    public alpr(Drawable drawable) {
        this(drawable, true);
    }

    public alpr(Drawable drawable, boolean z) {
        this.a = (Drawable) amqw.a((Object) drawable);
        this.c = z;
        this.b = new SparseArray();
    }

    public final void a(int i, View view) {
        view.measure(0, 0);
        this.b.put(i, view);
    }

    public final void a() {
        this.b.clear();
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        int e = RecyclerView.e(view);
        View view2 = (View) this.b.get(e);
        if (view2 != null) {
            rect.top = view2.getMeasuredHeight();
            if (e <= 0) {
                return;
            }
            if (this.c || e != this.b.keyAt(0)) {
                rect.top += view2.getPaddingTop() + this.a.getIntrinsicHeight();
            }
        }
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            int e = RecyclerView.e(childAt);
            View view = (View) this.b.get(e);
            if (view != null) {
                canvas.save();
                canvas.translate((float) childAt.getLeft(), (float) (childAt.getTop() - view.getMeasuredHeight()));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                view.draw(canvas);
                if (e > 0) {
                    canvas.translate(0.0f, (float) (-this.a.getIntrinsicHeight()));
                    this.a.setBounds(0, 0, recyclerView.getWidth(), this.a.getIntrinsicHeight());
                    this.a.draw(canvas);
                }
                canvas.restore();
            }
        }
    }
}
