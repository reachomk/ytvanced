package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: anmr */
public final class anmr implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new anmo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        Thing[] thingArr = null;
        int i = 0;
        String[] strArr = null;
        String[] strArr2 = strArr;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c == 2) {
                thingArr = (Thing[]) qot.b(parcel, readInt, Thing.CREATOR);
            } else if (c == 3) {
                strArr = qot.q(parcel, readInt);
            } else if (c != 5) {
                qot.b(parcel, readInt);
            } else {
                strArr2 = qot.q(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new anmo(i, thingArr, strArr, strArr2);
    }
}
