package defpackage;

/* renamed from: zlm */
final /* synthetic */ class zlm implements zml {
    private final zkk a;

    public zlm(zkk zkk) {
        this.a = zkk;
    }

    public final void a(Object obj) {
        zkk zkk = this.a;
        String str = (String) obj;
        synchronized (zkk.o) {
            if (zkk.H) {
                if (zkk.Q) {
                    zkk.P.a(str);
                }
            }
            zkk.o.add(str);
        }
    }
}
