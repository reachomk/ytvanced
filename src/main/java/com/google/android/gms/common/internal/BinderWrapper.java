package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import defpackage.pzw;

public final class BinderWrapper implements Parcelable {
    public static final Creator CREATOR = new pzw();
    private IBinder a = null;

    public final int describeContents() {
        return 0;
    }

    public BinderWrapper(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
    }
}
