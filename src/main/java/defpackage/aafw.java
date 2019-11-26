package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aafw */
final class aafw implements Creator {
    aafw() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aafx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new aafx((aogi) xup.a(parcel, aogi.h));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
