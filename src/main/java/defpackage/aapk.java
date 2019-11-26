package defpackage;

/* renamed from: aapk */
final /* synthetic */ class aapk implements Runnable {
    private final aapl a;
    private final String b;

    aapk(aapl aapl, String str) {
        this.a = aapl;
        this.b = str;
    }

    public final void run() {
        aapl aapl = this.a;
        String str = this.b;
        synchronized (aapl) {
            aapl.a.c(str);
            bqa bqa = aapl.a;
            str = String.valueOf(str);
            String str2 = "_metadata";
            if (str2.length() == 0) {
                str2 = new String(str);
            } else {
                str2 = str.concat(str2);
            }
            bqa.c(str2);
        }
    }
}
