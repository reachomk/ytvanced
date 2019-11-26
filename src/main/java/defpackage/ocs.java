package defpackage;

import android.os.SystemClock;

/* renamed from: ocs */
final class ocs implements oci {
    private final /* synthetic */ ocm a;

    public final void a(long j, long j2, long j3, long j4) {
        long k = this.a.k();
        long l = this.a.l();
        StringBuilder stringBuilder = new StringBuilder(182);
        stringBuilder.append("Spurious audio timestamp (frame position mismatch): ");
        stringBuilder.append(j);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(j2);
        stringBuilder.append(str);
        stringBuilder.append(j3);
        stringBuilder.append(str);
        stringBuilder.append(j4);
        stringBuilder.append(str);
        stringBuilder.append(k);
        stringBuilder.append(str);
        stringBuilder.append(l);
        oyp.a("AudioTrack", stringBuilder.toString());
    }

    public final void b(long j, long j2, long j3, long j4) {
        long k = this.a.k();
        long l = this.a.l();
        StringBuilder stringBuilder = new StringBuilder(180);
        stringBuilder.append("Spurious audio timestamp (system clock mismatch): ");
        stringBuilder.append(j);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(j2);
        stringBuilder.append(str);
        stringBuilder.append(j3);
        stringBuilder.append(str);
        stringBuilder.append(j4);
        stringBuilder.append(str);
        stringBuilder.append(k);
        stringBuilder.append(str);
        stringBuilder.append(l);
        oyp.a("AudioTrack", stringBuilder.toString());
    }

    public final void a(long j) {
        StringBuilder stringBuilder = new StringBuilder(61);
        stringBuilder.append("Ignoring impossibly large audio latency: ");
        stringBuilder.append(j);
        oyp.a("AudioTrack", stringBuilder.toString());
    }

    public final void a(int i, long j) {
        if (this.a.b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ocm ocm = this.a;
            int i2 = i;
            long j2 = j;
            ocm.b.a(i2, j2, elapsedRealtime - ocm.c);
        }
    }

    /* synthetic */ ocs(ocm ocm) {
        this.a = ocm;
    }
}
