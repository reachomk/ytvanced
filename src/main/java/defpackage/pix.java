package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.TokenData;
import java.util.List;

/* renamed from: pix */
public final class pix implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        Long l = str;
        List list = l;
        String str2 = list;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = qot.d(parcel, readInt);
                    break;
                case 2:
                    str = qot.j(parcel, readInt);
                    break;
                case 3:
                    l = qot.g(parcel, readInt);
                    break;
                case 4:
                    z = qot.c(parcel, readInt);
                    break;
                case 5:
                    z2 = qot.c(parcel, readInt);
                    break;
                case 6:
                    list = qot.r(parcel, readInt);
                    break;
                case 7:
                    str2 = qot.j(parcel, readInt);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new TokenData(i, str, l, z, z2, list, str2);
    }
}
