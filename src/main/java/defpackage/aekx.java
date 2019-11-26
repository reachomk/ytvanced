package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: aekx */
public final class aekx {
    public static aoth a(apxn apxn) {
        if (apxn != null) {
            aosl aosl = apxn.d;
            if (aosl == null) {
                aosl = aosl.f;
            }
            aosp aosp = aosl.b;
            if (aosp == null) {
                aosp = aosp.c;
            }
            if ((aosp.a & 1) != 0) {
                aosl aosl2 = apxn.d;
                if (aosl2 == null) {
                    aosl2 = aosl.f;
                }
                aosp aosp2 = aosl2.b;
                if (aosp2 == null) {
                    aosp2 = aosp.c;
                }
                aoth aoth = aosp2.b;
                if (aoth == null) {
                    aoth = aoth.k;
                }
                return aoth;
            }
        }
        return null;
    }

    public static aotd b(apxn apxn) {
        aoth a = aekx.a(apxn);
        if (!(a == null || (a.a & 4) == 0)) {
            aotb aotb = a.c;
            if (aotb == null) {
                aotb = aotb.d;
            }
            if ((aotb.a & 2) != 0) {
                aotb aotb2 = a.c;
                if (aotb2 == null) {
                    aotb2 = aotb.d;
                }
                aotd aotd = aotb2.c;
                if (aotd == null) {
                    aotd = aotd.d;
                }
                return aotd;
            }
        }
        return null;
    }

    public static Executor a(int i, Executor executor) {
        amqw.a((Object) executor);
        int i2 = i - 1;
        if (i != 0) {
            String str = "mediaCronetResp";
            if (i2 == 2) {
                return new ScheduledThreadPoolExecutor(4, new xaf(6, str));
            }
            if (i2 == 3) {
                return new ScheduledThreadPoolExecutor(4, new xaf(3, str));
            }
            if (i2 != 4) {
                return executor;
            }
            return new ScheduledThreadPoolExecutor(4, new xaf(0, str));
        }
        throw null;
    }
}
