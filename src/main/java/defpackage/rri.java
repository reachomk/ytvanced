package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rri */
public final class rri implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rrj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        rrh rrh = null;
        IBinder iBinder = rrh;
        PendingIntent pendingIntent = iBinder;
        IBinder iBinder2 = pendingIntent;
        IBinder iBinder3 = iBinder2;
        int i = 1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = qot.d(parcel, readInt);
                    break;
                case 2:
                    rrh = (rrh) qot.a(parcel, readInt, rrh.CREATOR);
                    break;
                case 3:
                    iBinder = qot.k(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) qot.a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = qot.k(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = qot.k(parcel, readInt);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new rrj(i, rrh, iBinder, pendingIntent, iBinder2, iBinder3);
    }
}
