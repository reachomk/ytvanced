package defpackage;

/* renamed from: bcxl */
public final class bcxl implements bcub {
    private final int a;
    private final int b;

    public bcxl(int i) {
        if (i > 0) {
            this.a = i;
            this.b = 1;
            return;
        }
        throw new IllegalArgumentException("count must be greater than 0");
    }

    public final /* synthetic */ Object a(Object obj) {
        bcup bcup = (bcup) obj;
        int i = this.b;
        int i2 = this.a;
        bcuo bcxo;
        if (i == i2) {
            bcuo bcxk = new bcxk(bcup, i2);
            bcup.a(bcxk);
            bcup.a(new bcxn(bcxk));
            return bcxk;
        } else if (i > i2) {
            bcxo = new bcxo(bcup, i2, i);
            bcup.a(bcxo);
            bcup.a(new bcxr(bcxo));
            return bcxo;
        } else {
            bcxo = new bcxm(bcup, i2, i);
            bcup.a(bcxo);
            bcup.a(new bcxp(bcxo));
            return bcxo;
        }
    }
}
