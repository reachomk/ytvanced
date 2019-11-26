package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint;
import java.util.Map;

/* renamed from: fwi */
public final class fwi implements aaap, gej {
    public Map a;
    private final nt b;
    private final Context c;
    private final abgv d;
    private final afpu e;
    private String f;

    public fwi(Context context, abgv abgv, afpu afpu, nt ntVar) {
        this.c = context;
        this.d = abgv;
        this.e = afpu;
        this.b = ntVar;
    }

    public final void a(apxu apxu, Map map) {
        String obj;
        this.a = map;
        anxr access$000 = anxl.checkIsLite(ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.reelCreationMetadataEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint = (ReelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint) b;
        axak axak = reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.b;
        if (axak == null) {
            axak = axak.a;
        }
        awww awww = (awww) ajzv.a(ajzv.a(axak), awww.class);
        this.f = reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.c;
        if ((reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.a & 4) == 0) {
            arml arml = reelCreationMetadataEndpointOuterClass$ReelCreationMetadataEndpoint.d;
            if (arml == null) {
                arml = arml.f;
            }
            obj = ajqy.a(arml).toString();
        } else {
            obj = null;
        }
        nf a = gei.a(awww, null, obj);
        a.a(this);
        this.b.a().a(a, "reel_playlist_creation").a();
    }

    public final void a(String str) {
        atkj atkj = (atkj) atkk.f.createBuilder();
        String str2 = this.f;
        atkj.copyOnWrite();
        atkk atkk = (atkk) atkj.instance;
        if (str2 != null) {
            atkk.a |= 2;
            atkk.c = str2;
            atkh atkh = (atkh) atki.c.createBuilder();
            atkh.copyOnWrite();
            atki atki = (atki) atkh.instance;
            if (str != null) {
                atki.a |= 1;
                atki.b = str;
                atkj.copyOnWrite();
                atkk atkk2 = (atkk) atkj.instance;
                atkk2.d = (atki) ((anxl) atkh.build());
                atkk2.a |= 4;
                atkj.copyOnWrite();
                atkk2 = (atkk) atkj.instance;
                if (!atkk2.e.a()) {
                    atkk2.e = anxl.mutableCopy(atkk2.e);
                }
                atkk2.e.d(1);
                try {
                    abgv abgv = this.d;
                    aaml abhe = new abhe(abgv.c, this.e.c(), atkj);
                    abhe.h = abgv.j.p();
                    abhe.g();
                    abgv = this.d;
                    abgv.i.a(abhe, new fwh(this));
                    return;
                } catch (aanq unused) {
                    a();
                    return;
                }
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void a() {
        xpr.a(this.c, (int) R.string.update_reel_playlist_failed, 1);
    }
}
