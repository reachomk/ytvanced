package defpackage;

import android.os.SystemClock;
import java.util.Random;

/* renamed from: udb */
public final class udb {
    private final float a;
    private final Random b;

    public udb(float f) {
        Random random = new Random(SystemClock.elapsedRealtime());
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        uhy.a(z, (Object) "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }

    public final boolean a() {
        return this.b.nextFloat() < this.a;
    }
}
