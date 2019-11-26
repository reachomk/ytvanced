package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.youtube.R;

/* renamed from: lki */
public final class lki extends lkn implements eye {
    private final Context a;
    private final eyb b;
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private int f;
    private int g;

    public lki(Context context, eyb eyb) {
        this.a = context;
        this.b = eyb;
    }

    public final float m() {
        return 1.0f;
    }

    public final float n() {
        return 0.0f;
    }

    public final float o() {
        return 1.0f;
    }

    public final float p() {
        return 1.0f;
    }

    public final float q() {
        return 0.0f;
    }

    public final float r() {
        return 0.0f;
    }

    public final void b_(int i, int i2) {
        this.f = i;
        this.g = i2;
        int i3 = (int) (((float) i) * (!xss.e(this.a) ? 0.4f : 0.35f));
        int i4 = (int) (((float) i3) / 1.777f);
        this.c.set(0, 0, i3, this.a.getResources().getDimensionPixelSize(R.dimen.floaty_box_controls_height) + i4);
        this.d.set(0, 0, this.c.width(), i4);
        fpe.a(1.777f, this.d, this.e);
        i -= this.c.width();
        i2 = (i2 + this.b.b) - this.c.height();
        this.c.offset(i, i2);
        this.d.offset(i, i2);
        this.e.offset(i, i2);
        t();
    }

    public final Rect h() {
        return this.e;
    }

    public final Rect i() {
        return this.d;
    }

    public final Rect j() {
        return i;
    }

    public final Rect k() {
        return this.c;
    }

    public final Rect l() {
        return i;
    }

    public final void f() {
        this.b.a(this);
    }

    public final void g() {
        this.b.b(this);
    }

    public final void a() {
        b_(this.f, this.g);
    }
}
