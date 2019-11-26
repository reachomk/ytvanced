package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: opw */
final class opw implements Creator {
    opw() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new opx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new opx(parcel);
    }
}
