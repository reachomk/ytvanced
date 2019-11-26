package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ppq */
public final class ppq implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pja[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        long j = 0;
        long j2 = j;
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        pkk pkk = str9;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = qot.j(parcel2, readInt);
                    break;
                case 3:
                    str2 = qot.j(parcel2, readInt);
                    break;
                case 4:
                    j = qot.f(parcel2, readInt);
                    break;
                case 5:
                    str3 = qot.j(parcel2, readInt);
                    break;
                case 6:
                    str4 = qot.j(parcel2, readInt);
                    break;
                case 7:
                    str5 = qot.j(parcel2, readInt);
                    break;
                case 8:
                    str6 = qot.j(parcel2, readInt);
                    break;
                case 9:
                    str7 = qot.j(parcel2, readInt);
                    break;
                case 10:
                    str8 = qot.j(parcel2, readInt);
                    break;
                case 11:
                    j2 = qot.f(parcel2, readInt);
                    break;
                case 12:
                    str9 = qot.j(parcel2, readInt);
                    break;
                case 13:
                    pkk = (pkk) qot.a(parcel2, readInt, pkk.CREATOR);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new pja(str, str2, j, str3, str4, str5, str6, str7, str8, j2, str9, pkk);
    }
}
