package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.Map;

/* renamed from: eum */
public final class eum implements aaap {
    public final aaas a;
    public final xoi b;
    public final akmx c;
    private final Context d;
    private final abdx e;
    private final afve f;

    public eum(Context context, abdx abdx, aaas aaas, xoi xoi, akmx akmx, afve afve) {
        this.d = (Context) amqw.a((Object) context);
        this.e = (abdx) amqw.a((Object) abdx);
        this.a = aaas;
        this.b = (xoi) amqw.a((Object) xoi);
        this.c = akmx;
        this.f = afve;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        eun eup;
        eun eun;
        anxr access$000 = anxl.checkIsLite(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) obj;
        this.a.a(modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.d, map);
        abdx abdx = this.e;
        aaml abds = new abds(abdx.c, abdx.d.c());
        abds.c = this.f.a();
        abds.d = afxw.a(this.d, this.f);
        abds.a = modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.b;
        abds.b = (String[]) amqw.a((String[]) modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.c.toArray(new String[0]));
        abds.a(apxu.b.d());
        obj = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        afxm afxm = (afxm) xsb.a(map, (Object) "notification_data", afxm.class);
        abdx abdx2 = this.e;
        if (obj instanceof etb) {
            eup = new eup((etb) obj);
        } else if (obj instanceof eul) {
            eup = new euo((eul) obj);
        } else {
            eun = new eun();
            abdx2.i.a(abds, new euq(this, apxu, eun, map, afxm));
        }
        eun = eup;
        abdx2.i.a(abds, new euq(this, apxu, eun, map, afxm));
    }
}
