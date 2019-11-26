package defpackage;

import android.os.Handler;
import android.text.TextUtils;

/* renamed from: yvh */
public final class yvh {
    public final aadw a;
    public final amro b;
    public final xsc c;
    private final Handler d;

    public yvh(aadw aadw, yji yji, xsc xsc, Handler handler) {
        this.a = aadw;
        yji.getClass();
        this.b = new yvk(yji);
        this.c = xsc;
        this.d = handler;
    }

    public final void a(String str, String str2) {
        this.d.removeCallbacksAndMessages(yvh.c(str, str2));
    }

    public final yvl b(String str, String str2) {
        str = yic.a("ChatTypingStatus", str);
        ykt ykt = (ykt) this.a.a(str);
        Object obj = null;
        if (ykt == null) {
            ykw f = ykt.f();
            f.a = str;
            return yvl.a(f.a(), null);
        }
        amuh amuh = ykt.e;
        if (amuh == null || amuh.isEmpty()) {
            return yvl.a(ykt, null);
        }
        amxo amxo = (amxo) ykt.e.iterator();
        boolean z = false;
        Object obj2 = null;
        int i = -1;
        int i2 = 0;
        while (amxo.hasNext()) {
            ykr ykr = (ykr) amxo.next();
            boolean equals = TextUtils.equals(ykr.a(), str2);
            if (equals) {
                obj = ykr;
            }
            if (equals) {
                i = i2;
            }
            if (obj2 == null || obj2.c() >= ykr.c()) {
                obj2 = ykr;
            }
            i2++;
        }
        if (obj == null) {
            return yvl.a(ykt, obj2);
        }
        if (i != -1) {
            z = true;
        }
        amqw.a(z);
        amqw.a(obj);
        amqw.a(obj2);
        return new yvl(ykt, i, obj, obj2);
    }

    private static String c(String str, String str2) {
        str = String.valueOf(str);
        str2 = String.valueOf(str2);
        return str2.length() == 0 ? new String(str) : str.concat(str2);
    }

    public final void a(String str, String str2, int i) {
        Runnable yvj;
        int i2;
        a(str, str);
        Handler handler = this.d;
        if (i == 1) {
            yvj = new yvj(this, str, str2);
        } else {
            yvj = new yvm(this, str, str2);
        }
        str = yvh.c(str, str2);
        long c = this.c.c();
        aprm aprm;
        if (i - 1 != 0) {
            aprm = ((yjf) this.b.get()).b().c;
            if (aprm == null) {
                aprm = aprm.f;
            }
            i2 = aprm.c;
        } else {
            aprm = ((yjf) this.b.get()).b().c;
            if (aprm == null) {
                aprm = aprm.f;
            }
            i2 = aprm.b;
        }
        handler.postAtTime(yvj, str, c + ((long) i2));
    }
}
