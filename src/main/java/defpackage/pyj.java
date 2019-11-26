package defpackage;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: pyj */
final class pyj extends Handler {
    private final /* synthetic */ pyd a;

    public pyj(pyd pyd, Looper looper) {
        this.a = pyd;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (this.a.L.get() != message.arg1) {
            if (pyj.b(message)) {
                pyj.a(message);
            }
        } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.a.j()) {
            pyj.a(message);
        } else {
            PendingIntent pendingIntent = null;
            psa psa;
            if (message.what == 4) {
                this.a.I = new psa(message.arg2);
                pyd pyd = this.a;
                if (!(pyd.J || TextUtils.isEmpty(pyd.b()) || TextUtils.isEmpty(null))) {
                    try {
                        Class.forName(pyd.b());
                        pyd = this.a;
                        if (!pyd.J) {
                            pyd.a(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                psa = this.a.I;
                if (psa == null) {
                    psa = new psa(8);
                }
                this.a.D.a(psa);
                this.a.a(psa);
            } else if (message.what == 5) {
                psa = this.a.I;
                if (psa == null) {
                    psa = new psa(8);
                }
                this.a.D.a(psa);
                this.a.a(psa);
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                psa psa2 = new psa(message.arg2, pendingIntent);
                this.a.D.a(psa2);
                this.a.a(psa2);
            } else if (message.what == 6) {
                this.a.a(5, null);
                pyc pyc = this.a.G;
                if (pyc != null) {
                    pyc.a(message.arg2);
                }
                pyd pyd2 = this.a;
                pyd2.v = message.arg2;
                pyd2.w = System.currentTimeMillis();
                this.a.a(5, 1, null);
            } else if (message.what == 2 && !this.a.i()) {
                pyj.a(message);
            } else if (pyj.b(message)) {
                Object obj;
                pyi pyi = (pyi) message.obj;
                synchronized (pyi) {
                    obj = pyi.a;
                    if (pyi.b) {
                        String valueOf = String.valueOf(pyi);
                        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 47);
                        stringBuilder.append("Callback proxy ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" being reused. This is not safe.");
                        Log.w("GmsClient", stringBuilder.toString());
                    }
                }
                if (obj != null) {
                    try {
                        pyi.c();
                    } catch (RuntimeException e) {
                        pyi.b();
                        throw e;
                    }
                }
                pyi.b();
                synchronized (pyi) {
                    pyi.b = true;
                }
                pyi.d();
            } else {
                int i = message.what;
                StringBuilder stringBuilder2 = new StringBuilder(45);
                stringBuilder2.append("Don't know how to handle message: ");
                stringBuilder2.append(i);
                Log.wtf("GmsClient", stringBuilder2.toString(), new Exception());
            }
        }
    }

    private static void a(Message message) {
        pyi pyi = (pyi) message.obj;
        pyi.b();
        pyi.d();
    }

    private static boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }
}
