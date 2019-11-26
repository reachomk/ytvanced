package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: onf */
final class onf implements Creator {
    onf() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new onc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new onc(parcel);
    }
}
