package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import java.util.Arrays;

/* renamed from: rqj */
public final class rqj extends qou {
    public static final Creator CREATOR = new rsg();
    private boolean a;
    private long b;
    private float c;
    private long d;
    private int e;

    rqj(boolean z, long j, float f, long j2, int i) {
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = j2;
        this.e = i;
    }

    public rqj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, 4, this.d);
        qov.b(parcel, 5, this.e);
        qov.a(parcel, i);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeviceOrientationRequest[mShouldUseMag=");
        stringBuilder.append(this.a);
        stringBuilder.append(" mMinimumSamplingPeriodMs=");
        stringBuilder.append(this.b);
        stringBuilder.append(" mSmallestAngleChangeRadians=");
        stringBuilder.append(this.c);
        long j = this.d;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(j - elapsedRealtime);
            stringBuilder.append("ms");
        }
        if (this.e != Integer.MAX_VALUE) {
            stringBuilder.append(" num=");
            stringBuilder.append(this.e);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rqj) {
            rqj rqj = (rqj) obj;
            return this.a == rqj.a && this.b == rqj.b && Float.compare(this.c, rqj.c) == 0 && this.d == rqj.d && this.e == rqj.e;
        }
    }
}
