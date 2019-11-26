package defpackage;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.TimeUnit;

/* renamed from: adkj */
public final class adkj implements adaa, uyo, xcp {
    private static final long b = TimeUnit.HOURS.toMillis(3);
    public final xci a;
    private final adkk c;
    private final xsc d;
    private final boolean e;
    private final Context f;
    private final BroadcastReceiver g;
    private final int h;
    private final int i;

    public adkj(adkk adkk, xsc xsc, Context context, uyp uyp, xci xci, boolean z, int i, int i2) {
        this.c = adkk;
        this.d = xsc;
        this.f = context;
        this.a = xci;
        this.e = z;
        this.h = i;
        this.i = i2;
        this.g = new adki(this, adkk);
        context.registerReceiver(this.g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        uyp.a((uyo) this);
    }

    public final void a() {
    }

    public final String b() {
        return "LivingRoomNotificationRevokeManager";
    }

    public final void g() {
    }

    public final void h() {
    }

    public final adac c() {
        int i = !this.e ? this.h : 15;
        adab e = adac.e();
        long a = this.c.a();
        int b = this.c.b();
        long a2 = this.d.a() - a;
        long j = b;
        boolean z = false;
        if (!(a == 0 || b == -1 || a2 >= j)) {
            z = true;
        }
        return e.a(z).a(this.i).c(i).b(i).a();
    }

    public final void a(amul amul) {
        if (!this.c.d().isEmpty()) {
            if (amul.isEmpty()) {
                e();
            } else if (!this.c.e()) {
                String d = this.c.d();
                amxn amxn = (amxn) amul.listIterator();
                while (amxn.hasNext()) {
                    bbs bbs = (bbs) amxn.next();
                    if (d != null && adhn.a(bbs.c, d)) {
                        return;
                    }
                }
                e();
            }
        }
    }

    public final void d() {
        e();
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        int b = this.c.b();
        this.c.c();
        String string = this.c.a.getString("mdx.last_lr_notification_shown_tag", "");
        if (b != -1) {
            ((NotificationManager) this.f.getSystemService("notification")).cancel(string, b);
        }
    }

    public final void i() {
        e();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{adqk.class, afqh.class};
        } else if (i != 0) {
            if (i == 1) {
                e();
                this.a.b(this);
            } else {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            }
        } else if (((adqk) obj).a != null) {
            e();
            this.a.b(this);
            return null;
        }
        return clsArr;
    }
}
