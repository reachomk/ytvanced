package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.View.MeasureSpec;

/* renamed from: lwg */
final class lwg implements els {
    private final lky a;
    private final Rect b = new Rect();

    public lwg(lky lky) {
        this.a = lky;
    }

    public final void a(View view, int i, int i2) {
        this.b.set(0, 0, MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        Rect a = this.a.a(this.b);
        view.measure(MeasureSpec.makeMeasureSpec(Math.max(0, a.width()), 1073741824), MeasureSpec.makeMeasureSpec(Math.max(0, a.height()), 1073741824));
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        this.b.set(0, 0, i3 - i, i4 - i2);
        Rect a = this.a.a(this.b);
        view.layout(a.left, a.top, a.left + Math.max(0, a.width()), a.top + Math.max(0, a.height()));
    }
}
