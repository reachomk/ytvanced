package defpackage;

/* renamed from: avrp */
public enum avrp implements anxv {
    OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN(0),
    OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE(1),
    OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_IN_ORDER_DEDUPE(2),
    OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE(3);
    
    public final int e;

    public final int getNumber() {
        return this.e;
    }

    public static avrp a(int i) {
        if (i == 0) {
            return OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
        }
        if (i == 1) {
            return OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE;
        }
        if (i != 2) {
            return i != 3 ? null : OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE;
        } else {
            return OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_IN_ORDER_DEDUPE;
        }
    }

    public static anxx a() {
        return avro.a;
    }

    private avrp(int i) {
        this.e = i;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
