package defpackage;

import android.util.Pair;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: epa */
public final class epa implements swd {
    public final jty a;
    private final fhb b;
    private final Map c = new WeakHashMap();
    private final Map d = new WeakHashMap();

    public epa(jty jty, fhb fhb) {
        this.b = fhb;
        this.a = jty;
    }

    public final anwy a() {
        return azwz.h;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        azwz azwz = (azwz) obj;
        if (!(swg instanceof eok)) {
            return bblt.a();
        }
        if (!swg.d().a()) {
            return bblt.a(new Throwable("InlineMutedCommand dispatched without eventData."));
        }
        Pair pair = (Pair) swg.d().b();
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        eow eow = (eow) pair.second;
        int a = azwx.a(azwz.b);
        if (a != 0 && a == 2) {
            anxp anxp = azwz.c;
            if (anxp == null) {
                anxp = azsr.a;
            }
            anxr access$000 = anxl.checkIsLite(asfc.a);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            b = (apxu) b;
            access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            b.a(access$000);
            if (!b.h.a(access$000.d)) {
                return bblt.a(new NullPointerException());
            }
            anvf anvf = azwz.d;
            if (anvf == null) {
                anvf = azuz.a;
            }
            azsg azsg = azwz.f;
            if (azsg == null) {
                azsg = azsg.c;
            }
            boolean z = azwz.e;
            fob fob = (fob) this.c.get(eow);
            int i = 0;
            if (fob == null) {
                Object obj2;
                amqw.a(b);
                anxr access$0002 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                b.a(access$0002);
                amqw.b(b.h.a(access$0002.d));
                access$0002 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                b.a(access$0002);
                Object b2 = b.h.b(access$0002.d);
                if (b2 == null) {
                    obj2 = access$0002.b;
                } else {
                    obj2 = access$0002.a(b2);
                }
                azje azje = (azje) obj2;
                ayft ayft = (ayft) ayfu.q.createBuilder();
                apdn apdn = apdn.d;
                ayft.copyOnWrite();
                ayfu ayfu = (ayfu) ayft.instance;
                if (apdn != null) {
                    arml arml;
                    aygk aygk;
                    ayfu.l = apdn;
                    ayfu.a |= 1024;
                    ayfu ayfu2 = (ayfu) ((anxl) ayft.build());
                    fpg k = fpd.k();
                    k.g = 4;
                    k.c = b;
                    k.b = azje.b;
                    if (z) {
                        arml = null;
                    } else {
                        armk armk = (armk) arml.f.createBuilder();
                        armk.a(azsg.b);
                        arml = (arml) ((anxl) armk.build());
                    }
                    k.e = arml;
                    k.f = new ayfu[]{ayfu2};
                    aygj aygj = (aygj) aygk.f.createBuilder();
                    if (anvf != null) {
                        try {
                            for (bdhk bdhk : ((bdhi) aocf.mergeFrom(new bdhi(), anvf.toByteArray())).a) {
                                if (bdhk.b()) {
                                    aygl aygl = (aygl) aygm.e.createBuilder();
                                    String str = !bdhk.a().startsWith("//") ? "" : "https:";
                                    String valueOf = String.valueOf(bdhk.a());
                                    if (valueOf.length() == 0) {
                                        valueOf = new String(str);
                                    } else {
                                        valueOf = str.concat(valueOf);
                                    }
                                    aygl.a(valueOf);
                                    aygl.a(bdhk.b);
                                    aygl.b(bdhk.c);
                                    aygj.a(aygl);
                                }
                            }
                            aygk = (aygk) ((anxl) aygj.build());
                        } catch (aocg | NullPointerException unused) {
                            aygk = (aygk) ((anxl) aygj.build());
                        }
                    } else {
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    k.a = aygk;
                    fob = k.a();
                    this.c.put(eow, fob);
                } else {
                    throw new NullPointerException();
                }
            }
            String b3 = fob.b();
            fgz fgz = (epd) this.d.get(eow);
            if (fgz == null) {
                fgz = new epd(this, b3, eow);
                this.d.put(eow, fgz);
            }
            String.valueOf(b).length();
            fhb fhb = this.b;
            if (booleanValue) {
                i = 3;
            }
            return fhb.a(fob, fgz, i).b(bbmt.a());
        }
        fob fob2 = (fob) this.c.get(eow);
        if (fob2 != null) {
            return this.b.a(fob2).b(bbmt.a());
        }
        return bblt.a();
    }
}
