package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vrw */
final class vrw implements Creator {
    vrw() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new vrx[0];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new vrx(parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readString(), parcel.readByte() != (byte) 0, (aajj) parcel.readParcelable(aajj.class.getClassLoader()), parcel.readString(), parcel.readLong(), (arku) xup.a(parcel, arku.b), (byte) 0);
        } catch (IllegalArgumentException unused) {
            xtl.c("Failed to read forecastingAdRenderer proto from parcel.");
            return null;
        }
    }
}
