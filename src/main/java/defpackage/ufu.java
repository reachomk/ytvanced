package defpackage;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: ufu */
final class ufu {
    public final long a;
    public final long b;
    public final boolean c;

    public ufu(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public static Object a(Callable callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            IOException iOException = new IOException(th);
        }
    }

    /* synthetic */ ufu(long j, long j2, boolean z, byte b) {
        this(j, j2, z);
    }
}
