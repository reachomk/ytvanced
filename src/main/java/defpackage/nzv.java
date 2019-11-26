package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nzv */
final class nzv implements Creator {
    nzv() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nzw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nzw(parcel);
    }
}
