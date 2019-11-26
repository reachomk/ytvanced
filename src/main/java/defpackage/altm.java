package defpackage;

/* renamed from: altm */
public abstract class altm {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public static altm a(String str, String str2, String str3) {
        altn altn = new altn();
        altn.a = str2;
        altn.c = str3;
        if (str != null) {
            altn.b = str;
            str = "";
            if (altn.a == null) {
                str = str.concat(" namespace");
            }
            if (altn.b == null) {
                str = String.valueOf(str).concat(" userId");
            }
            if (altn.c == null) {
                str = String.valueOf(str).concat(" key");
            }
            if (str.isEmpty()) {
                altk altk = new altk(altn.a, altn.b, altn.c);
                amqw.a(altk.b().isEmpty() ^ 1, (Object) "userId cannot be empty");
                amqw.a(altk.c().isEmpty() ^ 1, (Object) "Key cannot be empty.");
                amqw.a(altk.a().isEmpty() ^ 1, (Object) "namespace cannot be empty.");
                return altk;
            }
            str3 = "Missing required properties:";
            if (str.length() == 0) {
                str = new String(str3);
            } else {
                str = str3.concat(str);
            }
            throw new IllegalStateException(str);
        }
        throw new NullPointerException("Null userId");
    }
}
