package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bbeh */
final class bbeh {
    public final Long a;
    public final Boolean b;
    public final Integer c;
    public final Integer d;
    public final bbgr e;
    public final bbcf f;

    bbeh(Map map, boolean z, int i, int i2) {
        bbgr bbgr;
        Iterator it;
        bbcf bbcf;
        this.a = bbhd.o(map);
        this.b = bbhd.p(map);
        this.c = bbhd.r(map);
        Integer num = this.c;
        if (num != null) {
            amqw.a(num.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", this.c);
        }
        this.d = bbhd.q(map);
        num = this.d;
        if (num != null) {
            amqw.a(num.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", this.d);
        }
        Map l = z ? bbhd.l(map) : null;
        String str = "rawCode can not be \"OK\"";
        String str2 = "OK";
        Object obj = "rawCodes can't be empty";
        Object obj2 = "rawCodes must be present";
        String str3 = "maxAttempts must be greater than 1: %s";
        Object obj3 = "maxAttempts cannot be empty";
        if (l == null) {
            bbgr = bbgr.f;
        } else {
            int intValue = ((Integer) amqw.a(bbhd.b(l), obj3)).intValue();
            amqw.a(intValue >= 2, str3, intValue);
            int min = Math.min(intValue, i);
            long longValue = ((Long) amqw.a(bbhd.c(l), (Object) "initialBackoff cannot be empty")).longValue();
            amqw.a(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) amqw.a(bbhd.d(l), (Object) "maxBackoff cannot be empty")).longValue();
            amqw.a(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            double doubleValue = ((Double) amqw.a(bbhd.e(l), (Object) "backoffMultiplier cannot be empty")).doubleValue();
            amqw.a(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Object f = bbhd.f(l);
            amqw.a(f, obj2);
            int i3 = 1;
            amqw.a(f.isEmpty() ^ 1, obj);
            EnumSet noneOf = EnumSet.noneOf(bawa.class);
            it = f.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                Iterator it2 = it;
                amrw.a(str2.equals(str4) ^ i3, str, new Object[0]);
                noneOf.add(bawa.a(str4));
                it = it2;
                i3 = 1;
            }
            bbgr bbgr2 = new bbgr(min, longValue, longValue2, doubleValue, Collections.unmodifiableSet(noneOf));
        }
        this.e = bbgr;
        Map m = z ? bbhd.m(map) : null;
        if (m == null) {
            bbcf = bbcf.d;
        } else {
            int intValue2 = ((Integer) amqw.a(bbhd.g(m), obj3)).intValue();
            amqw.a(intValue2 >= 2, str3, intValue2);
            intValue2 = Math.min(intValue2, i2);
            long longValue3 = ((Long) amqw.a(bbhd.h(m), (Object) "hedgingDelay cannot be empty")).longValue();
            amqw.a(longValue3 >= 0, "hedgingDelay must not be negative: %s", longValue3);
            Object<String> i4 = bbhd.i(m);
            amqw.a((Object) i4, obj2);
            amqw.a(i4.isEmpty() ^ 1, obj);
            EnumSet noneOf2 = EnumSet.noneOf(bawa.class);
            for (String str5 : i4) {
                amrw.a(str2.equals(str5) ^ 1, str, new Object[0]);
                noneOf2.add(bawa.a(str5));
            }
            bbcf = new bbcf(intValue2, longValue3, Collections.unmodifiableSet(noneOf2));
        }
        this.f = bbcf;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bbeh) {
            bbeh bbeh = (bbeh) obj;
            if (amqq.a(this.a, bbeh.a) && amqq.a(this.b, bbeh.b) && amqq.a(this.c, bbeh.c) && amqq.a(this.d, bbeh.d) && amqq.a(this.e, bbeh.e) && amqq.a(this.f, bbeh.f)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("timeoutNanos", this.a);
        a.a("waitForReady", this.b);
        a.a("maxInboundMessageSize", this.c);
        a.a("maxOutboundMessageSize", this.d);
        a.a("retryPolicy", this.e);
        a.a("hedgingPolicy", this.f);
        return a.toString();
    }
}
