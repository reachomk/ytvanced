package defpackage;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: bja */
final class bja implements ClassLoaderCreator {
    bja() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new bix(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bix[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bix(parcel, null);
    }
}
