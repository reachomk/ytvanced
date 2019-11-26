package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: anmt */
public final class anmt implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Thing[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        Bundle bundle = null;
        anml anml = bundle;
        String str = anml;
        String str2 = str;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bundle = qot.l(parcel, readInt);
            } else if (c == 2) {
                anml = (anml) qot.a(parcel, readInt, anml.CREATOR);
            } else if (c == 3) {
                str = qot.j(parcel, readInt);
            } else if (c == 4) {
                str2 = qot.j(parcel, readInt);
            } else if (c != 1000) {
                qot.b(parcel, readInt);
            } else {
                i = qot.d(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new Thing(i, bundle, anml, str, str2);
    }
}
