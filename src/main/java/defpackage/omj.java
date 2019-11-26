package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omj */
final class omj implements Creator {
    omj() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new omg[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new omg(parcel);
    }
}
