package defpackage;

import com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer;

/* renamed from: amkh */
final class amkh implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ long e;
    private final /* synthetic */ long f;
    private final /* synthetic */ amkc g;

    amkh(amkc amkc, String str, String str2, boolean z, boolean z2, long j, long j2) {
        this.g = amkc;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = j2;
    }

    public final void run() {
        this.g.a.a(this.a, this.b);
        RemoteEmbeddedPlayer remoteEmbeddedPlayer = this.g.a;
        remoteEmbeddedPlayer.D = this.c;
        remoteEmbeddedPlayer.C = this.d;
        remoteEmbeddedPlayer.E = this.e;
        remoteEmbeddedPlayer.F = this.f;
    }
}
