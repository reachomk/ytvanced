package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;

/* renamed from: qhc */
public final class qhc implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        String str = null;
        Account account = str;
        Bundle bundle = account;
        String str2 = bundle;
        String str3 = str2;
        Bitmap bitmap = str3;
        List list = bitmap;
        Bundle bundle2 = list;
        Bitmap bitmap2 = bundle2;
        byte[] bArr = bitmap2;
        String str4 = bArr;
        Uri uri = str4;
        List list2 = uri;
        qeb qeb = list2;
        List list3 = qeb;
        ErrorReport errorReport = list3;
        TogglingData togglingData = errorReport;
        PendingIntent pendingIntent = togglingData;
        String str5 = pendingIntent;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
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
                    account = (Account) qot.a(parcel2, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = qot.l(parcel2, readInt);
                    break;
                case 5:
                    z = qot.c(parcel2, readInt);
                    break;
                case 6:
                    z2 = qot.c(parcel2, readInt);
                    break;
                case 7:
                    list = qot.r(parcel2, readInt);
                    break;
                case 10:
                    bundle2 = qot.l(parcel2, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) qot.a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = qot.j(parcel2, readInt);
                    break;
                case 15:
                    uri = (Uri) qot.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 16:
                    list2 = qot.c(parcel2, readInt, qgl.CREATOR);
                    break;
                case 17:
                    i4 = qot.d(parcel2, readInt);
                    break;
                case 18:
                    list3 = qot.c(parcel2, readInt, qfy.CREATOR);
                    break;
                case 19:
                    bArr = qot.m(parcel2, readInt);
                    break;
                case 20:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 21:
                    i3 = qot.d(parcel2, readInt);
                    break;
                case 22:
                    z3 = qot.c(parcel2, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) qot.a(parcel2, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    qeb = (qeb) qot.a(parcel2, readInt, qeb.CREATOR);
                    break;
                case 28:
                    str2 = qot.j(parcel2, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) qot.a(parcel2, readInt, TogglingData.CREATOR);
                    break;
                case ' ':
                    i5 = qot.d(parcel2, readInt);
                    break;
                case '!':
                    pendingIntent = (PendingIntent) qot.a(parcel2, readInt, PendingIntent.CREATOR);
                    break;
                case '\"':
                    str3 = qot.j(parcel2, readInt);
                    break;
                case '#':
                    bitmap = (Bitmap) qot.a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case '$':
                    i6 = qot.d(parcel2, readInt);
                    break;
                case '%':
                    z4 = qot.c(parcel2, readInt);
                    break;
                case '&':
                    z5 = qot.c(parcel2, readInt);
                    break;
                case '\'':
                    i7 = qot.d(parcel2, readInt);
                    break;
                case '(':
                    str5 = qot.j(parcel2, readInt);
                    break;
                case ')':
                    z6 = qot.c(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, list, bundle2, bitmap2, bArr, i2, i3, str4, uri, list2, i4, qeb, list3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6);
    }
}
