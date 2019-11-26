package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;

/* renamed from: tgw */
public final class tgw implements tgv {
    public final void a(Context context, String str, Map map, tgx tgx) {
        tgz tgz = new tgz(tgx);
        qpr qpr = new qcc(context).a;
        qqa qpu = new qpu(qpr, str, map, tgz);
        long a = (long) qpu.d.a();
        qpr.b.postAtTime(new qpw(qpr, qpu, a), qpu, a + SystemClock.uptimeMillis());
        qpr.a.a(qpu);
    }

    public final tgu a(Context context, String str) {
        qqa qpv = new qpv(new qcc(context).a, str);
        pzr.c("This method must not be called on the main thread.");
        qpv.a.a.a(qpv);
        try {
            Object a = qpv.b.a((long) qpv.d.a());
            if (a == null) {
                int a2 = qpv.d.a();
                StringBuilder stringBuilder = new StringBuilder(23);
                stringBuilder.append("timeout: ");
                stringBuilder.append(a2);
                stringBuilder.append(" ms");
                String stringBuilder2 = stringBuilder.toString();
                qqb qqb = qpv.a.a;
                qqb.getClass();
                stringBuilder2 = String.valueOf(stringBuilder2);
                String str2 = "init ";
                if (stringBuilder2.length() == 0) {
                    stringBuilder2 = new String(str2);
                } else {
                    stringBuilder2 = str2.concat(stringBuilder2);
                }
                a = new qqe(qqb, stringBuilder2);
            }
            return new thb((qcb) a);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
