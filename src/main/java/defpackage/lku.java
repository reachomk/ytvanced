package defpackage;

import android.content.Context;
import android.graphics.Rect;

/* renamed from: lku */
public final class lku extends lkn implements ajkk {
    private final Context a;
    private final ajjz b;
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private float g = 1.777f;

    public lku(Context context, ajjz ajjz) {
        this.a = context;
        this.b = ajjz;
    }

    public final float m() {
        return 1.0f;
    }

    public final float n() {
        return 1.0f;
    }

    public final float o() {
        return 0.0f;
    }

    public final float p() {
        return 0.0f;
    }

    public final float r() {
        return 1.0f;
    }

    public final void f() {
        this.b.a((ajkk) this);
        if (this.b.a > 0.0f) {
            this.g = this.b.a;
            b();
        }
    }

    public final void g() {
        this.b.b(this);
    }

    public final Rect h() {
        return this.c;
    }

    public final Rect i() {
        return this.d;
    }

    public final Rect j() {
        return this.e;
    }

    public final Rect k() {
        return i;
    }

    public final Rect l() {
        return this.f;
    }

    public final float q() {
        return !a() ? 0.0f : 1.0f;
    }

    public final void b_(int i, int i2) {
        if (a()) {
            int i3 = (int) (((float) i) * (!xss.d(this.a) ? 0.65f : 0.7f));
            int i4 = (int) (((float) i3) / 1.777f);
            this.d.set(0, 0, i3, i4);
            this.e.set(i3, 0, i, i2);
            this.f.set(0, i4, i3, i2);
        } else {
            this.d.set(0, 0, i, (int) (((float) i) / 1.777f));
            this.e.set(0, this.d.height(), i, i2);
        }
        b();
    }

    public final void a(int i, int i2) {
        float f = 1.777f;
        if (i2 > 0 && i > 0) {
            f = ((float) i) / ((float) i2);
        }
        this.g = f;
        b();
    }

    private final boolean a() {
        return xss.b(this.a) && xss.e(this.a);
    }

    private final void b() {
        fpe.b(this.g, this.d, this.c);
        t();
    }
}
