package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

/* renamed from: iys */
public final class iys implements iyc {
    private final /* synthetic */ VoiceSearchActivity a;

    public iys(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    public final void a() {
        VoiceSearchActivity voiceSearchActivity = this.a;
        if (!voiceSearchActivity.m && !voiceSearchActivity.E) {
            if (voiceSearchActivity.h.c != 1) {
                voiceSearchActivity.c(voiceSearchActivity.l);
            }
            this.a.o();
        }
    }

    public final void a(Throwable th) {
        VoiceSearchActivity voiceSearchActivity = this.a;
        if (voiceSearchActivity.h.c != 1) {
            voiceSearchActivity.c(voiceSearchActivity.l);
        }
        if (!(th == null || th.getMessage() == null)) {
            afpc.a(2, afpf.youtube_assistant, th.getMessage(), th);
            String valueOf = String.valueOf(th.getMessage());
            String str = "VoiceSearchActivity error: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            xtl.c(valueOf);
        }
        this.a.m();
    }

    public final void a(anvu anvu) {
        try {
            azyd azyd = (azyd) anxl.parseFrom(azyd.c, anvu);
            akcj akcj = (akcj) this.a.x.a((azyd.a == 1 ? (anvu) azyd.b : anvu.a).d(), akcj.class);
            if (akcj != null) {
                String str = "";
                VoiceSearchActivity voiceSearchActivity;
                if (akcj.b != null) {
                    byte[] bArr = akcj.a;
                    if (bArr != null) {
                        this.a.u.b(new acvs(bArr));
                    }
                    if (foh.k(this.a.t) && this.a.s.b(atyw.LATENCY_ACTION_VOICE_ASSISTANT, str)) {
                        this.a.s.a("voz_rqf", atyw.LATENCY_ACTION_VOICE_ASSISTANT, str);
                    }
                    voiceSearchActivity = this.a;
                    byte[] d = anvu.d();
                    Intent intent = voiceSearchActivity.getIntent();
                    intent.putExtra("RecognizedText", d);
                    intent.putExtra("AssistantCsn", voiceSearchActivity.u.d());
                    voiceSearchActivity.setResult(-1, intent);
                    voiceSearchActivity.c(voiceSearchActivity.j);
                    voiceSearchActivity.p();
                    return;
                }
                String[] strArr = akcj.e;
                if (strArr == null || strArr.length <= 0) {
                    VoiceSearchActivity voiceSearchActivity2 = this.a;
                    if (voiceSearchActivity2.h.c != 1) {
                        voiceSearchActivity2.c(voiceSearchActivity2.l);
                    }
                    this.a.m();
                } else {
                    voiceSearchActivity = this.a;
                    voiceSearchActivity.F = strArr;
                    voiceSearchActivity.q();
                    this.a.C.setVisibility(0);
                    if (foh.k(this.a.t) && this.a.s.b(atyw.LATENCY_ACTION_VOICE_ASSISTANT, str)) {
                        this.a.s.a("voz_vt", atyw.LATENCY_ACTION_VOICE_ASSISTANT, str);
                    }
                }
            }
        } catch (anyg unused) {
        }
    }
}
