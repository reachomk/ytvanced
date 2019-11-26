package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: aajt */
final class aajt implements Creator {
    aajt() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aajq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        int i = 0;
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        int readInt2 = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        while (i < readInt2) {
            try {
                arrayList.add((arlz) xup.a(parcel, arlz.c));
                i++;
            } catch (IllegalArgumentException unused) {
            }
        }
        return new aajq(readInt, readString, z, arrayList);
    }
}
