package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;

/* renamed from: nil */
final class nil implements mmy {
    public amma a;

    public nil(amma amma) {
        this.a = (amma) amqw.a((Object) amma);
    }

    public final void a(Bitmap bitmap, String str, boolean z, boolean z2) {
        amma amma = this.a;
        if (amma != null) {
            try {
                amma.a(bitmap, str, z, z2);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(String str, boolean z, boolean z2) {
        amma amma = this.a;
        if (amma != null) {
            try {
                amma.a(str, z, z2);
            } catch (RemoteException unused) {
            }
        }
    }
}
