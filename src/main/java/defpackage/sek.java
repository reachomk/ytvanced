package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: sek */
final class sek implements Creator {
    sek() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new sel[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new sel((sgz) parcel.readParcelable(sgz.class.getClassLoader()), parcel.readInt() == 0 ? sgn.a(parcel.readString()) : null);
    }
}
