package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: utg */
final class utg implements Creator {
    utg() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new utd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        boolean z = true;
        boolean z2 = parcel.readInt() == 1;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new utd(readString, readString2, readString3, z2, z, parcel.readString());
    }
}
