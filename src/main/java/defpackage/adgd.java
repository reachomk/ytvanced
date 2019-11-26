package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: adgd */
public final class adgd extends bay {
    private static final String a = xtl.b("MDX.RouteController");
    private final bcaa b;
    private final adis c;
    private final bcaa d;
    private final String e;

    adgd(bcaa bcaa, adis adis, bcaa bcaa2, String str) {
        this.b = (bcaa) amqw.a((Object) bcaa);
        this.c = (adis) amqw.a((Object) adis);
        this.d = (bcaa) amqw.a((Object) bcaa2);
        this.e = str;
    }

    public final void b(int i) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append("set volume on route: ");
        stringBuilder.append(i);
        xtl.c(str, stringBuilder.toString());
        adqo adqo = (adqo) this.d.get();
        if (adqo.b()) {
            adqo.c.removeMessages(1);
            long b = adqo.b.b() - adqo.d;
            if (b >= 200) {
                adqo.b(i);
                return;
            }
            Handler handler = adqo.c;
            handler.sendMessageDelayed(Message.obtain(handler, 1, i, 0), 200 - b);
            return;
        }
        xtl.a(adqo.a, "Remote control is not connected, cannot change volume");
    }

    public final void c(int i) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("update volume on route: ");
        stringBuilder.append(i);
        xtl.c(str, stringBuilder.toString());
        str = "Remote control is not connected, cannot change volume";
        adqo adqo;
        if (i > 0) {
            adqo = (adqo) this.d.get();
            if (adqo.b()) {
                adqo.a(3);
                return;
            } else {
                xtl.a(adqo.a, str);
                return;
            }
        }
        adqo = (adqo) this.d.get();
        if (adqo.b()) {
            adqo.a(-3);
        } else {
            xtl.a(adqo.a, str);
        }
    }

    public final void b() {
        String str = a;
        String valueOf = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 22);
        stringBuilder.append("route selected screen:");
        stringBuilder.append(valueOf);
        xtl.c(str, stringBuilder.toString());
        ((adgj) this.b.get()).a(this.c, this.e);
    }

    public final void c() {
        String str = a;
        String valueOf = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 24);
        stringBuilder.append("route unselected screen:");
        stringBuilder.append(valueOf);
        xtl.c(str, stringBuilder.toString());
        ((adgj) this.b.get()).a(this.e);
    }
}
