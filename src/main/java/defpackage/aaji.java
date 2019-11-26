package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aaji */
final class aaji implements Creator {
    aaji() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aajj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new aajj((awdg) xup.a(parcel, awdg.J));
        } catch (IllegalArgumentException unused) {
            return aajj.b;
        }
    }
}
