package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rvc */
public final class rvc implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rvf[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        rvj rvj = null;
        String str = rvj;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 17) {
                switch (c) {
                    case 2:
                        rvj = (rvj) qot.a(parcel, readInt, rvj.CREATOR);
                        break;
                    case 3:
                        str = qot.j(parcel, readInt);
                        break;
                    case 4:
                        str6 = qot.j(parcel, readInt);
                        break;
                    case 5:
                        str3 = qot.j(parcel, readInt);
                        break;
                    case 6:
                        str4 = qot.j(parcel, readInt);
                        break;
                    case 7:
                        str5 = qot.j(parcel, readInt);
                        break;
                    default:
                        qot.b(parcel, readInt);
                        break;
                }
            }
            str2 = qot.j(parcel, readInt);
        }
        qot.s(parcel, a);
        return new rvf(rvj, str, str2, str3, str4, str5, str6);
    }
}
