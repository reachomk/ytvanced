package defpackage;

import android.graphics.Typeface;

/* renamed from: hg */
public final class hg extends hp {
    private final Typeface a;
    private final hj b;
    private boolean c;

    public hg(hj hjVar, Typeface typeface) {
        this.a = typeface;
        this.b = hjVar;
    }

    public final void a(Typeface typeface) {
        b(typeface);
    }

    public final void a() {
        b(this.a);
    }

    public final void b() {
        this.c = true;
    }

    public final void b(Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }
}
