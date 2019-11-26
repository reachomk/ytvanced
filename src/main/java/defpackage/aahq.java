package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aahq */
final class aahq implements Creator {
    aahq() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aahr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        arlv arlv = (arlv) xup.a(parcel, arlv.E);
        if (arlv != null) {
            return new aahr(arlv, parcel.readString(), parcel.readLong(), xup.a(parcel));
        }
        throw new NullPointerException();
    }
}
