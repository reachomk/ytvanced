package defpackage;

import com.google.android.apps.youtube.app.search.voice.BitmapSoundLevelsView;
import com.google.android.apps.youtube.app.search.voice.MicrophoneView;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import java.util.List;

/* renamed from: iyv */
public final class iyv implements iyf {
    private final /* synthetic */ VoiceSearchActivity a;

    public iyv(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    public final void a() {
        this.a.i.setVisibility(0);
        this.a.y.setVisibility(0);
        MicrophoneView microphoneView = this.a.h;
        microphoneView.c = 2;
        microphoneView.b();
    }

    public final void a(List list) {
        for (ampb ampb : list) {
            float f;
            float f2 = ampb.b;
            if (((double) f2) == 1.0d) {
                this.a.E = true;
            }
            arvt b = this.a.t.b();
            if (b != null) {
                aume aume = b.e;
                if (aume == null) {
                    aume = aume.af;
                }
                f = aume.E;
            } else {
                f = 0.0f;
            }
            if (f2 >= f || this.a.E) {
                VoiceSearchActivity voiceSearchActivity = this.a;
                if (voiceSearchActivity.h.c != 1) {
                    voiceSearchActivity.C.setVisibility(8);
                    this.a.z.setVisibility(8);
                }
                if (((double) ampb.b) >= 0.8d) {
                    String str = "";
                    this.a.y.setText(str);
                    this.a.i.setText(ampb.a);
                    if (foh.k(this.a.t) && this.a.s.b(atyw.LATENCY_ACTION_VOICE_ASSISTANT, str)) {
                        this.a.s.a("voz_sf", atyw.LATENCY_ACTION_VOICE_ASSISTANT, str);
                    }
                } else {
                    this.a.y.setText(ampb.a);
                }
            }
        }
    }

    public final void a(int i) {
        if (i > 0) {
            boolean z = true;
            if (foh.k(this.a.t)) {
                String str = "";
                if (this.a.s.b(atyw.LATENCY_ACTION_VOICE_ASSISTANT, str)) {
                    VoiceSearchActivity voiceSearchActivity = this.a;
                    if (!voiceSearchActivity.D) {
                        voiceSearchActivity.D = true;
                        voiceSearchActivity.s.a("voz_ss", atyw.LATENCY_ACTION_VOICE_ASSISTANT, str);
                    }
                }
            }
            MicrophoneView microphoneView = this.a.h;
            if (i > 100) {
                z = false;
            }
            amqw.a(z);
            BitmapSoundLevelsView bitmapSoundLevelsView = microphoneView.a;
            amqw.a(z);
            bitmapSoundLevelsView.a = i;
        }
    }

    public final void b() {
        if (foh.k(this.a.t)) {
            String str = "";
            if (this.a.s.b(atyw.LATENCY_ACTION_VOICE_ASSISTANT, str)) {
                this.a.s.a("voz_mf", atyw.LATENCY_ACTION_VOICE_ASSISTANT, str);
            }
        }
        VoiceSearchActivity voiceSearchActivity = this.a;
        voiceSearchActivity.m = false;
        ixp ixp = voiceSearchActivity.n;
        if (ixp != null) {
            ixp.a();
        }
        voiceSearchActivity.h.setEnabled(false);
        MicrophoneView microphoneView = voiceSearchActivity.h;
        microphoneView.c = 4;
        microphoneView.b();
    }
}
