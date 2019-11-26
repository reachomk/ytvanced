package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: ruq */
public final class ruq implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AvatarReference[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        Long l = str5;
        Long l2 = l;
        int i = 0;
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
                    str2 = qot.j(parcel, readInt);
                    break;
                case 4:
                    str3 = qot.j(parcel, readInt);
                    break;
                case 5:
                    str4 = qot.j(parcel, readInt);
                    break;
                case 6:
                    str5 = qot.j(parcel, readInt);
                    break;
                case 7:
                    l = qot.g(parcel, readInt);
                    break;
                case 8:
                    l2 = qot.g(parcel, readInt);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new AvatarReference(i, str, str2, str3, str4, str5, l, l2);
    }
}
