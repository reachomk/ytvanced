package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ngl */
final class ngl implements Creator {
    ngl() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ngm[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ngm(parcel);
    }
}
