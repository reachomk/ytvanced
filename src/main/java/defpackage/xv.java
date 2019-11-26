package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: xv */
final class xv implements Creator {
    xv() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new xs[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new xs(parcel);
    }
}
