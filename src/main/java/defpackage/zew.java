package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: zew */
final class zew implements Creator {
    zew() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zet[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zet(parcel);
    }
}
