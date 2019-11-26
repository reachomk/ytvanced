package defpackage;

/* renamed from: anhp */
class anhp extends Throwable {
    anhp(String str) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
