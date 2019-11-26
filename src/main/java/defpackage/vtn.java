package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vtn */
final class vtn implements Creator {
    vtn() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new vtk[0];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        byte[] createByteArray = parcel.createByteArray();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        boolean z = parcel.readByte() != (byte) 0;
        parcel.readParcelable(aajj.class.getClassLoader());
        try {
            return new vtk(readString, createByteArray, readString2, readString3, z, parcel.readString(), parcel.readLong(), (ayxm) xup.a(parcel, ayxm.o), (aakj) parcel.readParcelable(aakj.class.getClassLoader()));
        } catch (IllegalArgumentException unused) {
            xtl.c("Failed to read videoAdRenderer proto from parcel.");
            return null;
        }
    }
}
