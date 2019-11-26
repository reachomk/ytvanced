package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aihr */
final class aihr implements Creator {
    aihr() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aihs[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aihs(parcel.readLong(), parcel.readLong());
    }
}
