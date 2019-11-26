package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: aklr */
final class aklr extends cgs {
    private final /* synthetic */ wxg a;
    private final /* synthetic */ Uri b;

    aklr(wxg wxg, Uri uri) {
        this.a = wxg;
        this.b = uri;
        super(aocf.UNSET_ENUM_VALUE, aocf.UNSET_ENUM_VALUE);
    }

    public final void c(Drawable drawable) {
        this.a.a(this.b, null);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, chb chb) {
        this.a.a(this.b, (Bitmap) obj);
    }
}
