package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aakp */
final class aakp implements Creator {
    aakp() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aakm[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aakm((nkr) xup.a(parcel, nkr.f));
    }
}
