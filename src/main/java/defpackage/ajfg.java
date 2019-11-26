package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ajfg */
final class ajfg implements Creator {
    ajfg() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ajfh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ajfh(parcel);
    }
}
