package defpackage;

import java.io.Serializable;

/* renamed from: amup */
final class amup implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;

    amup(Object[] objArr) {
        this.a = objArr;
    }

    /* Access modifiers changed, original: final */
    public final Object readResolve() {
        return amul.a(this.a);
    }
}
