package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/* renamed from: alpc */
public final class alpc extends apk {
    public final int a;
    public final SparseArray b = new SparseArray();
    public int c;
    public View d;
    private final int e;

    public alpc(int i, int i2) {
        this.e = i;
        this.a = i2;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        rect.top = this.c;
        this.d = recyclerView;
        int e = RecyclerView.e(view);
        if (e != 0 && ((View) this.b.get(e)) != null) {
            if (a()) {
                rect.right = this.e;
            } else {
                rect.left = this.e;
            }
        }
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            View view = (View) this.b.get(RecyclerView.e(childAt));
            if (view != null) {
                int right;
                canvas.save();
                if (a()) {
                    right = childAt.getRight() - view.getMeasuredWidth();
                } else {
                    right = childAt.getLeft();
                }
                canvas.translate((float) right, 0.0f);
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                view.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final boolean a() {
        return abe.g(this.d) == 1;
    }
}
