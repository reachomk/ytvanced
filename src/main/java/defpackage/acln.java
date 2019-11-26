package defpackage;

/* renamed from: acln */
final class acln implements Runnable {
    private final /* synthetic */ aclk a;

    acln(aclk aclk) {
        this.a = aclk;
    }

    public final void run() {
        aclk aclk = this.a;
        if (!aclk.f) {
            aclk.e();
        }
    }
}
