package defpackage;

/* renamed from: acol */
final class acol implements acfn {
    public final /* synthetic */ acnc a;
    private final /* synthetic */ int b;

    acol(acnc acnc, int i) {
        this.a = acnc;
        this.b = i;
    }

    public final void a() {
        if (aclo.a(this.a)) {
            this.a.aa.b();
            this.a.am();
        }
    }

    public final void a(int i, boolean z, long j) {
        if (aclo.a(this.a)) {
            int i2 = this.b;
            StringBuilder stringBuilder = new StringBuilder(123);
            stringBuilder.append("Start stream failed: status=");
            stringBuilder.append(i);
            stringBuilder.append(", remainingAttempts=");
            stringBuilder.append(i2);
            stringBuilder.append(", mayRetry=");
            stringBuilder.append(z);
            stringBuilder.append(", minDelayMillis=");
            stringBuilder.append(j);
            xtl.d(stringBuilder.toString());
            if (z) {
                i = this.b;
                if (i > 0) {
                    this.a.ai.postDelayed(new acoo(this, i), Math.max(1000, j));
                    return;
                }
            }
            this.a.aa.c();
        }
    }
}
