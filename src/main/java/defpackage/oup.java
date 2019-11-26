package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: oup */
final class oup implements Creator {
    oup() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ouq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ouq(parcel);
    }
}
