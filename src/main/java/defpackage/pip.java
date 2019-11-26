package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.List;

/* renamed from: pip */
public final class pip implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        Uri uri = str4;
        String str5 = uri;
        String str6 = str5;
        List list = str6;
        String str7 = list;
        String str8 = str7;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = qot.d(parcel2, readInt);
                    break;
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
                    uri = (Uri) qot.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = qot.j(parcel2, readInt);
                    break;
                case 8:
                    j = qot.f(parcel2, readInt);
                    break;
                case 9:
                    str6 = qot.j(parcel2, readInt);
                    break;
                case 10:
                    list = qot.c(parcel2, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = qot.j(parcel2, readInt);
                    break;
                case 12:
                    str8 = qot.j(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
    }
}
