package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ugu */
final class ugu implements Creator {
    ugu() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ugv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ugv(parcel);
    }
}
