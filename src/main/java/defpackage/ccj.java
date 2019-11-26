package defpackage;

import android.util.Log;
import java.io.File;

/* renamed from: ccj */
final class ccj {
    public static volatile ccj a;
    private static final File b = new File("/proc/self/fd");
    private volatile int c;
    private volatile boolean d = true;

    public final synchronized boolean a() {
        int i = this.c + 1;
        this.c = i;
        if (i >= 50) {
            boolean z = false;
            this.c = 0;
            int length = b.list().length;
            if (length < 700) {
                z = true;
            }
            this.d = z;
            if (!this.d && Log.isLoggable("Downsampler", 5)) {
                StringBuilder stringBuilder = new StringBuilder(118);
                stringBuilder.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                stringBuilder.append(length);
                stringBuilder.append(", limit 700");
                Log.w("Downsampler", stringBuilder.toString());
            }
        }
        return this.d;
    }
}
