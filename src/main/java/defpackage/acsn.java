package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: acsn */
final class acsn implements Creator {
    acsn() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new acsl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new acsl(parcel);
    }
}
