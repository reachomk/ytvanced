package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: roq */
public final class roq extends riy implements roo {
    roq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final qcs a() {
        Parcel a = a(1, aX_());
        qcs a2 = qcr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final Uri b() {
        Parcel a = a(2, aX_());
        Uri uri = (Uri) rjz.a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    public final double c() {
        Parcel a = a(3, aX_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }
}
