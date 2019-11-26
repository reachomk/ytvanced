package defpackage;

import java.security.MessageDigest;

/* renamed from: chi */
public final class chi implements bsm {
    private final Object b;

    public chi(Object obj) {
        this.b = chw.a(obj);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 18);
        stringBuilder.append("ObjectKey{object=");
        stringBuilder.append(valueOf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof chi)) {
            return false;
        }
        return this.b.equals(((chi) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }
}
