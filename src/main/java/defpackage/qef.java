package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import java.util.List;

/* renamed from: qef */
public final class qef implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ErrorReport[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = applicationErrorReport;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String[] strArr = str13;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr2;
        String str14 = strArr3;
        String str15 = str14;
        byte[] bArr = str15;
        String str16 = bArr;
        String str17 = str16;
        String str18 = str17;
        Bundle bundle = str18;
        String str19 = bundle;
        String str20 = str19;
        String str21 = str20;
        String str22 = str21;
        String str23 = str22;
        String str24 = str23;
        String str25 = str24;
        String str26 = str25;
        String str27 = str26;
        BitmapTeleporter bitmapTeleporter = str27;
        String str28 = bitmapTeleporter;
        qdz[] qdzArr = str28;
        String[] strArr4 = qdzArr;
        String str29 = strArr4;
        qeb qeb = str29;
        qec qec = qeb;
        String str30 = qec;
        Bundle bundle2 = str30;
        List list = bundle2;
        Bitmap bitmap = list;
        String str31 = bitmap;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) qot.a(parcel2, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = qot.j(parcel2, readInt);
                    break;
                case 4:
                    i = qot.d(parcel2, readInt);
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
                    str5 = qot.j(parcel2, readInt);
                    break;
                case 9:
                    str6 = qot.j(parcel2, readInt);
                    break;
                case 10:
                    str7 = qot.j(parcel2, readInt);
                    break;
                case 11:
                    str8 = qot.j(parcel2, readInt);
                    break;
                case 12:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 13:
                    str9 = qot.j(parcel2, readInt);
                    break;
                case 14:
                    str10 = qot.j(parcel2, readInt);
                    break;
                case 15:
                    str11 = qot.j(parcel2, readInt);
                    break;
                case 16:
                    str12 = qot.j(parcel2, readInt);
                    break;
                case 17:
                    str13 = qot.j(parcel2, readInt);
                    break;
                case 18:
                    strArr = qot.q(parcel2, readInt);
                    break;
                case 19:
                    strArr2 = qot.q(parcel2, readInt);
                    break;
                case 20:
                    strArr3 = qot.q(parcel2, readInt);
                    break;
                case 21:
                    str14 = qot.j(parcel2, readInt);
                    break;
                case 22:
                    str15 = qot.j(parcel2, readInt);
                    break;
                case 23:
                    bArr = qot.m(parcel2, readInt);
                    break;
                case 24:
                    i3 = qot.d(parcel2, readInt);
                    break;
                case 25:
                    i4 = qot.d(parcel2, readInt);
                    break;
                case 26:
                    i5 = qot.d(parcel2, readInt);
                    break;
                case 27:
                    i6 = qot.d(parcel2, readInt);
                    break;
                case 28:
                    str16 = qot.j(parcel2, readInt);
                    break;
                case 29:
                    str17 = qot.j(parcel2, readInt);
                    break;
                case 30:
                    str18 = qot.j(parcel2, readInt);
                    break;
                case 31:
                    bundle = qot.l(parcel2, readInt);
                    break;
                case ' ':
                    z = qot.c(parcel2, readInt);
                    break;
                case '!':
                    i7 = qot.d(parcel2, readInt);
                    break;
                case '\"':
                    i8 = qot.d(parcel2, readInt);
                    break;
                case '#':
                    z2 = qot.c(parcel2, readInt);
                    break;
                case '$':
                    str19 = qot.j(parcel2, readInt);
                    break;
                case '%':
                    str20 = qot.j(parcel2, readInt);
                    break;
                case '&':
                    i9 = qot.d(parcel2, readInt);
                    break;
                case '\'':
                    str21 = qot.j(parcel2, readInt);
                    break;
                case '(':
                    str22 = qot.j(parcel2, readInt);
                    break;
                case ')':
                    str23 = qot.j(parcel2, readInt);
                    break;
                case '*':
                    str24 = qot.j(parcel2, readInt);
                    break;
                case '+':
                    str25 = qot.j(parcel2, readInt);
                    break;
                case ',':
                    str26 = qot.j(parcel2, readInt);
                    break;
                case '-':
                    str27 = qot.j(parcel2, readInt);
                    break;
                case '.':
                    bitmapTeleporter = (BitmapTeleporter) qot.a(parcel2, readInt, BitmapTeleporter.CREATOR);
                    break;
                case '/':
                    str28 = qot.j(parcel2, readInt);
                    break;
                case '0':
                    qdzArr = (qdz[]) qot.b(parcel2, readInt, qdz.CREATOR);
                    break;
                case cv.aT /*49*/:
                    strArr4 = qot.q(parcel2, readInt);
                    break;
                case cv.aU /*50*/:
                    z3 = qot.c(parcel2, readInt);
                    break;
                case cv.aV /*51*/:
                    str29 = qot.j(parcel2, readInt);
                    break;
                case cv.aW /*52*/:
                    qeb = (qeb) qot.a(parcel2, readInt, qeb.CREATOR);
                    break;
                case cv.aX /*53*/:
                    qec = (qec) qot.a(parcel2, readInt, qec.CREATOR);
                    break;
                case cv.aY /*54*/:
                    str30 = qot.j(parcel2, readInt);
                    break;
                case cv.aZ /*55*/:
                    z4 = qot.c(parcel2, readInt);
                    break;
                case cv.ba /*56*/:
                    bundle2 = qot.l(parcel2, readInt);
                    break;
                case cv.bb /*57*/:
                    list = qot.c(parcel2, readInt, RectF.CREATOR);
                    break;
                case ':':
                    z5 = qot.c(parcel2, readInt);
                    break;
                case cv.bc /*59*/:
                    bitmap = (Bitmap) qot.a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case cv.bd /*60*/:
                    str31 = qot.j(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, qdzArr, strArr4, z3, str29, qeb, qec, str30, z4, bundle2, list, z5, bitmap, str31);
    }
}
