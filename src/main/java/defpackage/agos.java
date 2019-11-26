package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: agos */
public final class agos {
    private static byte[] c(String str) {
        UUID nameUUIDFromBytes = UUID.nameUUIDFromBytes(str.getBytes(ampv.c));
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(nameUUIDFromBytes.getMostSignificantBits());
        wrap.putLong(nameUUIDFromBytes.getLeastSignificantBits());
        return wrap.array();
    }

    public static boolean a(String str, String str2) {
        return agos.a(str).equals(agos.a(str2));
    }

    public static String a(String str) {
        if (str.charAt(0) != '/') {
            String str2 = "/";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
        }
        if (str.charAt(str.length() - 1) == '/') {
            str = str.substring(0, str.length() - 1);
        }
        return str.charAt(str.length() + -1) != ']' ? str.concat("[0]") : str;
    }

    public static String b(String str) {
        str = agos.a(str);
        int lastIndexOf = str.lastIndexOf(47);
        return str.substring(lastIndexOf + 1, lastIndexOf + 5);
    }

    public static amul a(agoq agoq) {
        Object obj;
        HashMap hashMap = new HashMap();
        if (agoq.b().a()) {
            for (azqd azqd : ((azqb) agoq.b().b()).a) {
                obj = azqd.b;
                if (obj == null) {
                    obj = azlk.f;
                }
                hashMap.put(obj, azqd);
            }
        }
        amuo a = amul.a(agoq.a().c.size());
        for (azql azql : agoq.a().c) {
            Object obj2;
            obj = azql.b;
            if (obj == null) {
                obj = azlk.f;
            }
            List g = amul.g();
            amqp c = amqp.c((azqd) hashMap.get(obj));
            if (c.a() && (((azqd) c.b()).a & 4) != 0) {
                azli azli = ((azqd) c.b()).c;
                if (azli == null) {
                    azli = azli.f;
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < azli.d.size(); i++) {
                    agqg agqg = new agqg();
                    agqg.a = obj.b;
                    agqg.b = obj.c;
                    agqg.d = azli.e;
                    agqg.a(((anvu) azli.d.get(i)).d());
                    agqg.e = i;
                    arrayList.add(agqg.a());
                }
                g = arrayList;
            }
            azlk azlk = azql.b;
            if (azlk == null) {
                azlk = azlk.f;
            }
            arlv arlv = azql.d;
            if (arlv == null) {
                arlv = arlv.E;
            }
            if ((azql.a & 8) != 0) {
                obj2 = azql.e;
                if (obj2 == null) {
                    obj2 = azkw.a;
                }
            } else {
                obj2 = null;
            }
            a.c(agnn.a(azlk, arlv, amqp.c(obj2), g));
        }
        return a.a();
    }

    public static int a(byte[] bArr) {
        int i = 2;
        if (!Arrays.equals((byte[]) agos.a(2).b(), bArr)) {
            i = 4;
            if (!Arrays.equals((byte[]) agos.a(4).b(), bArr)) {
                i = 3;
                if (!Arrays.equals((byte[]) agos.a(3).b(), bArr)) {
                    return 1;
                }
            }
        }
        return i;
    }

    public static amqp a(int i) {
        if (i == 2) {
            return amqp.b(agos.c("com.youtube.yt4.offline_file_metadata"));
        }
        if (i == 4) {
            return amqp.b(agos.c("com.youtube.yt4.signatures"));
        }
        if (i == 3) {
            return amqp.b(agos.c("com.youtube.yt4.client_data"));
        }
        return ampo.a;
    }
}
