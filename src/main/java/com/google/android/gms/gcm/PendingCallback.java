package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.qfp;

public class PendingCallback implements Parcelable, ReflectedParcelable {
    public static final Creator CREATOR = new qfp();
    public final IBinder a;

    public PendingCallback(Parcel parcel) {
        this.a = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
    }
}
