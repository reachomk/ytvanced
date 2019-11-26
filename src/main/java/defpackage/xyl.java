package defpackage;

import com.google.protos.youtube.api.innertube.EditConversationNameEndpointOuterClass$EditConversationNameEndpoint;
import com.google.protos.youtube.api.innertube.EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xyl */
public final class xyl implements yab {
    public final aaas a;
    public yaa b;
    public apxu c;
    private apxu d;
    private xyo e;

    public xyl(aaas aaas, xyo xyo) {
        this.e = (xyo) amqw.a((Object) xyo);
        this.a = (aaas) amqw.a((Object) aaas);
    }

    public xyl(aaas aaas, apxu apxu) {
        boolean z = false;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(EditConversationNameEndpointOuterClass$EditConversationNameEndpoint.editConversationNameEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                z = true;
            }
        }
        amqw.a(z);
        this.a = (aaas) amqw.a((Object) aaas);
        this.d = apxu;
    }

    public final void a(String str) {
        apxu apxu = this.d;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(EditConversationNameEndpointOuterClass$EditConversationNameEndpoint.editConversationNameEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            arau arau = (arau) ((anxo) ((EditConversationNameEndpointOuterClass$EditConversationNameEndpoint) b).toBuilder());
            arau.copyOnWrite();
            EditConversationNameEndpointOuterClass$EditConversationNameEndpoint editConversationNameEndpointOuterClass$EditConversationNameEndpoint = (EditConversationNameEndpointOuterClass$EditConversationNameEndpoint) arau.instance;
            if (str != null) {
                editConversationNameEndpointOuterClass$EditConversationNameEndpoint.a |= 2;
                editConversationNameEndpointOuterClass$EditConversationNameEndpoint.c = str;
                EditConversationNameEndpointOuterClass$EditConversationNameEndpoint editConversationNameEndpointOuterClass$EditConversationNameEndpoint2 = (EditConversationNameEndpointOuterClass$EditConversationNameEndpoint) ((anxl) arau.build());
                apxx apxx = (apxx) ((anxo) this.d.toBuilder());
                apxx.a(EditConversationNameEndpointOuterClass$EditConversationNameEndpoint.editConversationNameEndpoint, editConversationNameEndpointOuterClass$EditConversationNameEndpoint2);
                this.d = (apxu) ((anxl) apxx.build());
                Map hashMap = new HashMap();
                yaa yaa = this.b;
                String str2 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
                if (yaa != null) {
                    hashMap.put(str2, yaa);
                } else {
                    hashMap.put(str2, this);
                }
                this.a.a(this.d, hashMap);
                return;
            }
            throw new NullPointerException();
        }
    }

    public final void a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.editConversationNameEntryEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.editConversationNameEntryEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint = (EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint) obj;
                araq araq = editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.b;
                if (araq == null) {
                    araq = araq.c;
                }
                arao arao = araq.b;
                if (arao == null) {
                    arao = arao.g;
                }
                anxp anxp = arao.f;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                anxr access$0002 = anxl.checkIsLite(EditConversationNameEndpointOuterClass$EditConversationNameEndpoint.editConversationNameEndpoint);
                anxp.a(access$0002);
                if (anxp.h.a(access$0002.d)) {
                    this.c = apxu;
                    araq araq2 = editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.b;
                    if (araq2 == null) {
                        araq2 = araq.c;
                    }
                    arao arao2 = araq2.b;
                    if (arao2 == null) {
                        arao2 = arao.g;
                    }
                    apxu = arao2.f;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    this.d = apxu;
                }
            }
        }
    }

    public final void a(araq araq) {
        this.e.a(araq);
    }
}
