package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vrf */
final class vrf implements Creator {
    vrf() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new vrc[0];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        byte[] createByteArray = parcel.createByteArray();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        boolean z = parcel.readByte() != (byte) 0;
        parcel.readParcelable(aajj.class.getClassLoader());
        return new vrc(readString, createByteArray, readString2, readString3, z, parcel.readString(), parcel.readLong(), (aakj) parcel.readParcelable(aakj.class.getClassLoader()));
    }
}
