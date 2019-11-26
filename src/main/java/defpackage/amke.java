package defpackage;

import com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer;

/* renamed from: amke */
final class amke implements Runnable {
    private final /* synthetic */ amkc a;

    amke(amkc amkc) {
        this.a = amkc;
    }

    public final void run() {
        RemoteEmbeddedPlayer remoteEmbeddedPlayer = this.a.a;
        remoteEmbeddedPlayer.E = -1;
        remoteEmbeddedPlayer.F = -1;
    }
}
