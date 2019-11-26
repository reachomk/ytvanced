package defpackage;

/* renamed from: aket */
public final class aket {
    private final Object a = new Object();
    private volatile akev b = null;
    private final bcaa c;

    public aket(akew akew) {
        this.c = akew;
    }

    public final akev a() {
        akev akev = this.b;
        if (akev == null) {
            synchronized (this.a) {
                akev = (akev) this.c.get();
                this.b = akev;
            }
        }
        return akev;
    }
}
