package defpackage;

/* renamed from: usr */
final class usr implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String[] c;
    private final /* synthetic */ usp d;

    usr(usp usp, String str, String str2, String[] strArr) {
        this.d = usp;
        this.a = str;
        this.b = str2;
        this.c = strArr;
    }

    public final void run() {
        this.d.a.getWritableDatabase().delete(this.a, this.b, this.c);
        this.d.b.open();
    }
}
