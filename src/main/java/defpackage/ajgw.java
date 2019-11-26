package defpackage;

import org.xml.sax.Attributes;

/* renamed from: ajgw */
public final class ajgw {
    public static int a(float f) {
        return (int) (f * 1000.0f);
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 9;
            case 1:
                return 10;
            case 2:
                return 12;
            case 3:
                return 17;
            case 4:
                return 18;
            case 5:
                return 20;
            case 6:
                return 33;
            case 7:
                return 34;
            case 8:
                return 36;
            default:
                return 34;
        }
    }

    public static xwi a() {
        xwh xwh = new xwh();
        xwh.a("/transcript", new ajha());
        xwh.a("/transcript/text", new ajgz());
        xwh.a("/timedtext", new ajhb());
        xwh.a("/timedtext/window", new ajgy());
        xwh.a("/timedtext/text", new ajhj());
        xwh.a("/timedtext/head/pen", new ajhg());
        xwh.a("/timedtext/head/ws", new ajhh());
        xwh.a("/timedtext/head/wp", new ajhe());
        xwh.a("/timedtext/body/w", new ajhf());
        xwh.a("/timedtext/body/p", new ajhc());
        xwh.a("/timedtext/body/p/s", new ajhd());
        return xwh.a();
    }

    public static String a(Attributes attributes, String... strArr) {
        for (String value : strArr) {
            String value2 = attributes.getValue(value2);
            if (value2 != null) {
                return value2;
            }
        }
        return null;
    }

    public static String a(Attributes attributes, String str, String... strArr) {
        String value = attributes.getValue(strArr[0]);
        return value == null ? str : value;
    }

    public static int a(Attributes attributes, int i, String... strArr) {
        String value = attributes.getValue(strArr[0]);
        return value != null ? xvd.a(value, i) : i;
    }

    public static long a(Attributes attributes, long j, String... strArr) {
        String value = attributes.getValue(strArr[0]);
        return value != null ? xvd.a(value, j) : j;
    }

    static /* synthetic */ boolean b(Attributes attributes, String[] strArr) {
        return ajgw.a(attributes, 0, strArr) != 0;
    }
}
