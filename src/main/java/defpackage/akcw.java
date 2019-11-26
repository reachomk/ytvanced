package defpackage;

import java.util.List;

/* renamed from: akcw */
final class akcw extends akee {
    private final Object a;
    private final List b;

    public final Object a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 58) + valueOf2.length());
        stringBuilder.append("YouTubeCustomCommandEventDataImpl{tag=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", customConverters=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akee) {
            akee akee = (akee) obj;
            Object obj2 = this.a;
            if (obj2 == null ? akee.a() != null : !obj2.equals(akee.a())) {
                List list = this.b;
                if (list == null ? akee.b() == null : list.equals(akee.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = ((obj != null ? obj.hashCode() : 0) ^ 1000003) * 1000003;
        List list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode ^ i;
    }

    /* synthetic */ akcw(Object obj, List list) {
        this.a = obj;
        this.b = list;
    }
}
