package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: akls */
final class akls extends cgs {
    private final /* synthetic */ wxg a;
    private final /* synthetic */ Uri b;

    akls(wxg wxg, Uri uri) {
        this.a = wxg;
        this.b = uri;
    }

    public final void c(Drawable drawable) {
        this.a.a(this.b, null);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, chb chb) {
        this.a.a(this.b, (byte[]) obj);
    }
}
