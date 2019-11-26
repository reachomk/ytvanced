package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ankp */
final class ankp extends aniz {
    public anjv a;
    public ScheduledFuture f;

    public ankp(anjv anjv) {
        this.a = (anjv) amqw.a((Object) anjv);
    }

    /* Access modifiers changed, original: protected|final */
    public final String ax_() {
        anjv anjv = this.a;
        ScheduledFuture scheduledFuture = this.f;
        if (anjv == null) {
            return null;
        }
        String valueOf = String.valueOf(anjv);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 14);
        stringBuilder.append("inputFuture=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        valueOf = stringBuilder.toString();
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                valueOf = String.valueOf(valueOf);
                StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 43);
                stringBuilder2.append(valueOf);
                stringBuilder2.append(", remaining delay=[");
                stringBuilder2.append(delay);
                stringBuilder2.append(" ms]");
                valueOf = stringBuilder2.toString();
            }
        }
        return valueOf;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        a(this.a);
        ScheduledFuture scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.f = null;
    }
}
