package defpackage;

import java.util.Arrays;
import java.util.Map;

/* renamed from: abqr */
final /* synthetic */ class abqr implements xar {
    private final abqp a;
    private final Map b;

    abqr(abqp abqp, Map map) {
        this.a = abqp;
        this.b = map;
    }

    public final void accept(Object obj) {
        abqp abqp = this.a;
        Map map = this.b;
        asvz asvz = (asvz) obj;
        if (asvz.c.size() > 0) {
            abor d;
            Object obj2 = map.get("com.google.android.libraries.youtube.innertube.endpoint.tag");
            if (obj2 instanceof abqn) {
                d = ((abqn) obj2).d();
            } else if (obj2 instanceof abor) {
                d = (abor) obj2;
            } else {
                d = null;
            }
            if (d == null) {
                afpf afpf = afpf.livechat;
                String valueOf = String.valueOf(Arrays.toString(Thread.currentThread().getStackTrace()));
                String str = "Moderate live chat command called with no context. \n";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                afpc.a(2, afpf, valueOf);
                return;
            }
            abqp.a.a((apxu[]) asvz.c.toArray(new apxu[0]), d, true);
        }
    }
}
