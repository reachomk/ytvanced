package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aicg */
final class aicg implements Creator {
    aicg() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aicd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aicd(parcel);
    }
}
