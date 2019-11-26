package defpackage;

import com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer;

/* renamed from: amkm */
final class amkm implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ amkc b;

    amkm(amkc amkc, long j) {
        this.b = amkc;
        this.a = j;
    }

    public final void run() {
        RemoteEmbeddedPlayer remoteEmbeddedPlayer = this.b.a;
        remoteEmbeddedPlayer.E = this.a;
        remoteEmbeddedPlayer.B = false;
        remoteEmbeddedPlayer.T();
    }
}
