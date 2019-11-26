package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import defpackage.qfo;

public class PeriodicTask extends Task {
    public static final Creator CREATOR = new qfo();
    private long c = -1;
    private long d = -1;

    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putLong("period", this.c);
        bundle.putLong("period_flex", this.d);
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
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 54);
        stringBuilder.append(obj);
        stringBuilder.append(" period=");
        stringBuilder.append(j);
        stringBuilder.append(" flex=");
        stringBuilder.append(j2);
        return stringBuilder.toString();
    }
}
