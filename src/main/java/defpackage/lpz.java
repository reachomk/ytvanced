package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewStub;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.youtube.R;

/* renamed from: lpz */
public final class lpz implements lqg {
    private final Drawable a;
    private final Drawable b;
    private final int c;
    private final int d;
    private final /* synthetic */ NextGenWatchLayout e;

    public lpz(NextGenWatchLayout nextGenWatchLayout, Context context) {
        this.e = nextGenWatchLayout;
        this.b = ra.a(context, (int) R.drawable.floaty_scrim);
        this.c = context.getResources().getDimensionPixelOffset(R.dimen.floaty_bar_gradient_size);
        this.a = ra.a(context, (int) R.drawable.floaty_bar_shadow);
        this.d = context.getResources().getDimensionPixelOffset(R.dimen.floaty_bar_shadow_size);
    }

    public final int b() {
        return 16;
    }

    public final void b(Canvas canvas, View view) {
    }

    public final int d() {
        return 1;
    }

    public final int a() {
        NextGenWatchLayout nextGenWatchLayout = this.e;
        return !lja.a(nextGenWatchLayout.c, nextGenWatchLayout.getContext()) ? 4 : 256;
    }

    public final void c() {
        NextGenWatchLayout nextGenWatchLayout = this.e;
        View view = nextGenWatchLayout.h;
        if (view instanceof ViewStub) {
            nextGenWatchLayout.h = ((ViewStub) view).inflate();
        }
        nextGenWatchLayout = this.e;
        view = nextGenWatchLayout.i;
        if (view instanceof ViewStub) {
            nextGenWatchLayout.i = ((ViewStub) view).inflate();
        }
    }

    public final void a(float f) {
        this.b.setAlpha(xpr.a((float) (Math.exp((double) (f * 25.0f)) / Math.expm1(25.0d))));
    }

    public final void a(lla lla) {
        NextGenWatchLayout nextGenWatchLayout = this.e;
        Rect i;
        if (lja.a(nextGenWatchLayout.c, nextGenWatchLayout.getContext())) {
            i = lla.i();
            NextGenWatchLayout.a(this.e.i, true, i.left, i.top, this.e.i.getMeasuredWidth() + i.left, i.top + this.e.i.getMeasuredHeight());
        } else {
            i = lla.k();
            NextGenWatchLayout.a(this.e.i, true, i.left, i.top, this.e.i.getMeasuredWidth() + i.left, i.top + this.e.i.getMeasuredHeight());
        }
        Rect k = lla.k();
        this.b.setBounds(0, e() - this.c, this.e.getWidth(), e());
        this.a.setBounds(k.left - this.d, k.top - this.d, (k.left + this.e.h.getMeasuredWidth()) + this.d, (k.top + this.e.h.getMeasuredHeight()) + this.d);
    }

    private final int e() {
        int height = this.e.getHeight();
        eyb eyb = this.e.e;
        return height + (eyb.b - eyb.a.get(1, 0));
    }

    public final void a(Canvas canvas, View view) {
        if (view == this.e.h && view.getVisibility() == 0) {
            NextGenWatchLayout nextGenWatchLayout = this.e;
            if (!lja.a(nextGenWatchLayout.c, nextGenWatchLayout.getContext())) {
                this.b.draw(canvas);
            }
            this.a.draw(canvas);
        }
    }

    public final int a(int i) {
        if (i != 2) {
            return i == 4 ? 16 : 0;
        } else {
            NextGenWatchLayout nextGenWatchLayout = this.e;
            return nextGenWatchLayout.a(!nextGenWatchLayout.b.e() ? 3 : 1);
        }
    }

    public final void b(lla lla) {
        Rect i;
        NextGenWatchLayout nextGenWatchLayout = this.e;
        if (lja.a(nextGenWatchLayout.c, nextGenWatchLayout.getContext())) {
            i = lla.i();
        } else {
            i = lla.k();
        }
        this.e.i.measure(MeasureSpec.makeMeasureSpec(i.width(), 1073741824), MeasureSpec.makeMeasureSpec(i.height(), 1073741824));
    }
}
