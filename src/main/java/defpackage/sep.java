package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: sep */
final class sep implements Creator {
    sep() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new sem[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new sem(parcel);
    }
}
