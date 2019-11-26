package defpackage;

import android.net.Uri;

/* renamed from: dfd */
public final class dfd {
    public final Uri a;
    public final int b;

    public dfd(Uri uri, int i) {
        if (uri != null) {
            this.a = uri;
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("URI must not be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dfd) {
            dfd dfd = (dfd) obj;
            return this.b == dfd.b && this.a.equals(dfd.a);
        }
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b;
    }
}
