package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.List;

/* renamed from: qav */
public final class qav implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        long j = 0;
        long j2 = j;
        long j3 = j2;
        String str = null;
        List list = str;
        String str2 = list;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = qot.d(parcel2, readInt);
                    break;
                case 2:
                    j = qot.f(parcel2, readInt);
                    break;
                case 4:
                    str = qot.j(parcel2, readInt);
                    break;
                case 5:
                    i3 = qot.d(parcel2, readInt);
                    break;
                case 6:
                    list = qot.r(parcel2, readInt);
                    break;
                case 8:
                    j2 = qot.f(parcel2, readInt);
                    break;
                case 10:
                    str3 = qot.j(parcel2, readInt);
                    break;
                case 11:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 12:
                    str2 = qot.j(parcel2, readInt);
                    break;
                case 13:
                    str4 = qot.j(parcel2, readInt);
                    break;
                case 14:
                    i4 = qot.d(parcel2, readInt);
                    break;
                case 15:
                    f = qot.h(parcel2, readInt);
                    break;
                case 16:
                    j3 = qot.f(parcel2, readInt);
                    break;
                case 17:
                    str5 = qot.j(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f, j3, str5);
    }
}
