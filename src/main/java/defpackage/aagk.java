package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aagk */
final class aagk implements Creator {
    aagk() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aagl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new aagl((nkz) xup.a(parcel, nkz.k));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
