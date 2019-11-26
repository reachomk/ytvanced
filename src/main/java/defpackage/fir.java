package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: fir */
final class fir implements Creator {
    fir() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new fis[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new fis(parcel);
    }
}
