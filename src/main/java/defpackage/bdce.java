package defpackage;

/* renamed from: bdce */
public final class bdce {
    public static final int a;
    public static final boolean b;

    static {
        int intValue;
        boolean z = false;
        try {
            intValue = ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            intValue = 0;
        }
        a = intValue;
        if (intValue != 0) {
            z = true;
        }
        b = z;
    }
}
