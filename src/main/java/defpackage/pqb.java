package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaTrack;

/* renamed from: pqb */
public final class pqb implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaTrack[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    j = qot.f(parcel2, readInt);
                    break;
                case 3:
                    i = qot.d(parcel2, readInt);
                    break;
                case 4:
                    str = qot.j(parcel2, readInt);
                    break;
                case 5:
                    str2 = qot.j(parcel2, readInt);
                    break;
                case 6:
                    str3 = qot.j(parcel2, readInt);
                    break;
                case 7:
                    str4 = qot.j(parcel2, readInt);
                    break;
                case 8:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 9:
                    str5 = qot.j(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new MediaTrack(j, i, str, str2, str3, str4, i2, str5);
    }
}
