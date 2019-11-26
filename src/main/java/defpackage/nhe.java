package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nhe */
final class nhe implements Creator {
    nhe() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nhb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nhb(parcel);
    }
}
