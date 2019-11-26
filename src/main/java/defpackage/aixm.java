package defpackage;

/* renamed from: aixm */
public final /* synthetic */ class aixm implements Runnable {
    private final aixn a;
    private final aiqq b;
    private final String c;
    private final int d;
    private final wxi e;

    public aixm(aixn aixn, aiqq aiqq, String str, int i, wxi wxi) {
        this.a = aixn;
        this.b = aiqq;
        this.c = str;
        this.d = i;
        this.e = wxi;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e);
    }
}
