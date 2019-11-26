package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aafu */
final class aafu implements Creator {
    aafu() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aafv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new aafv(parcel);
        } catch (aocg unused) {
            return null;
        }
    }
}
