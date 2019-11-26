package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nhl */
final class nhl implements Creator {
    nhl() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nhm[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nhm(parcel);
    }
}
