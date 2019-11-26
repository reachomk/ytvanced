package defpackage;

import java.util.Arrays;

/* renamed from: esc */
public class esc {
    public final auwl a;

    public esc(auwl auwl) {
        this.a = auwl;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof esc) && this.a.equals(((esc) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
