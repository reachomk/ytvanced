package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: xmr */
public abstract class xmr extends HorizontalScrollView {
    private OnClickListener a;
    private final xnn b = new xnn();
    public LinearLayout s;
    public int t;
    public ArrayList u;
    public xmt v;

    public xmr(Context context) {
        super(context);
        a(context);
    }

    public abstract void a(int i, boolean z);

    public xmr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public xmr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private final void a(Context context) {
        this.t = -1;
        this.u = new ArrayList(10);
        this.s = new LinearLayout(context);
        this.s.setOrientation(0);
        this.s.setFocusable(false);
        this.s.setClickable(false);
        addView(this.s);
        abe.b(this.s, 1);
        setFillViewport(true);
        setHorizontalScrollBarEnabled(false);
        this.a = new xmu(this);
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -1);
    }

    public void a() {
        this.s.removeAllViews();
        this.u.clear();
        this.t = -1;
    }

    public final int b() {
        return this.u.size();
    }

    public final View c(int i) {
        return (i < 0 || i >= this.u.size()) ? null : (View) this.u.get(i);
    }

    public View a(View view) {
        this.u.add(view);
        this.s.addView(view, view.getLayoutParams());
        view.setOnClickListener(this.a);
        abe.a(view, this.b);
        return view;
    }

    public void b(int i, boolean z) {
        int i2 = this.t;
        if (i2 != i) {
            this.t = i;
            a(i2, false);
            a(this.t, true);
        }
        xmt xmt = this.v;
        if (xmt != null) {
            xmt.a(i2, i, z);
        }
    }
}
