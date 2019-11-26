package defpackage;

import com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer;

/* renamed from: amko */
final class amko implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ long b;
    private final /* synthetic */ amkc c;

    amko(amkc amkc, long j, long j2) {
        this.c = amkc;
        this.a = j;
        this.b = j2;
    }

    public final void run() {
        RemoteEmbeddedPlayer remoteEmbeddedPlayer = this.c.a;
        remoteEmbeddedPlayer.E = this.a;
        remoteEmbeddedPlayer.F = this.b;
    }
}
