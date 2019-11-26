package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: qby */
public final class qby extends qou {
    public static final Creator CREATOR = new qbx();
    private final String a;
    private final qbs b;
    private final boolean c;

    qby(String str, IBinder iBinder, boolean z) {
        String str2 = "Could not unwrap certificate";
        String str3 = "GoogleCertificatesQuery";
        this.a = str;
        qbs qbs = null;
        if (iBinder != null) {
            try {
                pzb pzb;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof pzb) {
                    pzb = (pzb) queryLocalInterface;
                } else {
                    pzb = new pzc(iBinder);
                }
                qcs a = pzb.a();
                byte[] bArr = a != null ? (byte[]) qct.a(a) : null;
                if (bArr == null) {
                    Log.e(str3, str2);
                } else {
                    qbs = new qbr(bArr);
                }
            } catch (RemoteException e) {
                Log.e(str3, str2, e);
            }
        }
        this.b = qbs;
        this.c = z;
    }

    qby(String str, qbs qbs, boolean z) {
        this.a = str;
        this.b = qbs;
        this.c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        i = qov.a(parcel);
        qov.a(parcel, 1, this.a);
        qbs qbs = this.b;
        if (qbs == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = qbs.asBinder();
        }
        qov.a(parcel, 2, iBinder);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, i);
    }
}
