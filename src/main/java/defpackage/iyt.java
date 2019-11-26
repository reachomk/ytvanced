package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

/* renamed from: iyt */
public final /* synthetic */ class iyt implements Runnable {
    private final VoiceSearchActivity a;

    public iyt(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    public final void run() {
        VoiceSearchActivity voiceSearchActivity = this.a;
        if (!voiceSearchActivity.isFinishing() && voiceSearchActivity.p != null) {
            voiceSearchActivity.o.a().a(voiceSearchActivity.p).a();
            voiceSearchActivity.p.a = null;
            voiceSearchActivity.p = null;
        }
    }
}
