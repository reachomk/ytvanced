package defpackage;

/* renamed from: agwg */
final class agwg implements Runnable {
    private final /* synthetic */ Class a;
    private final /* synthetic */ String b;
    private final /* synthetic */ agwd c;

    agwg(agwd agwd, Class cls, String str) {
        this.c = agwd;
        this.a = cls;
        this.b = str;
    }

    public final void run() {
        this.c.a(this.a, this.b);
    }
}
