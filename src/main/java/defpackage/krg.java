package defpackage;

/* renamed from: krg */
public final class krg implements kvt {
    private krl a;
    private apxu b;
    private apxu[] c;

    public final void a(apxu apxu, apxu[] apxuArr) {
        this.b = apxu;
        this.c = apxuArr;
    }

    public final void a(krl krl) {
        this.a = krl;
    }

    public final void a() {
        this.a.b(this.b);
    }

    public final /* bridge */ /* synthetic */ Object c() {
        return awqe.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_NOOP;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        return awqe.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_OPEN_AD;
    }

    public final /* bridge */ /* synthetic */ Object e() {
        return awqe.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN;
    }

    public final /* synthetic */ Integer b(Object obj) {
        awqo awqo = (awqo) obj;
        return (awqo == null || (awqo.a & 2) == 0) ? null : Integer.valueOf(awqo.c);
    }

    public final /* synthetic */ Object c(Object obj) {
        awqo awqo = (awqo) obj;
        if (awqo == null || (awqo.a & 4) == 0) {
            obj = awqe.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        } else {
            obj = awqe.a(awqo.d);
            if (obj == null) {
                return awqe.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN;
            }
        }
        return obj;
    }
}
