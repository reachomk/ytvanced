package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vto */
final class vto implements Creator {
    vto() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new vtp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new vtp((aojx) xup.a(parcel, aojx.w));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
