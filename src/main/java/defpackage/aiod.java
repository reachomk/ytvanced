package defpackage;

import java.util.Arrays;

/* renamed from: aiod */
public final class aiod {
    public final int a = 15;
    public final int b;
    public final String c;

    public aiod(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aiod) {
            aiod aiod = (aiod) obj;
            if (this.a == aiod.a && this.b == aiod.b && amqq.a(this.c, aiod.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
    }
}
