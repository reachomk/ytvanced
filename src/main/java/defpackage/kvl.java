package defpackage;

import java.util.Map;

/* renamed from: kvl */
public final class kvl implements kvt {
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
        return awqk.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_NOOP;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        return awqk.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE;
    }

    public final /* synthetic */ void a(Map map, Object[] objArr) {
        for (awqs awqs : (awqs[]) objArr) {
            Object a = awqg.a(awqs.b);
            if (a == null) {
                a = awqg.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN;
            }
            map.put(a, awqs);
        }
    }

    public final /* bridge */ /* synthetic */ Object e() {
        return awqk.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN;
    }

    public final /* synthetic */ Integer b(Object obj) {
        awqs awqs = (awqs) obj;
        return (awqs == null || (awqs.a & 2) == 0) ? null : Integer.valueOf(awqs.c);
    }

    public final /* synthetic */ Object c(Object obj) {
        awqs awqs = (awqs) obj;
        if (awqs == null || (awqs.a & 4) == 0) {
            obj = awqk.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        } else {
            obj = awqk.a(awqs.d);
            if (obj == null) {
                return awqk.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN;
            }
        }
        return obj;
    }
}
