package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nhg */
final class nhg implements Creator {
    nhg() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nhd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nhd(parcel);
    }
}
