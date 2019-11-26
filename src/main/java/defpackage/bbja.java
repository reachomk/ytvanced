package defpackage;

/* renamed from: bbja */
public abstract class bbja extends bbiy {
    bbja() {
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public static bbja a(String str, String str2, String str3) {
        boolean z = false;
        if (bbiu.a(str) && str.length() <= 255) {
            z = true;
        }
        bbit.a(z, (Object) "Name should be a ASCII string with a length no greater than 255 characters.");
        return new bbiv(str, str2, str3);
    }
}
