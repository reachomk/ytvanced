package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bajf */
final class bajf implements Creator {
    bajf() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bajc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bajc(parcel);
    }
}
