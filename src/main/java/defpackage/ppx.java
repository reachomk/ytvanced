package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.List;

/* renamed from: ppx */
public final class ppx implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaInfo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        pjw pjw = str2;
        List list = pjw;
        pkl pkl = list;
        String str3 = pkl;
        List list2 = str3;
        List list3 = list2;
        String str4 = list3;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = qot.j(parcel2, readInt);
                    break;
                case 3:
                    i = qot.d(parcel2, readInt);
                    break;
                case 4:
                    str2 = qot.j(parcel2, readInt);
                    break;
                case 5:
                    pjw = (pjw) qot.a(parcel2, readInt, pjw.CREATOR);
                    break;
                case 6:
                    j = qot.f(parcel2, readInt);
                    break;
                case 7:
                    list = qot.c(parcel2, readInt, MediaTrack.CREATOR);
                    break;
                case 8:
                    pkl = (pkl) qot.a(parcel2, readInt, pkl.CREATOR);
                    break;
                case 9:
                    str3 = qot.j(parcel2, readInt);
                    break;
                case 10:
                    list2 = qot.c(parcel2, readInt, piz.CREATOR);
                    break;
                case 11:
                    list3 = qot.c(parcel2, readInt, pja.CREATOR);
                    break;
                case 12:
                    str4 = qot.j(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new MediaInfo(str, i, str2, pjw, j, list, pkl, str3, list2, list3, str4);
    }
}
