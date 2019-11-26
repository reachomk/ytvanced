package defpackage;

/* renamed from: agtn */
final /* synthetic */ class agtn implements Runnable {
    private final agtl a;
    private final aiqq b;
    private final wxg c;

    agtn(agtl agtl, aiqq aiqq, wxg wxg) {
        this.a = agtl;
        this.b = aiqq;
        this.c = wxg;
    }

    public final void run() {
        agtl agtl = this.a;
        aiqq aiqq = this.b;
        wxg wxg = this.c;
        agqp h = agtl.a().k().h(aiqq.b());
        boolean z = false;
        if (!aiqq.m() && agtl.a(agtl.b)) {
            z = true;
        }
        agtl.a(h, wxg, z);
    }
}
