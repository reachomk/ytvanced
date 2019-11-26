package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: oug */
final class oug implements Creator {
    oug() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new oud[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new oud(parcel);
    }
}
