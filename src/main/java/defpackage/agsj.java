package defpackage;

import java.util.Set;

/* renamed from: agsj */
final /* synthetic */ class agsj implements anim {
    private final Set a;
    private final anim b;

    agsj(Set set, anim anim) {
        this.a = set;
        this.b = anim;
    }

    public final anjv a(Object obj) {
        Set<Class> set = this.a;
        anim anim = this.b;
        Throwable th = (Exception) obj;
        amqw.a((Object) th);
        for (Class isInstance : set) {
            if (isInstance.isInstance(th)) {
                return anim.a(th);
            }
        }
        afpc.a(1, afpf.offline, "Encountered unexpected exception during fallback", th);
        throw th;
    }
}
