package defpackage;

import android.net.Uri;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ron */
public abstract class ron extends rjn implements roo {
    public ron() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            IInterface a = a();
            parcel2.writeNoException();
            rjz.a(parcel2, a);
        } else if (i == 2) {
            Uri b = b();
            parcel2.writeNoException();
            rjz.b(parcel2, b);
        } else if (i != 3) {
            return false;
        } else {
            double c = c();
            parcel2.writeNoException();
            parcel2.writeDouble(c);
        }
        return true;
    }
}
