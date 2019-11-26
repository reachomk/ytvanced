package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

/* renamed from: iyq */
public final /* synthetic */ class iyq implements Runnable {
    private final VoiceSearchActivity a;

    public iyq(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    public final void run() {
        this.a.recreate();
    }
}
