package defpackage;

/* renamed from: aemc */
final /* synthetic */ class aemc implements Runnable {
    private final aema a;
    private final String b;
    private final Object c;

    aemc(aema aema, String str, Object obj) {
        this.a = aema;
        this.b = str;
        this.c = obj;
    }

    public final void run() {
        this.a.h.a(new afif(1, this.b, 0, this.c));
    }
}
