package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: zjw */
final class zjw implements Creator {
    zjw() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zjt[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zjt(parcel);
    }
}
