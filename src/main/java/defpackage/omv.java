package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omv */
final class omv implements Creator {
    omv() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new oms[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new oms(parcel);
    }
}
