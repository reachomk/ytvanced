package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vtj */
final class vtj implements Creator {
    vtj() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new vtg[0];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new vtg(parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readString(), parcel.readByte() != (byte) 0, (aajj) parcel.readParcelable(aajj.class.getClassLoader()), parcel.readString(), parcel.readLong(), (byte) 0);
    }
}
