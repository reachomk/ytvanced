package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nhq */
final class nhq implements Creator {
    nhq() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nhn[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nhn(parcel);
    }
}
