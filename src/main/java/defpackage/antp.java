package defpackage;

/* renamed from: antp */
public enum antp implements anxv {
    TOKEN_REQUESTED(0),
    ACCOUNT_SELECTION(1),
    ACCOUNT_CREATION(2),
    PROVIDER_CONSENT(3),
    APP_AUTH(4),
    INFO_DIALOG(6),
    COMPLETE(5),
    UNRECOGNIZED(-1);
    
    private final int i;

    public final String toString() {
        return Integer.toString(getNumber());
    }

    public static antp a(String str) {
        return (antp) Enum.valueOf(antp.class, str);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static antp a(int i) {
        switch (i) {
            case 0:
                return TOKEN_REQUESTED;
            case 1:
                return ACCOUNT_SELECTION;
            case 2:
                return ACCOUNT_CREATION;
            case 3:
                return PROVIDER_CONSENT;
            case 4:
                return APP_AUTH;
            case 5:
                return COMPLETE;
            case 6:
                return INFO_DIALOG;
            default:
                return null;
        }
    }

    private antp(int i) {
        this.i = i;
    }
}
