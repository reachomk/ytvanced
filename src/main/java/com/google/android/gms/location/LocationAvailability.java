package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.qou;
import defpackage.qov;
import defpackage.rqr;
import defpackage.rsd;
import java.util.Arrays;

public final class LocationAvailability extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new rsd();
    @Deprecated
    private int a;
    @Deprecated
    private int b;
    private long c;
    private int d;
    private rqr[] e;

    public LocationAvailability(int i, int i2, int i3, long j, rqr[] rqrArr) {
        this.d = i;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.e = rqrArr;
    }

    public final boolean a() {
        return this.d < 1000;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.b(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.b(parcel, 4, this.d);
        qov.a(parcel, 5, this.e, i);
        qov.a(parcel, a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), this.e});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e);
        }
    }

    public final String toString() {
        boolean a = a();
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("LocationAvailability[isLocationAvailable: ");
        stringBuilder.append(a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
