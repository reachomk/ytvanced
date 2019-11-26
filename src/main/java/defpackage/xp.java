package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: xp */
final class xp implements Creator {
    xp() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new xm[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new xm(parcel);
    }
}
