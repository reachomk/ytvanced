package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bajh */
final class bajh implements Creator {
    bajh() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new baje[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new baje(parcel);
    }
}
