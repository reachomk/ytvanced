package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: olt */
final class olt implements Creator {
    olt() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new olq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new olq(parcel);
    }
}
