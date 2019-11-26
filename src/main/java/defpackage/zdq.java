package defpackage;

import android.net.Uri;

/* renamed from: zdq */
final class zdq extends zec {
    private final Uri a;
    private final zdz b;

    zdq(Uri uri, zdz zdz) {
        if (uri != null) {
            this.a = uri;
            if (zdz != null) {
                this.b = zdz;
                return;
            }
            throw new NullPointerException("Null observer");
        }
        throw new NullPointerException("Null subscribed");
    }

    /* Access modifiers changed, original: final */
    public final Uri a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final zdz b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 52) + valueOf2.length());
        stringBuilder.append("DataSyncObserverNotification{subscribed=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", observer=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zec) {
            zec zec = (zec) obj;
            return this.a.equals(zec.a()) && this.b.equals(zec.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
