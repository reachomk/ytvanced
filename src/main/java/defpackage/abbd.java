package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import java.util.Set;

/* renamed from: abbd */
public final class abbd extends aaml {
    public String a = "";
    public boolean b;
    public boolean c;
    private final Set d;
    private byte[] e = new byte[0];

    public abbd(aamd aamd, afpt afpt, Set set) {
        super("live_chat/get_live_chat", aamd, afpt);
        this.d = set;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final abbd a(apxu apxu) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        this.e = ((LiveChatEndpointOuterClass$LiveChatEndpoint) obj).b.d();
        a(apxu.b);
        return this;
    }

    public final /* synthetic */ anzd c() {
        asvp asvp;
        asvs asvs = (asvs) asvp.g.createBuilder();
        asvp asvp2;
        if (TextUtils.isEmpty(this.a)) {
            byte[] bArr = this.e;
            if (bArr != null && bArr.length > 0) {
                anvu a = anvu.a(bArr);
                asvs.copyOnWrite();
                asvp2 = (asvp) asvs.instance;
                if (a != null) {
                    asvp2.a |= 2;
                    asvp2.c = a;
                } else {
                    throw new NullPointerException();
                }
            }
        }
        String str = this.a;
        asvs.copyOnWrite();
        asvp2 = (asvp) asvs.instance;
        if (str != null) {
            asvp2.a |= 4;
            asvp2.d = str;
        } else {
            throw new NullPointerException();
        }
        if (this.b) {
            asvs.copyOnWrite();
            asvp = (asvp) asvs.instance;
            asvp.a |= 64;
            asvp.e = true;
        }
        if (this.c) {
            asvs.copyOnWrite();
            asvp = (asvp) asvs.instance;
            asvp.a |= 128;
            asvp.f = true;
        }
        Set set = this.d;
        if (!(set == null || set.isEmpty())) {
            for (abba abba : this.d) {
                if (abba != null) {
                    abba.a();
                }
            }
        }
        return asvs;
    }
}
