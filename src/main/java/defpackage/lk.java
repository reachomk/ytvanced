package defpackage;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: lk */
final class lk implements ClassLoaderCreator {
    lk() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new li(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new li[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new li(parcel, null);
    }
}
