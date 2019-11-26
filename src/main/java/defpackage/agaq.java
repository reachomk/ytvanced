package defpackage;

/* renamed from: agaq */
final /* synthetic */ class agaq implements Runnable {
    private final agak a;
    private final String b;

    agaq(agak agak, String str) {
        this.a = agak;
        this.b = str;
    }

    public final void run() {
        agak agak = this.a;
        agak.e.edit().putLong(this.b, agak.c.a()).apply();
        afzh d = agak.d();
        if (d != null) {
            ((agps) agak.j.get()).a(d.a(true));
        }
    }
}
