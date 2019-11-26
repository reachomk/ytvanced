package defpackage;

/* renamed from: afzl */
final /* synthetic */ class afzl implements Runnable {
    private final afzj a;
    private final String b;
    private final String c;

    afzl(afzj afzj, String str, String str2) {
        this.a = afzj;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        afzj afzj = this.a;
        String str = this.b;
        String str2 = this.c;
        if (afzj.b.v()) {
            ((agfi) afzj.a.get()).b(str, str2);
        }
    }
}
