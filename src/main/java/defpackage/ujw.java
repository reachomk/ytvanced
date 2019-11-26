package defpackage;

import java.nio.ShortBuffer;

/* renamed from: ujw */
public final class ujw implements ujr {
    public final ujv a = new ujv();
    public final float b;
    public boolean c;
    private final ujs d;
    private boolean e;

    public ujw(ujs ujs, float f) {
        this.d = (ujs) uhy.a((Object) ujs);
        this.b = f;
    }

    public final void a(long j) {
        this.a.a(j);
    }

    public final void a(ShortBuffer shortBuffer, int i, int i2) {
        if (!this.e) {
            ujv ujv = this.a;
            uhy.b(ujv.a == 0, "ticksPerSample already set (%s)", Integer.valueOf(ujv.a));
            uhy.a(i > 0, "Invalid samplesPerSec (%s)", Integer.valueOf(i));
            ujv.a = 7056000 / i;
            ujv = this.a;
            Object a = ujy.a(i2);
            uhy.b(ujv.b == null, (Object) "channelCount already set");
            ujv.b = (ujy) uhy.a(a);
            this.e = true;
        }
        uhy.a(i == this.a.c(), "samplesPerSec changed from %s to %s", Integer.valueOf(this.a.c()), Integer.valueOf(i));
        uhy.a(i2 == this.a.b.a, "channelCount changed from %s to %s", Integer.valueOf(this.a.b.a), Integer.valueOf(i2));
        this.a.a(shortBuffer);
        this.d.a();
    }

    public final void a() {
        this.c = true;
        this.d.a();
    }

    public final float a(int i) {
        return this.a.a(i) * this.b;
    }
}
