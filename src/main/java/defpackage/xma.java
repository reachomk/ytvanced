package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* renamed from: xma */
public final class xma extends BroadcastReceiver {
    public final Context a;
    public final xmc b;
    public Map c;
    private final xci d;

    public xma(Context context, xmc xmc, xci xci) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (xmc) amqw.a((Object) xmc);
        this.d = (xci) amqw.a((Object) xci);
    }

    public final void onReceive(Context context, Intent intent) {
        Map map = this.c;
        this.c = this.b.b();
        if (!this.c.equals(map)) {
            this.b.h();
            this.d.d(new xlz());
        }
    }
}
