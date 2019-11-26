package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: zqn */
final class zqn implements Creator {
    zqn() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zqk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zqk(parcel);
    }
}
