package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IPlayerUiService.Stub;
import defpackage.aiug;
import defpackage.aiuj;
import defpackage.amqw;
import defpackage.nab;

public final class RemotePlayerUi implements aiug {
    public nab a;
    private final PlayerUiService b;

    final class PlayerUiService extends Stub implements aiuj {
        public aiuj a;
        private final Handler b;

        public PlayerUiService(Handler handler) {
            this.b = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
        }

        public final void a() {
            this.b.post(new Runnable() {
                public final void run() {
                    PlayerUiService.this.a.a();
                }
            });
        }
    }

    public RemotePlayerUi(Handler handler, nab nab) {
        this.a = (nab) amqw.a((Object) nab, (Object) "client cannot be null");
        this.b = new PlayerUiService(handler);
        try {
            nab.a(this.b);
        } catch (RemoteException unused) {
        }
    }

    public final void a(aiuj aiuj) {
        this.b.a = (aiuj) amqw.a((Object) aiuj, (Object) "listener cannot be null");
    }

    public final void a(boolean z) {
        nab nab = this.a;
        if (nab != null) {
            try {
                nab.a(z);
            } catch (RemoteException unused) {
            }
        }
    }
}
