package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import com.google.protos.youtube.api.innertube.EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jpd */
public final class jpd extends fai {
    public auvj a;
    private final aaas b;
    private final int c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final yab e;

    public jpd(aaas aaas, auvj auvj, int i, yab yab) {
        this.b = (aaas) amqw.a((Object) aaas);
        this.a = (auvj) amqw.a((Object) auvj);
        this.e = (yab) amqw.a((Object) yab);
        this.c = i;
    }

    public final boolean b() {
        return true;
    }

    public final int c() {
        return 0;
    }

    public final ezx d() {
        return null;
    }

    public final int a() {
        return this.c;
    }

    public final CharSequence e() {
        return abmk.a(this.a);
    }

    public final void a(MenuItem menuItem) {
        menuItem.setTitle(e());
    }

    public final boolean b(MenuItem menuItem) {
        int i = 0;
        String str = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        if (abmk.c(this.a) != null) {
            Map hashMap = new HashMap();
            hashMap.put(str, this.a);
            this.b.a(abmk.c(this.a), hashMap);
            return true;
        } else if (abmk.d(this.a) == null) {
            return false;
        } else {
            Map hashMap2 = new HashMap();
            hashMap2.put(str, this.a);
            apxu d = abmk.d(this.a);
            anxr access$000 = anxl.checkIsLite(EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.editConversationNameEntryEndpoint);
            d.a(access$000);
            if (d.h.a(access$000.d)) {
                hashMap2.put("edit_conversation_entry_listener", this.e);
            }
            this.b.a(abmk.d(this.a), hashMap2);
            auvm auvm = (auvm) ((anxo) this.a.toBuilder());
            auvj auvj = this.a;
            if ((auvj.a & 4) != 0) {
                auwb auwb = auvj.d;
                if (auwb == null) {
                    auwb = auwb.l;
                }
                i = auwb.j;
            }
            i ^= 1;
            if (auvm.c()) {
                auwe auwe = (auwe) ((anxo) auvm.d().toBuilder());
                auwe.copyOnWrite();
                auwb auwb2 = (auwb) auwe.instance;
                auwb2.a |= 256;
                auwb2.j = i;
                auvm.a(auwe);
            }
            this.a = (auvj) ((anxl) auvm.build());
            this.d.post(new jpc(this, menuItem));
            return true;
        }
    }

    public final int f() {
        return this.c + 2000;
    }
}
