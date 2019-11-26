package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: hky */
final class hky extends BroadcastReceiver {
    private final /* synthetic */ hku a;

    hky(hku hku) {
        this.a = hku;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.a.e != null) {
            String str = "video_id";
            if (intent.hasExtra(str)) {
                this.a.e.a(intent.getStringExtra(str));
            } else {
                str = "playlist_id";
                if (intent.hasExtra(str)) {
                    if (intent.getBooleanExtra("is_sync", false)) {
                        this.a.e.c(intent.getStringExtra(str));
                        return;
                    }
                    this.a.e.b(intent.getStringExtra(str));
                }
            }
        }
    }
}
