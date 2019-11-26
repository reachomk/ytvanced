package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: baie */
final class baie implements Creator {
    baie() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new baif[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new baif(parcel);
    }
}
