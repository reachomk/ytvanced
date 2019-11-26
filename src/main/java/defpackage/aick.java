package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aick */
final class aick implements Creator {
    aick() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aich[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        aicj aicj = aicj.values()[parcel.readInt()];
        boolean z = true;
        if (parcel.readByte() != (byte) 1) {
            z = false;
        }
        return new aich(aicj, z, (byte) 0);
    }
}
