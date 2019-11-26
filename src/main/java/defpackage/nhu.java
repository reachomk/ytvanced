package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nhu */
final class nhu implements Creator {
    nhu() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nhr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nhr(parcel);
    }
}
