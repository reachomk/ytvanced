package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omb */
final class omb implements Creator {
    omb() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new oly[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new oly(parcel);
    }
}
