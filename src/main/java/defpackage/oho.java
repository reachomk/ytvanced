package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: oho */
final class oho implements Creator {
    oho() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ohp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ohp(parcel);
    }
}
