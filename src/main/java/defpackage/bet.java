package defpackage;

import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: bet */
public final class bet {
    public final RectF a = new RectF();
    public final Paint b = new Paint();
    public final Paint c = new Paint();
    public final Paint d = new Paint();
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 5.0f;
    public int[] i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public Path n;
    public float o = 1.0f;
    public float p;
    public int q;
    public int r;
    public int s = 255;
    public int t;
    private int u;

    bet() {
        this.b.setStrokeCap(Cap.SQUARE);
        this.b.setAntiAlias(true);
        this.b.setStyle(Style.STROKE);
        this.c.setStyle(Style.FILL);
        this.c.setAntiAlias(true);
        this.d.setColor(0);
    }

    public final void a(int[] iArr) {
        this.i = iArr;
        a(0);
    }

    public final void a(int i) {
        this.u = i;
        this.t = this.i[i];
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        return (this.u + 1) % this.i.length;
    }

    public final void a(float f) {
        this.h = f;
        this.b.setStrokeWidth(f);
    }

    /* Access modifiers changed, original: final */
    public final int b() {
        return this.i[this.u];
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (this.m != z) {
            this.m = z;
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        this.j = this.e;
        this.k = this.f;
        this.l = this.g;
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
    }
}
