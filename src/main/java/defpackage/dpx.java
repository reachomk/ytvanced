package defpackage;

import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;

/* renamed from: dpx */
final class dpx implements Runnable {
    private final /* synthetic */ dos a;

    dpx(dos dos) {
        this.a = dos;
    }

    public final void run() {
        if (YouTubeBackupAgent.a((xti) this.a.al.get())) {
            dos dos = this.a;
            dos.b = YouTubeBackupAgent.a(dos.aD);
            dos = this.a;
            dos.c = YouTubeBackupAgent.b(dos.aD);
        }
    }
}
