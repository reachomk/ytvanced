package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: vgv */
public final class vgv {
    private final bcaa a;
    private final bctz b;
    private final ScheduledExecutorService c;
    private final Executor d;
    private final long e;
    private final CopyOnWriteArrayList f;
    private final zzl g;

    public vgv(bcaa bcaa, bctz bctz, ScheduledExecutorService scheduledExecutorService, Executor executor, vdj vdj, CopyOnWriteArrayList copyOnWriteArrayList, zzl zzl) {
        this.a = bcaa;
        this.b = bctz;
        this.c = scheduledExecutorService;
        this.d = executor;
        this.e = vdj.f();
        this.f = copyOnWriteArrayList;
        this.g = zzl;
    }

    public final vgy a(vgd vgd, ajpu ajpu, vqy vqy, List list, String str, vsm vsm, long j, long j2) {
        vgd vgd2 = vgd;
        if (vgd2 == null) {
            throw new vgu("ContentVideoState was null");
        } else if (!vgd.a()) {
            return new vhu((vhb) this.a.get(), vgd2.d, this.f, this.g, this.c, this.d, vqy != null ? vqy : vth.c, list, this.e, TimeUnit.SECONDS.toMillis((long) vgd2.c.h()), vgd2.a, str, vsm, j, j2);
        } else if (ajpu == null) {
            throw new vgu("SingleVideoComponent was null");
        } else if (amqq.a(ajpu.Q(), vgd2.a)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (vso vso : list) {
                String str2 = "Mix of media and forecasting ads";
                if (vso instanceof vsl) {
                    if (arrayList2.isEmpty()) {
                        arrayList.add((vsl) vso);
                    } else {
                        throw new vgu(str2);
                    }
                } else if (!(vso instanceof vrx)) {
                    String valueOf = String.valueOf(vso);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 28);
                    stringBuilder.append("Unsupported format for DAI: ");
                    stringBuilder.append(valueOf);
                    throw new vgu(stringBuilder.toString());
                } else if (arrayList.isEmpty()) {
                    arrayList2.add((vrx) vso);
                } else {
                    throw new vgu(str2);
                }
            }
            vgy vhd;
            if (arrayList.isEmpty()) {
                vhd = new vhd((vhb) this.a.get(), ajpu, this.d, vgd2.a, str, j, j2, arrayList2);
            } else {
                vhd = new vhg((vhb) this.a.get(), this.b, vgd2.d, this.d, arrayList, vgd2.a, str, j, j2);
            }
            return r2;
        } else {
            throw new vgu("ContentVideoState and SingleVideoComponent cpns didn't line up");
        }
    }
}
