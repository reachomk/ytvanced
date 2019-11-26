package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* renamed from: ams */
public final class ams extends apk {
    private static final int[] a = new int[]{16843284};
    private final Drawable b;
    private final int c;
    private final Rect d = new Rect();

    public ams(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        this.b = obtainStyledAttributes.getDrawable(0);
        if (this.b == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.c = 1;
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        if (!(recyclerView.n == null || this.b == null)) {
            int i = 0;
            int paddingLeft;
            int width;
            int childCount;
            View childAt;
            int round;
            if (this.c == 1) {
                canvas.save();
                if (recyclerView.i) {
                    paddingLeft = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    paddingLeft = 0;
                }
                childCount = recyclerView.getChildCount();
                while (i < childCount) {
                    childAt = recyclerView.getChildAt(i);
                    RecyclerView.a(childAt, this.d);
                    round = this.d.bottom + Math.round(childAt.getTranslationY());
                    this.b.setBounds(paddingLeft, round - this.b.getIntrinsicHeight(), width, round);
                    this.b.draw(canvas);
                    i++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.i) {
                paddingLeft = recyclerView.getPaddingTop();
                width = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), paddingLeft, recyclerView.getWidth() - recyclerView.getPaddingRight(), width);
            } else {
                width = recyclerView.getHeight();
                paddingLeft = 0;
            }
            childCount = recyclerView.getChildCount();
            while (i < childCount) {
                childAt = recyclerView.getChildAt(i);
                apn apn = recyclerView.n;
                RecyclerView.a(childAt, this.d);
                round = this.d.right + Math.round(childAt.getTranslationX());
                this.b.setBounds(round - this.b.getIntrinsicWidth(), paddingLeft, round, width);
                this.b.draw(canvas);
                i++;
            }
            canvas.restore();
        }
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        Drawable drawable = this.b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
