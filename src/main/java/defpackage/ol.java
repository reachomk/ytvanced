package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ol */
final class ol implements Creator {
    ol() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new oi[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new oi(parcel);
    }
}
