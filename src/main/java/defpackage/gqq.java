package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: gqq */
final class gqq implements Creator {
    gqq() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new gqr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new gqr(parcel);
    }
}
