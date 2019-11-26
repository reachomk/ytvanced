package defpackage;

import java.io.Serializable;

/* renamed from: amti */
abstract class amti implements Serializable, Comparable {
    public static final long serialVersionUID = 0;
    public final Comparable b;

    amti(Comparable comparable) {
        this.b = comparable;
    }

    public abstract void a(StringBuilder stringBuilder);

    public abstract boolean a(Comparable comparable);

    public abstract void b(StringBuilder stringBuilder);

    public abstract int hashCode();

    /* renamed from: a */
    public int compareTo(amti amti) {
        if (amti == amtj.a) {
            return 1;
        }
        int i = -1;
        if (amti == amth.a) {
            return -1;
        }
        int b = amwi.b(this.b, amti.b);
        if (b != 0) {
            return b;
        }
        boolean z = this instanceof amtk;
        if (z == (amti instanceof amtk)) {
            i = 0;
        } else if (z) {
            return 1;
        } else {
            return i;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public Comparable a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amti) {
            try {
                if (compareTo((amti) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
