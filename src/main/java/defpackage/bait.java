package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bait */
final class bait implements Creator {
    bait() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new baiq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new baiq(parcel);
    }
}
