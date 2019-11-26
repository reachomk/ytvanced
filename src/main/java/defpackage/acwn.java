package defpackage;

import java.util.Arrays;

/* renamed from: acwn */
final class acwn {
    public anze a;
    public anvu b;

    acwn(anze anze, anvu anvu) {
        a(anze, anvu);
    }

    /* Access modifiers changed, original: final */
    public final void a(anze anze, anvu anvu) {
        this.a = anze;
        this.b = anvu;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acwn)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        acwn acwn = (acwn) obj;
        return amqq.a(this.a, acwn.a) && amqq.a(this.b, acwn.b) && amqq.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, this.b}) * 31;
    }
}
