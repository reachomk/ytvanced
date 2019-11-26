package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: bzh */
public final class bzh implements bzq {
    private final Context a;

    public bzh(Context context) {
        this.a = context;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return btq.a((Uri) obj);
    }

    public final /* synthetic */ bzp a(Object obj, int i, int i2, bsq bsq) {
        Uri uri = (Uri) obj;
        return new bzp(new chi(uri), new bzj(this.a, uri));
    }
}
