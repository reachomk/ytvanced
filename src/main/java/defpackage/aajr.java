package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aajr */
final class aajr implements Creator {
    aajr() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aajo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aajo(parcel.readInt());
    }
}
