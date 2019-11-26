package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

/* renamed from: iyp */
public final /* synthetic */ class iyp implements OnClickListener {
    private final VoiceSearchActivity a;

    public iyp(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    public final void onClick(View view) {
        VoiceSearchActivity voiceSearchActivity = this.a;
        voiceSearchActivity.onBackPressed();
        voiceSearchActivity.p();
    }
}
