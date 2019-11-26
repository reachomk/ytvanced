package defpackage;

/* renamed from: afcn */
final class afcn implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ afbo b;

    afcn(afbo afbo, String str) {
        this.b = afbo;
        this.a = str;
    }

    public final void run() {
        this.b.j.post(new afcm(this));
    }
}
