package defpackage;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: aag */
final class aag implements ClassLoaderCreator {
    aag() {
    }

    private static aae a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return aae.f;
        }
        throw new IllegalStateException("superState must be null");
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return aag.a(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aae[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return aag.a(parcel, null);
    }
}
