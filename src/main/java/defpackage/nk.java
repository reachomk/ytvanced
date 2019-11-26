package defpackage;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: nk */
final class nk implements ClassLoaderCreator {
    nk() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new nl(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nl(parcel, null);
    }
}
