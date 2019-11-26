package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.CastDevice;
import java.util.List;

/* renamed from: pra */
public final class pra implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new CastDevice[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        List list = str5;
        String str6 = list;
        String str7 = str6;
        String str8 = str7;
        byte[] bArr = str8;
        String str9 = bArr;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
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
                    str3 = qot.j(parcel2, readInt);
                    break;
                case 5:
                    str4 = qot.j(parcel2, readInt);
                    break;
                case 6:
                    str5 = qot.j(parcel2, readInt);
                    break;
                case 7:
                    i = qot.d(parcel2, readInt);
                    break;
                case 8:
                    list = qot.c(parcel2, readInt, pyb.CREATOR);
                    break;
                case 9:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 10:
                    i3 = qot.d(parcel2, readInt);
                    break;
                case 11:
                    str6 = qot.j(parcel2, readInt);
                    break;
                case 12:
                    str7 = qot.j(parcel2, readInt);
                    break;
                case 13:
                    i4 = qot.d(parcel2, readInt);
                    break;
                case 14:
                    str8 = qot.j(parcel2, readInt);
                    break;
                case 15:
                    bArr = qot.m(parcel2, readInt);
                    break;
                case 16:
                    str9 = qot.j(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new CastDevice(str, str2, str3, str4, str5, i, list, i2, i3, str6, str7, i4, str8, bArr, str9);
    }
}
