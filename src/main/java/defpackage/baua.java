package defpackage;

import java.util.Arrays;

/* renamed from: baua */
public final class baua {
    public static final baua a = new baua(null, bavx.b, false);
    public final baue b;
    public final bash c = null;
    public final bavx d;
    public final boolean e;

    private baua(baue baue, bavx bavx, boolean z) {
        this.b = baue;
        this.d = (bavx) amqw.a((Object) bavx, (Object) "status");
        this.e = z;
    }

    public static baua a(baue baue) {
        return new baua((baue) amqw.a((Object) baue, (Object) "subchannel"), bavx.b, false);
    }

    public static baua a(bavx bavx) {
        amqw.a(bavx.a() ^ 1, (Object) "error status shouldn't be OK");
        return new baua(null, bavx, false);
    }

    public static baua b(bavx bavx) {
        amqw.a(bavx.a() ^ 1, (Object) "drop status shouldn't be OK");
        return new baua(null, bavx, true);
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("subchannel", this.b);
        a.a("streamTracerFactory", null);
        a.a("status", this.d);
        a.a("drop", this.e);
        return a.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.d, null, Boolean.valueOf(this.e)});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof baua) {
            baua baua = (baua) obj;
            if (amqq.a(this.b, baua.b) && amqq.a(this.d, baua.d) && amqq.a(null, null) && this.e == baua.e) {
                return true;
            }
        }
        return false;
    }
}
