package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: acsu */
final class acsu implements Creator {
    acsu() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new acsv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new acsv(parcel);
    }
}
