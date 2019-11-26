package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ngu */
final class ngu implements Creator {
    ngu() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ngr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ngr(parcel);
    }
}
