package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bair */
final class bair implements Creator {
    bair() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new baio[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new baio(parcel);
    }
}
