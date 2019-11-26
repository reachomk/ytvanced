package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nhk */
final class nhk implements Creator {
    nhk() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nhh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nhh(parcel);
    }
}
