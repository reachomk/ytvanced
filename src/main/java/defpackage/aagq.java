package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aagq */
final class aagq implements Creator {
    aagq() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aagr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new aagr(parcel);
        } catch (aocg e) {
            throw new RuntimeException("Failed to parse VastAd's annotations parcel", e);
        }
    }
}
