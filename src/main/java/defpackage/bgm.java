package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.youtube.R;

/* renamed from: bgm */
final class bgm extends ViewGroup implements bgl {
    public ViewGroup a;
    public View b;
    public final View c;
    public int d;
    public Matrix e;
    private final OnPreDrawListener f = new bgp(this);

    bgm(View view) {
        super(view.getContext());
        this.c = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (bgm.a(this.c) == this) {
            bht.a(this.c, i == 0 ? 4 : 0);
        }
    }

    public final void a(ViewGroup viewGroup, View view) {
        this.a = viewGroup;
        this.b = view;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bgm.a(this.c, this);
        this.c.getViewTreeObserver().addOnPreDrawListener(this.f);
        bht.a(this.c, 4);
        if (this.c.getParent() != null) {
            ((View) this.c.getParent()).invalidate();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        this.c.getViewTreeObserver().removeOnPreDrawListener(this.f);
        bht.a(this.c, 0);
        bgm.a(this.c, null);
        if (this.c.getParent() != null) {
            ((View) this.c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        bfi.a(canvas, true);
        canvas.setMatrix(this.e);
        bht.a(this.c, 0);
        this.c.invalidate();
        bht.a(this.c, 4);
        drawChild(canvas, this.c, getDrawingTime());
        bfi.a(canvas, false);
    }

    static void a(View view, View view2) {
        bht.a(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    static bgm a(View view) {
        return (bgm) view.getTag(R.id.ghost_view);
    }

    private static void a(View view, bgm bgm) {
        view.setTag(R.id.ghost_view, bgm);
    }
}
