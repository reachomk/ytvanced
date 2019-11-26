package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: xw */
final class xw implements Creator {
    xw() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new xx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new xx(parcel);
    }
}
