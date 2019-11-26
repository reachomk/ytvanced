package defpackage;

import android.net.Uri;
import com.google.protos.youtube.api.innertube.EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint;
import com.google.protos.youtube.api.innertube.PhonebookRenderer;
import java.util.List;

/* renamed from: alfx */
public final class alfx extends aleg implements alni {
    public List a;
    public final acvx b;
    public final allc f = new allc();
    public String g;
    private final allw h;
    private final alnp i;

    public alfx(alpo alpo, alel alel, acvx acvx, apxu apxu, allw allw, alnp alnp) {
        super(alpo, alel);
        this.b = (acvx) amqw.a((Object) acvx);
        this.h = (allw) amqw.a((Object) allw);
        this.i = (alnp) amqw.a((Object) alnp);
        acvx.a(acwl.ag, apxu, null);
    }

    public final void a(String str) {
        List<alnn> list = this.a;
        if (list == null) {
            this.g = str;
            return;
        }
        for (alnn alnn : list) {
            alnp alnp = this.i;
            alnm alnm = alnn.f;
            if (alnm != null) {
                alnm.cancel(true);
            }
            alnn.f = new alnm(alnn, alnp);
            alnn.f.execute(new String[]{str});
        }
    }

    public final void a(avyi avyi) {
        alld alld = (alld) this.f.b.get(avyi.c);
        amqw.b(avyi.b.equals(alld.b));
        alld.h = avyi;
    }

    public final void a(alld alld, avym avym, alio alio) {
        auvq auvq = (auvq) auvn.l.createBuilder();
        int a = aqiw.a(alld.h.d);
        auvp auvp = null;
        anxp anxp;
        anxr access$000;
        anxp anxp2;
        anxr access$0002;
        Object b;
        if (a != 0 && a == 3) {
            anxp = avym.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(PhonebookRenderer.phonebookBottomSheetMenuItemTemplateRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp2 = avym.c;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                access$0002 = anxl.checkIsLite(PhonebookRenderer.phonebookBottomSheetMenuItemTemplateRenderer);
                anxp2.a(access$0002);
                b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                auvp = alfx.a((avyk) b, alld.h.f);
            }
        } else {
            anxp = avym.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(PhonebookRenderer.phonebookBottomSheetMenuItemTemplateRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp2 = avym.b;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                access$0002 = anxl.checkIsLite(PhonebookRenderer.phonebookBottomSheetMenuItemTemplateRenderer);
                anxp2.a(access$0002);
                b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                auvp = alfx.a((avyk) b, alld.h.e);
            }
        }
        if (auvp != null) {
            auvm auvm = (auvm) auvj.j.createBuilder();
            auvm.a(auvp);
            auvq.a((auvj) ((anxl) auvm.build()));
        }
        aqic aqic = (aqic) aqid.e.createBuilder();
        arml a2 = ajqy.a(alld.c);
        aqic.copyOnWrite();
        aqid aqid = (aqid) aqic.instance;
        if (a2 != null) {
            aqid.b = a2;
            aqid.a |= 1;
            arml a3 = ajqy.a(alld.b);
            aqic.copyOnWrite();
            aqid aqid2 = (aqid) aqic.instance;
            if (a3 != null) {
                aqid2.c = a3;
                aqid2.a |= 2;
                Uri uri = alld.e;
                if (uri != null) {
                    aygk a4 = aklb.a(uri);
                    aqic.copyOnWrite();
                    aqid aqid3 = (aqid) aqic.instance;
                    if (a4 != null) {
                        aqid3.d = a4;
                        aqid3.a |= 4;
                    } else {
                        throw new NullPointerException();
                    }
                }
                aqid aqid4 = (aqid) ((anxl) aqic.build());
                auwa auwa = (auwa) auvx.c.createBuilder();
                auwa.copyOnWrite();
                auvx auvx = (auvx) auwa.instance;
                if (aqid4 != null) {
                    auvx.b = aqid4;
                    auvx.a = 94310230;
                    auvq.copyOnWrite();
                    auvn auvn = (auvn) auvq.instance;
                    auvn.c = (auvx) ((anxl) auwa.build());
                    auvn.a |= 4;
                    this.h.a((auvn) ((anxl) auvq.build()), alio);
                    return;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void a(azfa azfa) {
        this.b.b(azfa, null);
    }

    public final void a(alld alld) {
        this.b.c(alld.i, null);
    }

    public final void b() {
        super.b();
        this.b.a();
    }

    private static auvp a(avyk avyk, String str) {
        auvs auvs = (auvs) auvp.h.createBuilder();
        arml arml = avyk.b;
        if (arml == null) {
            arml = arml.f;
        }
        auvs.a(arml);
        arwf arwf = avyk.c;
        if (arwf == null) {
            arwf = arwf.c;
        }
        auvs.copyOnWrite();
        auvp auvp = (auvp) auvs.instance;
        if (arwf != null) {
            auvp.d = arwf;
            auvp.a |= 4;
            anxp anxp = avyk.d;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.editNonGaiaConnectionStateEndpoint);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp = avyk.d;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                access$000 = anxl.checkIsLite(EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.editNonGaiaConnectionStateEndpoint);
                anxp.a(access$000);
                Object b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                arax arax = (arax) ((anxo) ((EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint) b).toBuilder());
                arax.a(str);
                EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint = (EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint) ((anxl) arax.build());
                anxl anxl = avyk.d;
                if (anxl == null) {
                    anxl = apxu.d;
                }
                apxx apxx = (apxx) ((anxo) anxl.toBuilder());
                apxx.a(EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.editNonGaiaConnectionStateEndpoint, editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint);
                auvs.a(apxx);
            }
            return (auvp) ((anxl) auvs.build());
        }
        throw new NullPointerException();
    }
}
