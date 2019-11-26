package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
import java.util.Map;

/* renamed from: wrr */
public class wrr implements aaap {
    private final Context a;
    private final wsa b;
    private final aaas c;
    private final acvx d;

    public wrr(Context context, wsa wsa, aaas aaas, acvx acvx) {
        this.a = context;
        this.b = wsa;
        this.c = aaas;
        this.d = acvx;
    }

    public void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint = (UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint) b;
        aymo aymo = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.b;
        if (aymo == null) {
            aymo = aymo.c;
        }
        aqhy aqhy = null;
        if (aymo.a != 86135402) {
            obj = null;
        } else {
            anze anze;
            aymo = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.b;
            if (aymo == null) {
                aymo = aymo.c;
            }
            if (aymo.a == 86135402) {
                anze = (atuf) aymo.b;
            } else {
                anze = atuf.j;
            }
            obj = (ajwn) ajzv.a(anze, ajwn.class);
        }
        if (obj == null) {
            aymo = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.b;
            if (aymo == null) {
                aymo = aymo.c;
            }
            if (aymo.a == 64099105) {
                aymo aymo2 = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.b;
                if (aymo2 == null) {
                    aymo2 = aymo.c;
                }
                if (aymo2.a == 64099105) {
                    aqhy = (aqhy) aymo2.b;
                } else {
                    aqhy = aqhy.q;
                }
            }
            aqhy aqhy2 = aqhy;
            if (aqhy2 != null) {
                akcq.a(this.a, aqhy2, this.c, this.d, (akcp) xsb.a(map, (Object) "confirmDialogControllerListener", akcp.class), null);
            }
            return;
        }
        this.b.a(obj);
    }
}
