package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;

/* renamed from: aaek */
public class aaek implements aaep {
    private static final ThreadLocal c = new aaen();
    public final Queue a = new amtl();
    private final xsc b;

    public aaek(xsc xsc) {
        this.b = xsc;
    }

    public synchronized void a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
        stringBuilder.append("[");
        stringBuilder.append(str);
        stringBuilder.append("] ");
        stringBuilder.append(str2);
        str = stringBuilder.toString();
        Queue queue = this.a;
        String format = ((SimpleDateFormat) c.get()).format(new Date(this.b.a()));
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(format).length() + 1) + String.valueOf(str).length());
        stringBuilder2.append(format);
        stringBuilder2.append(" ");
        stringBuilder2.append(str);
        queue.add(stringBuilder2.toString());
    }

    public final synchronized amul a() {
        return amul.a(this.a);
    }
}
