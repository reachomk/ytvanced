package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aizv */
final class aizv implements Creator {
    aizv() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aizs[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aizs(parcel);
    }
}
