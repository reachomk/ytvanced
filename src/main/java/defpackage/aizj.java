package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aizj */
final class aizj implements Creator {
    aizj() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aizg[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aizg(parcel);
    }
}
