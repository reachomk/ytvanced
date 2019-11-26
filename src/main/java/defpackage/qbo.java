package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qbo */
public final class qbo implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new psa[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = pendingIntent;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c == 2) {
                i2 = qot.d(parcel, readInt);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) qot.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                str = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new psa(i, i2, pendingIntent, str);
    }
}
