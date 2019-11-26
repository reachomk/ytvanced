package defpackage;

/* renamed from: ahbv */
public abstract class ahbv {
    public abstract boolean a();

    public abstract amqp b();

    public static ahbv a(boolean z) {
        ahaq ahaq = new ahaq();
        ahaq.a = Boolean.valueOf(z);
        String str = "";
        if (ahaq.a == null) {
            str = str.concat(" shouldShow");
        }
        if (str.isEmpty()) {
            return new ahar(ahaq.a.booleanValue(), ahaq.b);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
