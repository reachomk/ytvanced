package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: akco */
final class akco implements Creator {
    akco() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new akcl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new akcl(parcel);
    }
}
