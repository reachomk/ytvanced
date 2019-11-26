package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: afyu */
public final class afyu implements aham {
    private static final long a = TimeUnit.MINUTES.toSeconds(1);
    private final wya b;

    public afyu(wya wya) {
        this.b = wya;
    }

    public final void a() {
        a(0, 1);
    }

    public final void a(long j) {
        a(j, a);
    }

    private final void a(long j, long j2) {
        xtl.e(String.format(Locale.US, "Scheduling offline time window task, delay: %d, window %d", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        this.b.a("transfer_tw", j, j2, true, 1, false, null, null, true, false);
    }

    static {
        TimeUnit.MINUTES.toMillis(5);
    }
}
