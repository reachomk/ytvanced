package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: nyc */
final class nyc extends Handler {
    private final /* synthetic */ nxw a;

    public nyc(nxw nxw, Looper looper) {
        this.a = nxw;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        nxw nxw;
        Object obj;
        if (i == 0) {
            nxw = this.a;
            obj = message.obj;
            if (nxw.j == 2 || nxw.i()) {
                if (obj instanceof Exception) {
                    nxw.b((Exception) obj);
                } else {
                    try {
                        nxw.a.b((byte[]) obj);
                        if (nxw.a(false)) {
                            nxw.b(true);
                        }
                    } catch (Exception e) {
                        nxw.b(e);
                    }
                }
            }
        } else if (i == 1) {
            nxw = this.a;
            obj = message.obj;
            if (nxw.i()) {
                if (obj instanceof Exception) {
                    nxw.a((Exception) obj);
                } else {
                    nxw.e.d();
                    nxw.e.e();
                    try {
                        byte[] a = nxw.a.a(nxw.k, (byte[]) obj);
                        if (nxw.l != null) {
                            if (!(a == null || a.length == 0)) {
                                nxw.l = a;
                            }
                        }
                        nxw.j = 4;
                        Handler handler = nxw.d;
                        if (!(handler == null || nxw.e == null)) {
                            handler.post(new nxx(nxw));
                        }
                    } catch (Exception e2) {
                        nxw.a(e2);
                    }
                    nxw.e.f();
                }
            }
        }
    }
}
