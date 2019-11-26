package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;

/* renamed from: hob */
public final class hob extends hnn {
    private final Context a;

    public hob(Context context) {
        super(agqk.class, ajxx.class);
        this.a = context;
    }

    public final /* synthetic */ Object a(Object obj, amur amur) {
        agqi agqi = ((agqk) obj).a;
        hoa hoa = new hoa();
        hoa.a = agqi.a;
        hoa.b = ajqy.a(agqi.b);
        aygk d = agqi.d.d();
        hoa.c = d;
        awkw awkw = (awkw) awkx.c.createBuilder();
        awkw.copyOnWrite();
        awkx awkx = (awkx) awkw.instance;
        if (d != null) {
            awkx.b = d;
            awkx.a |= 1;
            awkx awkx2 = (awkx) ((anxl) awkw.build());
            awku awku = (awku) awkv.d.createBuilder();
            awku.copyOnWrite();
            awkv awkv = (awkv) awku.instance;
            if (awkx2 != null) {
                awkv.b = awkx2;
                awkv.a |= 1;
                hoa.d = (awkv) ((anxl) awku.build());
                String quantityString = this.a.getResources().getQuantityString(R.plurals.video_count, agqi.e, new Object[]{Integer.valueOf(agqi.e)});
                hoa.e = ajqy.a(quantityString);
                String str = agqi.a;
                arwe arwe = (arwe) arwf.c.createBuilder();
                arwe.a(arwh.PLAY_ARROW);
                arwf arwf = (arwf) ((anxl) arwe.build());
                artj artj = (artj) artk.f.createBuilder();
                artj.copyOnWrite();
                artk artk = (artk) artj.instance;
                if (arwf != null) {
                    artk.d = arwf;
                    artk.a |= 1;
                    if (str != null) {
                        avse avse = (avse) avsc.g.createBuilder();
                        avse.b(str);
                        avsc avsc = (avsc) ((anxl) avse.build());
                        apxx apxx = (apxx) apxu.d.createBuilder();
                        apxx.a(OfflineWatchEndpointOuterClass.offlineWatchEndpoint, avsc);
                        apxu apxu = (apxu) ((anxl) apxx.build());
                        artj.copyOnWrite();
                        artk artk2 = (artk) artj.instance;
                        if (apxu != null) {
                            artk2.c = apxu;
                            artk2.b = 3;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    hoa.h = (artk) ((anxl) artj.build());
                    agpy agpy = agqi.c;
                    if (agpy != null) {
                        str = agpy.b;
                        quantityString = ebm.a(agpy.a);
                        armk armk = (armk) arml.f.createBuilder();
                        armo armo = (armo) armp.m.createBuilder();
                        armo.a(str);
                        armo.a(hoa.a(quantityString));
                        armk.a(armo);
                        hoa.f = (arml) ((anxl) armk.build());
                        hoa.g = hoa.a(ebm.a(agpy.a));
                    }
                    ajxx ajxx = new ajxx();
                    ajxx.a = hoa.a;
                    ajxx.b = hoa.b;
                    ajxx.c = hoa.c;
                    ajxx.p = hoa.d;
                    ajxx.d = hoa.e;
                    ajxx.f = hoa.f;
                    ajxx.g = null;
                    ajxx.k = hoa.g;
                    awig awig = (awig) awih.c.createBuilder();
                    artk artk3 = hoa.h;
                    awig.copyOnWrite();
                    awih awih = (awih) awig.instance;
                    if (artk3 != null) {
                        awih.b = artk3;
                        awih.a |= 1;
                        ajxx.v = (awih) ((anxl) awig.build());
                        return ajxx;
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
