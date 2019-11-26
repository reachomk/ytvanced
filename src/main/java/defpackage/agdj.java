package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: agdj */
public final class agdj implements xcp {
    public final xci a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public boolean f;
    private final zzl g;
    private final ScheduledExecutorService h;
    private final bcaa i;

    public agdj(xci xci, zzl zzl, ScheduledExecutorService scheduledExecutorService, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = xci;
        this.g = zzl;
        this.h = scheduledExecutorService;
        this.b = bcaa;
        this.c = bcaa2;
        this.d = bcaa3;
        this.i = bcaa4;
        this.e = bcaa5;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{agll.class, ahjc.class, ahkf.class};
        } else if (i == 0) {
            String str = ((agll) obj).a;
            aizy aizy = (aizy) this.b.get();
            if (aizy != null && aizy.y() && TextUtils.equals(aizy.k(), str) && this.f) {
                aizy.i();
                return null;
            }
        } else if (i == 1) {
            ahjc ahjc = (ahjc) obj;
            avoa avoa = this.g.b().h;
            if (avoa == null) {
                avoa = avoa.w;
            }
            if (avoa.t || avoa.v) {
                this.h.execute(new agdm(this, ahjc, avoa));
                return null;
            }
        } else if (i == 2) {
            apxu apxu = ((ahkf) obj).d;
            if (apxu != null) {
                anxr access$000 = anxl.checkIsLite(OfflineWatchEndpointOuterClass.offlineWatchEndpoint);
                apxu.a(access$000);
                this.f = apxu.h.a(access$000.d);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }

    public final void a(int i, int i2, int i3) {
        if (this.i.get() != null) {
            alwu alwu = (alwu) this.i.get();
            String str = i != 1 ? i != 2 ? "VERIFICATION_SUCCESS" : "VIDEO_STREAM_VERIFICATION_FAILURE" : "AUDIO_STREAM_VERIFICATION_FAILURE";
            if (i2 == 0) {
                throw null;
            } else if (i2 != 0) {
                String num = Integer.toString(i2 - 1);
                String str2 = i3 != 1 ? i3 != 2 ? i3 != 3 ? "PLAYBACK_EXCEPTION_FMT_NONEAVAILABLE" : "PLAYBACK_EXCEPTION_OFFLINE_FMT_NONEAVAILABLE" : "PLAYBACK_EXCEPTION_NO_CONNECTION" : "PLAYBACK_EXCEPTION_UNKNOWN";
                ((uib) alwu.g.get()).a("VERIFY_ON_PLAYBACK_EXCEPTION", str, num, str2);
            } else {
                throw null;
            }
        }
    }
}
