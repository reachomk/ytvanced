package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vr */
final class vr implements Creator {
    vr() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new vo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new vo(parcel.readInt(), parcel.readFloat());
    }
}
