package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: cbc */
public final class cbc implements bzq {
    private final Context a;

    public cbc(Context context) {
        this.a = context.getApplicationContext();
    }

    public final /* synthetic */ boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return btq.a(uri) && btq.b(uri);
    }

    public final /* synthetic */ bzp a(Object obj, int i, int i2, bsq bsq) {
        Uri uri = (Uri) obj;
        if (btq.a(i, i2)) {
            Long l = (Long) bsq.a(ccv.a);
            if (l != null && l.longValue() == -1) {
                chi chi = new chi(uri);
                Context context = this.a;
                return new bzp(chi, btp.a(context, uri, new btr(context.getContentResolver())));
            }
        }
        return null;
    }
}
