package defpackage;

/* renamed from: abhx */
public final /* synthetic */ class abhx implements Runnable {
    private final abhv a;
    private final String b;

    public abhx(abhv abhv, String str) {
        this.a = abhv;
        this.b = str;
    }

    public final void run() {
        abhv abhv = this.a;
        abhv.a.c(this.b);
    }
}
