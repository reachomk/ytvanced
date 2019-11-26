package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: fxx */
public final class fxx implements aaap {
    public final Context a;
    public final kwi b;
    private final abdp c;
    private final aapn d;
    private final acvx e;
    private final Executor f;
    private final bcaa g;

    public fxx(Context context, abdp abdp, aapn aapn, kwi kwi, Executor executor, acvx acvx, bcaa bcaa) {
        this.a = context;
        this.c = abdp;
        this.e = (acvx) amqw.a((Object) acvx);
        this.b = (kwi) amqw.a((Object) kwi);
        this.f = (Executor) amqw.a((Object) executor);
        this.d = (aapn) amqw.a((Object) aapn);
        this.g = bcaa;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.shoppingServiceEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            akdt akdt = (akdt) xsb.a(map, (Object) "command_status_callback", akdt.class);
            bblw a = akdt != null ? akdt.a() : null;
            access$000 = anxl.checkIsLite(ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.shoppingServiceEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint = (ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint) obj;
            String str;
            if ((shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.a & 128) == 0 || shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.i.isEmpty()) {
                int a2 = axkx.a(shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.b);
                boolean z = true;
                if (a2 == 0) {
                    a2 = 1;
                }
                a2--;
                if (a2 == 1) {
                    asrm asrm;
                    String str2;
                    asrj asrj;
                    abdp abdp = this.c;
                    abdm abdm = new abdm(abdp.c, abdp.d.c(), (asrm) asrj.i.createBuilder());
                    apxn a3 = abdp.b.a();
                    if (a3 != null) {
                        auya auya = a3.i;
                        if (auya == null) {
                            auya = auya.J;
                        }
                        if ((auya.b & 256) != 0) {
                            auya auya2 = a3.i;
                            if (auya2 == null) {
                                auya2 = auya.J;
                            }
                            aovf aovf = auya2.z;
                            if (aovf == null) {
                                aovf = aovf.g;
                            }
                            z = aovf.c;
                        }
                    }
                    abdm.h = z;
                    abdm.a(aabc.a(apxu));
                    abdm.j = (String) abdp.g.get();
                    if ((shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.a & 8) != 0) {
                        asrm = abdm.a;
                        str2 = shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.e;
                        asrm.copyOnWrite();
                        asrj = (asrj) asrm.instance;
                        if (str2 != null) {
                            asrj.a |= 8;
                            asrj.e = str2;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    if ((shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.a & 4) != 0) {
                        asrm = abdm.a;
                        str2 = shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.d;
                        asrm.copyOnWrite();
                        asrj = (asrj) asrm.instance;
                        if (str2 != null) {
                            asrj.a |= 4;
                            asrj.d = str2;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    if ((shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.a & 2) != 0) {
                        asrm = abdm.a;
                        str2 = shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.c;
                        asrm.copyOnWrite();
                        asrj = (asrj) asrm.instance;
                        if (str2 != null) {
                            asrj.a |= 2;
                            asrj.c = str2;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    if ((shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.a & 32) != 0) {
                        asrm = abdm.a;
                        boolean z2 = shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.g;
                        asrm.copyOnWrite();
                        asrj = (asrj) asrm.instance;
                        asrj.a |= 16;
                        asrj.f = z2;
                    }
                    if ((shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.a & 64) != 0) {
                        asrm = abdm.a;
                        str2 = shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.h;
                        asrm.copyOnWrite();
                        asrj = (asrj) asrm.instance;
                        if (str2 != null) {
                            asrj.a |= 32;
                            asrj.g = str2;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    if ((shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.a & 16) != 0) {
                        asrm = abdm.a;
                        str = shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.f;
                        asrm.copyOnWrite();
                        asrj = (asrj) asrm.instance;
                        if (str != null) {
                            asrj.a |= 64;
                            asrj.h = str;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    try {
                        asrl asrl = (asrl) this.c.a.b(abdm);
                        if (asrl != null && asrl.hasFrameworkUpdates()) {
                            amqp a4 = fxx.a(asrl.getFrameworkUpdates());
                            c(a4);
                            a(fxx.b(a4));
                        }
                        if (a != null) {
                            a.a();
                            return;
                        }
                    } catch (Exception e) {
                        xtl.a("GetProductDetails RPC failed.", e);
                        if (a != null) {
                            a.a(e);
                        }
                    }
                } else if (a2 == 2) {
                    String str3 = "GetCheckoutURL RPC not implemented.";
                    xtl.c(str3);
                    if (a != null) {
                        a.a(new Exception(str3));
                        return;
                    }
                }
            }
            access$000 = anxl.checkIsLite(ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.shoppingServiceEndpoint);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint = (ShoppingServiceEndpointOuterClass$ShoppingServiceEndpoint) obj;
            aaps a5 = this.d.a();
            str = shoppingServiceEndpointOuterClass$ShoppingServiceEndpoint.i;
            a5.a(apxu.b);
            a5.c("FEproduct_details");
            a5.d(str);
            a5.j = (String) this.g.get();
            xan.a(this.d.a(a5, this.f), aniv.a, new fya(a), new fxz(this, a));
        }
    }

    public final void a(amqp amqp) {
        if (amqp.a()) {
            aopd aopd = (aopd) amqp.b();
            if (aopd.d) {
                if (aopd.c.isEmpty()) {
                    xtl.c("Checkout url is empty.");
                    return;
                }
                bblt.a(new fyc(this, aopd)).b(bbmt.a()).c();
            }
        }
    }

    public static amqp a(arnm arnm) {
        anxr access$000 = anxl.checkIsLite(arfm.c);
        arnm.a(access$000);
        if (!arnm.h.a(access$000.d)) {
            return ampo.a;
        }
        access$000 = anxl.checkIsLite(arfm.c);
        arnm.a(access$000);
        Object b = arnm.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        for (arfo arfo : ((arfm) r3).a) {
            int a = arga.a(arfo.c);
            if (a != 0 && a == 2 && arfo.b.startsWith("video/youtube/ecommerce/shopping/")) {
                anxp anxp = arfo.d;
                if (anxp == null) {
                    anxp = arfy.a;
                }
                access$000 = anxl.checkIsLite(awof.f);
                anxp.a(access$000);
                b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                return amqp.b((awof) b);
            }
        }
        return ampo.a;
    }

    public static amqp b(amqp amqp) {
        if (!amqp.a()) {
            return ampo.a;
        }
        awod awod = ((awof) amqp.b()).c;
        if (awod == null) {
            awod = awod.c;
        }
        anxp anxp = awod.b;
        if (anxp == null) {
            anxp = azsr.a;
        }
        anxr access$000 = anxl.checkIsLite(asfc.a);
        anxp.a(access$000);
        if (!anxp.h.a(access$000.d)) {
            return ampo.a;
        }
        awod awod2 = ((awof) amqp.b()).c;
        if (awod2 == null) {
            awod2 = awod.c;
        }
        anxp anxp2 = awod2.b;
        if (anxp2 == null) {
            anxp2 = azsr.a;
        }
        anxr access$0002 = anxl.checkIsLite(asfc.a);
        anxp2.a(access$0002);
        Object b = anxp2.h.b(access$0002.d);
        if (b == null) {
            b = access$0002.b;
        } else {
            b = access$0002.a(b);
        }
        apxu apxu = (apxu) b;
        access$0002 = anxl.checkIsLite(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
        apxu.a(access$0002);
        if (!apxu.h.a(access$0002.d)) {
            return ampo.a;
        }
        access$0002 = anxl.checkIsLite(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
        apxu.a(access$0002);
        b = apxu.h.b(access$0002.d);
        if (b == null) {
            b = access$0002.b;
        } else {
            b = access$0002.a(b);
        }
        arex arex = ((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) b).c;
        if (arex == null) {
            arex = arex.c;
        }
        arfb arfb = (arex.a == 138681066 ? (arff) arex.b : arff.e).d;
        if (arfb == null) {
            arfb = arfb.c;
        }
        axez axez = arfb.a == 49399797 ? (axez) arfb.b : axez.g;
        if (axez.b.size() == 1) {
            atvv atvv = ((axff) axez.b.get(0)).h;
            if (atvv == null) {
                atvv = atvv.d;
            }
            if (atvv.c.size() == 1) {
                b = ((atwb) atvv.c.get(0)).dx;
                if (b == null) {
                    b = aopd.h;
                }
                return amqp.b(b);
            }
        }
        return ampo.a;
    }

    public final void c(amqp amqp) {
        if (amqp.a()) {
            this.e.b(new acvs(((awof) amqp.b()).d));
        }
    }
}
