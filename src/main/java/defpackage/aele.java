package defpackage;

/* renamed from: aele */
final /* synthetic */ class aele implements Runnable {
    private final aelb a;
    private final String b;
    private final aevf c;

    aele(aelb aelb, String str, aevf aevf) {
        this.a = aelb;
        this.b = str;
        this.c = aevf;
    }

    public final void run() {
        aelb aelb = this.a;
        aelb.a.a(this.b, this.c);
    }
}
