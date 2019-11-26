package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import com.google.android.youtube.R;

/* renamed from: lkg */
public final class lkg extends lkn implements ajkk, eye, xcp {
    private final ajjz a;
    private final eyb b;
    private final xci c;
    private final ajam d;
    private final zyw e;
    private final bdfu f = new bdfu();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect j = new Rect();
    private final Rect k = new Rect();
    private final Context l;
    private final int m;
    private final int n;
    private final int o;
    private float p = 2.4f;
    private float q;

    public lkg(Context context, ajjz ajjz, eyb eyb, xci xci, ajam ajam, zyw zyw) {
        this.l = context;
        this.a = ajjz;
        this.b = eyb;
        this.c = xci;
        this.d = ajam;
        this.e = zyw;
        Resources resources = context.getResources();
        this.m = resources.getDimensionPixelOffset(R.dimen.floaty_bar_start_bottom_padding);
        this.n = resources.getDimensionPixelOffset(R.dimen.floaty_bar_start_end_padding);
        this.o = resources.getDimensionPixelSize(R.dimen.floaty_bar_max_width);
        this.q = 1.777f;
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

    public final void f() {
        this.a.a((ajkk) this);
        this.b.a(this);
        float f = this.a.a;
        if (((double) f) == 0.0d) {
            f = 1.777f;
        }
        a(f);
        if (foh.x(this.e)) {
            this.f.a();
            this.f.a(this.d.Q().a.f().a(emg.a(this.e, 1048576, 1)).a(new lkf(this)));
            return;
        }
        this.c.a((Object) this);
    }

    public final void g() {
        this.a.b(this);
        this.b.b(this);
        if (foh.x(this.e)) {
            this.f.a();
        } else {
            this.c.b(this);
        }
    }

    public final Rect h() {
        return this.h;
    }

    public final Rect i() {
        return this.j;
    }

    public final Rect j() {
        return i;
    }

    public final Rect k() {
        return this.k;
    }

    public final Rect l() {
        return i;
    }

    public final void b_(int i, int i2) {
        this.g.set(0, 0, i, i2);
        b();
    }

    private final void a(float f) {
        this.q = f;
        b();
    }

    private final void b() {
        int c = c();
        int round = Math.round(this.p * ((float) c()));
        int width = this.g.width();
        int height = this.g.height();
        int i = this.b.b;
        int i2 = this.n;
        i2 = (width - Math.min(width - (i2 + i2), this.o)) / 2;
        height = (height + i) - (this.m + c);
        c += height;
        this.j.set(i2, height, round + i2, c);
        fpe.a(this.q, this.j, this.h);
        this.k.set(i2, height, width - i2, c);
        t();
    }

    public final void a(int i, int i2) {
        float f = 1.777f;
        if (i2 > 0 && i > 0) {
            f = ((float) i) / ((float) i2);
        }
        a(f);
    }

    public final void a() {
        b();
    }

    public final void a(ahkn ahkn) {
        airi airi = ahkn.a;
        if (airi.a()) {
            a(true);
        } else if (airi.a(airi.READY)) {
            a(false);
        }
    }

    private final void a(boolean z) {
        this.p = !z ? 2.4f : 1.777f;
        b();
    }

    private final int c() {
        return this.l.getResources().getDimensionPixelSize(R.dimen.floaty_bar_height);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
