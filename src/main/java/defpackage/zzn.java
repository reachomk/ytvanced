package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: zzn */
public final class zzn implements afmr {
    public static final int a = ((int) TimeUnit.DAYS.toHours(30));
    public static final amul b = amul.g();
    public final avzm c;
    public afmq d;
    public afmq e;

    public zzn(avzm avzm) {
        this.c = (avzm) amqw.a((Object) avzm);
    }

    public final int a() {
        avzm avzm = this.c;
        if ((avzm.a & 1) == 0) {
            return 1000;
        }
        return avzm.b;
    }

    public final int b() {
        avzm avzm = this.c;
        if ((avzm.a & 32) != 0) {
            return avzm.e;
        }
        return a;
    }

    public final int c() {
        avzm avzm = this.c;
        if ((avzm.a & 2) == 0) {
            return 100;
        }
        return avzm.c;
    }

    public final int d() {
        avzm avzm = this.c;
        if ((avzm.a & 16) == 0) {
            return 60;
        }
        return avzm.d;
    }

    public final boolean e() {
        avzm avzm = this.c;
        if ((avzm.a & 512) == 0) {
            return true;
        }
        return avzm.f;
    }
}
