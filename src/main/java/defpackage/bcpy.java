package defpackage;

/* renamed from: bcpy */
public final class bcpy extends IllegalArgumentException {
    public static final long serialVersionUID = 6305711765985447737L;
    public String a = super.getMessage();

    private static String a(String str, Number number, Number number2, Number number3, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Value ");
        stringBuilder.append(number);
        stringBuilder.append(" for ");
        stringBuilder.append(str);
        stringBuilder.append(' ');
        if (number2 == null) {
            if (number3 != null) {
                stringBuilder.append("must not be larger than ");
                stringBuilder.append(number3);
            } else {
                stringBuilder.append("is not supported");
            }
        } else if (number3 != null) {
            stringBuilder.append("must be in the range [");
            stringBuilder.append(number2);
            stringBuilder.append(',');
            stringBuilder.append(number3);
            stringBuilder.append(']');
        } else {
            stringBuilder.append("must not be smaller than ");
            stringBuilder.append(number2);
        }
        if (str2 != null) {
            stringBuilder.append(": ");
            stringBuilder.append(str2);
        }
        return stringBuilder.toString();
    }

    public bcpy(bcpm bcpm, Number number, Number number2, Number number3) {
        super(bcpy.a(bcpm.x, number, number2, number3, null));
        String str = bcpm.x;
    }

    public bcpy(bcpm bcpm, Number number, String str) {
        super(bcpy.a(bcpm.x, number, null, null, str));
        String str2 = bcpm.x;
    }

    public bcpy(bcpm bcpm, String str) {
        String str2 = bcpm.x;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Value ");
        stringBuffer.append('\"');
        stringBuffer.append(str);
        stringBuffer.append('\"');
        stringBuffer.append(" for ");
        stringBuffer.append(str2);
        stringBuffer.append(' ');
        stringBuffer.append("is not supported");
        super(stringBuffer.toString());
        String str3 = bcpm.x;
    }

    public final String getMessage() {
        return this.a;
    }
}
