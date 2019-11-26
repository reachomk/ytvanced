package defpackage;

/* renamed from: aodg */
public enum aodg implements anxv {
    ENVIRONMENT_UNKNOWN(0),
    ENVIRONMENT_PROD(1),
    ENVIRONMENT_STAGING(2),
    ENVIRONMENT_TEST_STAGING(3),
    ENVIRONMENT_AUTOPUSH(4),
    ENVIRONMENT_TEST_AUTOPUSH(5),
    ENVIRONMENT_TEST(6),
    UNRECOGNIZED(-1);
    
    private final int i;

    public final String toString() {
        return Integer.toString(getNumber());
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static aodg a(int i) {
        switch (i) {
            case 0:
                return ENVIRONMENT_UNKNOWN;
            case 1:
                return ENVIRONMENT_PROD;
            case 2:
                return ENVIRONMENT_STAGING;
            case 3:
                return ENVIRONMENT_TEST_STAGING;
            case 4:
                return ENVIRONMENT_AUTOPUSH;
            case 5:
                return ENVIRONMENT_TEST_AUTOPUSH;
            case 6:
                return ENVIRONMENT_TEST;
            default:
                return null;
        }
    }

    public static anxx a() {
        return aodf.a;
    }

    private aodg(int i) {
        this.i = i;
    }
}
