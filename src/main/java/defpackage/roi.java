package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

@qlp
/* renamed from: roi */
public final class roi extends ron {
    private final Drawable a;
    private final Uri b;
    private final double c;

    public roi(Drawable drawable, Uri uri, double d) {
        this.a = drawable;
        this.b = uri;
        this.c = d;
    }

    public final qcs a() {
        return qct.a(this.a);
    }

    public final Uri b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }
}
