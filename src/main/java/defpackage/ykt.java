package defpackage;

import java.util.Arrays;

/* renamed from: ykt */
public final class ykt extends yki {
    public final long d;
    public final amuh e;

    public static ykw f() {
        ykw ykw = new ykw();
        ykw.b = 0;
        ykw.c = amul.g();
        return ykw;
    }

    public final long g() {
        return Long.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ykt) {
            ykt ykt = (ykt) obj;
            if (amqq.a(this.a, ykt.a) && this.d == ykt.d && amqq.a(this.e, ykt.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.d), this.e});
    }

    public final ykw h() {
        ykw ykw = new ykw();
        ykw.a = this.a;
        ykw.b = this.d;
        ykw.c = this.e;
        return ykw;
    }

    /* synthetic */ ykt(String str, long j, amuh amuh) {
        super(str, null, false, false);
        this.d = j;
        this.e = (amuh) amqw.a((Object) amuh);
    }
}
