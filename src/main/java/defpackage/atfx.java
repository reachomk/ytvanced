package defpackage;

/* renamed from: atfx */
public enum atfx implements anxv {
    CODE_DELIVERY_METHOD_UNKNOWN(0),
    CODE_DELIVERY_METHOD_TEXT(1),
    CODE_DELIVERY_METHOD_CALL(2);
    
    public final int c;

    public final int getNumber() {
        return this.c;
    }

    public static atfx a(int i) {
        if (i == 0) {
            return CODE_DELIVERY_METHOD_UNKNOWN;
        }
        if (i != 1) {
            return i != 2 ? null : CODE_DELIVERY_METHOD_CALL;
        } else {
            return CODE_DELIVERY_METHOD_TEXT;
        }
    }

    public static anxx a() {
        return atga.a;
    }

    private atfx(int i) {
        this.c = i;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
