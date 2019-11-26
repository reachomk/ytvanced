package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nhw */
final class nhw implements Creator {
    nhw() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nht[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nht(parcel);
    }
}
