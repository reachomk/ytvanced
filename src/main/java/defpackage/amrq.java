package defpackage;

import java.io.Serializable;

/* renamed from: amrq */
final class amrq implements amro, Serializable {
    public static final long serialVersionUID = 0;
    private final amro a;
    private volatile transient boolean b;
    private transient Object c;

    amrq(amro amro) {
        this.a = (amro) amqw.a((Object) amro);
    }

    public final Object get() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object obj = this.a.get();
                    this.c = obj;
                    this.b = true;
                    return obj;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        String valueOf;
        StringBuilder stringBuilder;
        Object stringBuilder2;
        if (this.b) {
            valueOf = String.valueOf(this.c);
            stringBuilder = new StringBuilder(valueOf.length() + 25);
            stringBuilder.append("<supplier that returned ");
            stringBuilder.append(valueOf);
            stringBuilder.append(">");
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = this.a;
        }
        valueOf = String.valueOf(stringBuilder2);
        stringBuilder = new StringBuilder(valueOf.length() + 19);
        stringBuilder.append("Suppliers.memoize(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
