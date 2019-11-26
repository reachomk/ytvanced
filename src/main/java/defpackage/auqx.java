package defpackage;

/* renamed from: auqx */
public enum auqx implements anxv {
    DAY_OF_WEEK_UNKNOWN(0),
    DAY_OF_WEEK_SUNDAY(1),
    DAY_OF_WEEK_MONDAY(2),
    DAY_OF_WEEK_TUESDAY(3),
    DAY_OF_WEEK_WEDNESDAY(4),
    DAY_OF_WEEK_THURSDAY(5),
    DAY_OF_WEEK_FRIDAY(6),
    DAY_OF_WEEK_SATURDAY(7);
    
    public final int d;

    public final int getNumber() {
        return this.d;
    }

    public static auqx a(int i) {
        switch (i) {
            case 0:
                return DAY_OF_WEEK_UNKNOWN;
            case 1:
                return DAY_OF_WEEK_SUNDAY;
            case 2:
                return DAY_OF_WEEK_MONDAY;
            case 3:
                return DAY_OF_WEEK_TUESDAY;
            case 4:
                return DAY_OF_WEEK_WEDNESDAY;
            case 5:
                return DAY_OF_WEEK_THURSDAY;
            case 6:
                return DAY_OF_WEEK_FRIDAY;
            case 7:
                return DAY_OF_WEEK_SATURDAY;
            default:
                return null;
        }
    }

    public static anxx a() {
        return auqz.a;
    }

    private auqx(int i) {
        this.d = i;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
