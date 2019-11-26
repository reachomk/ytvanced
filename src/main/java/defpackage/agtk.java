package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: agtk */
final class agtk implements Creator {
    agtk() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new agth[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new agth(parcel);
    }
}
