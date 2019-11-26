package defpackage;

import com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer;

/* renamed from: amkl */
final class amkl implements Runnable {
    private final /* synthetic */ amkc a;

    amkl(amkc amkc) {
        this.a = amkc;
    }

    public final void run() {
        RemoteEmbeddedPlayer remoteEmbeddedPlayer = this.a.a;
        remoteEmbeddedPlayer.B = false;
        remoteEmbeddedPlayer.T();
    }
}
