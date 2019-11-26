package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omt */
final class omt implements Creator {
    omt() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new omq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new omq(parcel);
    }
}
