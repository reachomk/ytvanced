package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: hqp */
public final class hqp {
    public final ahcn a;
    private final Context b;
    private final aiuu c;
    private final ahcd d;
    private final hqj e;
    private final acwa f;

    public hqp(Context context, aiuu aiuu, ahcd ahcd, ahcn ahcn, hqj hqj, acwa acwa) {
        this.b = context;
        this.c = aiuu;
        this.d = ahcd;
        this.a = ahcn;
        this.e = hqj;
        this.f = acwa;
    }

    public final void a(String str, agqy agqy, String str2) {
        boolean z = agqy == null || agqy.u() != agqs.PLAYABLE;
        amqw.a(z);
        if (agqy != null) {
            if (agqy.v()) {
                agqs u = agqy.u();
                if (u == agqs.TRANSFER_PENDING_USER_APPROVAL && str2 != null) {
                    this.d.b(str2);
                } else if (u == agqs.ERROR_PENDING_PLAYABILITY_ACTION) {
                    this.c.a(agqy.k, new hqr(this, str, str2), str);
                } else if (u == agqs.ERROR_STREAMS_MISSING) {
                    this.a.a(str2, str);
                } else if (u == agqs.ERROR_EXPIRED) {
                    this.a.a(agqy.j, true);
                } else if (u == agqs.ERROR_POLICY || u == agqs.ERROR_NOT_PLAYABLE) {
                    agqw agqw = agqy.j;
                    if (agqw != null) {
                        Object a = agqw.a();
                        if (a != null) {
                            this.a.a(str, a, this.f.t());
                        }
                    }
                } else if (agqy.w()) {
                    this.a.a(str2, str, null, true);
                }
            } else if (agqy.u() == agqs.TRANSFER_PENDING_TOOTHFAIRY) {
                new Builder(this.b).setTitle(R.string.offline_dialog_waiting_for_discount_title).setMessage(R.string.offline_dialog_waiting_for_discount_or_wifi_message).setCancelable(true).setPositiveButton(R.string.ok, hqs.a).show();
            } else if (agqy.k() || agqy.m()) {
                this.e.b(R.string.offline_click_queued_offline_video_snackbar_text);
            }
        } else if (amqu.a(str2)) {
            this.a.a(str2, str, null, true);
        } else {
            this.d.a(str2, str);
        }
    }
}
