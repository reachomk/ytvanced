package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

/* renamed from: iyr */
public final /* synthetic */ class iyr implements OnClickListener {
    private final VoiceSearchActivity a;

    public iyr(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    public final void onClick(View view) {
        VoiceSearchActivity voiceSearchActivity = this.a;
        voiceSearchActivity.A.setVisibility(4);
        voiceSearchActivity.B.setVisibility(8);
        if (voiceSearchActivity.m) {
            voiceSearchActivity.u.a(3, new acvs(acwc.VOICE_SEARCH_MIC_BUTTON), null);
            voiceSearchActivity.c(voiceSearchActivity.k);
            voiceSearchActivity.m();
            return;
        }
        voiceSearchActivity.l();
    }
}
