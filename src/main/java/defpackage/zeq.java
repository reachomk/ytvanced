package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: zeq */
final class zeq implements Creator {
    zeq() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zen[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zen(parcel);
    }
}
