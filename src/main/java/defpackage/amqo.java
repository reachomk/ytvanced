package defpackage;

import java.util.Arrays;

/* renamed from: amqo */
public final class amqo {
    public boolean a = false;
    private final String b;
    private final amqn c = new amqn();
    private amqn d = this.c;

    public final amqo a(String str, boolean z) {
        a(str, String.valueOf(z));
        return this;
    }

    public final amqo a(String str, float f) {
        a(str, String.valueOf(f));
        return this;
    }

    public final amqo a(String str, int i) {
        a(str, String.valueOf(i));
        return this;
    }

    public final amqo a(String str, long j) {
        a(str, String.valueOf(j));
        return this;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(this.b);
        stringBuilder.append('{');
        String str = "";
        for (amqn amqn = this.c.c; amqn != null; amqn = amqn.c) {
            Object obj = amqn.b;
            if (!z || obj != null) {
                stringBuilder.append(str);
                str = amqn.a;
                if (str != null) {
                    stringBuilder.append(str);
                    stringBuilder.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    stringBuilder.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    stringBuilder.append(deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    private final amqn a() {
        amqn amqn = new amqn();
        this.d.c = amqn;
        this.d = amqn;
        return amqn;
    }

    public final amqo a(Object obj) {
        a().b = obj;
        return this;
    }

    public final amqo a(String str, Object obj) {
        amqn a = a();
        a.b = obj;
        a.a = (String) amqw.a((Object) str);
        return this;
    }

    public /* synthetic */ amqo(String str) {
        this.b = (String) amqw.a((Object) str);
    }
}
