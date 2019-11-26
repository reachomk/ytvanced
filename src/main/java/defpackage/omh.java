package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omh */
final class omh implements Creator {
    omh() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ome[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ome(parcel);
    }
}
