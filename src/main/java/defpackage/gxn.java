package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: gxn */
final class gxn implements Creator {
    gxn() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new gxk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new gxk(parcel);
    }
}
