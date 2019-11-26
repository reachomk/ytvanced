package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: anks */
final class anks implements Runnable {
    private ankp a;

    anks(ankp ankp) {
        this.a = ankp;
    }

    public final void run() {
        ankp ankp = this.a;
        if (ankp != null) {
            anjv anjv = ankp.a;
            if (anjv != null) {
                this.a = null;
                if (anjv.isDone()) {
                    ankp.a(anjv);
                    return;
                }
                Object obj;
                try {
                    StringBuilder stringBuilder;
                    ScheduledFuture scheduledFuture = ankp.f;
                    ankp.f = null;
                    obj = "Timed out";
                    if (scheduledFuture != null) {
                        long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (abs > 10) {
                            stringBuilder = new StringBuilder(obj.length() + 66);
                            stringBuilder.append(obj);
                            stringBuilder.append(" (timeout delayed by ");
                            stringBuilder.append(abs);
                            stringBuilder.append(" ms after scheduled time)");
                            obj = stringBuilder.toString();
                        }
                    }
                    String valueOf = String.valueOf(obj);
                    String valueOf2 = String.valueOf(anjv);
                    stringBuilder = new StringBuilder((valueOf.length() + 2) + valueOf2.length());
                    stringBuilder.append(valueOf);
                    stringBuilder.append(": ");
                    stringBuilder.append(valueOf2);
                    ankp.a(new ankr(stringBuilder.toString()));
                    anjv.cancel(true);
                } catch (Throwable th) {
                    anjv.cancel(true);
                }
            }
        }
    }
}
