package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: zim */
final class zim implements Creator {
    zim() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zin[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zin(parcel);
    }
}
