package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aaki */
final class aaki implements Creator {
    aaki() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aakj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            ajxu ajxu = (ajxu) aamj.a(parcel, new ajxu());
            if (ajxu != null) {
                return new aakj(ajxu, parcel.readLong(), (aajs) parcel.readParcelable(aajs.class.getClassLoader()), (aakl) parcel.readParcelable(aakl.class.getClassLoader()));
            }
        } catch (aocg unused) {
        }
        return null;
    }
}
