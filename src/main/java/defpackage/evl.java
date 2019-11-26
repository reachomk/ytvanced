package defpackage;

/* renamed from: evl */
final /* synthetic */ class evl implements Runnable {
    private final evm a;

    evl(evm evm) {
        this.a = evm;
    }

    public final void run() {
        evm evm = this.a;
        evm.d = false;
        while (!evm.a.isEmpty()) {
            if (!evm.g() || evm.c() < ((evr) evm.a.peek()).a) {
                break;
            }
            ((evr) evm.a.poll()).a(evm.c);
        }
        evm.b = null;
        evm.f();
    }
}
