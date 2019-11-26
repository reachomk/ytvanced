package defpackage;

import java.io.Serializable;

/* renamed from: amwi */
public final class amwi extends amwh implements amqv, Serializable {
    private static final amwi a = new amwi(amtj.a, amth.a);
    public static final long serialVersionUID = 0;
    private final amti b;
    private final amti c;

    public static amwi a(Comparable comparable, Comparable comparable2) {
        return new amwi(new amtm(comparable), new amtk(comparable2));
    }

    private amwi(amti amti, amti amti2) {
        this.b = (amti) amqw.a((Object) amti);
        this.c = (amti) amqw.a((Object) amti2);
        if (amti.compareTo(amti2) > 0 || amti == amth.a || amti2 == amtj.a) {
            String valueOf = String.valueOf(amwi.a(amti, amti2));
            String str = "Invalid range: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new IllegalArgumentException(valueOf);
        }
    }

    public final Comparable a() {
        return this.b.a();
    }

    public final Comparable b() {
        return this.c.a();
    }

    public final boolean a(Comparable comparable) {
        amqw.a((Object) comparable);
        return this.b.a(comparable) && !this.c.a(comparable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amwi) {
            amwi amwi = (amwi) obj;
            if (this.b.equals(amwi.b) && this.c.equals(amwi.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return amwi.a(this.b, this.c);
    }

    private static String a(amti amti, amti amti2) {
        StringBuilder stringBuilder = new StringBuilder(16);
        amti.a(stringBuilder);
        stringBuilder.append("..");
        amti2.b(stringBuilder);
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final Object readResolve() {
        return equals(a) ? a : this;
    }

    static int b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
}
