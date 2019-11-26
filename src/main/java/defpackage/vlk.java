package defpackage;

/* renamed from: vlk */
public final class vlk extends Exception {
    public vlk(int i, int i2) {
        String a = vlk.a(i);
        String a2 = vlk.a(i2);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 41) + String.valueOf(a2).length());
        stringBuilder.append("Tried fulfillment status change from ");
        stringBuilder.append(a);
        stringBuilder.append(" to ");
        stringBuilder.append(a2);
        super(stringBuilder.toString());
    }

    private static String a(int i) {
        if (i == 0) {
            return "NOT_FILLED";
        }
        if (i == 1) {
            return "FULFILL_SCHEDULED";
        }
        if (i == 2) {
            return "FULFILLING";
        }
        if (i == 3) {
            return "FILLED";
        }
        if (i == 4) {
            return "FILL_FAILED";
        }
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Bad fulfillment status: ");
        stringBuilder.append(i);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
