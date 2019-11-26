package defpackage;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: fd */
final class fd implements ClassLoaderCreator {
    fd() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new fa(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new fa[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new fa(parcel, null);
    }
}
