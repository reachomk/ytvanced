package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nhi */
final class nhi implements Creator {
    nhi() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nhf[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nhf(parcel);
    }
}
