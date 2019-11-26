package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.List;

/* renamed from: qen */
public final class qen implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qdx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        String str = null;
        Bundle bundle = str;
        String str2 = bundle;
        ApplicationErrorReport applicationErrorReport = str2;
        String str3 = applicationErrorReport;
        BitmapTeleporter bitmapTeleporter = str3;
        String str4 = bitmapTeleporter;
        List list = str4;
        qeb qeb = list;
        qec qec = qeb;
        Bitmap bitmap = qec;
        String str5 = bitmap;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = qot.j(parcel2, readInt);
                    break;
                case 3:
                    bundle = qot.l(parcel2, readInt);
                    break;
                case 5:
                    str2 = qot.j(parcel2, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) qot.a(parcel2, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = qot.j(parcel2, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) qot.a(parcel2, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = qot.j(parcel2, readInt);
                    break;
                case 10:
                    list = qot.c(parcel2, readInt, qdz.CREATOR);
                    break;
                case 11:
                    z = qot.c(parcel2, readInt);
                    break;
                case 12:
                    qeb = (qeb) qot.a(parcel2, readInt, qeb.CREATOR);
                    break;
                case 13:
                    qec = (qec) qot.a(parcel2, readInt, qec.CREATOR);
                    break;
                case 14:
                    z2 = qot.c(parcel2, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) qot.a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = qot.j(parcel2, readInt);
                    break;
                case 17:
                    z3 = qot.c(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new qdx(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, list, z, qeb, qec, z2, bitmap, str5, z3);
    }
}
