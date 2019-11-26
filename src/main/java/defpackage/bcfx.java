package defpackage;

import android.net.Uri;

/* renamed from: bcfx */
public final class bcfx {
    public final Uri a;
    public final Uri b;
    public final Uri c;
    public final bcfw d;

    public bcfx(Uri uri, Uri uri2, Uri uri3) {
        this.a = (Uri) bcgg.a(uri);
        this.b = (Uri) bcgg.a(uri2);
        this.c = uri3;
        this.d = null;
    }

    public bcfx(bcfw bcfw) {
        bcgg.a((Object) bcfw, (Object) "docJson cannot be null");
        this.d = bcfw;
        this.a = (Uri) bcfw.a(bcfw.a);
        this.b = (Uri) bcfw.a(bcfw.b);
        this.c = (Uri) bcfw.a(bcfw.c);
    }
}
