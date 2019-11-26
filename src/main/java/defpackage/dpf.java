package defpackage;

/* renamed from: dpf */
final class dpf implements Runnable {
    private final /* synthetic */ dos a;

    dpf(dos dos) {
        this.a = dos;
    }

    public final void run() {
        Object obj = (hhe) this.a.F.get();
        ((hhb) obj.d.get()).a();
        obj.a.registerOnSharedPreferenceChangeListener(obj.g);
        obj.h = new hhh(obj);
        obj.b.a(obj);
        ((agwc) this.a.I.get()).a();
    }
}
