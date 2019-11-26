package com.google.android.libraries.youtube.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import defpackage.ahfm;
import defpackage.wd;
import defpackage.wq;
import defpackage.xfc;

public final class PlayerUiModule {

    public class LegacyMediaButtonIntentReceiver extends BroadcastReceiver {
        public final void onReceive(Context context, Intent intent) {
            wq wqVar = ((ahfm) ((xfc) context.getApplicationContext()).n()).pa().c;
            if (wqVar != null) {
                wd wdVar = wqVar.b;
                if (wdVar != null) {
                    if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                        if (keyEvent != null) {
                            wdVar.a.a(keyEvent);
                        }
                    }
                }
            }
        }
    }
}
