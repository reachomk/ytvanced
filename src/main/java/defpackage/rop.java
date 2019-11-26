package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

@qlp
/* renamed from: rop */
public final class rop extends pcg {
    private final roo a;
    private final Drawable b;
    private final Uri c;
    private final double d;

    public rop(roo roo) {
        Drawable drawable;
        double c;
        String str = "";
        this.a = roo;
        Uri uri = null;
        try {
            qcs a = this.a.a();
            if (a != null) {
                drawable = (Drawable) qct.a(a);
                this.b = drawable;
                uri = this.a.b();
                this.c = uri;
                c = this.a.c();
                this.d = c;
            }
        } catch (RemoteException e) {
            qml.a(str, e);
        }
        drawable = null;
        this.b = drawable;
        try {
            uri = this.a.b();
        } catch (RemoteException e2) {
            qml.a(str, e2);
        }
        this.c = uri;
        try {
            c = this.a.c();
        } catch (RemoteException e3) {
            qml.a(str, e3);
            c = 1.0d;
        }
        this.d = c;
    }

    public final Drawable a() {
        return this.b;
    }

    public final Uri b() {
        return this.c;
    }

    public final double c() {
        return this.d;
    }
}
