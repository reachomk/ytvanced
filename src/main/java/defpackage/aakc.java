package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aakc */
final class aakc implements Creator {
    aakc() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aakb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aakb((nke) xup.a(parcel, nke.d));
    }
}
