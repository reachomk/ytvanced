package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: llm */
public final class llm extends apk implements ejc {
    private final RecyclerView a;
    private final Rect b = new Rect();
    private final Drawable c;
    private final int d;
    private boolean e = true;

    public llm(RecyclerView recyclerView) {
        this.a = recyclerView;
        this.c = ra.a(recyclerView.getContext(), (int) R.color.swipey_gutter_color);
        this.d = recyclerView.getResources().getDimensionPixelOffset(R.dimen.swipey_gutter_width);
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        int i = this.d / 2;
        rect.set(i, 0, i, 0);
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        if (this.e && recyclerView.n != null) {
            int paddingTop;
            int height;
            canvas.save();
            if (recyclerView.i) {
                paddingTop = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                paddingTop = 0;
            }
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                apn apn = recyclerView.n;
                RecyclerView.a(childAt, this.b);
                int round = Math.round(childAt.getTranslationX());
                int i2 = this.b.left + round;
                this.c.setBounds(i2, paddingTop, (this.d / 2) + i2, height);
                this.c.draw(canvas);
                i2 = this.b.right + round;
                this.c.setBounds(i2 - (this.d / 2), paddingTop, i2, height);
                this.c.draw(canvas);
            }
            canvas.restore();
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        boolean c = ejd2.c();
        if (this.e != c) {
            this.e = c;
            if (this.a.n()) {
                this.a.invalidate();
            } else {
                this.a.p();
            }
        }
    }
}
