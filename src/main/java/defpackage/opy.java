package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: opy */
final class opy implements Creator {
    opy() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new opz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new opz(parcel);
    }
}
