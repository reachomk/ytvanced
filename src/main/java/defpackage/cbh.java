package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: cbh */
public final class cbh implements bss {
    private final bwd a;
    private final bss b;

    public cbh(bwd bwd, bss bss) {
        this.a = bwd;
        this.b = bss;
    }

    public final /* synthetic */ boolean a(Object obj, File file, bsq bsq) {
        return this.b.a(new cbj(((BitmapDrawable) ((bvw) obj).b()).getBitmap(), this.a), file, bsq);
    }

    public final int a(bsq bsq) {
        return this.b.a(bsq);
    }
}
