package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import defpackage.qfm;

public class OneoffTask extends Task {
    public static final Creator CREATOR = new qfm();
    private final long c;
    private final long d;

    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putLong("window_start", this.c);
        bundle.putLong("window_end", this.d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }

    public final String toString() {
        String obj = super.toString();
        long j = this.c;
        long j2 = this.d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 64);
        stringBuilder.append(obj);
        stringBuilder.append(" windowStart=");
        stringBuilder.append(j);
        stringBuilder.append(" windowEnd=");
        stringBuilder.append(j2);
        return stringBuilder.toString();
    }
}
