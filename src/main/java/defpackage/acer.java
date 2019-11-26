package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: acer */
final class acer implements Creator {
    acer() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aceo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aceo(parcel);
    }
}
