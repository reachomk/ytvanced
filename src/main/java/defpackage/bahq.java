package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bahq */
final class bahq implements Creator {
    bahq() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bahr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bahr(parcel);
    }
}
