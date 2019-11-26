package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: nha */
final class nha implements Creator {
    nha() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ngx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        boolean z = true;
        aiqq aiqq = parcel.readInt() == 1 ? (aiqq) parcel.readParcelable(aiqq.class.getClassLoader()) : null;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new ngx(readInt, aiqq, z);
    }
}
