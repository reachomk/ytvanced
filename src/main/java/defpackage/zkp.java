package defpackage;

/* renamed from: zkp */
final class zkp implements Runnable {
    private final /* synthetic */ zkq a;

    zkp(zkq zkq) {
        this.a = zkq;
    }

    public final void run() {
        zkq zkq = this.a;
        zkq.e.b.removeCallbacks(zkq.d);
        this.a.e.b();
        zkq = this.a;
        if (zkq.a == null && zkq.b != null) {
            zkq.e.b.postDelayed(zkq.d, zkq.c);
        }
    }
}
