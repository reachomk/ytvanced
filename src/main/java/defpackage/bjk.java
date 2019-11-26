package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bjk */
final class bjk implements Creator {
    bjk() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bjh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bjh(parcel);
    }
}
