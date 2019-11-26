package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* renamed from: nyh */
final class nyh extends Handler {
    private final /* synthetic */ nye a;

    public nyh(nye nye, Looper looper) {
        this.a = nye;
        super(looper);
    }

    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        for (nxw nxw : this.a.b) {
            if (Arrays.equals(nxw.k, bArr)) {
                int i = message.what;
                if (nxw.i()) {
                    if (i == 1) {
                        nxw.j = 3;
                        nxw.e();
                    } else if (i == 2) {
                        nxw.b(false);
                        return;
                    } else if (i == 3 && nxw.j == 4) {
                        nxw.j = 3;
                        nxw.b(new oek());
                    }
                }
            }
        }
    }
}
