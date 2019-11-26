package defpackage;

/* renamed from: acui */
final class acui implements Runnable {
    private final /* synthetic */ asmy a;
    private final /* synthetic */ asmw b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ acuf f;

    acui(acuf acuf, asmy asmy, asmw asmw, String str, String str2, boolean z) {
        this.f = acuf;
        this.a = asmy;
        this.b = asmw;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final void run() {
        acuf acuf = this.f;
        acul acul = acuf.b;
        if (acul.f) {
            aqui a;
            asmy asmy = this.a;
            if (acul.e.containsKey(asmy)) {
                a = aqui.a(((Integer) acul.e.get(asmy)).intValue());
            } else {
                a = aqui.DELAYED_EVENT_TIER_DEFAULT;
            }
            argt argt = this.f.b.a;
            if ((argt.a & 256) != 0 && argt.f) {
                a = aqui.DELAYED_EVENT_TIER_IMMEDIATE;
            }
            this.f.a.a(a, (njz) ((anxo) acuf.a(this.b, this.c, this.d, this.e).toBuilder()));
            return;
        }
        acuf.a.a((njz) ((anxo) acuf.a(this.b, this.c, this.d, this.e).toBuilder()));
    }
}
