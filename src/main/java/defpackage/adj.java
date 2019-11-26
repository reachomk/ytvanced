package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: adj */
final class adj implements Creator {
    adj() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new adg[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new adg(parcel);
    }
}
