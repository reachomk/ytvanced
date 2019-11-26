package defpackage;

import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import java.util.Map;

/* renamed from: fvl */
public final class fvl implements aaap {
    private final nn a;
    private final aaas b;
    private final akvp c;
    private final akoe d;
    private final jof e;
    private final acwa f;

    public fvl(nn nnVar, aaas aaas, akvp akvp, akoe akoe, jof jof, acwa acwa) {
        this.a = (nn) amqw.a((Object) nnVar);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (akvp) amqw.a((Object) akvp);
        this.d = akoe;
        this.e = jof;
        this.f = acwa;
    }

    public final void a(apxu apxu, Map map) {
        auvn auvn;
        anxr access$000 = anxl.checkIsLite(MenuEndpointOuterClass$MenuEndpoint.menuEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        MenuEndpointOuterClass$MenuEndpoint menuEndpointOuterClass$MenuEndpoint = (MenuEndpointOuterClass$MenuEndpoint) b;
        arml arml = null;
        if ((menuEndpointOuterClass$MenuEndpoint.a & 1) != 0) {
            auvr auvr = menuEndpointOuterClass$MenuEndpoint.b;
            if (auvr == null) {
                auvr = auvr.c;
            }
            auvn = auvr.b;
            if (auvn == null) {
                auvn = auvn.l;
            }
        } else {
            auvn = null;
        }
        View view = (View) xsb.a(map, (Object) "com.google.android.libraries.youtube.rendering.elements.sender_view", View.class);
        Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (view == null) {
            Bundle bundle = (Bundle) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.bundle", Bundle.class);
            if (bundle == null || !bundle.getBoolean("menu_as_bottom_sheet", false)) {
                arml arml2;
                nn nnVar = this.a;
                aaas aaas = this.b;
                akvp akvp = this.c;
                akoe akoe = this.d;
                eqo eqo = new eqo(auvn, aaas, c);
                Builder builder = new Builder(nnVar);
                auvx auvx = auvn.c;
                if (auvx == null) {
                    auvx = auvx.c;
                }
                if (((auvx.a == 82258301 ? (auvv) auvx.b : auvv.e).a & 1) == 0) {
                    arml2 = null;
                } else {
                    auvv auvv;
                    auvx = auvn.c;
                    if (auvx == null) {
                        auvx = auvx.c;
                    }
                    if (auvx.a == 82258301) {
                        auvv = (auvv) auvx.b;
                    } else {
                        auvv = auvv.e;
                    }
                    arml2 = auvv.b;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                }
                Spanned a = ajqy.a(arml2);
                if (a != null) {
                    builder.setTitle(a);
                }
                if (auvn.b.size() > 0) {
                    aknw aknw = new aknw();
                    aknw.a(auvj.class, new eqq(nnVar, akvp));
                    akoc a2 = akoe.a(aknw);
                    aknh akpk = new akpk();
                    for (auvj add : auvn.b) {
                        akpk.add(add);
                    }
                    a2.a(akpk);
                    builder.setAdapter(a2, eqo);
                }
                auvb auvb = auvn.d;
                if (auvb == null) {
                    auvb = auvb.c;
                }
                auva auva = auvb.b;
                if (auva == null) {
                    auva = auva.c;
                }
                if ((auva.a & 1) != 0) {
                    auvb auvb2 = auvn.d;
                    if (auvb2 == null) {
                        auvb2 = auvb.c;
                    }
                    auva auva2 = auvb2.b;
                    if (auva2 == null) {
                        auva2 = auva.c;
                    }
                    arml = auva2.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                Spanned a3 = ajqy.a(arml);
                if (a3 != null) {
                    builder.setNegativeButton(a3, eqo);
                }
                builder.setCancelable(true);
                eqo.a(builder.create());
                eqo.d();
                return;
            }
            akyt.a(this.a, auvn, this.b, map);
            return;
        }
        this.e.a(auvn, view, c, this.f.t());
    }
}
