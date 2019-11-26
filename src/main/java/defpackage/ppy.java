package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaInfo;
import java.util.List;

/* renamed from: ppy */
public final class ppy implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pjz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        double d = 0.0d;
        double d2 = d;
        long j = 0;
        long j2 = j;
        long j3 = j2;
        MediaInfo mediaInfo = null;
        long[] jArr = mediaInfo;
        String str = jArr;
        List list = str;
        pjc pjc = list;
        pkn pkn = pjc;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) qot.a(parcel2, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = qot.f(parcel2, readInt);
                    break;
                case 4:
                    i = qot.d(parcel2, readInt);
                    break;
                case 5:
                    d = qot.i(parcel2, readInt);
                    break;
                case 6:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 7:
                    i3 = qot.d(parcel2, readInt);
                    break;
                case 8:
                    j2 = qot.f(parcel2, readInt);
                    break;
                case 9:
                    j3 = qot.f(parcel2, readInt);
                    break;
                case 10:
                    d2 = qot.i(parcel2, readInt);
                    break;
                case 11:
                    z = qot.c(parcel2, readInt);
                    break;
                case 12:
                    jArr = qot.p(parcel2, readInt);
                    break;
                case 13:
                    i4 = qot.d(parcel2, readInt);
                    break;
                case 14:
                    i5 = qot.d(parcel2, readInt);
                    break;
                case 15:
                    str = qot.j(parcel2, readInt);
                    break;
                case 16:
                    i6 = qot.d(parcel2, readInt);
                    break;
                case 17:
                    list = qot.c(parcel2, readInt, pjy.CREATOR);
                    break;
                case 18:
                    z2 = qot.c(parcel2, readInt);
                    break;
                case 19:
                    pjc = (pjc) qot.a(parcel2, readInt, pjc.CREATOR);
                    break;
                case 20:
                    pkn = (pkn) qot.a(parcel2, readInt, pkn.CREATOR);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new pjz(mediaInfo, j, i, d, i2, i3, j2, j3, d2, z, jArr, i4, i5, str, i6, list, z2, pjc, pkn);
    }
}
