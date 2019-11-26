package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: lgh */
final class lgh implements Creator {
    lgh() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new lge[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new lge(parcel);
    }
}
