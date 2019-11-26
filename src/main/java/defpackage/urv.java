package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;

/* renamed from: urv */
public final class urv implements urs {
    private static final urz a = new ury();
    private static final usa b = new urx();
    private final nn c;
    private final xci d;
    private final urz e;
    private final usa f;
    private nd g;
    private nd h;
    private urt j = urt.i;
    private boolean k = true;

    public urv(nn nnVar, xci xci) {
        urz urz = a;
        usa usa = b;
        this.c = nnVar;
        this.d = xci;
        this.e = urz;
        this.f = usa;
    }

    public final void a(urt urt) {
        if (urt == null) {
            urt = urt.i;
        }
        this.j = urt;
    }

    public final void a() {
        Bundle bundle;
        or a;
        if (!(this.k || i() == null)) {
            bundle = new Bundle();
            a(i(), bundle);
            a = this.c.f().a();
            a.a(this.g);
            this.g = this.e.a();
            urv.a(a, "channel_creation_fragment", bundle, this.g);
        }
        if (!this.k && j() != null) {
            bundle = new Bundle();
            a(j(), bundle);
            a = this.c.f().a();
            a.a(this.h);
            this.h = this.f.a();
            urv.a(a, "birthday_picker_fragment", bundle, this.h);
        }
    }

    public final void b() {
        this.k = true;
    }

    public final void f() {
        this.k = false;
    }

    private final void a(nd ndVar, Bundle bundle) {
        bundle.putBundle("fragment_args", ndVar.j);
        bundle.putParcelable("fragment_saved_state", this.c.f().a((nf) ndVar));
    }

    private static void a(or orVar, String str, Bundle bundle, nd ndVar) {
        ndVar.a((nl) bundle.getParcelable("fragment_saved_state"));
        ndVar.f(bundle.getBundle("fragment_args"));
        orVar.a((nf) ndVar, str).c();
    }

    public final void b(apxu apxu) {
        amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint);
        apxu.a(access$000);
        amqw.a(apxu.h.a(access$000.d));
        if (!this.k && i() == null) {
            access$000 = anxl.checkIsLite(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint = (ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint) b;
            urz urz = this.e;
            byte[] d = channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.b.d();
            int a = apli.a(channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.c);
            if (a == 0) {
                a = 1;
            }
            this.g = urz.a(d, a);
            this.c.f().a().a(this.g, "channel_creation_fragment").c();
        }
    }

    private final nd i() {
        nd ndVar = this.g;
        if (ndVar != null) {
            return ndVar;
        }
        this.g = (nd) this.c.f().a("channel_creation_fragment");
        return this.g;
    }

    public final void g() {
        this.g = null;
    }

    public final void a(boolean z) {
        if (z) {
            this.d.d(new uru());
        }
        this.j.a(z);
    }

    public final void c() {
        this.d.d(new uru());
        this.j.c();
    }

    public final void u_() {
        this.d.d(new uru());
        this.j.u_();
    }

    public final void v_() {
        this.j.v_();
    }

    public final void a(apxu apxu) {
        urr urr = (urr) i();
        if (urr != null) {
            urr.a(apxu);
        }
    }

    public final void a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (!this.k && j() == null) {
            this.h = this.f.a(charSequence, i, i2, i3, z);
            this.c.f().a().a(this.h, "birthday_picker_fragment").c();
        }
    }

    private final nd j() {
        nd ndVar = this.h;
        if (ndVar != null) {
            return ndVar;
        }
        this.h = (nd) this.c.f().a("birthday_picker_fragment");
        return this.h;
    }

    public final void h() {
        this.h = null;
    }

    public final void a(int i, int i2, int i3) {
        urb urb = (urb) i();
        if (urb != null) {
            urb.a(i, i2, i3);
        }
    }
}
