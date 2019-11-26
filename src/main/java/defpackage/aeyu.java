package defpackage;

/* renamed from: aeyu */
final /* synthetic */ class aeyu implements Runnable {
    private final aeyt a;
    private final int b;

    aeyu(aeyt aeyt, int i) {
        this.a = aeyt;
        this.b = i;
    }

    public final void run() {
        aeyt aeyt = this.a;
        int i = this.b;
        aeyw aeyw = aeyt.b;
        String k = aeyt.k();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(k).length() + 11);
        stringBuilder.append(k);
        stringBuilder.append(i);
        aeyw.a(false, stringBuilder.toString());
    }
}
