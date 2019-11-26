package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import java.util.List;

/* renamed from: hoo */
public final class hoo extends hnn {
    private final Context a;

    public hoo(Context context) {
        super(agqp.class, akay.class);
        this.a = context;
    }

    private static axpc a(String str, arwh arwh, String str2, auac auac) {
        axpb axpb = (axpb) axpc.f.createBuilder();
        aphm aphm = (aphm) aphj.d.createBuilder();
        aphf aphf = (aphf) aphg.s.createBuilder();
        aphf.a(ajqy.a(str2));
        arwe arwe = (arwe) arwf.c.createBuilder();
        arwe.a(arwh);
        aphf.a(arwe);
        apxx apxx = (apxx) apxu.d.createBuilder();
        anxr anxr = LikeEndpointOuterClass$LikeEndpoint.likeEndpoint;
        atzu atzu = (atzu) LikeEndpointOuterClass$LikeEndpoint.e.createBuilder();
        atzu.a(auac);
        auag auag = (auag) auad.d.createBuilder();
        auag.a(str);
        atzu.a(auag);
        apxx.a(anxr, (LikeEndpointOuterClass$LikeEndpoint) ((anxl) atzu.build()));
        aphf.a(apxx);
        aphm.a(aphf);
        axpb.a(aphm);
        return (axpc) ((anxl) axpb.build());
    }

    public final /* synthetic */ Object a(Object obj, amur amur) {
        agqp agqp = (agqp) obj;
        String a = agqp.a();
        armk armk = (armk) arml.f.createBuilder();
        if (agqp.d != null) {
            armo armo = (armo) armp.m.createBuilder();
            armo.a();
            armo.a(DateFormat.getLongDateFormat(this.a).format(agqp.d));
            armk.a((armp) ((anxl) armo.build()));
        }
        arml arml = (arml) ((anxl) armk.build());
        Context context = this.a;
        Object[] objArr = new Object[1];
        int i = 0;
        objArr[0] = Long.valueOf(agqp.g());
        String string = context.getString(R.string.video_views, objArr);
        etw etw = new etw();
        arml arml2 = agqp.e.j;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        etw.c = arml2;
        etw.d = arml;
        etw.e = etw.a(string);
        etw.f = etw.a(string);
        etw.b = etw.a(agqp.b());
        etw.a = a;
        etw.a(hoo.a(a, arwh.LIKE, agqp.d(), auac.LIKE));
        etw.a(hoo.a(a, arwh.DISLIKE, agqp.e(), auac.DISLIKE));
        axpb axpb = (axpb) axpc.f.createBuilder();
        aphm aphm = (aphm) aphj.d.createBuilder();
        aphm.a(aphg.s);
        axpb.a(aphm);
        axpb.a();
        axpb.a(ajqy.a(this.a.getString(R.string.offline_button_complete_text)));
        etw.a((axpc) ((anxl) axpb.build()));
        etw.i = Boolean.valueOf(true);
        ett ett = new ett();
        agpy agpy = agqp.a;
        if (agpy != null) {
            ett.a(agpy.b);
            aaft aaft = agqp.a.c;
            if (aaft != null) {
                ett.a = aaft.d();
            }
        }
        akat a2 = ett.a();
        etw.h = new akav();
        etw.h.a = a2;
        akay akay = new akay();
        akay.k = etw.a;
        akay.a = etw.b;
        akay.f = etw.c;
        akay.l = etw.d;
        akay.b = etw.e;
        akay.c = etw.f;
        List list = etw.g;
        if (list != null) {
            akay.d = new axpe[list.size()];
            while (true) {
                axpe[] axpeArr = akay.d;
                if (i >= axpeArr.length) {
                    break;
                }
                axpeArr[i] = (axpe) etw.g.get(i);
                i++;
            }
        }
        akay.e = etw.h;
        if (etw.i != null) {
            akay.setExtension(akax.a, etw.i);
        }
        return akay;
    }
}
