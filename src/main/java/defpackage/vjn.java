package defpackage;

/* renamed from: vjn */
final class vjn implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ vsm c;
    public final /* synthetic */ viz d;

    vjn(viz viz, String str, String str2, vsm vsm) {
        this.d = viz;
        this.a = str;
        this.b = str2;
        this.c = vsm;
    }

    public final void run() {
        vka g = this.d.a.g(this.a);
        if (!wcf.c(this.d.g)) {
            this.d.b.a(g);
        }
        this.d.c.execute(new vjm(this, g));
    }
}
