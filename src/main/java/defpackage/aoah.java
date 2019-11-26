package defpackage;

import java.util.Map.Entry;

/* renamed from: aoah */
final class aoah implements Comparable, Entry {
    public final Comparable a;
    public Object b;
    private final /* synthetic */ aoae c;

    aoah(aoae aoae, Entry entry) {
        this(aoae, (Comparable) entry.getKey(), entry.getValue());
    }

    aoah(aoae aoae, Comparable comparable, Object obj) {
        this.c = aoae;
        this.a = comparable;
        this.b = obj;
    }

    public final Object getValue() {
        return this.b;
    }

    public final Object setValue(Object obj) {
        this.c.d();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            return aoah.a(this.a, entry.getKey()) && aoah.a(this.b, entry.getValue());
        }
    }

    public final int hashCode() {
        Comparable comparable = this.a;
        int i = 0;
        int hashCode = comparable != null ? comparable.hashCode() : 0;
        Object obj = this.b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 1) + valueOf2.length());
        stringBuilder.append(valueOf);
        stringBuilder.append("=");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }

    private static boolean a(Object obj, Object obj2) {
        boolean equals;
        if (obj != null) {
            equals = obj.equals(obj2);
        } else if (obj2 == null) {
            return true;
        } else {
            equals = false;
        }
        return equals;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((aoah) obj).a);
    }
}
