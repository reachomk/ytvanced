package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.mdx.mediaroute.RemotePlaybackControlsService;
import java.util.Arrays;
import java.util.List;

/* renamed from: dli */
final class dli implements adhi {
    private final /* synthetic */ diu a;

    public final void a(RemotePlaybackControlsService remotePlaybackControlsService) {
        Object obj;
        Object vue;
        remotePlaybackControlsService.a = this.a.oC();
        remotePlaybackControlsService.b = this.a.cx();
        diu diu = this.a;
        Context ow = diu.ow();
        bcaa fy = diu.fy();
        ajkp fz = diu.fz();
        ajko bS = diu.bS();
        bcaa bQ = diu.bQ();
        List fC = diu.fC();
        aiss fB = diu.fB();
        adby pj = diu.pj();
        remotePlaybackControlsService.c = (aisx) baqd.a((Object) new aisx(ow, fy, fz, bS, pj.e(), bQ, fB, diu.oy(), fC, diu.c()), "Cannot return null from a non-@Nullable @Provides method");
        diu = this.a;
        ow = diu.ow();
        fy = diu.fy();
        fz = diu.lM();
        bS = diu.bS();
        bQ = diu.bQ();
        Object obj2 = diu.cq;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = diu.cq;
                if (obj instanceof baqe) {
                    obj = diu.cp;
                    if (obj instanceof baqe) {
                        Object obj3;
                        synchronized (obj) {
                            obj3 = diu.cp;
                            if (obj3 instanceof baqe) {
                                vtx lO = diu.lO();
                                vue = new vue(lO);
                                lO.b.add(vue);
                                obj3 = (vue) baqd.a(vue, "Cannot return null from a non-@Nullable @Provides method");
                                diu.cp = bapx.a(diu.cp, obj3);
                            }
                        }
                        obj = obj3;
                    }
                    obj = (List) baqd.a(Arrays.asList(new aisp[]{(vue) obj, aisx.c, aisx.d}), "Cannot return null from a non-@Nullable @Provides method");
                    diu.cq = bapx.a(diu.cq, obj);
                }
            }
            obj2 = obj;
        }
        fC = (List) obj2;
        fB = diu.fB();
        pj = diu.pj();
        obj = diu.cr;
        if (obj instanceof baqe) {
            synchronized (obj) {
                vue = diu.cr;
                if (vue instanceof baqe) {
                    vue = new vud(diu.lP());
                    diu.cr = bapx.a(diu.cr, vue);
                }
            }
            obj = vue;
        }
        vud vud = (vud) obj;
        remotePlaybackControlsService.d = (aisx) baqd.a((Object) new aisx(ow, fy, fz, bS, pj.e(), bQ, fB, diu.oy(), fC, diu.c(), vud), "Cannot return null from a non-@Nullable @Provides method");
        diu = this.a;
        obj2 = diu.cs;
        if (obj2 instanceof baqe) {
            Object obj4;
            synchronized (obj2) {
                obj4 = diu.cs;
                if (obj4 instanceof baqe) {
                    obj4 = (vuf) baqd.a(new vuf(diu.lP(), diu.ow()), "Cannot return null from a non-@Nullable @Provides method");
                    diu.cs = bapx.a(diu.cs, obj4);
                }
            }
            obj2 = obj4;
        }
        remotePlaybackControlsService.e = (vuf) obj2;
        remotePlaybackControlsService.f = this.a.fB();
        remotePlaybackControlsService.g = this.a.dS();
        remotePlaybackControlsService.h = this.a.cI();
        remotePlaybackControlsService.i = this.a.pj();
        remotePlaybackControlsService.j = this.a.fA();
    }

    /* synthetic */ dli(diu diu) {
        this.a = diu;
    }
}
