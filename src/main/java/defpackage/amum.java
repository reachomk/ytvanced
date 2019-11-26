package defpackage;

import java.io.Serializable;

/* renamed from: amum */
final class amum extends amsm implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    amum(Object obj, Object obj2) {
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
        throw new UnsupportedOperationException();
    }
}
