package defpackage;

import com.google.android.gms.gcm.PeriodicTask;

/* renamed from: qfi */
public final class qfi extends qfl {
    public long a;
    public long b;

    public qfi() {
        this.a = -1;
        this.b = -1;
        this.g = true;
    }

    public final PeriodicTask a() {
        super.b();
        long j = this.a;
        if (j == -1) {
            throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
        } else if (j > 0) {
            long j2 = this.b;
            if (j2 == -1) {
                this.b = (long) (((float) j) * 0.1f);
            } else if (j2 > j) {
                this.b = j;
            }
            return new PeriodicTask(this);
        } else {
            StringBuilder stringBuilder = new StringBuilder(66);
            stringBuilder.append("Period set cannot be less than or equal to 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
