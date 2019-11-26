package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ngy */
final class ngy implements Creator {
    ngy() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ngv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ngv(parcel);
    }
}
