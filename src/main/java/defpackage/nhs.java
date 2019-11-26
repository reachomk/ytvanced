package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nhs */
final class nhs implements Creator {
    nhs() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nhp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nhp(parcel);
    }
}
