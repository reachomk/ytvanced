package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.View.MeasureSpec;

/* renamed from: lqa */
public abstract class lqa {
    lqa() {
    }

    public abstract View a();

    public abstract boolean b();

    public abstract float c();

    public abstract Rect d();

    public abstract Rect e();

    public final void f() {
        if (b()) {
            Rect e = e();
            a().measure(MeasureSpec.makeMeasureSpec(e.width(), 1073741824), MeasureSpec.makeMeasureSpec(e.height(), 1073741824));
        }
    }

    public final void g() {
        if (b()) {
            Rect e = e();
            a().layout(0, 0, e.width(), e.height());
            h();
            a().setAlpha(c());
        }
    }

    public final void h() {
        if (b()) {
            a().setTranslationX((float) d().left);
            a().setTranslationY((float) d().top);
        }
    }
}
