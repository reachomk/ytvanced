package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: fip */
final class fip implements Creator {
    fip() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new fiq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new fiq(parcel);
    }
}
