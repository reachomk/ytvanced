package defpackage;

import android.net.Uri;

/* renamed from: afnk */
public final class afnk implements afnl {
    public final afnw a;

    public afnk(afnw afnw) {
        this.a = afnw;
    }

    public final /* synthetic */ xle a(Object obj, wxg wxg) {
        Uri uri = (Uri) obj;
        return new afnm(this, uri.toString(), new afnn(wxg, uri), wxg, uri);
    }
}
