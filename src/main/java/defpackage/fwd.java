package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DeleteReelEndpointOuterClass$DeleteReelEndpoint;
import java.util.Map;

/* renamed from: fwd */
public final class fwd implements aaap {
    public final Context a;
    public Map b;
    private final abgv c;
    private final afpu d;

    public fwd(Context context, abgv abgv, afpu afpu) {
        this.a = context;
        this.c = abgv;
        this.d = afpu;
    }

    public final void a(apxu apxu, Map map) {
        this.b = map;
        new Builder(this.a).setTitle(R.string.delete_reel_playlist_title).setMessage(R.string.delete_reel_playlist_message).setNegativeButton(17039360, null).setPositiveButton(this.a.getString(R.string.delete_reel_playlist_button_text), new fwg(this, apxu)).create().show();
    }

    public final void a(apxu apxu) {
        aslh aslh = (aslh) asle.d.createBuilder();
        anxr access$000 = anxl.checkIsLite(DeleteReelEndpointOuterClass$DeleteReelEndpoint.deleteReelEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        String str = ((DeleteReelEndpointOuterClass$DeleteReelEndpoint) b).b;
        aslh.copyOnWrite();
        asle asle = (asle) aslh.instance;
        if (str != null) {
            asle.a |= 2;
            asle.c = str;
            try {
                abgv abgv = this.c;
                aaml abgt = new abgt(abgv.c, this.d.c(), aslh);
                abgt.h = abgv.j.p();
                abgt.g();
                abgv = this.c;
                abgv.h.a(abgt, new fwf(this));
                return;
            } catch (aanq unused) {
                a();
                return;
            }
        }
        throw new NullPointerException();
    }

    public final void a() {
        xpr.a(this.a, (int) R.string.delete_reel_playlist_failed, 1);
    }
}
