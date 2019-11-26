package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DownloadReelItem$DownloadReelItemEndpoint;
import java.util.Map;

/* renamed from: glk */
public final class glk implements aaap {
    public final Context a;
    public final goq b;
    public gqu c;
    private final afpu d;
    private final afsa e;
    private final xhf f;

    public glk(Context context, afpu afpu, afsa afsa, xhf xhf, goq goq) {
        this.a = (Context) amqw.a((Object) context);
        this.d = (afpu) amqw.a((Object) afpu);
        this.e = afsa;
        this.f = (xhf) amqw.a((Object) xhf);
        this.b = (goq) amqw.a((Object) goq);
    }

    public final void a(apxu apxu, Map map) {
        this.b.a();
        anxr access$000 = anxl.checkIsLite(DownloadReelItem$DownloadReelItemEndpoint.downloadReelItemEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        DownloadReelItem$DownloadReelItemEndpoint downloadReelItem$DownloadReelItemEndpoint = (DownloadReelItem$DownloadReelItemEndpoint) b;
        AlertDialog create = new Builder(this.a).setMessage(R.string.download_reel_item_in_progress).create();
        create.setOnDismissListener(new glj(this));
        create.setButton(-2, this.a.getString(17039360), new glm(this));
        create.show();
        this.c = new gqu(downloadReelItem$DownloadReelItemEndpoint.b, this.d.c(), this.e, this.a.getContentResolver(), new gll(this, create));
        this.f.b(this.c);
    }
}
