package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;

/* renamed from: xag */
final class xag implements ServiceConnection {
    private final /* synthetic */ xah a;

    xag(xah xah) {
        this.a = xah;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a.b) {
            if (this.a.c) {
                if (!(iBinder instanceof Binder)) {
                    String str;
                    Object flattenToString = componentName != null ? componentName.flattenToString() : "null";
                    if (iBinder == null) {
                        str = "null";
                    } else {
                        str = iBinder.getClass().getName();
                    }
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(flattenToString).length() + 78) + str.length());
                    stringBuilder.append("Unexpected IBinder non-concrete-Binder for ComponentName: ");
                    stringBuilder.append(flattenToString);
                    stringBuilder.append(" service className: ");
                    stringBuilder.append(str);
                    xtl.c(stringBuilder.toString());
                }
                xah xah = this.a;
                xah.d = (Binder) iBinder;
                xah.a.open();
                xah = this.a;
                xah.a(xah.d);
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.b) {
            xah xah = this.a;
            if (xah.c) {
                xah.c = false;
                xah.a.close();
                this.a.d = null;
            }
        }
    }
}
