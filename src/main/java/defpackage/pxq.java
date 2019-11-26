package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

/* renamed from: pxq */
public final class pxq implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = str;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = qot.d(parcel, readInt);
            } else if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) qot.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (c != 1000) {
                qot.b(parcel, readInt);
            } else {
                i = qot.d(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new Status(i, i2, str, pendingIntent);
    }
}
