package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: adje */
final class adje implements Creator {
    adje() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new adjb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new adjb(parcel.readString());
    }
}
