package defpackage;

import java.security.MessageDigest;

/* renamed from: bue */
final class bue implements bsm {
    private final bsm b;
    private final bsm c;

    bue(bsm bsm, bsm bsm2) {
        this.b = bsm;
        this.c = bsm2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bue) {
            bue bue = (bue) obj;
            if (this.b.equals(bue.b) && this.c.equals(bue.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 36) + valueOf2.length());
        stringBuilder.append("DataCacheKey{sourceKey=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", signature=");
        stringBuilder.append(valueOf2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }
}
