package defpackage;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: aqa */
final class aqa implements ClassLoaderCreator {
    aqa() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new aqb(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aqb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aqb(parcel, null);
    }
}
