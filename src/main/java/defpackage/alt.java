package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: alt */
final class alt implements Creator {
    alt() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new alu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new alu(parcel);
    }
}
