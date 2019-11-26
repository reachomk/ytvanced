package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.mediarouter.app.MediaRouteButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: azb */
public final class azb extends BroadcastReceiver {
    public final Context a;
    public boolean b = true;
    public final List c;

    public azb(Context context) {
        this.a = context;
        this.c = new ArrayList();
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false) ^ 1;
            if (this.b != booleanExtra) {
                this.b = booleanExtra;
                for (MediaRouteButton bp_ : this.c) {
                    bp_.bp_();
                }
            }
        }
    }
}
