package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nna */
final class nna implements Creator {
    nna() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nmx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nmx(parcel);
    }
}
