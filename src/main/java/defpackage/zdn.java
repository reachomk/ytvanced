package defpackage;

import android.net.Uri;

/* renamed from: zdn */
final class zdn extends zdy {
    private final Uri a;
    private final Object b;
    private final Object c;
    private final Long d;
    private final int e;

    public final Uri a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final Object c() {
        return this.c;
    }

    public final Long d() {
        return this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.e;
        String str = i != 1 ? i != 2 ? "null" : "DELETED" : "UPDATED";
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 76) + str.length()) + valueOf2.length()) + valueOf3.length()) + valueOf4.length());
        stringBuilder.append("DataSyncModelChange{path=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", updateType=");
        stringBuilder.append(str);
        stringBuilder.append(", previousModel=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", nextModel=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", expiry=");
        stringBuilder.append(valueOf4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zdy) {
            zdy zdy = (zdy) obj;
            if (this.a.equals(zdy.a())) {
                int i = this.e;
                int e = zdy.e();
                if (i == 0) {
                    throw null;
                } else if (i == e) {
                    Object obj2 = this.b;
                    if (obj2 == null ? zdy.b() != null : !obj2.equals(zdy.b())) {
                        obj2 = this.c;
                        if (obj2 == null ? zdy.c() != null : !obj2.equals(zdy.c())) {
                            Long l = this.d;
                            if (l == null ? zdy.d() == null : l.equals(zdy.d())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.e;
        if (i != 0) {
            hashCode = (hashCode ^ i) * 1000003;
            Object obj = this.b;
            int i2 = 0;
            hashCode = (hashCode ^ (obj != null ? obj.hashCode() : 0)) * 1000003;
            obj = this.c;
            hashCode = (hashCode ^ (obj != null ? obj.hashCode() : 0)) * 1000003;
            Long l = this.d;
            if (l != null) {
                i2 = l.hashCode();
            }
            return hashCode ^ i2;
        }
        throw null;
    }

    zdn(Uri uri, int i, Object obj, Object obj2, Long l) {
        if (uri != null) {
            this.a = uri;
            if (i != 0) {
                this.e = i;
                this.b = obj;
                this.c = obj2;
                this.d = l;
                return;
            }
            throw new NullPointerException("Null updateType");
        }
        throw new NullPointerException("Null path");
    }

    public final int e() {
        return this.e;
    }
}
