package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: anv */
final class anv implements Creator {
    anv() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new anw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new anw(parcel);
    }
}
