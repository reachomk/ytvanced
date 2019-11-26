package defpackage;

import android.content.Context;
import android.os.FileObserver;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;

/* renamed from: dtd */
public final class dtd extends FileObserver {
    private final /* synthetic */ Context a;

    public dtd(String str, Context context) {
        this.a = context;
        super(str);
    }

    public final void onEvent(int i, String str) {
        if (i == 2) {
            YouTubeBackupAgent.d(this.a);
        }
    }
}
