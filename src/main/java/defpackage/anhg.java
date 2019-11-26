package defpackage;

import java.io.Serializable;

/* renamed from: anhg */
public final class anhg extends amqa implements Serializable {
    public static final anhg a = new anhg();
    public static final long serialVersionUID = 1;

    private anhg() {
    }

    public final String toString() {
        return "Ints.stringConverter()";
    }

    private final Object readResolve() {
        return a;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object c(Object obj) {
        return ((Integer) obj).toString();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(Object obj) {
        return Integer.decode((String) obj);
    }
}
