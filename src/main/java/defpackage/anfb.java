package defpackage;

/* renamed from: anfb */
public enum anfb implements anxv {
    UNKNOWN_ALIGNMENT(0),
    DISABLED(1),
    ENABLED_NO_FILTERING(2),
    ENABLED_WITH_MEDIAN_FILTER(3);
    
    public static final int DISABLED_VALUE = 1;
    public static final int ENABLED_NO_FILTERING_VALUE = 2;
    public static final int ENABLED_WITH_MEDIAN_FILTER_VALUE = 3;
    public static final int UNKNOWN_ALIGNMENT_VALUE = 0;
    public static final anxy internalValueMap = null;
    public final int value;

    static {
        internalValueMap = new anfe();
    }

    private anfb(int i) {
        this.value = i;
    }

    public static anfb a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : ENABLED_WITH_MEDIAN_FILTER : ENABLED_NO_FILTERING : DISABLED : UNKNOWN_ALIGNMENT;
    }

    public static anxx a() {
        return anfd.INSTANCE;
    }

    public final int getNumber() {
        return this.value;
    }

    public final String toString() {
        return Integer.toString(this.value);
    }
}
