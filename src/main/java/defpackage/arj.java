package defpackage;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: arj */
final class arj implements ClassLoaderCreator {
    arj() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new arh(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new arh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new arh(parcel, null);
    }
}
