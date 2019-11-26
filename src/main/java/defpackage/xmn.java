package defpackage;

/* renamed from: xmn */
public final class xmn implements Runnable {
    private final /* synthetic */ nkp a;
    private final /* synthetic */ xml b;

    public xmn(xml xml, nkp nkp) {
        this.b = xml;
        this.a = nkp;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
