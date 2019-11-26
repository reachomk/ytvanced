package defpackage;

import com.google.protos.youtube.api.innertube.FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: fxl */
public final class fxl implements aaap {
    private final vuh a;
    private final vqp b;
    private final aaas c;

    public fxl(vup vup, vqr vqr, aaas aaas) {
        this.a = vup.a(new fxo());
        this.b = vqr.a();
        this.c = aaas;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.formfillPostSubmitEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.formfillPostSubmitEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint = (FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint) b;
            int a = arne.a(formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.d);
            String str = "FORM_RESULTS_ARG";
            ArrayList arrayList;
            vuh vuh;
            aojo aojo;
            if (a != 0 && a == 2) {
                arrayList = (ArrayList) fxl.a(map, str, new ArrayList());
                dht dht = (dht) dhq.d.createBuilder();
                String str2 = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.c;
                dht.copyOnWrite();
                dhq dhq = (dhq) dht.instance;
                if (str2 != null) {
                    dhq.a |= 1;
                    dhq.b = str2;
                    dht.copyOnWrite();
                    dhq dhq2 = (dhq) dht.instance;
                    if (!dhq2.c.a()) {
                        dhq2.c = anxl.mutableCopy(dhq2.c);
                    }
                    anvf.addAll(arrayList, dhq2.c);
                    byte[] toByteArray = ((dhq) ((anxl) dht.build())).toByteArray();
                    vuh = this.a;
                    aojo = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.b;
                    if (aojo == null) {
                        aojo = aojo.f;
                    }
                    vuh.a(aojo, toByteArray, this.b);
                } else {
                    throw new NullPointerException();
                }
            }
            arrayList = new ArrayList();
            List<dho> list = (List) fxl.a(map, str, new ArrayList());
            if (list != null) {
                for (dho dho : list) {
                    dhs dhs;
                    Object obj = dho.d;
                    if (dho.b == 4) {
                        dhs = (dhs) dho.c;
                    } else {
                        dhs = dhs.c;
                    }
                    Object obj2 = dhs.b;
                    if (!(amqu.a((String) obj) || amqu.a((String) obj2))) {
                        arrayList.add(amvr.a(obj, obj2));
                    }
                }
            }
            vuh = this.a;
            aojo = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.b;
            if (aojo == null) {
                aojo = aojo.f;
            }
            vuh.a(aojo, arrayList, false, new aftl[0]);
            Iterable iterable = (List) fxl.a(map, "SUBMIT_COMMANDS_ARG", new ArrayList());
            if (iterable != null) {
                this.c.a((apxu[]) amux.a(iterable, apxu.class), map);
            }
        }
    }

    private static Object a(Map map, String str, Object obj) {
        if (map == null || !map.containsKey(str)) {
            return obj;
        }
        try {
            return map.get(str);
        } catch (ClassCastException e) {
            afpc.a(2, afpf.ad, "FormfillPostSubmitCommand: This should never happen.", e);
            return null;
        }
    }
}
