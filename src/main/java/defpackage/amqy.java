package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: amqy */
public final class amqy implements amqv, Serializable {
    public static final long serialVersionUID = 0;
    private final List a;

    public final boolean a(Object obj) {
        for (int i = 0; i < this.a.size(); i++) {
            if (!((amqv) this.a.get(i)).a(obj)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amqy)) {
            return false;
        }
        return this.a.equals(((amqy) obj).a);
    }

    public final String toString() {
        List list = this.a;
        StringBuilder stringBuilder = new StringBuilder("Predicates.");
        stringBuilder.append("and");
        stringBuilder.append('(');
        Object obj = 1;
        for (Object next : list) {
            if (obj == null) {
                stringBuilder.append(',');
            }
            stringBuilder.append(next);
            obj = null;
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public /* synthetic */ amqy(List list) {
        this.a = list;
    }
}
