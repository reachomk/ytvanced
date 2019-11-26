package defpackage;

/* renamed from: nyu */
public final class nyu implements oaa {
    private final ovl a;
    private final long b = nyr.b(15000);
    private final long c = nyr.b(50000);
    private final long d = nyr.b(50000);
    private final long e = nyr.b(2500);
    private final long f = nyr.b(5000);
    private final int g = -1;
    private final boolean h = true;
    private final long i = nyr.b(0);
    private int j;
    private boolean k;
    private boolean l;

    public nyu() {
        ovl ovl = new ovl(true, 65536);
        String str = "0";
        String str2 = "bufferForPlaybackMs";
        nyu.a(2500, 0, str2, str);
        String str3 = "bufferForPlaybackAfterRebufferMs";
        nyu.a(5000, 0, str3, str);
        String str4 = "minBufferAudioMs";
        nyu.a(15000, 2500, str4, str2);
        String str5 = "minBufferVideoMs";
        nyu.a(50000, 2500, str5, str2);
        nyu.a(15000, 5000, str4, str3);
        nyu.a(50000, 5000, str5, str3);
        str2 = "maxBufferMs";
        nyu.a(50000, 15000, str2, str4);
        nyu.a(50000, 50000, str2, str5);
        nyu.a(0, 0, "backBufferDurationMs", str);
        this.a = ovl;
    }

    public final boolean f() {
        return false;
    }

    public final void a() {
        a(false);
    }

    public final void a(oal[] oalArr, oun oun) {
        boolean z;
        int i = 0;
        while (i < oalArr.length) {
            if (oalArr[i].a() == 2 && oun.a(i) != null) {
                z = true;
                break;
            }
            i++;
        }
        z = false;
        this.l = z;
        i = this.g;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < oalArr.length; i2++) {
                if (oun.a(i2) != null) {
                    i += ozp.g(oalArr[i2].a());
                }
            }
        }
        this.j = i;
        this.a.a(i);
    }

    public final void b() {
        a(true);
    }

    public final void c() {
        a(true);
    }

    public final ouw d() {
        return this.a;
    }

    public final long e() {
        return this.i;
    }

    public final boolean a(long j, float f) {
        long j2;
        int e = this.a.e();
        int i = this.j;
        if (this.l) {
            j2 = this.c;
        } else {
            j2 = this.b;
        }
        if (f > 1.0f) {
            j2 = Math.min(ozp.a(j2, f), this.d);
        }
        if (j < j2) {
            boolean z = true;
            if (!this.h && e >= i) {
                z = false;
            }
            this.k = z;
        } else if (j >= this.d || e >= i) {
            this.k = false;
        }
        return this.k;
    }

    public final boolean a(long j, float f, boolean z) {
        long j2;
        j = ozp.b(j, f);
        if (z) {
            j2 = this.f;
        } else {
            j2 = this.e;
        }
        boolean z2 = true;
        if (j2 > 0 && j < j2) {
            if (this.h) {
                z2 = false;
            } else if (this.a.e() >= this.j) {
                return z2;
            } else {
                return false;
            }
        }
        return z2;
    }

    private final void a(boolean z) {
        this.j = 0;
        this.k = false;
        if (z) {
            this.a.d();
        }
    }

    private static void a(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" cannot be less than ");
        stringBuilder.append(str2);
        oxz.a(z, stringBuilder.toString());
    }
}
