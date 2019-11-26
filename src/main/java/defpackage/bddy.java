package defpackage;

import java.util.Arrays;

/* renamed from: bddy */
public final class bddy extends bcup {
    private final bcup a;
    private boolean b;

    public bddy(bcup bcup) {
        super(bcup);
        this.a = bcup;
    }

    public final void bM_() {
        bcvi bcvi;
        if (!this.b) {
            this.b = true;
            try {
                this.a.bM_();
                try {
                    b();
                } catch (Throwable th) {
                    bdeh.a(th);
                    bcvi = new bcvi(th.getMessage(), th);
                }
            } catch (Throwable th2) {
                try {
                    b();
                } catch (Throwable th3) {
                    bdeh.a(th3);
                    bcvi = new bcvi(th3.getMessage(), th3);
                }
            }
        }
    }

    public final void a(Throwable th) {
        bcva.b(th);
        if (!this.b) {
            this.b = true;
            bdey.a.a();
            try {
                this.a.a(th);
                try {
                    b();
                } catch (Throwable th2) {
                    bdeh.a(th2);
                    bcvf bcvf = new bcvf(th2);
                }
            } catch (bcve e) {
                b();
                throw e;
            } catch (Throwable th3) {
                bdeh.a(th3);
                bcve bcve = new bcve("Observer.onError not implemented and error while unsubscribing.", new bcux(Arrays.asList(new Throwable[]{th2, th3})));
            }
        }
    }

    public final void e_(Object obj) {
        try {
            if (!this.b) {
                this.a.e_(obj);
            }
        } catch (Throwable th) {
            bcva.a(th, this);
        }
    }
}
