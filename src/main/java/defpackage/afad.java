package defpackage;

/* renamed from: afad */
final /* synthetic */ class afad implements Runnable {
    private final aezw a;
    private final String b;
    private final aevf c;

    afad(aezw aezw, String str, aevf aevf) {
        this.a = aezw;
        this.b = str;
        this.c = aevf;
    }

    public final void run() {
        aezw aezw = this.a;
        aezw.b.a(this.b, this.c);
    }
}
