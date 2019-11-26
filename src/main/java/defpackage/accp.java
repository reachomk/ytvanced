package defpackage;

/* renamed from: accp */
final /* synthetic */ class accp implements Runnable {
    private final acck a;
    private final Throwable b;

    accp(acck acck, Throwable th) {
        this.a = acck;
        this.b = th;
    }

    public final void run() {
        acck acck = this.a;
        Throwable th = this.b;
        if (acck.j != null) {
            acck.j.a(new aanq("Stream health monitor thread died", th));
        }
    }
}
