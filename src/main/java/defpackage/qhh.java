package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: qhh */
public final class qhh implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qfv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        GoogleHelp googleHelp = null;
        String str = null;
        String str2 = str;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                googleHelp = (GoogleHelp) qot.a(parcel, readInt, GoogleHelp.CREATOR);
            } else if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                str2 = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new qfv(googleHelp, str, str2);
    }
}
