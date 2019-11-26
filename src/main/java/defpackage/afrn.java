package defpackage;

/* renamed from: afrn */
final class afrn implements Runnable {
    private final /* synthetic */ Object a;
    private final /* synthetic */ wxg b;
    private final /* synthetic */ afrk c;

    afrn(afrk afrk, Object obj, wxg wxg) {
        this.c = afrk;
        this.a = obj;
        this.b = wxg;
    }

    public final void run() {
        try {
            this.c.a.a(this.a, this.b);
        } catch (Exception e) {
            xtl.d("target requester should catch exception and pass to callback.onError");
            this.b.a(this.a, e);
        }
    }
}
