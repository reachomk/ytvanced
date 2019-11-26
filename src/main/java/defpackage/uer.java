package defpackage;

/* renamed from: uer */
public final class uer extends Exception {
    public final int a;
    private final String b;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error type: ");
        int i = this.a;
        Object obj = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TOO_LONG" : "TOO_SHORT_NSN" : "TOO_SHORT_AFTER_IDD" : "NOT_A_NUMBER" : "INVALID_COUNTRY_CODE";
        stringBuilder.append(obj);
        stringBuilder.append(". ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    public uer(int i, String str) {
        super(str);
        this.b = str;
        this.a = i;
    }
}
