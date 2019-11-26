package defpackage;

import android.net.Uri;

/* renamed from: aepg */
public final class aepg {
    public final String a;
    public final int b;
    public Uri c;
    public Uri d;

    public aepg(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void a(Uri uri, Uri uri2) {
        this.c = uri;
        this.d = uri2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aepg) {
            aepg aepg = (aepg) obj;
            return this.a.equals(aepg.a) && this.b == aepg.b;
        }
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }
}
