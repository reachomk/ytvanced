package defpackage;

import java.util.List;

/* renamed from: vot */
public final /* synthetic */ class vot implements soq {
    private final swf a;
    private final tpu b;

    public vot(swf swf, tpu tpu) {
        this.a = swf;
        this.b = tpu;
    }

    public final clz a(cmg cmg, swk swk, Object obj, String str, bdho bdho, List list) {
        swf swf = this.a;
        tpu tpu = this.b;
        aoge aoge = (aoge) obj;
        voq voq = new voq();
        voq.a(voq, cmg, new vor());
        voq.a.d = swf;
        voq.d.set(3);
        voq.a.b = tpu;
        voq.d.set(1);
        voq.a.a = aoge;
        voq.d.set(0);
        if (!list.isEmpty()) {
            cma cma = (cma) list.get(0);
            voq.a.c = cma != null ? cma.g() : null;
            voq.d.set(2);
        }
        return voq;
    }
}
