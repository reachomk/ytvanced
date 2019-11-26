package defpackage;

/* renamed from: ljh */
final /* synthetic */ class ljh implements lkc {
    private final bcaa a;
    private final acvx b;

    ljh(bcaa bcaa, acvx acvx) {
        this.a = bcaa;
        this.b = acvx;
    }

    public final void a() {
        bcaa bcaa = this.a;
        acvx acvx = this.b;
        aizy aizy = (aizy) bcaa.get();
        if (aizy.c()) {
            acvx.a(3, new acvs(acwc.MINI_PLAYER_PAUSE_BUTTON), null);
            aizy.b();
            return;
        }
        acvx.a(3, new acvs(acwc.MINI_PLAYER_PLAY_BUTTON), null);
        aizy.a();
    }
}
