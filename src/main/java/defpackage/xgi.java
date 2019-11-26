package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: xgi */
public final class xgi extends BroadcastReceiver implements xge {
    private final Application a;
    private final xci b;
    private final xhv c;
    private final xrq d;
    private final ttw e = new xgh(this);
    private final ttx f;
    private xgg g;
    private xgd h;

    public xgi(Context context, xci xci, xhv xhv, xrq xrq) {
        this.a = (Application) ((Context) amqw.a((Object) context)).getApplicationContext();
        this.b = (xci) amqw.a((Object) xci);
        this.c = (xhv) amqw.a((Object) xhv);
        this.f = new xgk(xhv);
        this.d = (xrq) amqw.a((Object) xrq);
        this.d.a(this.e);
        this.d.a(this.f);
        this.a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void a() {
        this.a.unregisterReceiver(this);
        this.d.b(this.e);
        this.d.b(this.f);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            b();
            return;
        }
        String valueOf = String.valueOf(intent);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 71);
        stringBuilder.append("Unexpected intent. Received action does not match CONNECTIVITY_ACTION: ");
        stringBuilder.append(valueOf);
        xtl.d(stringBuilder.toString());
    }

    public final void b() {
        this.c.a();
        boolean c = this.c.c();
        xgg xgg = this.g;
        if (xgg == null || c != xgg.a) {
            this.g = new xgg(c);
            this.b.c(this.g);
        }
        int k = this.c.k();
        xgd xgd = this.h;
        if (xgd == null || xgd.a != k) {
            this.h = new xgd(k);
            this.b.c(this.h);
        }
    }
}
