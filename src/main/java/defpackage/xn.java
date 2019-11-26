package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: xn */
final class xn implements Creator {
    xn() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new xk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new xk(parcel);
    }
}
