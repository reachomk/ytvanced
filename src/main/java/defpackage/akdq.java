package defpackage;

import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: akdq */
public final class akdq implements aalw, sxz {
    private static final anxa e;
    private static final int f = ((arcg.c.a() << 3) | 2);
    public final Map a = Collections.synchronizedMap(new HashMap());
    public final bapu b;
    public final boolean c;
    public final OutputStream d = new akds();
    private final Map g = Collections.synchronizedMap(new HashMap());
    private final boolean h;
    private final sxd i;
    private final Set j = Collections.synchronizedSet(new HashSet());

    public akdq(sxg sxg, boolean z, boolean z2, bapu bapu) {
        akcx akcx = new akcx(sxg);
        this.h = z;
        this.c = z2;
        this.b = bapu;
        this.i = akcx;
    }

    public final void a(arnm arnm) {
        try {
            arcg arcg;
            anwf g = arnm.toByteString().g();
            while (!g.u()) {
                int a = g.a();
                if (a == f) {
                    arcg = (arcg) g.a(arcg.b.getParserForType(), e);
                    break;
                }
                g.b(a);
            }
            arcg = null;
            if (arcg != null) {
                for (arce arce : arcg.a) {
                    anxr access$000 = anxl.checkIsLite(ayeb.e);
                    arce.a(access$000);
                    if (arce.h.a(access$000.d)) {
                        Object obj;
                        access$000 = anxl.checkIsLite(ayeb.e);
                        arce.a(access$000);
                        Object b = arce.h.b(access$000.d);
                        if (b == null) {
                            obj = access$000.b;
                        } else {
                            obj = access$000.a(b);
                        }
                        ayeb ayeb = (ayeb) obj;
                        String str = ayeb.b;
                        byte[] d = ayeb.c.d();
                        if (this.j.add(str)) {
                            ((UnifiedTemplateResolver) this.b.get()).jni_setTemplateConfig(str, d);
                            if (this.c) {
                                this.a.put(str, d);
                            }
                        }
                        this.g.put(str, d);
                    }
                    access$000 = anxl.checkIsLite(axfp.e);
                    arce.a(access$000);
                    if (arce.h.a(access$000.d)) {
                        access$000 = anxl.checkIsLite(axfp.e);
                        arce.a(access$000);
                        Object b2 = arce.h.b(access$000.d);
                        if (b2 == null) {
                            b2 = access$000.b;
                        } else {
                            b2 = access$000.a(b2);
                        }
                        axfp axfp = (axfp) b2;
                        long j = axfp.b;
                        byte[] d2 = axfp.c.d();
                        if (this.h) {
                            ((UnifiedTemplateResolver) this.b.get()).jni_setResolvedElement(j, d2);
                        }
                    }
                }
                if (this.h) {
                    bblt.a(new akdp(this)).b(bbzi.b).c();
                }
            }
        } catch (IOException e) {
            throw new sxf("Failed to process FrameworkUpdateTransport", e);
        }
    }

    public final byte[] a(String str) {
        byte[] bArr = (byte[]) this.g.get(str);
        if (bArr == null) {
            String a;
            sxd sxd = this.i;
            Map map = this.g;
            Iterable keySet = map.keySet();
            amqh a2 = amqh.a(", ");
            synchronized (map) {
                a = a2.a(keySet);
            }
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 33) + String.valueOf(a).length());
            stringBuilder.append("Missing Template: ");
            stringBuilder.append(str);
            stringBuilder.append(", cached keys: ");
            stringBuilder.append(a);
            sxd.a(3, stringBuilder.toString());
        }
        return bArr;
    }

    public final void a(arnm arnm, asic asic) {
        a(arnm);
    }

    static {
        anxa a = anxa.a();
        a.a(arcg.c);
        a.a(ayeb.e);
        a.a(axfp.e);
        e = a;
    }
}
