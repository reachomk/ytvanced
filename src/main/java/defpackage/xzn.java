package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.EditConversationEndpointOuterClass$EditConversationEndpoint;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: xzn */
public final class xzn implements yhn, yhp {
    public final Handler a;
    public final Set b = new HashSet();
    public final Set c = new HashSet();
    public final Map d = new HashMap();
    public xxp e;
    public aqnv f;
    public akpk g;
    public yda h;
    private final aaas i;
    private final xsc j;
    private long k;
    private boolean l;

    public xzn(aaas aaas, xsc xsc, Handler handler) {
        this.i = (aaas) amqw.a((Object) aaas);
        this.j = (xsc) amqw.a((Object) xsc);
        this.a = (Handler) amqw.a((Object) handler);
    }

    public final void a(aqny aqny, boolean z) {
        if (aqny != null) {
            long a = this.j.a();
            apxu a2;
            aqnz aqnz;
            if (z) {
                aqnz aqnz2 = (aqnz) aqny.instance;
                if ((aqnz2.a & 128) != 0 && a > this.k + ((long) aqnz2.i)) {
                    yda yda = this.h;
                    if (yda == null || yda.a.size() < ((aqnz) aqny.instance).k) {
                        this.k = a;
                        a2 = xzn.a(aqny.b(), a);
                        aqny.copyOnWrite();
                        aqnz = (aqnz) aqny.instance;
                        if (a2 != null) {
                            aqnz.h = a2;
                            aqnz.a |= 128;
                            this.i.a(aqny.b(), null);
                            this.l = true;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                }
            } else if ((((aqnz) aqny.instance).a & 512) != 0 && this.l) {
                a2 = xzn.a(aqny.c(), a);
                aqny.copyOnWrite();
                aqnz = (aqnz) aqny.instance;
                if (a2 != null) {
                    aqnz.j = a2;
                    aqnz.a |= 512;
                    this.i.a(aqny.c(), null);
                    return;
                }
                throw new NullPointerException();
            }
        }
    }

    public final void a(yho yho) {
        this.b.add(yho);
    }

    public final void b(yho yho) {
        this.b.remove(yho);
    }

    private static apxu a(apxu apxu, long j) {
        anxr access$000 = anxl.checkIsLite(EditConversationEndpointOuterClass$EditConversationEndpoint.editConversationEndpoint);
        apxu.a(access$000);
        if (!apxu.h.a(access$000.d)) {
            return apxu;
        }
        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
        anxr anxr = EditConversationEndpointOuterClass$EditConversationEndpoint.editConversationEndpoint;
        anxr access$0002 = anxl.checkIsLite(EditConversationEndpointOuterClass$EditConversationEndpoint.editConversationEndpoint);
        apxu.a(access$0002);
        Object b = apxu.h.b(access$0002.d);
        if (b == null) {
            b = access$0002.b;
        } else {
            b = access$0002.a(b);
        }
        arat arat = (arat) ((anxo) ((EditConversationEndpointOuterClass$EditConversationEndpoint) b).toBuilder());
        arat.copyOnWrite();
        EditConversationEndpointOuterClass$EditConversationEndpoint editConversationEndpointOuterClass$EditConversationEndpoint = (EditConversationEndpointOuterClass$EditConversationEndpoint) arat.instance;
        editConversationEndpointOuterClass$EditConversationEndpoint.a |= 4;
        editConversationEndpointOuterClass$EditConversationEndpoint.d = j;
        apxx.a(anxr, (EditConversationEndpointOuterClass$EditConversationEndpoint) ((anxl) arat.build()));
        return (apxu) ((anxl) apxx.build());
    }

    public final void a(String str, long j) {
        ycz ycz = (ycz) this.h.a.get(str);
        if (ycz != null && ycz.a.d <= j) {
            this.h.a.remove(str);
            a();
        }
    }

    public final void a() {
        for (yho a : this.b) {
            a.a(this.h);
        }
    }
}
