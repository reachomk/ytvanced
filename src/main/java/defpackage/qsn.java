package defpackage;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: qsn */
public final class qsn {
    public static final ConditionVariable b = new ConditionVariable();
    public static volatile rkn c = null;
    private static volatile Random e = null;
    public final qui a;
    public volatile Boolean d;

    public qsn(qui qui) {
        this.a = qui;
        qui.b.execute(new qsq(this));
    }

    public static int a() {
        try {
            if (VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return qsn.b().nextInt();
        } catch (RuntimeException unused) {
            return qsn.b().nextInt();
        }
    }

    private static Random b() {
        if (e == null) {
            synchronized (qsn.class) {
                if (e == null) {
                    e = new Random();
                }
            }
        }
        return e;
    }
}
