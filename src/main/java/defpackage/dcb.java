package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.List;

/* renamed from: dcb */
public final class dcb extends SwipeRefreshLayout implements cou {
    public final cpq l;
    public final RecyclerView m;
    public boolean n = false;

    public dcb(Context context, RecyclerView recyclerView) {
        super(context);
        this.m = recyclerView;
        this.m.a(new dce());
        this.m.a(0);
        addView(this.m);
        this.l = new cpq(new cmg(getContext()));
        this.l.setLayoutParams(new LayoutParams(-1, -2));
        addView(this.l);
    }

    public final void b() {
        this.l.o();
        this.l.setVisibility(8);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        c(MeasureSpec.getSize(i));
    }

    public final void c(int i) {
        measureChild(this.l, MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.l.getVisibility() != 8) {
            int paddingLeft = getPaddingLeft();
            i = getPaddingTop();
            cpq cpq = this.l;
            cpq.layout(paddingLeft, i, cpq.getMeasuredWidth() + paddingLeft, this.l.getMeasuredHeight() + i);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = true;
    }

    public final boolean isLayoutRequested() {
        if (getParent() != null) {
            return getParent().isLayoutRequested() || super.isLayoutRequested();
        } else {
            return super.isLayoutRequested();
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (getParent() != null && !isNestedScrollingEnabled()) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.m.setOnTouchListener(onTouchListener);
    }

    public final void a(List list) {
        int childCount = this.m.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.m.getChildAt(i);
            if (childAt instanceof cpq) {
                list.add((cpq) childAt);
            }
        }
    }
}
