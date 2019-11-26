package defpackage;

import com.google.android.gms.gcm.OneoffTask;

/* renamed from: qfg */
public final class qfg extends qfl {
    public long a;
    public long b;

    public qfg() {
        this.a = -1;
        this.b = -1;
        this.g = false;
    }

    public final OneoffTask a() {
        super.b();
        long j = this.a;
        if (j != -1) {
            long j2 = this.b;
            if (j2 != -1) {
                if (j < j2) {
                    return new OneoffTask(this);
                }
                throw new IllegalArgumentException("Window start must be shorter than window end.");
            }
        }
        throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
    }
}
