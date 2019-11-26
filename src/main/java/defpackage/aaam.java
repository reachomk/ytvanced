package defpackage;

import java.util.Map;

/* renamed from: aaam */
public final /* synthetic */ class aaam {
    public static void a(aaan aaan, apxu apxu, Map map) {
        try {
            aaan.a(apxu).a(apxu, map);
        } catch (aabf unused) {
            String valueOf = String.valueOf(apxu);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 24);
            stringBuilder.append("Unknown command resolved");
            stringBuilder.append(valueOf);
            xtl.c(stringBuilder.toString());
        }
    }
}
