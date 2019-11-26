package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: cdk */
final class cdk extends cdi {
    static bvw a(Drawable drawable) {
        return drawable != null ? new cdk(drawable) : null;
    }

    public final void d() {
    }

    private cdk(Drawable drawable) {
        super(drawable);
    }

    public final Class a() {
        return this.a.getClass();
    }

    public final int c() {
        return Math.max(1, (this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight()) << 2);
    }
}
