package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bain */
final class bain implements Creator {
    bain() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new baik[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new baik(parcel);
    }
}
