package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.qou;
import defpackage.qov;
import defpackage.rsf;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new rsf();
    public static final List a = Collections.emptyList();
    public final List b;

    public LocationResult(List list) {
        this.b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.b);
        qov.a(parcel, i);
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.b) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            LocationResult locationResult = (LocationResult) obj;
            if (locationResult.b.size() == this.b.size()) {
                Iterator it = this.b.iterator();
                for (Location time : locationResult.b) {
                    if (((Location) it.next()).getTime() != time.getTime()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 27);
        stringBuilder.append("LocationResult[locations: ");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
