package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: fiv */
final class fiv implements Creator {
    fiv() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new fiw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new fiw(parcel);
    }
}
