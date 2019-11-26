package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: owi */
public final class owi {
    public static final owk a = owi.a(false, -9223372036854775807L);
    public static final owk b = new owk(2, -9223372036854775807L);
    public static final owk c = new owk(3, -9223372036854775807L);
    public final ExecutorService d;
    public owj e;
    public IOException f;

    public owi(String str) {
        this.d = ozp.a(str);
    }

    public static owk a(boolean z, long j) {
        return new owk(z, j);
    }

    public final long a(owm owm, owh owh, int i) {
        Looper myLooper = Looper.myLooper();
        oxz.b(myLooper != null);
        this.f = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new owj(this, myLooper, owm, owh, i, elapsedRealtime).a(0);
        return elapsedRealtime;
    }

    public final boolean a() {
        return this.e != null;
    }

    public final void b() {
        this.e.a(false);
    }

    public final void a(owl owl) {
        owj owj = this.e;
        if (owj != null) {
            owj.a(true);
        }
        if (owl != null) {
            this.d.execute(new owo(owl));
        }
        this.d.shutdown();
    }

    public final void a(int i) {
        IOException iOException = this.f;
        if (iOException == null) {
            owj owj = this.e;
            if (owj != null) {
                if (i == aocf.UNSET_ENUM_VALUE) {
                    i = owj.a;
                }
                IOException iOException2 = owj.b;
                if (iOException2 != null && owj.c > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    static {
        owi.a(true, -9223372036854775807L);
    }
}
