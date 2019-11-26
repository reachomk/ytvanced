package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: anmx */
public final class anmx implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new anmv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        anmu anmu = str4;
        String str5 = anmu;
        Bundle bundle = str5;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = qot.j(parcel, readInt);
                    break;
                case 2:
                    str2 = qot.j(parcel, readInt);
                    break;
                case 3:
                    str3 = qot.j(parcel, readInt);
                    break;
                case 4:
                    str4 = qot.j(parcel, readInt);
                    break;
                case 5:
                    anmu = (anmu) qot.a(parcel, readInt, anmu.CREATOR);
                    break;
                case 6:
                    str5 = qot.j(parcel, readInt);
                    break;
                case 7:
                    bundle = qot.l(parcel, readInt);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new anmv(str, str2, str3, str4, anmu, str5, bundle);
    }
}
