package defpackage;

import java.util.logging.Logger;

/* renamed from: baxw */
public final class baxw extends baty {
    public static final Logger a = Logger.getLogger(baxw.class.getName());
    public final baui b = ((baui) amqw.a(baui.a(), (Object) "registry"));
    public final String c;

    public baxw(String str) {
        this.c = (String) amqw.a((Object) str, (Object) "defaultPolicy");
    }

    public final batv a(batx batx) {
        throw null;
    }

    public final baug a(String str, String str2) {
        baug a = this.b.a(str);
        if (a != null) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 48) + String.valueOf(str2).length());
        stringBuilder.append("Trying to load '");
        stringBuilder.append(str);
        stringBuilder.append("' because ");
        stringBuilder.append(str2);
        stringBuilder.append(", but it's unavailable");
        throw new baxz(stringBuilder.toString());
    }
}
