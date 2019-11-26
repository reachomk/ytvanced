package defpackage;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: js */
final class js implements ClassLoaderCreator {
    js() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new jp(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new jp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jp(parcel, null);
    }
}
