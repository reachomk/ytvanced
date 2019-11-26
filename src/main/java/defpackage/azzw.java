package defpackage;

/* renamed from: azzw */
final /* synthetic */ class azzw implements Runnable {
    private final azzu a;
    private final azzk b;
    private final int c;
    private final int d;

    azzw(azzu azzu, azzk azzk, int i, int i2) {
        this.a = azzu;
        this.b = azzk;
        this.c = i;
        this.d = i2;
    }

    public final void run() {
        Object obj = this.a;
        Object obj2 = this.b;
        int i = this.c;
        int i2 = this.d;
        azzs azzs = obj.a;
        azzs.b = (azzh) amqw.a(obj);
        azzs.c = (azzk) amqw.a(obj2);
        azzy azzy = obj.b;
        if (azzy != null) {
            azzy.d = i;
            azzy.e = i2;
            azzy.a = new baab(obj2, obj);
        }
    }
}
