package defpackage;

import android.net.Uri;

/* renamed from: tpn */
public final class tpn extends anva {
    public final Uri a(int i, Uri uri) {
        anve tpo = new tpo();
        tpo.a(i);
        try {
            return (Uri) anva.a(tpo, new tpm(uri), true);
        } catch (anuz e) {
            throw new tpp(e);
        }
    }
}
