package defpackage;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: ed */
final class ed implements ClassLoaderCreator {
    ed() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ea(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ea[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ea(parcel, null);
    }
}
