package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

/* renamed from: dnd */
final class dnd implements iyu {
    public final /* synthetic */ dlu a;
    private volatile abmu b;

    public final void a(VoiceSearchActivity voiceSearchActivity) {
        voiceSearchActivity.g = this.a.dL.oF();
        abmu abmu = this.b;
        if (abmu == null) {
            abmu = new abmu();
            this.b = abmu;
        }
        voiceSearchActivity.q = abmu;
        voiceSearchActivity.r = this.a.dL.ox();
        voiceSearchActivity.s = this.a.dL.dx();
        voiceSearchActivity.t = this.a.dL.n();
        voiceSearchActivity.u = this.a.dL.s();
        voiceSearchActivity.v = new iye(this.a.dL.ag(), this.a.dL.lQ(), this.a.dL.fq(), this.a.dL.K(), this.a.dL.bu(), this.a.dL.ca(), this.a.dL.by(), this.a.dL.lR());
        voiceSearchActivity.w = this.a.dL.lS();
        voiceSearchActivity.x = this.a.dL.cB();
    }

    public final alat b() {
        return new dnc(this);
    }

    /* synthetic */ dnd(dlu dlu) {
        this.a = dlu;
    }
}
