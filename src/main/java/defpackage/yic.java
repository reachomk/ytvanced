package defpackage;

import java.util.Map;

/* renamed from: yic */
public final class yic {
    public final Map a;
    public final aadw b;

    public static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder("ClientSideLocalKeyPrefix");
        String str3 = "::";
        stringBuilder.append(str3);
        stringBuilder.append(str);
        if (!amqu.a(str2)) {
            stringBuilder.append(str3);
            stringBuilder.append(str2);
        }
        return stringBuilder.toString();
    }

    public yic(Map map, aadw aadw) {
        this.a = (Map) amqw.a((Object) map);
        this.b = (aadw) amqw.a((Object) aadw);
    }
}
