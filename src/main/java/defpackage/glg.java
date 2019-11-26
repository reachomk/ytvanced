package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DeleteReelItem$DeleteReelItemEndpoint;
import java.util.Map;

/* renamed from: glg */
public final class glg implements aaap {
    public final Context a;
    public final gqa b;
    public final goq c;
    private AlertDialog d;
    private final abgv e;
    private final afpu f;

    public glg(Context context, abgv abgv, afpu afpu, gqa gqa, goq goq) {
        this.a = (Context) amqw.a((Object) context);
        this.e = (abgv) amqw.a((Object) abgv);
        this.f = (afpu) amqw.a((Object) afpu);
        this.b = (gqa) amqw.a((Object) gqa);
        this.c = (goq) amqw.a((Object) goq);
    }

    public final void a(apxu apxu, Map map) {
        this.c.a();
        if (this.d == null) {
            this.d = new Builder(this.a).setMessage(R.string.delete_reel_item_confirmation).setNegativeButton(17039360, null).create();
            this.d.setOnDismissListener(new glf(this));
        }
        this.d.setButton(-1, this.a.getString(17039370), new gli(this, apxu));
        this.d.show();
    }

    public final void a(apxu apxu) {
        asld asld = (asld) asla.e.createBuilder();
        anxr access$000 = anxl.checkIsLite(DeleteReelItem$DeleteReelItemEndpoint.deleteReelItemEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        DeleteReelItem$DeleteReelItemEndpoint deleteReelItem$DeleteReelItemEndpoint = (DeleteReelItem$DeleteReelItemEndpoint) b;
        String str = deleteReelItem$DeleteReelItemEndpoint.c;
        asld.copyOnWrite();
        asla asla = (asla) asld.instance;
        if (str != null) {
            asla.a |= 4;
            asla.d = str;
            String str2 = deleteReelItem$DeleteReelItemEndpoint.b;
            asld.copyOnWrite();
            asla asla2 = (asla) asld.instance;
            if (str2 != null) {
                asla2.a |= 2;
                asla2.c = str2;
                try {
                    abgv abgv = this.e;
                    aaml abgq = new abgq(abgv.c, this.f.c(), asld);
                    abgq.h = abgv.j.p();
                    abgq.g();
                    abgv = this.e;
                    abgv.b.a(abgq, new glh(this, (asla) ((anxl) asld.build())));
                    return;
                } catch (aanq unused) {
                    return;
                }
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
