package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: onm */
final class onm implements Creator {
    onm() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new onn[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new onn(parcel.readLong(), parcel.readLong(), (byte) 0);
    }
}
