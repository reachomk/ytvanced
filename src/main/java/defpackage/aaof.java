package defpackage;

import com.google.protos.youtube.api.innertube.SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: aaof */
public final class aaof {
    public final ajrg a;
    public aanw b;
    private List c;

    public aaof(ajrg ajrg) {
        this.a = ajrg;
    }

    public final List a() {
        if (this.c == null) {
            LinkedList linkedList = new LinkedList();
            ajrf[] ajrfArr = this.a.a;
            if (ajrfArr != null) {
                for (ajrf ajrf : ajrfArr) {
                    aofb aofb = ajrf.b;
                    if (aofb != null) {
                        for (aofc aofc : aofb.a) {
                            if (aofc.a == 63434476) {
                                for (aoew aoew : ((aoex) aofc.b).b) {
                                    if (aoew.a == 62381864) {
                                        aanv aanv = new aanv((aoer) aoew.b);
                                        amqw.a(aanv.a());
                                        if (aanv.j()) {
                                            xvd.a(aanv.k());
                                        } else {
                                            xvd.a(aanv.e());
                                        }
                                        linkedList.add(aanv);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.c = Collections.unmodifiableList(linkedList);
        }
        return this.c;
    }

    public final aanv b() {
        ajrg ajrg = this.a;
        if (ajrg != null) {
            apxu apxu = ajrg.b;
            if (apxu != null) {
                anxr access$000 = anxl.checkIsLite(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    apxu apxu2 = this.a.b;
                    anxr access$0002 = anxl.checkIsLite(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint);
                    apxu2.a(access$0002);
                    Object b = apxu2.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    String b2 = new aaoe((SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint) b).b();
                    if (b2 != null) {
                        for (aanv aanv : a()) {
                            if (b2.equals(aanv.e())) {
                                return aanv;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
