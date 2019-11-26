package defpackage;

import android.util.Log;

/* renamed from: acig */
final class acig implements Runnable {
    private final /* synthetic */ acih a;

    acig(acih acih) {
        this.a = acih;
    }

    public final void run() {
        acih acih = this.a;
        if (acih.k) {
            acih.o.clear();
            return;
        }
        acih.c = ((Integer) acih.o.removeFirst()).intValue();
        long e = acih.f.e();
        long j = acih.p;
        acih.p = e;
        acih.h.putInt("video-bitrate", acih.c);
        try {
            acih.b.setParameters(acih.h);
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 23);
            stringBuilder.append("Failed to set bitrate: ");
            stringBuilder.append(valueOf);
            Log.e("ScreencastVideoEncoder", stringBuilder.toString());
        }
        if (!acih.o.isEmpty()) {
            acih.g.postDelayed(acih.i, (long) acih.q);
        }
    }
}
