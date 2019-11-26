package defpackage;

import com.google.protos.youtube.api.innertube.ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint;
import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: dxm */
public final class dxm implements aaap {
    public final aaas a;
    private final abim b;
    private final ScheduledExecutorService c;
    private final Executor d;
    private final Runnable e;
    private final abmw f;
    private final afpu g;
    private final xoi h;
    private final abno i;
    private final abns j;

    public dxm(abim abim, ScheduledExecutorService scheduledExecutorService, Executor executor, aboo aboo, abmw abmw, afpu afpu, aaas aaas, xoi xoi, abno abno, abns abns) {
        this.b = (abim) amqw.a((Object) abim);
        this.c = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.d = executor;
        aboo.getClass();
        this.e = new dxl(aboo);
        this.f = (abmw) amqw.a((Object) abmw);
        this.g = (afpu) amqw.a((Object) afpu);
        this.a = aaas;
        this.h = xoi;
        this.i = (abno) amqw.a((Object) abno);
        this.j = (abns) amqw.a((Object) abns);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        if (this.g.a()) {
            this.c.execute(this.e);
        } else {
            this.f.a.getWritableDatabase().delete("suggestions", "1", null);
        }
        this.i.a();
        this.j.a();
        axga axga = (axga) SetSettingEndpointOuterClass$SetSettingEndpoint.f.createBuilder();
        anxr access$000 = anxl.checkIsLite(ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.clearSearchHistorySettingEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        String str = ((ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint) obj).b;
        axga.copyOnWrite();
        SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint = (SetSettingEndpointOuterClass$SetSettingEndpoint) axga.instance;
        if (str != null) {
            setSettingEndpointOuterClass$SetSettingEndpoint.a |= 1;
            setSettingEndpointOuterClass$SetSettingEndpoint.d = str;
            SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint2 = (SetSettingEndpointOuterClass$SetSettingEndpoint) ((anxl) axga.build());
            aaml a = this.b.a();
            a.a(aabc.a(apxu));
            a.a(setSettingEndpointOuterClass$SetSettingEndpoint2);
            xan.a(this.b.a(a), this.d, new dxo(this), new dxn(this), ankh.a);
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Throwable th) {
        xoi xoi = this.h;
        if (xoi != null) {
            xoi.c(th);
        }
        xtl.b("Error requesting SetSetting", th);
    }
}
