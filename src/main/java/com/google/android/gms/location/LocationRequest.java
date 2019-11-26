package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.qou;
import defpackage.qov;
import defpackage.rsc;
import java.util.Arrays;

public final class LocationRequest extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new rsc();
    public int a;
    public long b;
    public long c;
    public boolean d;
    private long e;
    private int f;
    private float g;
    private long h;

    public LocationRequest() {
        this.a = 102;
        this.b = 3600000;
        this.c = 600000;
        this.d = false;
        this.e = Long.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = 0.0f;
        this.h = 0;
    }

    private final long a() {
        long j = this.h;
        long j2 = this.b;
        return j >= j2 ? j : j2;
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = i2;
        this.g = f;
        this.h = j4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, 4, this.d);
        qov.a(parcel, 5, this.e);
        qov.b(parcel, 6, this.f);
        qov.a(parcel, 7, this.g);
        qov.a(parcel, 8, this.h);
        qov.a(parcel, i);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request[");
        int i = this.a;
        String str = i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY";
        stringBuilder.append(str);
        String str2 = "ms";
        if (this.a != 105) {
            stringBuilder.append(" requested=");
            stringBuilder.append(this.b);
            stringBuilder.append(str2);
        }
        stringBuilder.append(" fastest=");
        stringBuilder.append(this.c);
        stringBuilder.append(str2);
        if (this.h > this.b) {
            stringBuilder.append(" maxWait=");
            stringBuilder.append(this.h);
            stringBuilder.append(str2);
        }
        if (this.g > 0.0f) {
            stringBuilder.append(" smallestDisplacement=");
            stringBuilder.append(this.g);
            stringBuilder.append("m");
        }
        long j = this.e;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(j - elapsedRealtime);
            stringBuilder.append(str2);
        }
        if (this.f != Integer.MAX_VALUE) {
            stringBuilder.append(" num=");
            stringBuilder.append(this.f);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.g), Long.valueOf(this.h)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            return this.a == locationRequest.a && this.b == locationRequest.b && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && a() == locationRequest.a();
        }
    }
}
