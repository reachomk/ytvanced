package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: pqv */
public final class pqv implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pjb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        List list = str2;
        List list2 = list;
        String str3 = list2;
        Uri uri = str3;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = qot.j(parcel, readInt);
                    break;
                case 3:
                    str2 = qot.j(parcel, readInt);
                    break;
                case 4:
                    list = qot.c(parcel, readInt, pyb.CREATOR);
                    break;
                case 5:
                    list2 = qot.r(parcel, readInt);
                    break;
                case 6:
                    str3 = qot.j(parcel, readInt);
                    break;
                case 7:
                    uri = (Uri) qot.a(parcel, readInt, Uri.CREATOR);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new pjb(str, str2, list, list2, str3, uri);
    }
}
