package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: olz */
final class olz implements Creator {
    olz() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new olw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new olw(parcel);
    }
}
