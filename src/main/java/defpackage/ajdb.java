package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ajdb */
final class ajdb implements Creator {
    ajdb() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ajcy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ajcy(parcel);
    }
}
