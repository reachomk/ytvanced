package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

/* renamed from: dlt */
final class dlt implements iyu {
    public final /* synthetic */ diu a;
    private volatile abmu b;

    public final void a(VoiceSearchActivity voiceSearchActivity) {
        voiceSearchActivity.g = this.a.oF();
        abmu abmu = this.b;
        if (abmu == null) {
            abmu = new abmu();
            this.b = abmu;
        }
        voiceSearchActivity.q = abmu;
        voiceSearchActivity.r = this.a.ox();
        voiceSearchActivity.s = this.a.dx();
        voiceSearchActivity.t = this.a.n();
        voiceSearchActivity.u = this.a.s();
        voiceSearchActivity.v = new iye(this.a.ag(), this.a.lQ(), this.a.fq(), this.a.K(), this.a.bu(), this.a.ca(), this.a.by(), this.a.lR());
        voiceSearchActivity.w = this.a.lS();
        voiceSearchActivity.x = this.a.cB();
    }

    public final alat b() {
        return new dls(this);
    }

    /* synthetic */ dlt(diu diu) {
        this.a = diu;
    }
}
