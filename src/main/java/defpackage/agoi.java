package defpackage;

import java.util.Locale;

/* renamed from: agoi */
public abstract class agoi {
    public abstract long a();

    public abstract long b();

    public static agoi a(long j, long j2) {
        return new agob(j, j2);
    }

    public final String toString() {
        return String.format(Locale.US, "(%d [%d] %d)", new Object[]{Long.valueOf(a()), Long.valueOf(b()), Long.valueOf((a() + b()) - 1)});
    }
}
