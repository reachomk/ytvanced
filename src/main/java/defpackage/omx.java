package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omx */
final class omx implements Creator {
    omx() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new omu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new omu(parcel);
    }
}
