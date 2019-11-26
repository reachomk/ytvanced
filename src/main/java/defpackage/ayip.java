package defpackage;

/* renamed from: ayip */
public enum ayip implements anxv {
    TRANSACTION_PRODUCT_DATA_TYPE_UNKNOWN(0),
    TRANSACTION_PRODUCT_DATA_TYPE_BUY_BUCKET(1);
    
    private final int c;

    public final int getNumber() {
        return this.c;
    }

    public static ayip a(int i) {
        if (i != 0) {
            return i != 1 ? null : TRANSACTION_PRODUCT_DATA_TYPE_BUY_BUCKET;
        } else {
            return TRANSACTION_PRODUCT_DATA_TYPE_UNKNOWN;
        }
    }

    public static anxx a() {
        return ayio.a;
    }

    private ayip(int i) {
        this.c = i;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
