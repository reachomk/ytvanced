package defpackage;

import java.io.Serializable;

/* renamed from: amqs */
public final class amqs implements Serializable {
    public static final long serialVersionUID = 747826592375603043L;
    public final Object a;
    public final Object b;

    public static amqs a(Object obj, Object obj2) {
        return new amqs(obj, obj2);
    }

    private amqs(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amqs) {
            amqs amqs = (amqs) obj;
            if (amqq.a(this.a, amqs.a) && amqq.a(this.b, amqs.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 4) + valueOf2.length());
        stringBuilder.append("(");
        stringBuilder.append(valueOf);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
