package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: yiu */
final /* synthetic */ class yiu implements Callable {
    private final yir a;
    private final String b;

    yiu(yir yir, String str) {
        this.a = yir;
        this.b = str;
    }

    public final Object call() {
        yir yir = this.a;
        String str = this.b;
        yic yic = yir.b;
        String str2 = null;
        if (!str.startsWith("ClientSideLocalKeyPrefix")) {
            return null;
        }
        List c = amqz.a("::").c(str);
        if (c.size() < 2) {
            throw new IllegalArgumentException("Key has client-side local prefix only!");
        } else if (c.size() <= 3) {
            String str3 = (String) c.get(1);
            if (c.size() == 3) {
                str2 = (String) c.get(2);
            }
            yib yib = (yib) yic.a.get(str3);
            if (yib != null) {
                return yib.a(str, str2, yic.b);
            }
            throw new IllegalStateException("Key has client-side local prefix but no factory!");
        } else {
            throw new IllegalArgumentException("Key has more than 3 delimited parts!");
        }
    }
}
