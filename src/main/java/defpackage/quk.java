package defpackage;

import android.net.Uri;

/* renamed from: quk */
public final class quk {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public quk(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    private quk(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final quk a(String str) {
        if (this.e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new quk(this.a, this.b, str, this.d, false, this.f);
    }

    public final quk b(String str) {
        return new quk(this.a, this.b, this.c, str, this.e, this.f);
    }
}
