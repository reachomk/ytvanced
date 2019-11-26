package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ts */
final class ts implements Creator {
    ts() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new tt[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new tt(parcel);
    }
}
