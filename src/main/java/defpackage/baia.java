package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: baia */
final class baia implements Creator {
    baia() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new baib[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new baib(parcel);
    }
}
