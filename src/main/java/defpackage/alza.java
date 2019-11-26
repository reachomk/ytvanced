package defpackage;

/* renamed from: alza */
final /* synthetic */ class alza implements Runnable {
    private final alyz a;

    alza(alyz alyz) {
        this.a = alyz;
    }

    public final void run() {
        try {
            this.a.a();
        } catch (alzc e) {
            String valueOf = String.valueOf(e.getMessage());
            String str = "JobStorageException on closing db for idleness: ";
            xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
    }
}
