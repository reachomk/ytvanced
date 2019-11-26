package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: cba */
public final class cba implements bzq {
    private final Context a;

    public cba(Context context) {
        this.a = context.getApplicationContext();
    }

    public final /* synthetic */ boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return btq.a(uri) && !btq.b(uri);
    }

    public final /* synthetic */ bzp a(Object obj, int i, int i2, bsq bsq) {
        Uri uri = (Uri) obj;
        if (!btq.a(i, i2)) {
            return null;
        }
        chi chi = new chi(uri);
        Context context = this.a;
        return new bzp(chi, btp.a(context, uri, new bts(context.getContentResolver())));
    }
}
