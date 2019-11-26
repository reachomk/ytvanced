package defpackage;

/* renamed from: amie */
final /* synthetic */ class amie implements Runnable {
    private final amhz a;
    private final String b;

    amie(amhz amhz, String str) {
        this.a = amhz;
        this.b = str;
    }

    public final void run() {
        amhz amhz = this.a;
        String str = this.b;
        synchronized (amhz.f) {
            amhz.f.remove(str);
        }
    }
}
