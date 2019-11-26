package defpackage;

import android.util.Pair;

/* renamed from: afot */
public final class afot {
    public final String a;
    public final boolean b;
    private final Pair c;

    public afot(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = new Pair(str, Boolean.valueOf(z));
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == getClass() && ((afot) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
