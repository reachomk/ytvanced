package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: adqo */
public final class adqo implements xcp {
    public static final String a = xtl.b("MDX.remote");
    public final xsc b;
    public final Handler c;
    public long d = 0;
    private final bcaa e;
    private int f = 0;

    public adqo(bcaa bcaa, xsc xsc) {
        this.e = (bcaa) amqw.a((Object) bcaa);
        this.b = (xsc) amqw.a((Object) xsc);
        this.c = new adqn(this);
    }

    public final void a(int i) {
        if (b()) {
            this.c.removeMessages(0);
            this.f += i;
            long b = this.b.b() - this.d;
            if (b >= 200) {
                a();
                return;
            }
            Handler handler = this.c;
            handler.sendMessageDelayed(Message.obtain(handler, 0), 200 - b);
            return;
        }
        xtl.a(a, "Remote control is not connected, cannot change volume");
    }

    public final void a() {
        adqe c = ((adqf) this.e.get()).c();
        if (this.f != 0 && c != null) {
            adqe c2 = ((adqf) this.e.get()).c();
            c.a(Math.min(100, Math.max(0, (c2 != null ? c2.v() : 0) + this.f)), this.f);
            this.d = this.b.b();
            this.f = 0;
        }
    }

    public final void b(int i) {
        adqe c = ((adqf) this.e.get()).c();
        if (c != null) {
            c.a(i);
            this.d = this.b.b();
        }
    }

    public final boolean b() {
        adqe c = ((adqf) this.e.get()).c();
        return (c == null || c.b()) ? false : true;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adqr.class};
        } else if (i == 0) {
            this.f = 0;
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
