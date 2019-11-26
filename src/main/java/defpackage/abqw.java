package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: abqw */
final class abqw implements Creator {
    abqw() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new abqx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new abqx(parcel);
    }
}
