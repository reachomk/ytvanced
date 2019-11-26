package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: aksj */
public final class aksj {
    public final int a;
    public final int b;

    public aksj(long j) {
        amqw.a(j >= 0);
        this.a = (int) TimeUnit.MILLISECONDS.toMinutes(j);
        this.b = (int) TimeUnit.MILLISECONDS.toSeconds(j - TimeUnit.MINUTES.toMillis((long) this.a));
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "%d:%02d", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
