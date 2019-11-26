package defpackage;

import java.util.Map.Entry;

/* renamed from: j */
public final class j implements Entry {
    public final Object a;
    public final Object b;
    public j c;
    public j d;

    j(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.a.equals(jVar.a) && this.b.equals(jVar.b);
        }
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
