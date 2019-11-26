package defpackage;

import java.util.Collection;

/* renamed from: zds */
final class zds extends zeg {
    private final zdz a;
    private final boolean b;
    private final Collection c;

    zds(zdz zdz, boolean z, Collection collection) {
        if (zdz != null) {
            this.a = zdz;
            this.b = z;
            if (collection != null) {
                this.c = collection;
                return;
            }
            throw new NullPointerException("Null paths");
        }
        throw new NullPointerException("Null observer");
    }

    public final zdz a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final Collection c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 53) + valueOf2.length());
        stringBuilder.append("DataSyncSubscription{observer=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", active=");
        stringBuilder.append(z);
        stringBuilder.append(", paths=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zeg) {
            zeg zeg = (zeg) obj;
            return this.a.equals(zeg.a()) && this.b == zeg.b() && this.c.equals(zeg.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }
}
