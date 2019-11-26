package defpackage;

import java.nio.charset.Charset;

/* renamed from: bbch */
public abstract class bbch extends baxc {
    private static final batr a = new bbck();
    public static final baur y = bats.a(":status", a);
    public baum A;
    public Charset B = ampv.c;
    public boolean C;
    public bavx z;

    protected bbch(int i, bbho bbho, bbht bbht) {
        super(i, bbho, bbht);
    }

    public abstract void a(bavx bavx, boolean z, baum baum);

    public static bavx a(baum baum) {
        Integer num = (Integer) baum.a(y);
        if (num == null) {
            return bavx.i.a("Missing HTTP status code");
        }
        String str = (String) baum.a(bbby.g);
        if (bbby.a(str)) {
            return null;
        }
        bavx a = bbby.a(num.intValue());
        str = String.valueOf(str);
        String str2 = "invalid content-type: ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        return a.b(str);
    }

    public static Charset b(baum baum) {
        String str = (String) baum.a(bbby.g);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return ampv.c;
    }

    public static void c(baum baum) {
        baum.b(y);
        baum.b(batu.b);
        baum.b(batu.a);
    }
}
