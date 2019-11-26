package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: zre */
final class zre implements Creator {
    zre() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zrb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zrb(parcel);
    }
}
