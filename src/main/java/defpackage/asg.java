package defpackage;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: asg */
final class asg implements ClassLoaderCreator {
    asg() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ash(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ash[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ash(parcel, null);
    }
}
