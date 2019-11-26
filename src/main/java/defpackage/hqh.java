package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: hqh */
public final class hqh extends ahbk {
    private final xhv d;
    private final agvs e;
    private final hqj f;
    private final hqm g;

    public hqh(Activity activity, afpu afpu, agwc agwc, aguk aguk, afqe afqe, xoi xoi, xhv xhv, agvs agvs, ahcp ahcp, ahcc ahcc, xpa xpa, hqj hqj, hqm hqm) {
        super(activity, afpu, agwc, aguk, afqe, xoi, xhv, agvs, ahcp, ahcc, xpa);
        this.d = xhv;
        this.e = agvs;
        this.f = hqj;
        this.g = hqm;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        if (!this.e.j() || this.d.e()) {
            this.f.a(i);
            return;
        }
        hqj hqj = this.f;
        hqj.b.b(hqj.c(i).a(hqj.a.getString(R.string.change_setting), hqj.d).c(false).d());
    }

    public final void a(String str, boolean z) {
        super.a(str, z);
        if (!z) {
            this.f.b(R.string.offline_actions_video_deleted_snackbar_text);
        }
    }

    public final void a(agqw agqw, boolean z) {
        if (z) {
            ahcr hqg = new hqg(this);
            hqm hqm = this.g;
            if (hqm.e.c()) {
                hqm.d.a(hqg);
                return;
            }
            aqhx aqhx = (aqhx) aqhy.q.createBuilder();
            aqhx.a(ajqy.a(hqm.a.getString(R.string.offline_go_online_to_renew_dialog_title)));
            long max = Math.max(1, TimeUnit.SECONDS.toDays(agqw.g()));
            String[] strArr = new String[1];
            strArr[0] = hqm.a.getResources().getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, (int) max, new Object[]{Long.valueOf(max)});
            aqhx.b(ajqy.a(strArr));
            arml a = ajqy.a(hqm.a.getString(R.string.ok));
            aqhx.copyOnWrite();
            aqhy aqhy = (aqhy) aqhx.instance;
            if (a != null) {
                aqhy.k = a;
                aqhy.a |= 16384;
                akcq.a(hqm.a, (aqhy) ((anxl) aqhx.build()), hqm.b, hqm.c, null, null);
                return;
            }
            throw new NullPointerException();
        }
        b();
    }
}
