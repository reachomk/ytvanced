package defpackage;

import java.io.Serializable;

/* renamed from: amuy */
final class amuy implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;

    amuy(Object[] objArr) {
        this.a = objArr;
    }

    /* Access modifiers changed, original: final */
    public final Object readResolve() {
        return amuw.a(this.a);
    }
}
