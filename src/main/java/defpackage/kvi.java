package defpackage;

import java.util.Map;

/* renamed from: kvi */
public final class kvi implements kvt {
    public apxu a;
    public apxu[] b;
    public apxu c;
    public apxu d;
    private krl e;

    public final void a(krl krl) {
        this.e = krl;
    }

    public final void a() {
        this.e.b(this.a);
    }

    public final /* bridge */ /* synthetic */ Object c() {
        return awqi.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_NOOP;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        return awqi.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE;
    }

    public final /* synthetic */ void a(Map map, Object[] objArr) {
        for (awqq awqq : (awqq[]) objArr) {
            Object a = awqg.a(awqq.b);
            if (a == null) {
                a = awqg.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN;
            }
            map.put(a, awqq);
        }
    }

    public final /* bridge */ /* synthetic */ Object e() {
        return awqi.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN;
    }

    public final /* synthetic */ Integer b(Object obj) {
        awqq awqq = (awqq) obj;
        return (awqq == null || (awqq.a & 2) == 0) ? null : Integer.valueOf(awqq.c);
    }

    public final /* synthetic */ Object c(Object obj) {
        awqq awqq = (awqq) obj;
        if (awqq == null || (awqq.a & 4) == 0) {
            obj = awqi.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        } else {
            obj = awqi.a(awqq.d);
            if (obj == null) {
                return awqi.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN;
            }
        }
        return obj;
    }
}
