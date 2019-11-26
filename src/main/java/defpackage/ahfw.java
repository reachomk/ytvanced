package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: ahfw */
public final class ahfw extends BroadcastReceiver {
    public final Context a;
    public aiqf b;
    public boolean c;

    public ahfw(Context context) {
        this.a = (Context) amqw.a((Object) context);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.b != null) {
            String str = "state";
            if (intent.hasExtra(str)) {
                boolean z = true;
                if (intent.getIntExtra(str, 1) != 1) {
                    z = false;
                }
                aiqf aiqf = this.b;
                if (z != aiqf.n) {
                    aiqf.n = z;
                    if (z) {
                        aiqf.a(new aiqy(3, 5));
                    } else {
                        aiqf.a(new aiqy());
                    }
                }
            }
        }
    }
}
