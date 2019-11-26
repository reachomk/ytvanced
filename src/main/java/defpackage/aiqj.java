package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aiqj */
final class aiqj implements Creator {
    aiqj() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aiqg[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aiqg(parcel);
    }
}
