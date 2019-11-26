package defpackage;

import android.net.Uri;

/* renamed from: aelj */
final class aelj extends aelo {
    private final Uri a;
    private final Uri b;

    aelj(Uri uri, Uri uri2) {
        this.a = uri;
        this.b = uri2;
    }

    public final Uri a() {
        return this.a;
    }

    public final Uri b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 54) + valueOf2.length());
        stringBuilder.append("LastOpenedInfo{originalRedirectorUri=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", redirectedUri=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aelo) {
            aelo aelo = (aelo) obj;
            Uri uri = this.a;
            if (uri == null ? aelo.a() != null : !uri.equals(aelo.a())) {
                uri = this.b;
                if (uri == null ? aelo.b() == null : uri.equals(aelo.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int i = 0;
        int hashCode = ((uri != null ? uri.hashCode() : 0) ^ 1000003) * 1000003;
        Uri uri2 = this.b;
        if (uri2 != null) {
            i = uri2.hashCode();
        }
        return hashCode ^ i;
    }
}
