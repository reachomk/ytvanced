package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ye */
final class ye implements Creator {
    ye() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new yf[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new yf(parcel);
    }
}
