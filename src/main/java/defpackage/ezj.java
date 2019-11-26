package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand;
import com.google.protos.youtube.api.innertube.UpdateViewershipActionOuterClass$UpdateViewershipAction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ezj */
public final class ezj implements exv, Runnable {
    public final Handler a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;
    public String e = null;
    public List f = null;
    public boolean g;
    public boolean h;
    private final Executor i;
    private final exu j;
    private final bcaa k;
    private final xsc l;
    private long m = 0;

    ezj(Handler handler, xsc xsc, exu exu, bcaa bcaa, String str, Executor executor) {
        this.a = handler;
        this.l = xsc;
        this.j = exu;
        this.k = bcaa;
        this.b = str;
        this.i = executor;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void a(Throwable th) {
        xtl.b(ezg.a, "Could not load updated metadata", th.getCause());
        this.a.postDelayed(this, 30000);
    }

    public static void a(List list, List list2, List list3, String str) {
        if (list != null) {
            for (apxu apxu : list) {
                anxr access$000 = anxl.checkIsLite(UpdateViewershipActionOuterClass$UpdateViewershipAction.updateViewershipAction);
                apxu.a(access$000);
                Object b;
                if (apxu.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(UpdateViewershipActionOuterClass$UpdateViewershipAction.updateViewershipAction);
                    apxu.a(access$000);
                    b = apxu.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    UpdateViewershipActionOuterClass$UpdateViewershipAction updateViewershipActionOuterClass$UpdateViewershipAction = (UpdateViewershipActionOuterClass$UpdateViewershipAction) b;
                    if (!updateViewershipActionOuterClass$UpdateViewershipAction.d) {
                        azbz azbz = updateViewershipActionOuterClass$UpdateViewershipAction.b;
                        if (azbz == null) {
                            azbz = azbz.c;
                        }
                        if ((azbz.a & 1) != 0) {
                            azbz azbz2 = updateViewershipActionOuterClass$UpdateViewershipAction.b;
                            if (azbz2 == null) {
                                azbz2 = azbz.c;
                            }
                            azek azek = azbz2.b;
                            if (azek == null) {
                                azek = azek.f;
                            }
                            for (WeakReference weakReference : list2) {
                                ezn ezn = (ezn) weakReference.get();
                                if (ezn != null) {
                                    ezn.a(str, azek);
                                }
                            }
                        }
                    }
                } else {
                    access$000 = anxl.checkIsLite(UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.updateDonationShelfCommand);
                    apxu.a(access$000);
                    if (apxu.h.a(access$000.d)) {
                        access$000 = anxl.checkIsLite(UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.updateDonationShelfCommand);
                        apxu.a(access$000);
                        b = apxu.h.b(access$000.d);
                        if (b == null) {
                            b = access$000.b;
                        } else {
                            b = access$000.a(b);
                        }
                        anxp anxp = ((UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand) b).b;
                        if (anxp == null) {
                            anxp = axak.a;
                        }
                        access$000 = anxl.checkIsLite(aqxk.a);
                        anxp.a(access$000);
                        b = anxp.h.b(access$000.d);
                        if (b == null) {
                            b = access$000.b;
                        } else {
                            b = access$000.a(b);
                        }
                        aqxj aqxj = (aqxj) b;
                        if (aqxj != null) {
                            for (WeakReference weakReference2 : list3) {
                                ezk ezk = (ezk) weakReference2.get();
                                if (ezk != null) {
                                    ezk.a(str, aqxj);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void run() {
        long a = this.l.a();
        long j = this.m;
        if (j != 0 && a - j < 15000) {
            this.a.postDelayed(this, 15000);
            return;
        }
        this.m = a;
        this.j.a((exv) this);
        abjq abjq = (abjq) this.k.get();
        String str = this.e;
        String str2 = str == null ? this.b : null;
        abjr abjr = new abjr(abjq.c, abjq.d.c());
        abjr.a = str2;
        abjr.b = str;
        xan.a(abjq.a(atkq.e, abjq.a, abjt.a, abjs.a).a(abjr), this.i, new ezi(this), new ezl(this), ankh.a);
    }

    public final void c() {
        String valueOf = String.valueOf(this.b);
        String str = "Cancelling ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
        this.a.removeCallbacks(this);
        this.j.b((exv) this);
        this.e = null;
        this.f = null;
        this.m = 0;
        this.h = true;
    }

    public final void a() {
        this.a.post(this);
    }

    public final void b() {
        this.a.removeCallbacks(this);
    }
}
