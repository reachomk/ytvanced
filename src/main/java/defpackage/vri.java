package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vri */
final class vri implements Creator {
    vri() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new vrj[0];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        byte[] createByteArray = parcel.createByteArray();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        boolean z = parcel.readByte() != (byte) 0;
        aajj aajj = (aajj) parcel.readParcelable(aajj.class.getClassLoader());
        String readString4 = parcel.readString();
        parcel.readLong();
        try {
            return new vrj(readString, createByteArray, readString2, readString3, z, aajj, readString4, (aolc) xup.a(parcel, aolc.h), (vso) parcel.readParcelable(vso.class.getClassLoader()));
        } catch (IllegalArgumentException unused) {
            xtl.c("Failed to read adVideoEndRenderer proto from parcel.");
            return null;
        }
    }
}
