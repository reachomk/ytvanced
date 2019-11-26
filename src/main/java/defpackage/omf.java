package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omf */
final class omf implements Creator {
    omf() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new omc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new omc(parcel);
    }
}
