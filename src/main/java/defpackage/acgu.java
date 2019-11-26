package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: acgu */
final class acgu implements Creator {
    acgu() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new acgv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new acgv(parcel);
    }
}
