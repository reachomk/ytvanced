package defpackage;

/* renamed from: sgx */
final /* synthetic */ class sgx implements Runnable {
    private final sgy a;

    sgx(sgy sgy) {
        this.a = sgy;
    }

    public final void run() {
        sgy sgy = this.a;
        sha sha = sgy.b;
        if (sha != null) {
            sha.a(sgy.b());
        }
    }
}
