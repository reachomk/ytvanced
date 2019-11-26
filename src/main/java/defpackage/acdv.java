package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import com.google.protos.youtube.api.innertube.EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint;
import com.google.protos.youtube.api.innertube.GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint;
import com.google.protos.youtube.api.innertube.GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint;
import com.google.protos.youtube.api.innertube.StartStreamEndpointOuterClass$StartStreamEndpoint;
import com.google.protos.youtube.api.innertube.TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint;
import java.util.Map;

/* renamed from: acdv */
public final class acdv implements aaap {
    private final Context a;
    private final acfe b;
    private final acdz c;
    private final zqz d;
    private final znv e;
    private aeh f;

    public acdv(Context context, acfe acfe, acdz acdz, zqz zqz, znv znv) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (acfe) amqw.a((Object) acfe);
        this.c = (acdz) amqw.a((Object) acdz);
        this.d = (zqz) amqw.a((Object) zqz);
        this.e = (znv) amqw.a((Object) znv);
    }

    public final void a(apxu apxu, Map map) {
        anxp anxp = apxu;
        Map map2 = map;
        Object c = xsb.c(map2, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        anxr access$000 = anxl.checkIsLite(CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint.createBroadcastEndpoint);
        anxp.a(access$000);
        aukf aukf = null;
        if (anxp.h.a(access$000.d) && (c instanceof acds)) {
            acds acds = (acds) c;
            acgv e = acds.e();
            arog arog = e.l;
            if (!(arog == null || (arog.a & 4) == 0)) {
                aukf = arog.d;
            }
            this.b.a(e.a, e.b, e.c, e.d, e.e, e.f, e.g, e.i, e.j, e.k, aukf, acds);
            return;
        }
        access$000 = anxl.checkIsLite(MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.mobileBroadcastSetupShowGoLiveScreenEndpoint);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d) && (c instanceof acfk)) {
            acfk acfk = (acfk) c;
            new acdw(this.e, this.b, anxp, acfk).execute(new Void[0]);
            return;
        }
        access$000 = anxl.checkIsLite(GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.getScheduledBroadcastsEndpoint);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d) && (c instanceof acfi)) {
            this.b.a((acfi) c);
            return;
        }
        access$000 = anxl.checkIsLite(TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.takePictureForThumbnailEndpoint);
        anxp.a(access$000);
        acdp acdp;
        anxr access$0002;
        Object b;
        if (anxp.h.a(access$000.d) && (c instanceof acdp)) {
            acdp = (acdp) c;
            access$0002 = anxl.checkIsLite(TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.takePictureForThumbnailEndpoint);
            anxp.a(access$0002);
            b = anxp.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            acdp.a(((TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint) b).b);
            return;
        }
        access$000 = anxl.checkIsLite(EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.editVideoThumbnailEndpoint);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d) && (c instanceof acdp)) {
            acdp = (acdp) c;
            access$0002 = anxl.checkIsLite(EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.editVideoThumbnailEndpoint);
            anxp.a(access$0002);
            b = anxp.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            acdp.b(((EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint) b).b);
            return;
        }
        access$000 = anxl.checkIsLite(GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.getBroadcastSetupEndpoint);
        anxp.a(access$000);
        String str;
        if (anxp.h.a(access$000.d) && (c instanceof acfl)) {
            access$0002 = anxl.checkIsLite(GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.getBroadcastSetupEndpoint);
            anxp.a(access$0002);
            b = anxp.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            str = ((GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint) b).b;
            acfl acfl = (acfl) c;
            if (alai.a(this.a, 3)) {
                this.d.a(new acdu(this, str, acfl));
                return;
            } else {
                a(str, null, acfl);
                return;
            }
        }
        access$000 = anxl.checkIsLite(StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d) && (c instanceof auyw)) {
            acdz acdz = this.c;
            anxr access$0003 = anxl.checkIsLite(StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint);
            anxp.a(access$0003);
            b = anxp.h.b(access$0003.d);
            if (b == null) {
                b = access$0003.b;
            } else {
                b = access$0003.a(b);
            }
            acdz.a(((StartStreamEndpointOuterClass$StartStreamEndpoint) b).b, (auyw) c, (Boolean) map2.get("ARG_IS_PORTRAIT"));
            return;
        }
        access$0002 = anxl.checkIsLite(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint);
        anxp.a(access$0002);
        if (anxp.h.a(access$0002.d) && (c instanceof acfj)) {
            acfj acfj = (acfj) c;
            if (this.f == null) {
                aeg aeg = new aeg(this.a);
                aeg.b(R.string.lc_confirm_delete_scheduled_stream);
                aeg.b(17039360, null);
                this.f = aeg.a();
            }
            aeh aeh = this.f;
            aeh.a.a(-1, this.a.getString(17039370), new acdx(this, anxp, acfj));
            this.f.show();
            return;
        }
        str = String.valueOf(apxu);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 19);
        stringBuilder.append("Unhandled command: ");
        stringBuilder.append(str);
        throw new aabf(stringBuilder.toString());
    }

    public final void a(String str, aukf aukf, acfl acfl) {
        this.b.a(aukf, str, acfl);
    }
}
