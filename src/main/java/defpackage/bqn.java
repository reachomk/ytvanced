package defpackage;

/* renamed from: bqn */
public class bqn extends Exception {
    public final bqd b;

    public bqn() {
        this.b = null;
    }

    public bqn(bqd bqd) {
        this.b = bqd;
    }

    public bqn(String str) {
        super(str);
        this.b = null;
    }

    public bqn(String str, Throwable th) {
        super(str, th);
        this.b = null;
    }

    public bqn(Throwable th) {
        super(th);
        this.b = null;
    }
}
