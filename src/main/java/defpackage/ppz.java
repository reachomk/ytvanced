package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaInfo;

/* renamed from: ppz */
public final class ppz implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pjy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        double d = 0.0d;
        double d2 = d;
        double d3 = d2;
        MediaInfo mediaInfo = null;
        long[] jArr = mediaInfo;
        String str = jArr;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) qot.a(parcel2, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    i = qot.d(parcel2, readInt);
                    break;
                case 4:
                    z = qot.c(parcel2, readInt);
                    break;
                case 5:
                    d = qot.i(parcel2, readInt);
                    break;
                case 6:
                    d2 = qot.i(parcel2, readInt);
                    break;
                case 7:
                    d3 = qot.i(parcel2, readInt);
                    break;
                case 8:
                    jArr = qot.p(parcel2, readInt);
                    break;
                case 9:
                    str = qot.j(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new pjy(mediaInfo, i, z, d, d2, d3, jArr, str);
    }
}
