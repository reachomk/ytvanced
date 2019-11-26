package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: baic */
final class baic implements Creator {
    baic() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new baid[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new baid(parcel);
    }
}
