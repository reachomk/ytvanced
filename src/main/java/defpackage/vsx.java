package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vsx */
final class vsx implements Creator {
    vsx() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new vsu[0];
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
            return new vsu(readString, createByteArray, readString2, readString3, z, aajj, readString4, (axzh) xup.a(parcel, axzh.h), (byte) 0);
        } catch (IllegalArgumentException unused) {
            xtl.c("Failed to read surveyAdRenderer proto from parcel.");
            return null;
        }
    }
}
