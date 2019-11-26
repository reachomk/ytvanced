package defpackage;

import com.google.protos.youtube.api.innertube.JoinGroupCommandOuterClass$JoinGroupCommand;
import com.google.protos.youtube.api.innertube.JoinGroupRendererOuterClass;

/* renamed from: xyu */
public final class xyu implements xzv {
    public final acvx a;
    public final aaas b;
    public final xyt c;
    public aphg d;
    public boolean e;
    private final apxu f;

    public xyu(acvx acvx, aaas aaas, xyt xyt, apxu apxu) {
        this.a = acvx;
        this.b = aaas;
        this.c = (xyt) amqw.a((Object) xyt);
        this.f = (apxu) amqw.a((Object) apxu);
    }

    public final void b() {
    }

    public final boolean d() {
        return false;
    }

    public final Object e() {
        return null;
    }

    public final void a() {
        apxu apxu = this.f;
        anxr access$000 = anxl.checkIsLite(JoinGroupCommandOuterClass$JoinGroupCommand.joinGroupCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        anxp anxp = ((JoinGroupCommandOuterClass$JoinGroupCommand) b).b;
        if (anxp == null) {
            anxp = axak.a;
        }
        access$000 = anxl.checkIsLite(JoinGroupRendererOuterClass.joinGroupRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            CharSequence charSequence;
            apxu = this.f;
            access$000 = anxl.checkIsLite(JoinGroupCommandOuterClass$JoinGroupCommand.joinGroupCommand);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            anxp = ((JoinGroupCommandOuterClass$JoinGroupCommand) b).b;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(JoinGroupRendererOuterClass.joinGroupRenderer);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            atwh atwh = (atwh) b;
            this.a.a(acwl.s, this.f, null);
            this.a.a(atwh.i.d());
            xyt xyt = this.c;
            arwf arwf = atwh.b;
            if (arwf == null) {
                arwf = arwf.c;
            }
            xyt.a(arwf);
            xyt = this.c;
            arml arml = atwh.e;
            if (arml == null) {
                arml = arml.f;
            }
            xyt.a(ajqy.a(arml));
            xyt = this.c;
            arml = atwh.f;
            if (arml == null) {
                arml = arml.f;
            }
            xyt.b(ajqy.a(arml));
            boolean z = atwh.h;
            this.e = z;
            if (z) {
                this.c.a(null);
                this.c.a(null);
                this.c.a(true);
            } else {
                this.c.a(atwh.c);
                this.c.a(atwh.d);
                this.c.a(false);
            }
            this.d = null;
            if ((atwh.a & 16) != 0) {
                axak axak = atwh.g;
                if (axak == null) {
                    axak = axak.a;
                }
                this.d = (aphg) ajzv.a(ajzv.a(axak), aphg.class);
            }
            xyt = this.c;
            aphg aphg = this.d;
            if (aphg == null) {
                charSequence = null;
            } else {
                if ((aphg.a & 128) != 0) {
                    arml = aphg.g;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                charSequence = ajqy.a(arml);
            }
            xyt.c(charSequence);
            this.a.a(atwh.i.d(), null);
            return;
        }
        this.c.dismiss();
    }

    public final void c() {
        this.c.dismiss();
    }
}
