package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: hfa */
final class hfa implements Creator {
    hfa() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new hfb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new hfb(parcel);
    }
}
