package defpackage;

/* renamed from: xmo */
public final class xmo implements Runnable {
    private final /* synthetic */ xml a;

    public xmo(xml xml) {
        this.a = xml;
    }

    public final void run() {
        xbu d = this.a.b.d();
        while (d.hasNext()) {
            this.a.b((nkp) d.next());
        }
        d.a();
    }
}
