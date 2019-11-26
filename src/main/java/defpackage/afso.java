package defpackage;

import android.net.Uri;

/* renamed from: afso */
public final class afso extends afnj {
    private afso() {
    }

    public final xhc a(Uri uri) {
        return super.b(uri.buildUpon().appendQueryParameter("pseudo_head", "1").build());
    }

    public final /* synthetic */ Object b(Object obj) {
        return b((Uri) obj);
    }

    public /* synthetic */ afso(byte b) {
    }
}
